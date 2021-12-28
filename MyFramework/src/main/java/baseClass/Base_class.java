package baseClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import crm_project_WebdriverUtility.WebDriverUtility;
import generic_Utility.PropertyFileUtility;
import pomClass.crm_pom_login;

public class Base_class {
	public PropertyFileUtility pf = new PropertyFileUtility();
	public WebDriverUtility wdu = new WebDriverUtility();
	public WebDriver driver;
	crm_pom_login cr = new crm_pom_login(driver);
	
	@BeforeMethod
	public void openApp() throws IOException {
		driver = new ChromeDriver();
		crm_pom_login cr = new crm_pom_login(driver);
		String URL = pf.readDataFromProperty("url");
		String un = pf.readDataFromProperty("username");
		String pass = pf.readDataFromProperty("password");
		driver.get(URL);
		cr.loginToApp(un, pass);
		cr.loginbtn();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void signout() throws InterruptedException {
		crm_pom_login cr = new crm_pom_login(driver);
		cr.getsignOut();

	}

}
