package AoC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class AoCInputFetcher {
    public static String fetchInput(int day) {
        String urlString = String.format("https://adventofcode.com/%d/day/%d/input", Constants.YEAR, day);

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Cookie", "session=" + System.getenv("SESSION"));

            if (connection.getResponseCode() == 200) {
                StringBuilder input = new StringBuilder();
                try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    String line;
                    while ((line = in.readLine()) != null) {
                        input.append(line).append("\n");
                    }
                }
                return input.toString().trim();
            } else {
                System.err.println("Failed to fetch input, maybe the day is not available yet. HTTP Code: " + connection.getResponseCode());
            }
        } catch (Exception e) {
            System.err.println("Error fetching input: " + e.getMessage());
        }

        return null;
    }
}
