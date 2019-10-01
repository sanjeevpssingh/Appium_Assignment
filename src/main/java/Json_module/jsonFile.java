package Json_module;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsonFile {
	
	public static JSONParser parserr;
	public static JSONObject jObj;
	public static Object obj;
	public String DataJSON(String file,String token) throws FileNotFoundException, IOException, ParseException 
	{
	parserr=new JSONParser();
	String FilePath =System.getProperty("user.dir")+"\\Resources\\"+file+".json";
	obj=(Object)parserr.parse(new FileReader(FilePath));
	jObj=(JSONObject)obj;
	String data=(String)jObj.get(token);
	return data;
	
	
	}
}
