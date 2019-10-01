package BusinessLogic;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;


import com.relevantcodes.extentreports.LogStatus;

import BaseClass.LaunchClass;
import CommonLib.CommonUtils;
import PageObjectRepository.HideShow_PL;

import utils.screenshot.ScreenShotManager;

public class HideShow_BL extends LaunchClass{


	HideShow_PL ob ;


    ScreenShotManager screenlib=new ScreenShotManager(); 
    public com.relevantcodes.extentreports.ExtentTest test;

	public boolean Hide_Show() throws FileNotFoundException, IOException, ParseException, InterruptedException
	{ 
		
		test=report.startTest("HideandShowButtons");
		ob= new HideShow_PL();
		

		
		try {
		CommonUtils.press(ob.getButton());
		CommonUtils.waitFunction();
		test.log(LogStatus.INFO, "Annimation Clicked");
		
		CommonUtils.press(ob.getButtonHideShow());
		CommonUtils.waitFunction();
		test.log(LogStatus.INFO, "Hide/Show Clicked");
		
		
		
		CommonUtils.press(ob.getButtonHide_GONE());
		CommonUtils.waitFunction();
		test.log(LogStatus.INFO, "Check Box ticked");
		
	
		
		CommonUtils.press(ob.getButton0());
		CommonUtils.waitFunction();
		test.log(LogStatus.INFO, "0 clicked");
		
		CommonUtils.press(ob.getButton1());
		CommonUtils.waitFunction();
		test.log(LogStatus.INFO, "1 clicked");
		
		CommonUtils.press(ob.getButton2());
		CommonUtils.waitFunction();
		test.log(LogStatus.INFO, "2 clicked");
		
		CommonUtils.press(ob.getButton3());
		CommonUtils.waitFunction();
		test.log(LogStatus.INFO, "3 clicked");
		
		
		
		
		CommonUtils.press(ob.getButtonShowButton());
		test.log(LogStatus.INFO, "Show button clicked");
	
		
	    ob.verify_visible();

		return true;

	}
		catch(Exception e)
		{
			test.log(LogStatus.INFO, test.addScreenCapture(screenlib.captureScreenShot(e.getMessage(), driver)));
			return false;
		}

}
}
