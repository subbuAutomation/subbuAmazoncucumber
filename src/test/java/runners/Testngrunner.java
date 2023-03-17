package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/features",glue = "stepdefinitions",monochrome = true,plugin ={"pretty","html:target/cucumberreport.html"})
public class Testngrunner extends AbstractTestNGCucumberTests {
}
