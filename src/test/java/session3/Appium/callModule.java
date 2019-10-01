package session3.Appium;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.LaunchClass;
import BusinessLogic.DisplayOptions_BL;
import BusinessLogic.HideShow_BL;

public class callModule extends LaunchClass {
	
	HideShow_BL bl;
	DisplayOptions_BL ob;
	
	@BeforeSuite
	public void basic() throws MalformedURLException
	{	
		bl=new HideShow_BL();
		ob=new DisplayOptions_BL();
		InvokeApp();
		
	}
	@Test
	public  void Hide_ShowFun() throws FileNotFoundException, IOException, ParseException, InterruptedException
	{
		
		Assert.assertTrue(bl.Hide_Show());;
		driver.navigate().back();
		driver.navigate().back();
		
		
	}
	
	@Test
	public void ShowTitle() throws FileNotFoundException, IOException, ParseException
	{
	Assert.assertTrue(ob.ShowTitleButton());
	}
	
	@AfterSuite
	public  void module2()
	{
		closeApp();
	}
	
}
