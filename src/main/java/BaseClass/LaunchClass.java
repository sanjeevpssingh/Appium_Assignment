package BaseClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.relevantcodes.extentreports.ExtentReports;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import utils.report.ExtentReportManager;

public class LaunchClass {


	public static AppiumDriverLocalService service;

	public static AppiumDriver<MobileElement> driver;
	
	public static ExtentReports report= ExtentReportManager.getInstance();
	
	public static String timestamp;
	public static String snapshotpathfolderPath;
	public static String testReportFolderPath; 
	public void InvokeApp () throws MalformedURLException {


		DesiredCapabilities capabilties = new DesiredCapabilities();

		service=AppiumDriverLocalService.buildDefaultService();

		service.start();

		capabilties.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3 API 26");
		capabilties.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		capabilties.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
		//capabilties.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		//capabilties.setCapability(MobileCapabilityType.APP, "");
		capabilties.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.example.android.apis.ApiDemos");
		capabilties.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.example.android.apis");

		URL serverURL = new URL("http://localhost:"+4723+"/wd/hub");
		driver = new AndroidDriver<MobileElement>(serverURL,capabilties);
		// service.stop();

	}


	public void closeApp()

	{
		driver.quit();
		service.stop();
	}

}


