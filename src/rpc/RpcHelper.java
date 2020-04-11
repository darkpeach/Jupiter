package rpc;

import java.io.IOException;
import java.io.PrintWriter;

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
}
