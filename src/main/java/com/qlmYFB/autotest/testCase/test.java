package com.qlmYFB.autotest.testCase;
import com.qlmYFB.autotest.common.MyClick;
import com.qlmYFB.autotest.common.WaitTime;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        //    ly谷歌驱动调用
        System.setProperty("webdriver.chrome.driver","D:\\AutoTest\\01 自动化培训\\01 自动化培训\\自动化测试工具\\测试工具\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://sso.bidcenter.com.cn/login/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.findElement(By.id("txtusername")).clear();
        driver.findElement(By.id("txtusername")).sendKeys("18612483640");
        driver.findElement(By.id("txtpassword")).clear();
        driver.findElement(By.id("txtpassword")).sendKeys("abc123456");
        driver.findElement(By.id("login_login_btn")).click();


    }

    @Test
    public void test() throws Exception {
        driver.findElement(By.id("aliSearchInput")).clear();
        driver.findElement(By.id("aliSearchInput")).sendKeys("服务器");
        driver.findElement(By.className("sousuo")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0)");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.findElement(By.linkText("下一页")).click();
    }


}
