package rpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

public class RpcHelper {

	// Write a JSONObject to http response.
	public static void writeJsonObject(HttpServletResponse response, JSONObject obj) {
		response.setContentType("application/json");
		response.setHeader("ACCESS-CONTROL-ALLOW-ORIGIN", "*");
		try {
			PrintWriter out = response.getWriter();
			out.print(obj);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// Write a JSONArray to http response.
	public static void writeJsonArray(HttpServletResponse response, JSONArray array) {
		response.setContentType("application/json");
		response.setHeader("ACCESS-CONTROL-ALLOW-ORIGIN", "*");
		try {
			PrintWriter out = response.getWriter();
			out.print(array);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// Parses a JSONObject from http request.
	public static JSONObject readJsonObject(HttpServletRequest request) {
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader reader = request.getReader();
			String line = null;
			while((line = reader.readLine()) != null){
				sb.append(line);
			}
			reader.close();
			return new JSONObject(sb.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
