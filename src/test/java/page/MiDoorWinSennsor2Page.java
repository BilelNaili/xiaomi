package page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class MiDoorWinSennsor2Page {
	@FindBy (xpath="//button[contains(text(),'Ajouter au panier')]") WebElement btn_ajout_panier;
	@FindBy (xpath="/html/body/div[1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div/div/div/div/div/a/span/i")
	WebElement panier;
	@FindBy (xpath="/html/body/div[1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/ul/li/div[2]/a[1]")
	WebElement verif_panier;
	
	public MiDoorWinSennsor2Page () { PageFactory.initElements(Config.driver, this); }
	
	public void ajouter_au_panier() {		
		btn_ajout_panier.click();	
		}
	public void verify_panier(String x) {
		Config.attente(3);
		panier.click();
		Assert.assertEquals(verif_panier.getText(), x);
		Config.quitWin();
	}
	}
