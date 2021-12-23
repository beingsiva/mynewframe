package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crm_project_WebdriverUtility.WebDriverUtility;
import generic_Utility.PropertyFileUtility;

public class OrgPom {
	
	public WebDriverUtility wdu = new WebDriverUtility();
	public PropertyFileUtility pf= new PropertyFileUtility();
	public WebDriver driver= null;
	
	public OrgPom(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Organizations'])[2]/following::img[1]")
	private WebElement orgcreate;
	
	public WebElement getOrgCreate() {
	return orgcreate;
	}
	 public void org() {
		 orgcreate.click();
	 }

	 @FindBy(name="accountname")
	 private WebElement accName;
	 
	 public WebElement getaccName() {
		 return accName;
	 }
	 
	 public void typeAccName() {
		 accName.sendKeys("sivasakthi");
	 }
	
	 @FindBy(name="website")
	 private WebElement webname;
	 
	 public WebElement getWebName() {
		 return webname;
	 }
	 public void typeWebName() {
		 webname.sendKeys("okok.com");
	 }

}
