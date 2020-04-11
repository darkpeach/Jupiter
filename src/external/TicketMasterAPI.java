package external;

import org.json.JSONArray;
import org.json.JSONObject;

public class TicketMasterAPI {
	
	private static final String URL ="https://app.ticketmaster.com/discovery/v2/events.json";
	private static final String DEFALUT_KEYWORD = "";
	private static final String API_KEY = "fxG3HgYOm7ZIWUs1L1OtEcOo1SjMor9o";
	
	public JSONArray search(double lat, double lon, String keyword) {
		return null;
	}
	
	private void queryAPI(double lat, double lon) {
		JSONArray events = search(lat, lon, null);
		try {
			for(int i = 0; i < events.length(); i++) {
				JSONObject event = events.getJSONObject(i);
				System.out.println(event);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
