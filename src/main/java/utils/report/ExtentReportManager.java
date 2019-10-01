package utils.report;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

import BaseClass.LaunchClass;



public class ExtentReportManager extends LaunchClass {
	
		private static ExtentReports rep;
		public static  ExtentReports getInstance() {
			if(rep==null) {
				Date dt= new Date();
				LaunchClass.timestamp=dt.toString().replace(":","_").replace(" ","_");
				String reportFolderPath=System.getProperty("user.dir")+"\\Resources\\Reports"+"Test_Report_"+LaunchClass.timestamp+"\\";
				LaunchClass.testReportFolderPath=reportFolderPath;
				String filename=LaunchClass.timestamp+".html";
				rep=new ExtentReports(LaunchClass.testReportFolderPath+filename,true,DisplayOrder.NEWEST_FIRST);
				rep.loadConfig(new File(System.getProperty("user.dir")+"//ReportsConfig.xml"));
				rep.addSystemInfo("Selenium Version", "3.11.0");
			}
			return rep;
		}
		
	}



