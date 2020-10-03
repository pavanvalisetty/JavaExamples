package codingtest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;


public class OptumTest1 {

	
	static String[] getMovieTitles(String substr) {
	    String response;
	    int startPage = 1;
	    int totalPages = Integer.MAX_VALUE;
	    List<String> titles = new ArrayList<>();
	    while (startPage <= totalPages) {
	        try {
	            URL obj = new URL(
	                    "https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr + "&page=" + startPage);
	            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	            con.setRequestMethod("GET");
	            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	            while ((response = in.readLine()) != null) {
	                JSONObject convertedObject = new Gson().fromJson(response, JsonObject.class);
	                totalPages = convertedObject.get("total_pages").getAsInt();
	                JSONArray data = convertedObject.getAsJsonArray("data");
	                for (int i = 0; i < data.size(); i++) {
	                    String title = data.get(i).getAsJsonObject().get("Title").getAsString();
	                    titles.add(title);
	                }
	            }
	            in.close();
	            startPage++;
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return null;
	        }

	    }
	    Collections.sort(titles);
	    return titles.toArray(new String[0]);
	}

	public static void main(String[] args) throws IOException {
	    Scanner in = new Scanner(System.in);
	    final String fileName = System.getenv("OUTPUT_PATH");
	    BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	    String[] res;
	    String _substr;
	    try {
	        _substr = in.nextLine();
	    } catch (Exception e) {
	        _substr = null;
	    }

	    res = getMovieTitles(_substr);
	    for (int res_i = 0; res_i < res.length; res_i++) {
	        bw.write(String.valueOf(res[res_i]));
	        bw.newLine();
	    }

	    bw.close();
}
