package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Methods {
//    static int logic(int x,int y)
    int logic(int x,int y){
        int z;
        if(x>y){
            z=x*y;
        }else{
            z=(x*y)+5;
        }
        return z;
    }
    public static void main(String[] args) {
        String result = fetchData("https://official-joke-api.appspot.com/random_joke");

        // Print the fetched data
        System.out.println("Response from API:");
        System.out.println(result);

    }

    // Method to fetch data using a GET request
    public static String fetchData(String apiUrl) {
        StringBuilder response = new StringBuilder();
        HttpURLConnection connection = null;

        try {
            // Create URL object
            URL url = new URL(apiUrl);

            // Open connection
            connection = (HttpURLConnection) url.openConnection();

            // Set request method to GET
            connection.setRequestMethod("GET");

            // Set request headers (optional)
            connection.setRequestProperty("Accept", "application/json");

            // Check response code
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read response
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(connection.getInputStream())
                );
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
            } else {
                System.out.println("GET request failed. Response Code: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

        return response.toString();
    }


    //    Void return
    static void Telljoke (){


    }

//    Method Overloading
}
