package runner_file;

import org.junit.runner.RunWith; 
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src\\main\\java\\feature_file\\signUp.feature", //the path of the feature files
			glue={"StepDef"}, //the path of the step definition files
			format= {"pretty","html:test-outout", "json:report_json/cucumber.json", "junit:report_xml/cucumber.xml"}
			
            )        

public class TestRunner {

}
