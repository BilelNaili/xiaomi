package testsuite;

import org.openqa.selenium.chrome.ChromeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.MaisonConnecteePage;

public class MaisonConnecteeStepDef {
	@Given("utilisateur sur la page maison connectee")
	public void utilisateur_sur_la_page_maison_connectee() {
	  Config.driver= new ChromeDriver();
	  Config.confChrome();
	  Config.maxWin();
	  String url= "https://mistore.com.tn/product-category/maison-connectee/";
	  Config.driver.get(url);
	}

	@When("utilisateur clique sur le produit {string}")
	public void utilisateur_clique_sur_le_produit(String string) throws Exception {
		MaisonConnecteePage page = new MaisonConnecteePage();
		page.tri();
		page.cliquer_sur_prod(string);
	}

	@Then("utilisateur de redirige ves la page du produit {string}")
	public void utilisateur_de_redirige_ves_la_page_du_produit(String string) {
		MaisonConnecteePage page = new MaisonConnecteePage();
		page.verify_prod(string);
		Config.quitWin();
	}

}
