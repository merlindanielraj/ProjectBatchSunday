package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.stepdefination.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\AdactinLoginPage.feature",
snippets = SnippetType.CAMELCASE,
glue = "com.stepdefination", dryRun = false, stepNotifications = true, plugin = {
		"pretty", "html:target\\Report\\cucumber-report.html", "junit:target\\Report\\cucumber-report.xml",
		"json:target\\Report\\cucumber-report.json" ,"rerun:src\\test\\resources\\failed.txt"}, monochrome = false, publish = true)
public class TestRunner {

	@AfterClass
	public static void afterClass() {
		Reporting.generateReport(
				"C:\\Users\\Lenovo\\eclipse-Tamizh13\\Cucumber8PMBatch\\target\\Report\\cucumber-report.json");
	}

}
