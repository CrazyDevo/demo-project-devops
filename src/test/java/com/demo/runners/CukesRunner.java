package com.demo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json", //For Jenkins Report
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" //For Allure Report
        },
        features = "src/test/resources/features",
        glue = "com/demo/step_definitions",
        dryRun = false,
        tags = "@cydeo",
        publish = true //generating a report with public link
)
public class CukesRunner {}


