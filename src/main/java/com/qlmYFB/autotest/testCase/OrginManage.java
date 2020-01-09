package com.qlmYFB.autotest.testCase;
import com.qlmYFB.autotest.common.WaitTime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.security.auth.spi.LoginModule;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
public class OrginManage {
    private static Logger log = Logger.getLogger(LoginModule.class);
    static WebDriver driver;
    public static WebDriver getDriver() {
        return driver;
    }
    @BeforeSuite
    @Parameters({"ChromDriverPath","DomainName"})
    public static WebDriver BeforeUrl(String ChromDriverPath,String DomainName ) throws Exception {
//    ly谷歌驱动调用
        System.setProperty("webdriver.chrome.driver",ChromDriverPath);
        driver = new ChromeDriver();
//    默认加载时间
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(DomainName);
        WaitTime.waitTime(2000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_F12);
        log.debug("进入前的driver为："+driver);
        return  driver;
    }
//

}