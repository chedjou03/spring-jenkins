package com.spring_Jenkins.demo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.spring_Jenkins.demo.steps",
        plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class CucumberIntegrationTest {
}
