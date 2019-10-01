package PageObjectRepository;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import BaseClass.LaunchClass;
import Json_module.jsonFile;
import io.appium.java_client.MobileElement;

public class DisplayOptions_PL extends LaunchClass{
	jsonFile lib=new jsonFile();


	public MobileElement getApp1() throws FileNotFoundException, IOException, ParseException
	{
		return driver.findElementByXPath(lib.DataJSON("data","Application"));
	}

	public MobileElement getActionBar() throws FileNotFoundException, IOException, ParseException
	{
		return driver.findElementByXPath(lib.DataJSON("data","Action_Bar"));
	}

	public MobileElement getDisplayOptions() throws FileNotFoundException, IOException, ParseException
	{
		return driver.findElementByXPath(lib.DataJSON("data","Display_Option"));
	}

	public MobileElement getDisplayShowTitle() throws FileNotFoundException, IOException, ParseException
	{
		return driver.findElementByXPath(lib.DataJSON("data","Show_Title"));
	}


	public boolean getTitle() throws FileNotFoundException, IOException, ParseException {
		try {
			driver.findElementByXPath(lib.DataJSON("Data", "Title"));
			return true;
		}
		catch(Exception e) {
			return false;
		}
	} 
}
