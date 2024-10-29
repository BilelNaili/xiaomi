package page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class HomePage {
	@FindBy (xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/a")
	List <WebElement> menu1;
	@FindBy (xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li[3]/div/div/div/div/section/div/div/div")
	List <WebElement> menu2;
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/header/h1")
	WebElement verifcat;
	
	public HomePage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void mouseHover(String menus, String cat) throws Exception {
		Config.attente(10);
		Thread.sleep(3000);
		try {
			for (WebElement menu:menu1) {
				if(menu.getText().contains(menus));
				Config.action= new Actions (Config.driver);
				Config.action.moveToElement(menu).perform();
				for(WebElement category:menu2) {
					if(category.getText().contains(cat)) {category.click();
					
					}
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void cliquer_categorie(String cat) throws Exception {
		Config.attente(10);
		Thread.sleep(4000);
		try {
			for (WebElement categorie : menu2) {
				if(categorie.getText().contains(cat)) {
					categorie.click();
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void verify_categorie(String abc) {
		Assert.assertEquals(abc, verifcat.getText());
	}
}
