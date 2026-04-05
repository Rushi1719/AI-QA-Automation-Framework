package ai;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class BugAnalyzer {

    public static String analyze(String errorLog) {

        String response = "";

        try {
            URL url = new URL("https://api.openai.com/v1/chat/completions");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("POST");
            conn.setRequestProperty("Authorization", "Bearer YOUR_API_KEY");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            String input = "{ \"model\": \"gpt-4\", \"messages\": [{\"role\": \"user\", \"content\": \"Analyze this Selenium error and give root cause + fix: " + errorLog + "\"}] }";

            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output;

            while ((output = br.readLine()) != null) {
                response += output;
            }

            conn.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }
}