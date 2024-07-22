package org.example;

import okhttp3.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class calling_llama {
    private static final String FILE_PATH = "src/main/java/org/example/new_model_responses.json";
    private static List<Long> responseTimes = new ArrayList<>();

    String question_text(String questionContent) throws IOException, ParseException {
        OkHttpClient client = new OkHttpClient.Builder().connectTimeout(60, TimeUnit.SECONDS).readTimeout(60, TimeUnit.SECONDS).writeTimeout(60, TimeUnit.SECONDS).addInterceptor(new RetryInterceptor(3, 2000)).build();
        MediaType mediaType = MediaType.parse("application/json");
        String questionJson = "{\"messages\": [" +
                "{\"role\": \"system\", " +
                "\"content\": \"You only answer providing the sets\"}, " +
                "{\"role\": \"user\", " +
                "\"content\": \"" + questionContent + "\"}]}";

        JSONObject existingAnswer = checkExistingAnswer(questionJson);
        if (existingAnswer != null && existingAnswer.get("response") instanceof String) {
            String response = ((String) existingAnswer.get("response"));
            return response;
        }
        else{
            System.out.println(questionJson);
            RequestBody body = RequestBody.create(mediaType, questionJson);
            Request request = new Request.Builder()
                    .url("https://api.llama-api.com/chat/completions")
                    .method("POST", body)
                    .addHeader("Content-Type", "application/json")
                    .addHeader("Authorization", "Bearer LL-*******************************************")
                    .build();

            long startTime = System.currentTimeMillis();
            Response response = client.newCall(request).execute();
            long endTime = System.currentTimeMillis();
            responseTimes.add(endTime - startTime);
            if (response.isSuccessful()) {
                String responseData = response.body().string();
                response.body().close();
                boolean res = saveResponse(questionJson, responseData);
                return responseData;
            } else {
                response.body().close();
                System.out.println("Response not successful: " + response.code());
                throw new IOException("Response not successful: HTTP code " + response.code());
            }
        }
    }

    boolean saveResponse(String question, String jsonResponse) {
        File file = new File(FILE_PATH);
        JSONObject responseJson = new JSONObject();
        JSONParser parser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) parser.parse(jsonResponse);
            JSONArray choicesArray = (JSONArray) jsonObject.get("choices");
            JSONObject firstChoice = (JSONObject) choicesArray.get(0);
            JSONObject messageObject = (JSONObject) firstChoice.get("message");
            String contentValue = (String) messageObject.get("content");
            responseJson.put("question", question);
            responseJson.put("response", contentValue);
            JSONArray responsesArray = new JSONArray();
            if (file.exists()) {
                try {
                    String content = new String(Files.readAllBytes(file.toPath()));
                    responsesArray = (JSONArray) parser.parse(content);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            responsesArray.add(responseJson);
            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write(responsesArray.toJSONString());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return Boolean.parseBoolean((String) contentValue);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }
    private JSONObject checkExistingAnswer(String question) throws IOException, ParseException {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return null;
        }

        JSONParser parser = new JSONParser();
        JSONArray responsesArray;

        try {
            String content = new String(Files.readAllBytes(file.toPath()));
            responsesArray = (JSONArray) parser.parse(content);
            for (Object obj : responsesArray) {
                JSONObject responseJson = (JSONObject) obj;
                if (responseJson.get("question").equals(question)) {
                    return responseJson;
                }
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Long> getResponseTimes() {
        return responseTimes;
    }

    public static void generateChart() {
        List<Long> times = getResponseTimes();
        List<Double> time_sec = new ArrayList<>();
        for (int i = 0; i < times.size(); i++) {
            double timeInSeconds = times.get(i) / 1000.0;
            time_sec.add(timeInSeconds);
        }
        try (FileWriter fileWriter = new FileWriter("\"src/main/java/org/example/response_times.txt")) {
            for (double time : time_sec) {
                fileWriter.write(time + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double[] timeArray = time_sec.stream().mapToDouble(Double::doubleValue).toArray();
        HistogramDataset dataset = new HistogramDataset();
        dataset.setType(HistogramType.FREQUENCY);
        dataset.addSeries("Response times", timeArray, 10);

    }
}
