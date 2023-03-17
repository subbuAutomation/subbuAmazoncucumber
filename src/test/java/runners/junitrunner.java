package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/features",glue = "stepdefinitions",monochrome = true,plugin ={"pretty","html:target/cucumberreport.html"})
public class junitrunner {
}
