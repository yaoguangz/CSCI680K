package Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadYelpBusiness {
     public static void main(String[] args) {

	JSONParser parser = new JSONParser();
	int count = 10;
	
	try {

		//Object obj = parser.parse(new FileReader("E:\\Spring 2016\\CSCI 680-K\\Project\\Datasets\\Yelp\\yelp_dataset_challenge_academic_dataset\\yelp_academic_dataset_business.json"));
		//Object obj = parser.parse(new FileReader("E:\\business1.json"));

		Object obj = parser.parse(new FileReader("E:\\Spring 2016\\CSCI 680-K\\Project\\Output\\yelp_review_short_all_array.json"));
		
		JSONArray jsonObjects = (JSONArray) obj;
/*
		for(JSONObject jsonObject:  jsonObjects)
		{
			String business_id = (String) jsonObject.get("name");
			System.out.println(business_id);
	
			String full_address = (String) jsonObject.get("full_address");
			System.out.println(full_address);
		}
		*/
		//for (int i = 0; i < jsonObjects.size(); ++i) {
		for (int i = 0; i < 5; ++i) {
		    JSONObject jsonObject = (JSONObject) jsonObjects.get(i);
		    String business_id = (String) jsonObject.get("business_id");
		    String text = (String) jsonObject.get("text");
		    System.out.println("business_id: "+business_id+",text:"+text);
		}

		/*
		// loop array
		JSONArray msg = (JSONArray) jsonObject.get("messages");
		Iterator<String> iterator = msg.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		*/

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ParseException e) {
		e.printStackTrace();
	}

     }

}