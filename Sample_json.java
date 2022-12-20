import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;
import org.json.simple.JSONObject;    
import org.json.simple.JSONValue;    
public class Sample_json {
   public static void main(String[] args) {
      JSONParser parser = new JSONParser();
      try {
         Object obj = parser.parse(new FileReader("/Desktop/sample.json"));
         JSONObject jsonObject = (JSONObject)obj;
         
         JSONArray subjects = (JSONArray)jsonObject.get("keys");
         
         System.out.println("Keys:");
         
        System.out.println(subjects);
        //  Iterator iterator = subjects.iterator();
        //  while (iterator.hasNext()) {
        //     JSONObject temp = iterator.next();
        //     System.out.println(iterator.next());
        //  }
         
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}