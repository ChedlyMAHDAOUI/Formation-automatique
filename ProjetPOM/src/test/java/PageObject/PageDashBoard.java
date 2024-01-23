package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageDashBoard {
	
	public WebDriver driver;
	
	//creation de constructeur
	public PageDashBoard (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	//identification des elements
	@FindBy(how = How.XPATH, using ="//p[@class='oxd-userdropdown-name']")
	public static WebElement Nom_Profil;
	
	//creation des methodes
	public static String getNomProfil() {
		String text;
		text = Nom_Profil.getText();
		return text;
	}
	


}
