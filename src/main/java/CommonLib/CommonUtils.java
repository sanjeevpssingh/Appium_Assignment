package CommonLib;

import org.openqa.selenium.WebElement;

public class CommonUtils {


	public static boolean press(WebElement go) {
		if(go!=null){
			go.click();
			return true;
		}
		else {
			System.out.println("Null parameter found");
			return false;
		}
	}
	public static boolean isdisplayed(WebElement buttonpass) {
		if(buttonpass != null) {
			boolean b = buttonpass.isDisplayed();
			if(b == true) {
				return true;
			}else {
				return false;
			}
		}else
			return false;
	}
	public static void waitFunction() throws InterruptedException
	{
		Thread.sleep(1000);
	}
} 
