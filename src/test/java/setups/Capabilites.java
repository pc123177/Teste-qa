package setups;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Capabilites extends DesiredCapabilities {
	protected IOSDriver IOSDriver;
	private AppiumDriverLocalService service;
	private AppiumServiceBuilder builder;
	protected void preparation() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "14.4");
		capabilities.setCapability("deviceName", "iPhone 11");
		capabilities.setCapability("automationName", "XCUITest");
		capabilities.setCapability("app", "/Users/paulocesardasilvamatos/Downloads/TesteQA/src/test/resources/apps/webmotors.app");
		builder = new AppiumServiceBuilder();
		builder.withIPAddress("127.0.0.1");
		builder.usingPort(4723);
		builder.withCapabilities(capabilities);
		builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
		builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");
		service = AppiumDriverLocalService.buildService(builder);
		service.start();
		String service_url = service.getUrl().toString();
		System.out.println("Appium Service Address: " + service_url);
		IOSDriver = new IOSDriver(new URL(service_url), capabilities);
		IOSDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void stopServer() {
		service.stop();
	}
}
