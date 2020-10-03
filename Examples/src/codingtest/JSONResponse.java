package codingtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.json.JsonArray;
import javax.json.JsonObject;


public class JSONResponse {


		public static void main(String[] args) {
	     try {
	    	 JSONResponse.call_me();
	        } catch (Exception e) {
	         e.printStackTrace();
	       }
	     }
		   
	public static void call_me() throws Exception {
	     String url = "http://api.ipinfodb.com/v3/ip-city/?key=d64fcfdfacc213c7ddf4ef911dfe97b55e4696be3532bf8302876c09ebd06b&ip=74.125.45.100&format=json";
	     URL obj = new URL(url);
	     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	     // optional default is GET
	     con.setRequestMethod("GET");
	     //add request header
	     con.setRequestProperty("User-Agent", "Mozilla/5.0");
	     int responseCode = con.getResponseCode();
	     System.out.println("\nSending 'GET' request to URL : " + url);
	     System.out.println("Response Code : " + responseCode);
	     BufferedReader in = new BufferedReader(
	             new InputStreamReader(con.getInputStream()));
	     String inputLine;
	     StringBuffer response = new StringBuffer();
	     while ((inputLine = in.readLine()) != null) {
	     	response.append(inputLine);
	     }
	     in.close();
	     //print in String
	     System.out.println(response.toString());
	     //Read JSON response and print
	     JsonObject myResponse = new JSONObject(response.toString());
	     System.out.println("result after Reading JSON Response");
	     System.out.println("statusCode- "+myResponse.getString("statusCode"));
	     System.out.println("statusMessage- "+myResponse.getString("statusMessage"));
	     System.out.println("ipAddress- "+myResponse.getString("ipAddress"));
	     System.out.println("countryCode- "+myResponse.getString("countryCode"));
	     System.out.println("countryName- "+myResponse.getString("countryName"));
	     System.out.println("regionName- "+myResponse.getString("regionName"));
	     System.out.println("cityName- "+myResponse.getString("cityName"));
	     System.out.println("zipCode- "+myResponse.getString("zipCode"));
	     System.out.println("latitude- "+myResponse.getString("latitude"));
	     System.out.println("longitude- "+myResponse.getString("longitude"));
	     System.out.println("timeZone- "+myResponse.getString("timeZone"));  
	}
	
	String[] getMovieTitles(String substr) {
		String response;
		int startPage = 1;
		int totalPages = Integer.MAX_VALUE;
		List<String> titles = new ArrayList<>();
		while (startPage <= totalPages) {
		  try {
		    URL obj = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr + "&page=" + startPage);
		    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		    con.setRequestMethod("GET");
		    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		    while ((response = in.readLine()) != null) {
		      JsonObject convertedObject = new Gson().fromJson(response, JsonObject.class);
		      totalPages = convertedObject.get("total_pages").getAsInt();
		      JsonArray data = convertedObject.getAsJsonArray("data");
		      for (int i = 0; i < data.size(); i++) {
		        String title = data.get(i).getAsJsonObject().get("Title").getAsString();
		        titles.add(title);
		      }
		    }
		    in.close();
		    startPage++;
		  } catch (Exception ex) {
		    ex.printStackTrace();
		  }

		}
		Collections.sort(titles);
		return titles.toArray(new String[0]);
		}
}
