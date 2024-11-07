package Hooks;

import Utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {

    @Before
    public void setUp(){
        System.out.println("Method çalıştı");
    }

    @After
    public void TearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if(scenario.isFailed()){
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }
}

