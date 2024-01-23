package Run;


import org.junit.runner.RunWith; 

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		
		tags="",
		features="src/test/features/PageaAceuil/Authentification.feature",
		glue={"StepDefinition","Hooks"},
		publish =true,
		plugin= {"pretty","html:target/cucumber-report.html","json:target/cucumber-repos",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		
		)

public class Runner {

}
