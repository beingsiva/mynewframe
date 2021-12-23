package organisationModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExReportForTestNgDemo {
	ExtentHtmlReporter htmlreport;
	ExtentReports extent; 
	WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		htmlreport= new ExtentHtmlReporter("extentreport1.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlreport);
	
		}
	
	@BeforeTest
	public void setuptest() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}

	@Test
	public void test() throws Exception {
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		
		 // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MySecondTest", "Sample description");
        
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        test.info("This step shows usage of info(details)");
        
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        test.addScreenCaptureFromPath("screenshot.png");
	}

	@Test
	public void test1() throws Exception {
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		
		 // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MySecondTest", "Sample description");
        
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        test.info("This step shows usage of info(details)");
        
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        test.addScreenCaptureFromPath("screenshot.png");
	}
	@AfterTest
	public void aftertest() {
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}

	@AfterSuite
	public void teardown() {
        extent.flush();

	}

}
