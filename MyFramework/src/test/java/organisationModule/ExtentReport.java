package organisationModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport {

	public static void main(String[] args) {
ExtentHtmlReporter htmlreport= new ExtentHtmlReporter("extentreport.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlreport);
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        
        test.log(Status.INFO, "Starting the testcase");
        driver.get("http://localhost:8888/index.php?module=Accounts&action=index");
        test.pass("navigated to website");
        
        
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        test.pass("Entering the credentials");
        
        driver.findElement(By.id("submitButton")).click();
        test.pass("Logged into website");
        driver.close();
        test.pass("testcase completed");
        extent.flush();

	}

}
