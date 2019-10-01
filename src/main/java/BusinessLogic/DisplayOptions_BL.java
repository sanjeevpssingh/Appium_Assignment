package BusinessLogic;

import java.io.FileNotFoundException;
import java.io.IOException;
import BaseClass.LaunchClass;
import org.json.simple.parser.ParseException;

import com.relevantcodes.extentreports.LogStatus;


import CommonLib.CommonUtils;
import PageObjectRepository.DisplayOptions_PL;
import utils.screenshot.ScreenShotManager;

public class DisplayOptions_BL extends LaunchClass {

	DisplayOptions_PL ob1;

    ScreenShotManager screenlib=new ScreenShotManager(); 
    public com.relevantcodes.extentreports.ExtentTest test;
    
	public boolean ShowTitleButton() throws FileNotFoundException, IOException, ParseException
	{
		
		test=report.startTest("DisplayOptions");
	
			
			ob1= new DisplayOptions_PL();
			try {
			CommonUtils.press(ob1.getApp1());
			CommonUtils.waitFunction();
			test.log(LogStatus.INFO, "APP Clicked");
			
			CommonUtils.press(ob1.getActionBar());
			CommonUtils.waitFunction();
			test.log(LogStatus.INFO, "Action Bar Clicked");
			
			
			CommonUtils.press(ob1.getDisplayOptions());
			CommonUtils.waitFunction();
			test.log(LogStatus.INFO, "Display Options Clicked");
			
			CommonUtils.press(ob1.getDisplayShowTitle());
			CommonUtils.waitFunction();
			test.log(LogStatus.INFO, "Display Show Title Clicked");
			
		    ob1.getTitle();
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			test.log(LogStatus.INFO, test.addScreenCapture(screenlib.captureScreenShot(e.getMessage(), driver)));
			return false;
		}

	}
}