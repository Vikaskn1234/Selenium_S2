package in.mphasis.testsripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class ScreenShot extends TestBase {
	@Test
	public File takeScreenShot() throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String Path="C:\\Users\\vikas\\OneDrive\\Pictures\\Screenshots\\myscreenshot_"+System.currentTimeMillis()+".png";
		File target=new File(Path);
		FileUtils.copyFile(source, target);
		return target;
	}

}
