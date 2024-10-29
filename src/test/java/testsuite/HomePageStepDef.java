package testsuite;

import org.openqa.selenium.chrome.ChromeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

public class HomePageStepDef {
	@Given("utilisateur accede a la page d accueil")
	public void utilisateur_accede_a_la_page_d_accueil() {
		Config.driver = new ChromeDriver();
		Config.confChrome();
		Config.maxWin();
		String url="https://mistore.com.tn/";
		Config.driver.get(url);
	}

	@When("utilisateur navigue sur le menu {string} et clique sur la categorie {string}")
	public void utilisateur_navigue_sur_le_menu_et_clique_sur_la_categorie(String menu_pr, String categorie) throws Exception {
		HomePage page = new HomePage();
		page.mouseHover(menu_pr, categorie);
	}

	@Then("utilisateur redirige vers la categorie des produits {string}")
	public void utilisateur_redirige_vers_la_categorie_des_produits(String string) {
		HomePage page = new HomePage();
		page.verify_categorie(string);
		Config.quitWin();
	}

}
