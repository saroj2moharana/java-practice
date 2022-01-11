package com.skm.algo.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author saroj on 10/12/2019
 */
public class JsonConnect {
    public static void main(String[] args) {
        try {
            connect();
        }catch (Exception ex){}
    }
    private static void connect()throws Exception{
        /*String responseStr = sendGet();
        //System.out.println(responseStr);
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(responseStr,JsonObject.class);
        JsonArray dataObject = jsonObject.getAsJsonArray("data");
        System.out.println(dataObject);
        for(JsonElement element:dataObject){
            JsonObject valueObject = element.getAsJsonObject();
            System.out.println("Val--- "+valueObject.get("date").getAsString()+"--"+valueObject.get("open")+"---"+valueObject.get("low"));

        }
*/    }
    private static String sendGet()throws IOException {
        URL url = new URL("https://jsonmock.hackerrank.com/api/stocks/search?key=6-January-2000");
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent","Mozilla/5.0");

        int responseCode = con.getResponseCode();
        StringBuilder response = new StringBuilder();
        //expecting success response code here...
        if(responseCode == HttpURLConnection.HTTP_OK){
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            while((inputLine = br.readLine()) != null){
                response.append(inputLine);
            }

            br.close();

        }
        return response.toString();
    }
}
