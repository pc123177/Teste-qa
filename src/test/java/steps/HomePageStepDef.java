package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import pages.HomePage;
import setups.Capabilites;

public class HomePageStepDef extends Capabilites {

	@Before("@test")
	public void setup()throws Exception{
		preparation();
	}
	@When("I open the app")
	public void I_open_the_app() throws InterruptedException {
		new HomePage().openApp();
	}
}
