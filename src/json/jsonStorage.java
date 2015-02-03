package json;
import org.json.JSONArray;
import org.json.JSONObject;;




public class jsonStorage {

	public static void main(String[] args){
		JSONObject myObject = new JSONObject();
		JSONArray myArray = new JSONArray();
		
		try{
			myObject.put("firstName", "Nathan");
			myObject.put("lastName", "Wittmann");
			
			myArray.put("Andrew");
			myArray.put("Ty");
			myArray.put("Chase");
			myArray.put("Maicy");
			myArray.put("Eden");
			
			myObject.put("Children", myArray);
		}catch (Exception e){
			
		}
		
		System.out.println(myObject.toString());
	}
}
