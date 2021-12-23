package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import crm_project_WebdriverUtility.WebDriverUtility;
import generic_Utility.PropertyFileUtility;

public class Homepage extends WebDriverUtility {
	public WebDriverUtility wdu = new WebDriverUtility();
	public PropertyFileUtility pf= new PropertyFileUtility();
	public WebDriver driver= null;
	
	public Homepage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
		@FindBy(xpath="//a[text()=\"Organizations\"]")
		private WebElement org;
		
		public WebElement orgLink() {
		return org;
		}
		
		
		/*@FindBy(xpath="(//a[text()='Organizations'])[2]/following::img[1]")
		private WebElement orgcreate;
		
		public WebElement getOrgCreate() {
		return orgcreate;
		}*/
		
		public void orgnisation() {
			orgLink().click();
			//getOrgCreate().click();
	}
		
	}


