package com.test_runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.baseelime.New_Baselime.Base_class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\admin\\eclipse-workspace\\selenium\\New_Baselime\\src\\test\\java\\com\\feature\\lime.feature",
                 glue = "com.Step_Definition",
                 dryRun = false,
                 strict = true,
                  
                 plugin = {"pretty",
                		  "json:Resources/lime.json",
                		  "html:Res/limeroad.html",
                		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                		 }
  
                 )

public class Test_runner extends Base_class{
	
	@BeforeClass
	public static void browserLaunch() {
		 launchBrowser("chrome");
		
	}

	 
}

 