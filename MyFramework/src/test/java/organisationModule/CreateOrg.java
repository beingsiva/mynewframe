package organisationModule;

import org.testng.annotations.Test;
import baseClass.Base_class;
import pomClass.Homepage;
import pomClass.OrgPom;

public class CreateOrg extends Base_class{
	@Test
	public void createOrg() {
		Homepage hp= new Homepage(driver);
		OrgPom op= new OrgPom(driver);
		hp.orgnisation();
		op.org();
		op.typeAccName();
		op.typeWebName();
	
				
	}
}
