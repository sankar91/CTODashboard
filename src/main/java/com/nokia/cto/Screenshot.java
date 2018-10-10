package com.nokia.cto;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screenshot {
	
	public static void screenshotcapture(WebDriver driver,String path) throws IOException {
		// TODO Auto-generated method stub
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));
		
	}

	  public static void scrollElementDown(WebDriver driver, WebElement element)
	  {
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", new Object[] { element });
	  }
	  public static void scrollElementUp(WebDriver driver, WebElement element)
	  {
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", new Object[] { element });
	  }
}
