package testsuite;

import org.openqa.selenium.chrome.ChromeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.MiDoorWinSennsor2Page;

public class MiDoorWinSennsor2StepDef {
	@Given("utilisateur sur la page du produit Mi Door Window Sennsor {int}")
	public void utilisateur_sur_la_page_du_produit_mi_door_window_sennsor(Integer int1) {
	    Config.driver = new ChromeDriver ();
	    Config.confChrome();
	    Config.maxWin();
	    String url ="https://mistore.com.tn/product/mi-door-window-sensor-2/";
	    Config.driver.get(url);
	}

	@When("utilisateur clique sur ajouter au panier")
	public void utilisateur_clique_sur_ajouter_au_panier() {
		MiDoorWinSennsor2Page page = new MiDoorWinSennsor2Page();
		page.ajouter_au_panier();	    
	}

	@Then("le produit {string} est disponible dans le panier")
	public void le_produit_est_disponible_dans_le_panier(String string) {
		MiDoorWinSennsor2Page page = new MiDoorWinSennsor2Page();
		page.verify_panier(string);
	}


}
