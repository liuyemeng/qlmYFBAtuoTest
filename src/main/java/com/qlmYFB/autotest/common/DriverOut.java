package com.whaty.autotest.common;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by lm1121 on 2018/11/27.
 */
public class DriverOut {
    private static Logger log = Logger.getLogger(DriverOut.class);
    WebDriver driver;
    public static void DriverOut(WebDriver  driver){
        driver.close();
    }
}
