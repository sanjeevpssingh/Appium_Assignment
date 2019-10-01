package utils.screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import BaseClass.LaunchClass;
import io.appium.java_client.AppiumDriver;

public class ScreenShotManager extends LaunchClass{
 public String captureScreenShot(String screenShotName,AppiumDriver driver)
 {
	 String path=null;
	 String relativepath=null;
	 try {
		 path= LaunchClass.testReportFolderPath +"Screenshots/"+screenShotName+".png";
		 relativepath= "./Screenshots"+screenShotName+".png";
	File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile,new File(path));
	
	return relativepath;
	 }
	 catch(Exception e)
	 {
		 System.out.println("Exception"+e.getMessage());
	 }
	 return relativepath;
 }
}
