package org.betVictor;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features/login.feature",
        tags = "",
        glue = {"steps"}
)
public class TaskRunner {

}
