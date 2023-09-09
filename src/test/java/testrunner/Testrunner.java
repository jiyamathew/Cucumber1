package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Mathew\\eclipse-workspace\\Cucumber1\\src\\test\\java\\feature",glue= {"stepdefin"},
plugin= {"pretty","html:target/HtmlReports"},monochrome=true)
public class Testrunner {

}
