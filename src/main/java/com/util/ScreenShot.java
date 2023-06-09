package com.util;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	public static String getScreenShot(WebDriver driver, String ScreenShotName) {

		File folder = new File("./target/Screen shot");
		if (!folder.exists()) {
			folder.mkdir();
		}
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenShotfile = ts.getScreenshotAs(OutputType.FILE);
		String destination = "./target//Screen Shot//" + ScreenShotName + ".png";
		try {
			FileUtils.copyFile(screenShotfile, new File(destination));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return destination;
	}
}
