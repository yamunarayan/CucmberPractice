package runner;

import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/features",
        glue={"steps", "hooks"},
        dryRun = false,
       tags="@BackGroundExample")
       // plugin={"html:report/WebReport", "json:report/jsonreport.json","junit:report/xmlreport.xml"})
       // tags = "@logout", plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunnerClass {


}
