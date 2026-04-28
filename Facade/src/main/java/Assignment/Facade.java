package Assignment;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Facade implements FacadeInterface {

    private String makeGetRequest(String url) throws IOException {
        HttpURLConnection connection;
        try {
            URL urlString = new URL(url);
            connection = (HttpURLConnection) urlString.openConnection();
            connection.setRequestMethod("GET");
        } catch (IOException e) {
            throw new IOException("Invalid URL: " + url);
        }
        StringBuilder sb;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        }catch (IOException e) {
            throw new IOException("Error reading response from URL: " + url);
        } finally {
            connection.disconnect();
        }
    }

    private String parseAttribute(String json, String attribute) {
        try{
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(json);
            return (String) jsonObject.get(attribute);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException {
        if (urlString == null || urlString.isEmpty()) {
            throw new IllegalArgumentException("URL cannot be null or empty");
        } else if (attributeName == null || attributeName.isEmpty()) {
            throw new IllegalArgumentException("Attribute name cannot be null or empty");
        } else{
            String jsonResponse = makeGetRequest(urlString);
            return parseAttribute(jsonResponse, attributeName);
        }
    }

    public static void main(String[] args) {
        Facade facade = new Facade();
        try {
            String jokeJson = facade.makeGetRequest("https://api.chucknorris.io/jokes/random");
            System.out.println(jokeJson);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




