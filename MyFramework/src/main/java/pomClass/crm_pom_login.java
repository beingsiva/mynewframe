package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import crm_project_WebdriverUtility.WebDriverUtility;
import generic_Utility.PropertyFileUtility;

public class crm_pom_login extends WebDriverUtility {

	WebDriverUtility wb = new WebDriverUtility();
	PropertyFileUtility pb = new PropertyFileUtility();
	WebDriver driver = null;

	public crm_pom_login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * username address
	 */
	@FindBy(name = "user_name")
	private WebElement usrr;

	/**
	 * password address
	 */
	@FindBy(name = "user_password")
	private WebElement pass;

	/**
	 * login button addres
	 */
	@FindBy(id = "submitButton")
	private WebElement loginbtn;


	
	
	@FindBy(xpath="//span[text()=' Administrator']/following::img[1]")
	private WebElement signoutIMG;
	
	/**
	 * signout address
	 */
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;

	/**
	 * return username address
	 * 
	 * @return usrr
	 */
	public WebElement getuser() {
		return usrr;
	}

	/**
	 * Return password address
	 * 
	 * @return
	 */
	public WebElement getpas() {
		return pass;
	}

	/**
	 * Enter username and password
	 * 
	 * @param un
	 * @param pwd
	 */
	public void loginToApp(String un, String pwd) {
		usrr.sendKeys(un);
		pass.sendKeys(pwd);
	}
	
	public void loginbtn() {
		loginbtn.click();
	}


	/**
	 * perform move to element and click sign out
	 */
	public void getsignOut() {

		wb.mouseOver(driver, signoutIMG, signout);

	}

	@FindBy(xpath = "//a[text()='Organizations']")
	private WebElement org;

	public void org() {
		org.click();
	}

	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement plus;

	public void plus() {
		plus.click();
	}

	@FindBy(name = "accountname")
	private WebElement org_name_textbox;

	public void org_name_textbox() {
		org_name_textbox.sendKeys("n123");
	}

	@FindBy(name = "button")
	private WebElement save_btn;

	public void save_btn() {
		save_btn.click();
	}
}
