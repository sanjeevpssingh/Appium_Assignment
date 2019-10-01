package PageObjectRepository;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import BaseClass.LaunchClass;
import Json_module.jsonFile;
import io.appium.java_client.MobileElement;

public class HideShow_PL extends LaunchClass  {
	jsonFile lib=new jsonFile();
	

	public MobileElement getButton() throws FileNotFoundException, IOException, ParseException
	{
		return driver.findElementByXPath(lib.DataJSON("data","Animation"));
	}

	public MobileElement getButtonHideShow() throws FileNotFoundException, IOException, ParseException
	{
		
		return driver.findElementByXPath(lib.DataJSON("data","Hide&Show"));
	}

	public MobileElement getButtonHide_GONE() throws FileNotFoundException, IOException, ParseException
	{
		return driver.findElementByXPath(lib.DataJSON("data","Hide_GONE"));
	}
	
	

	public MobileElement getButton0() throws FileNotFoundException, IOException, ParseException
	{
		return driver.findElementByXPath(lib.DataJSON("data","0"));
	}

	public MobileElement getButton1() throws FileNotFoundException, IOException, ParseException
	{
		return driver.findElementByXPath(lib.DataJSON("data","1"));
	}

	public MobileElement getButton2() throws FileNotFoundException, IOException, ParseException
	{
		return driver.findElementByXPath(lib.DataJSON("data","2"));
	}

	public MobileElement getButton3() throws FileNotFoundException, IOException, ParseException
	{
		return driver.findElementByXPath(lib.DataJSON("data","3"));
		
	}
	
	
	public MobileElement getButtonShowButton() throws FileNotFoundException, IOException, ParseException
	{
		return driver.findElementByXPath(lib.DataJSON("data","ShowButton"));
	}
	
	public void verify_visible() throws FileNotFoundException, IOException, ParseException
	{
		
		if(driver.findElementByXPath(lib.DataJSON("data","0")).equals(true))
		{
			System.out.println("Element visible");
		}
		
		else
		{
			System.out.println("Element hidden");
		}
		
	}
	
	
	
	
}
