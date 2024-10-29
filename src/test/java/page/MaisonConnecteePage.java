package page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import helper.Config;

public class MaisonConnecteePage {
	@FindBy (xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[2]/div[4]/form/div/select")
	WebElement tri;
	@FindBy (xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div")
	List <WebElement> prod;
	@FindBy (xpath="/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/h3") WebElement verif_prod;
	
	public MaisonConnecteePage() {PageFactory.initElements(Config.driver, this);}
	
	public void tri () {
		String sort="Tri par popularité";
		Select select = new Select(tri);
		select.selectByVisibleText(sort);
	}
	public void cliquer_sur_prod(String nom_prod) throws Exception {
		Thread.sleep(4000);
		try {
		for (WebElement pro: prod) {
			if(pro.getText().contains(nom_prod)) {pro.click();			}
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void verify_prod (String nom) {
		Assert.assertEquals(verif_prod.getText(), nom);	}
}
