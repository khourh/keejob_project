package com.keejob.tn;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/keejob.feature"
		,glue={"keejob_project"}
	)

public class runkee {

}
