package lead;

import java.io.IOException;

import org.testng.annotations.Test;

import baseClass.Base_class;
import pomClass.crm_pom_login;

public class LoginLead extends Base_class {

	@Test
	public void loginlead() throws IOException {
		crm_pom_login cr = new crm_pom_login(driver);
		String URL = pf.readDataFromProperty("url");
		String un = pf.readDataFromProperty("username");
		String pass = pf.readDataFromProperty("password");
		driver.get(URL);
		cr.loginToApp(un, pass);
		cr.loginbtn();
		
	}
}
