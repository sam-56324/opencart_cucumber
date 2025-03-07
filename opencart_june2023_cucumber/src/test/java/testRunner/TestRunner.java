package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					//features= {".//Features/"},// execute all the feature file
					//features= {".//Features/Login.feature"},
					//features= {".//Features/Registration.feature"},
		
					//features= {".//Features/LoginDDTExcel.feature"},
					features= {".//Features/Login.feature",".//Features/Registration.feature"},
					//features= {"@target/rerun.txt"},
					glue={"stepDefinitions","hooks"},//package name to give
					// need to give about reports
					plugin= {
								"pretty", "html:reports/myreport.html",   //cucumber-junit report
								"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
								"rerun:target/rerun.txt",    // only for capture failure scenario
							
							},
							
					dryRun=false,    // checks mapping between scenario steps and step definition methods
					monochrome=true,    // to avoid junk characters in output
					publish=true ,  // to publish report in cucumber server and share with team
					
					tags="@sanity"  // this will execute scenarios tagged with @sanity
					//tags="@regression"
					//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
					//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
					//tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
		)
public class TestRunner {

}


