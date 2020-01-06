package com.qlmYFB.autotest.testCase;
import com.qlmYFB.autotest.common.WaitTime;
import com.qlmYFB.autotest.common.WaitTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qlmYFB.autotest.common.MyClick;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

import javax.security.auth.spi.LoginModule;

/**
 * Created by lm1121 on 2019/4/3 17:14
 */
public class DYManageX {
    private static Logger log = Logger.getLogger(DYManageX.class);
    static WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        this.driver = OrginManage.getDriver();
    }

//    订阅tab-筛选招标信息
    @Test
    public void selectZhaoBiao()throws Exception{
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_F12);
//       选择区域
        WaitTime.waitTime(1000);
        driver.findElement(By.cssSelector("svg.icon")).click();
//        选择省
        WaitTime.waitTime(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[1]/div/div[3]/div/div[1]/div/div[1]/ul/li[2]")).click();
        WaitTime.waitTime(1000);
//        选择市
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[1]/div/div[3]/div/div[1]/div/div[1]/div/div[2]/div[1]")).click();
        WaitTime.waitTime(1000);
//        确定
        driver.findElement(By.xpath("//*[contains(text(),'确定')]")).click();
//        选择产品
        driver.findElement(By.xpath("//*[contains(text(),'产品')]")).click();
        WaitTime.waitTime(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[1]/div/div[3]/div/div[1]/div/div[1]/ul/li/div[1]")).click();
//        WaitTime.waitTime(3000);
//        driver.findElement(By.cssSelector("div.item-content.Blue")).click();
        WaitTime.waitTime(1000);
        driver.findElement(By.xpath("//*[contains(text(),'确定')]")).click();
    }
//    订阅tab-订阅招标信息
    @Test
    public void orderZhaoBiao() throws Exception {
//        driver.get(baseUrl);
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_F12);
//        Actions act=new Actions(driver);
//        act.keyDown(Keys.F12).perform();
//        act.sendKeys(Keys.F12).build().perform();
        WaitTime.waitTime(1000);
        driver.findElement(By.cssSelector("div.subscriptions_btn-text")).click();
        WaitTime.waitTime(1000);
        driver.findElement(By.cssSelector("div.join-city")).click();
        WaitTime.waitTime(1000);

        WebElement element =  driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[2]/div/div[2]/ul/li/div[1]/img"));
        if(element.getAttribute("src").contains("Fja4gAAAABJRU5ErkJggg==")){
           element.click();
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
        Reporter.log("测试通过");
    }
//   订阅tab-筛选拟建信息
    @Test
    public void selectProject()  throws Exception{
//        driver.get(baseUrl);
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_F12);

//        WaitTime.waitTime(2000);
//        robot.keyPress(KeyEvent.VK_SHIFT);
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_M);
//        robot.keyRelease(KeyEvent.VK_M);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        robot.keyRelease(KeyEvent.VK_SHIFT);
        WaitTime.waitTime(1000);
//      选择拟建
        WebElement element1 = driver.findElement(By.xpath("//div[@id='app']/div[5]/div/div/div[2]/div[2]/span"));
        MyClick.myClick(driver,element1);
//      选择地区
        WaitTime.waitTime(1000);
        MyClick.myClick(driver,driver.findElement(By.cssSelector("li.option > p > span")));
        WaitTime.waitTime(1000);
        MyClick.myClick(driver,driver.findElement(By.xpath("//div[@id='app']/div[5]/div/div/div[2]/div/div/div/aside/section[2]/div/div[2]/div[2]")));
        WaitTime.waitTime(1000);
        MyClick.myClick(driver,driver.findElement(By.xpath("//button[@type='button']")));
//      选择阶段
        WaitTime.waitTime(1000);
        MyClick.myClick(driver,driver.findElement(By.xpath("//div[@id='app']/div[5]/div/div/div[2]/div/div/div/aside/ul/li[2]/p/span")));
        WaitTime.waitTime(1000);
        MyClick.myClick(driver, driver.findElement(By.xpath("//div[@id='app']/div[5]/div/div/div[2]/div/div/div/aside/section[3]/div/div/div/div/ul/li[3]/div")));
        WaitTime.waitTime(1000);
        MyClick.myClick(driver,driver.findElement(By.xpath("//div[@id='app']/div[5]/div/div/div[2]/div/div/div/aside/section[3]/div/div/div/div[2]/ul/li[2]/div")));
        WaitTime.waitTime(1000);
        MyClick.myClick(driver, driver.findElement(By.xpath("(//button[@type='button'])[2]")));
//      搜索类型
        WaitTime.waitTime(1000);
        MyClick.myClick(driver,driver.findElement(By.xpath("//div[@id='app']/div[5]/div/div/div[2]/div/div/div/aside/ul/li[3]/p/span")));
        WaitTime.waitTime(1000);
        MyClick.myClick(driver, driver.findElement(By.xpath("//div[@id='app']/div[5]/div/div/div[2]/div/div/div/aside/section[4]/div/div/div/div/ul/li[2]/div")));
        WaitTime.waitTime(1000);
        MyClick.myClick(driver,driver.findElement(By.xpath("//div[@id='app']/div[5]/div/div/div[2]/div/div/div/aside/section[4]/div/div/div/div[2]/ul/li[2]/div")));
        WaitTime.waitTime(1000);
        MyClick.myClick(driver,driver.findElement(By.xpath("(//button[@type='button'])[3]")));
    }
