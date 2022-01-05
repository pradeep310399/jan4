package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods {
	@Test
	public void runLogin() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton();
		
		/*.clickCrmsfaLink()
		.clickLeadsButton()
		.clickCreateLeads()
		.enterCompanyName()
		.enterFirstname()
		.enterLastname()
		.clickCreateLeadButton()
		.verifyFirstname();*/
		

	}

}
