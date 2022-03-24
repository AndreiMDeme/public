package ceva;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class JSONParser {
	
	public static void main(String [] args) {
		
		try {
			JSONObject obj=(JSONObject) new org.json.simple.parser.JSONParser().parse(new FileReader("Person.json"));
		
			String name=obj.get("Name").toString();
			System.out.println(name);
			String age=obj.get("Age").toString();
			System.out.println(age);
			JSONArray array=(JSONArray) obj.get("skills");
			Iterator<Map.Entry> itr1;
			Iterator itr2 = array.iterator(); 
	          
	        while (itr2.hasNext())  
	        { 
	        	 itr1 = ((Map) itr2.next()).entrySet().iterator(); 
	             while (itr1.hasNext()) { 
	                 Map.Entry pair = itr1.next(); 
	                 System.out.println(pair.getKey() + " : " + pair.getValue()); 
	             } 
	            
	        } 
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
