package ceva;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBuilder {
	
	public static void main(String [] args) {
		
		JSONObject obj=new JSONObject();
		obj.put("Name","Andrei");
		obj.put("Age", 22);
		JSONArray array=new JSONArray();
		HashMap<String, String> skills=new HashMap<String,String>();
		skills.put("C++", "medium");
		array.add(skills);
		skills=new HashMap<String,String>();
		skills.put("Java", "beginner");
		array.add(skills);
		skills=new HashMap<String,String>();
		skills.put("C#", "beginner");
		array.add(skills);
		obj.put("skills", array);
		try {
			PrintWriter pw=new PrintWriter("Person.json");
			pw.write(obj.toJSONString());
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
