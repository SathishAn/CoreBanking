package techM;

import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.runtime.model.CucumberTagStatement;
import gherkin.formatter.model.ScenarioOutline;
import gherkin.formatter.model.Tag;
import utilities.CoreTapWrappers;
import utilities.GenericWrapper;
import wrappers.GenericWrappers;

@CucumberOptions(features = { "src/test/resources/features"}, glue = {"stepdefinitions"}, tags= {"@Regression"})
public class TechMRunnerClass extends CoreTapWrappers {
	
	
	private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass()  {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 

    @Test(dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {    
    	
    	testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());    	
        
    }

    /**
     * @return returns two dimensional array of {@link CucumberFeatureWrapper} objects.
     */
    @DataProvider()
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        testNGCucumberRunner.finish();
    }

}