//   订阅tab-订阅拟建信息
    @Test
    public void  orderProject() throws Exception{
//            driver.get(baseUrl);
//            Robot robot = new Robot();
//            robot.keyPress(KeyEvent.VK_F12);
//            robot.keyRelease(KeyEvent.VK_F12);
 //      选择拟建
//            WebElement element1 = driver.findElement(By.xpath("//div[@id='app']/div[4]/div/div/div[2]/div[2]/span"));
//            MyClick.myClick(driver,element1);
            WaitTime.waitTime(1000);
            driver.findElement(By.cssSelector("div.subscriptions_btn-text")).click();
            WaitTime.waitTime(1000);
//            编辑
            driver.findElement(By.cssSelector("div.add-btn-text")).click();
            WaitTime.waitTime(1000);
//          修改阶段
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div/div/div[2]/div/div/div[1]/ul/li[2]/div")).click();
            WaitTime.waitTime(1000);
            WebElement element2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div/div/div[2]/div/div/div[2]/ul/li[2]/div[1]/img"));
            if(element2.getAttribute("src").contains("sDSBgQFja4gAAAABJRU5ErkJggg==")){
                MyClick.myClick(driver, element2);
            }
            WaitTime.waitTime(1000);
            driver.findElement(By.xpath("//*[contains(text(),'保存设置')]")).click();
            WaitTime.waitTime(1000);
            driver.findElement(By.xpath("//*[contains(text(),'修改类型')]")).click();
            WaitTime.waitTime(1000);
//            选择父类型
            MyClick.myClick(driver,driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div/div/div[2]/div/div/div[1]/ul/li[4]/div")));
            WaitTime.waitTime(1000);
//            选择子类型
            WebElement element3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div/div/div[2]/div/div/div[2]/ul/li[2]/div[1]/img"));
            if(element3.getAttribute("src").contains("ROFW7Ggvxd7sDSBgQFja4gAAAABJRU5ErkJggg==")){
                MyClick.myClick(driver, element3);
            }

            driver.findElement(By.xpath("//*[contains(text(),'保存设置')]")).click();
            WaitTime.waitTime(1000);
            driver.findElement(By.xpath("//*[contains(text(),'添加')]")).click();
            WaitTime.waitTime(1000);
//            地区
            MyClick.myClick(driver,driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[2]/div/div[1]/div[2]")));
            WaitTime.waitTime(1000);
//            子地区
            WebElement element4 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[2]/div/div[2]/div[2]/div[1]/img"));
            if(element4.getAttribute("src").contains("ROFW7Ggvxd7sDSBgQFja4gAAAABJRU5ErkJggg==")){
                MyClick.myClick(driver, element4);
            }            WaitTime.waitTime(1000);
            driver.findElement(By.xpath("//*[contains(text(),'保存设置')]")).click();
            WaitTime.waitTime(1000);
            driver.findElement(By.xpath("//*[contains(text(),'开启订阅')]")).click();
        }
//    订阅tab-搜索中标信息selectZhongBiao
    @Test
    public void selectZhongBiao()throws Exception{
//                driver.get(baseUrl);
//                Robot robot = new Robot();
//                robot.keyPress(KeyEvent.VK_F12);
                WaitTime.waitTime(1000);
                driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[1]/div/div[1]/div[3]/span")).click();
                WaitTime.waitTime(1000);
//                  选择区域
                driver.findElement(By.cssSelector("svg.icon")).click();
                WaitTime.waitTime(1000);
//                  选择省
                driver.findElement(By.xpath("//div[@id='app']/div[5]/div/div/div[3]/div/div[2]/div/div/ul/li[2]")).click();
                WaitTime.waitTime(1000);
                if(driver.findElement(By.cssSelector("svg.icon.t-gray")).isDisplayed()){
                    driver.findElement(By.cssSelector("svg.icon.t-gray")).click();
                }
//                 选择市

                WaitTime.waitTime(1000);
//                点击确认
                driver.findElement(By.xpath(" //div[@id='app']/div[5]/div/div/div[3]/div/div[2]/div/div[2]")).click();
                WaitTime.waitTime(1000);
//                选择产品
                driver.findElement(By.xpath("//div[@id='app']/div[5]/div/div/div[3]/div/div/div[2]/div")).click();
                WaitTime.waitTime(1000);
//                选择目标产品
                driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[1]/div/div[3]/div/div[2]/div/div[1]/ul/li/div[1]")).click();

                WaitTime.waitTime(1000);
//                确定
                driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[1]/div/div[3]/div/div[2]/div/div[2]")).click();
            }
//    订阅tab-订阅中标信息orderZhongBiao
    @Test
    public void orderZhongBiao()throws Exception{
                WaitTime.waitTime(1000);
                driver.findElement(By.cssSelector("div.subscriptions_btn-text")).click();
                WaitTime.waitTime(1000);
                driver.findElement(By.cssSelector("div.join-city")).click();
                WaitTime.waitTime(1000);
                WebElement element =  driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[2]/div/div[2]/ul/li/div[1]/img"));
                if(element.getAttribute("src").contains("Fja4gAAAABJRU5ErkJggg==")){
                    driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[2]/div/div[2]/ul/li/div[1]/img")).click();
                }
                WaitTime.waitTime(1000);
                driver.findElement(By.xpath("//*[contains(text(),'保存设置')]")).click();

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
                WaitTime.waitTime(1000);
                Reporter.log("测试通过");

            }

}

