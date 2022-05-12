package org.betvictor.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/features/testAutomation.feature",
//        tags = "",
        glue = {"steps"}
)
public class TaskRunner {

}
