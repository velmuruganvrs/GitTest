package samplegittest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleGitTest {
	@Test
	public void loginTest() throws IOException
	{
		
			WebDriver wd = new FirefoxDriver();
			wd.manage().window().maximize();
			//wd.get("https://www.google.co.in");
			wd.get("https://www.flipkart.com/");
			File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);//compare two interface
			FileUtils.copyFile(src, new File("C:\\SeleniumWorkspace\\SampleGitTest\\Screenshot\\Test.jpeg"));
		}

	}


