package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.PageAuthentifaction;
import PageObject.PageDashBoard;
import io.cucumber.java.en.*;


public class AuthentificationStepDef {
	
	WebDriver driver= SetUp.driver;
	
	PageAuthentifaction login1 =new PageAuthentifaction(driver);
	PageDashBoard dash1 = new PageDashBoard(driver);
	
	
	@Given("je veux ouvrir URL {string}")
	public void je_veux_ouvrir_url(String string) {
		login1.ouvrirURL(string);
	   
	}

	@When("je veux saisir le user {string}")
	public void je_veux_saisir_le_user(String string) {
		login1.saisirUser(string);
	    
	}

	@When("je veux saisir le mot de passe {string}")
	public void je_veux_saisir_le_mot_de_passe(String string) {
		login1.saisirPass(string);
	    
	}

	@When("je veux cliquer sur le bouton login")
	public void je_veux_cliquer_sur_le_bouton_login() {
		login1.cliqueLogin();
	   
	}

	@Then("je dois verifier le nom du profil {string}")
	public void je_dois_verifier_le_nom_du_profil(String string) {
	   Assert.assertEquals(string, dash1.getNomProfil()); 
	}

}
