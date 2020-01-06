package com.qlmYFB.autotest.testCase;
import com.qlmYFB.autotest.common.WaitTime;
import org.openqa.selenium.*;
import com.qlmYFB.autotest.common.WaitTime;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Created by lm1121 on 2019/4/3 17:14
 */
public class DYManage {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    private WebElement element;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
//    ly谷歌驱动调用
        System.setProperty("webdriver.chrome.driver","D:\\AutoTest\\01 自动化培训\\01 自动化培训\\自动化测试工具\\测试工具\\chromedriver.exe");
        driver = new ChromeDriver();
//    访问链接
        baseUrl = "https://weixin.qianlima.com/qlmYFB/index.html?openid=oFNc6s8Z7DfyW5CU4sVol0nBgrZQ#/subscriptionPage/zbSubscriptionPage";
//    默认加载时间
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test() throws Exception {
        driver.get("https://weixin.qianlima.com/qlmYFB/index.html?openid=oFNc6s8Z7DfyW5CU4sVol0nBgrZQ#/subscriptionPage/zbSubscriptionPage");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_F12);
//        Actions act=new Actions(driver);
//        act.keyDown(Keys.F12).perform();
//        act.sendKeys(Keys.F12).build().perform();
        WaitTime.waitTime(3000);
        driver.findElement(By.cssSelector("div.subscriptions_btn-text")).click();
        WaitTime.waitTime(3000);
        driver.findElement(By.cssSelector("div.join-city")).click();
//        driver.navigate().refresh();
//        driver.findElement(By.xpath("//div[@id='app']/div[4]/div[2]/div/div/ul/li[2]/div")).click();
//        driver.navigate().refresh();

        WebElement element =  driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[2]/div/div[2]/ul/li/div[1]/img"));
        if(element.getAttribute("src").contains("Fja4gAAAABJRU5ErkJggg==")){
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[2]/div/div[2]/ul/li/div[1]/img")).click();
        }
        WaitTime.waitTime(1000);
        driver.findElement(By.cssSelector("div.confirm")).click();

        List<WebElement> elements = driver.findElements(By.className("keywords-item"));
        WaitTime.waitTime(1000);
        if (elements.size()==5){
            driver.findElement(By.cssSelector("div.keywords-item > svg.icon")).click();
        }

        driver.findElement(By.cssSelector("div.inputs-num")).click();
        driver.findElement(By.cssSelector("input.t-dgray")).clear();
//        输入内容
        driver.findElement(By.cssSelector("input.t-dgray")).sendKeys("测试");
        driver.findElement(By.cssSelector("div.btn > span")).click();
//        开启订阅
        driver.findElement(By.cssSelector("div.set-sub-btn")).click();
        WaitTime.waitTime(90);
    }
}

