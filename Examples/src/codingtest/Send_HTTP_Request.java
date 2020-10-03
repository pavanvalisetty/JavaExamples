package codingtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Collectors;

import javax.json.stream.JsonParser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Send_HTTP_Request {
	public static void main(String[] args) {
		try {
			Send_HTTP_Request.call_me();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void call_me() throws Exception {
		
		System.out.println("Enter population number to display countries");
		Scanner scanner =new Scanner(System.in);
		Long number = scanner.nextLong();
		String url = "http://httpbin.org/ip";
		url = "https://jsonmock.hackerrank.com/api/countries/search";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		// optional default is GET
		con.setRequestMethod("GET");
		// add request header
		con.setRequestProperty("User-Agent", "Mozilla/5.0");
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		// System.out.println("Response Code : " + responseCode);
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		JSONParser parse = new JSONParser();
		JSONObject jobj = (JSONObject) parse.parse(response.toString());

		JSONArray jsonarr_1 = (JSONArray) jobj.get("data");
		HashMap<String, Long> myMap = new HashMap<String,Long>();
		for (int i = 0; i < jsonarr_1.size(); i++) {
			org.json.simple.JSONObject jsonobj_1 = (org.json.simple.JSONObject) jsonarr_1.get(i);
			//System.out.println("country" + jsonobj_1.get("name"));
			//System.out.println("population" + jsonobj_1.get("population"));
			String name = (String) jsonobj_1.get("name");
			Long popluation = (Long) jsonobj_1.get("population");
			myMap.put(name,popluation);
		}
		
		System.out.println("------------100000 more than population");
		myMap.entrySet().stream().filter(map -> map.getValue() < number ).forEach(System.out::println);
	}

}
