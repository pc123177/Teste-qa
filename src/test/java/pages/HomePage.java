package pages;

import org.junit.Assert;
import utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePage extends BasePage{
	TestUtils utils = new TestUtils();

	@iOSXCUITFindBy (xpath = "//XCUIElementTypeApplication[@name=\"WebmotorsChallenge\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]")
	private MobileElement LancerEVODetails;

	@iOSXCUITFindBy (accessibility = "R$ 49000,00")
	private MobileElement price;


	public HomePage() {
	}
	public HomePage openApp() throws InterruptedException {
		waitForVisibility(LancerEVODetails);
		click(LancerEVODetails);
		return this;
	}
	public HomePage enterLancer() throws InterruptedException {
		waitForVisibility(LancerEVODetails);
		click(LancerEVODetails);
		return this;
	}
	public HomePage verifyLancerPrice() throws InterruptedException {
		waitForVisibility(price);
		Assert.assertEquals(price.getText(), "R$ 49000,00");
		return this;
	}
}
