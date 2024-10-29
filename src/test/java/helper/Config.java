package helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
	public static WebDriver driver;
	public static Actions action;
	public static void confChrome() {System.setProperty("webdriver.chromedriver", "Utils.get(chrome)");}
	public static void maxWin() {driver.manage().window().maximize();}
	public static void quitWin() {driver.quit();}
	public static void attente (int s) {Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));}
}
