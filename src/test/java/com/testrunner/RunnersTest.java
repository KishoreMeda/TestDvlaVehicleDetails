package test.java.com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", 
				 glue = {"test.java.com.stepdefs" }, 
				 plugin = {"pretty","html:target/dvla-reports", "json:target/dvla-reports/cucumber.json" },
				 tags = {"@DVLATest"})

public class RunnersTest {

}
