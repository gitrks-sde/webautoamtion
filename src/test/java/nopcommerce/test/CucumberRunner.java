package nopcommerce.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags= "@HC",features= {"resources/features"}, 
glue= {"stepdefinitions"}, 
plugin= {"usage","html:reports/cucumber_report.html"},monochrome=true)
public class CucumberRunner  extends AbstractTestNGCucumberTests{

	
}
