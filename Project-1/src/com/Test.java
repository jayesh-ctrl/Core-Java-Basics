package com;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
import java.net.URI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Test {

//	private static HttpURLConnection connection;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method 1:- java.net.HttpURLConnection
		
//		BufferedReader reader;
//		String line;
//		StringBuffer responseContent = new StringBuffer();
//		
//		try {
//			URL url = new URL("https://jsonplaceholder.typicode.com/albums");
//			connection = (HttpURLConnection) url.openConnection();
//			
//			//request setup
//			connection.setRequestMethod("GET");
//			connection.setConnectTimeout(5000);
//			connection.setReadTimeout(5000);
//			int status = connection.getResponseCode();
////			System.out.println(status);
//			if(status > 299)
//			{
//				reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
//				while((line = reader.readLine())!=null)
//				{
//					responseContent.append(line);
//				}
//				reader.close();
//			}
//			else {
//				reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//				while((line = reader.readLine())!=null)
//				{
//					responseContent.append(line);
//				}
//				reader.close();
//			}
//			System.out.println(responseContent.toString());
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		finally {
//			connection.disconnect();
//		}
		
		//Method 2:- java.net.http.HttpClient;
		try {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request =  (HttpRequest) HttpRequest.newBuilder().uri(URI.create("http://localhost:15672/api")).build();
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
					.thenApply(HttpResponse::body)
					.thenAccept(System.out::println)
					.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
