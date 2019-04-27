package StepDefinition;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                 features = {"/Users/nisum/Documents/AbhiBusBDD/src/test/resources/features"},
                 plugin = {"html:target/cucumber-reports"},
                 tags = {})
public class MainRunner {


}
