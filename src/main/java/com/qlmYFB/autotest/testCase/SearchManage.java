package com.qlmYFB.autotest.testCase;

import com.qlmYFB.autotest.common.MyClick;
import com.qlmYFB.autotest.common.WaitTime;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class SearchManage {
    private  static Logger log =Logger.getLogger( SearchManage.class);
    WebDriver driver;
    @BeforeClass
    public void BeforeClass(){
        this.driver = OrginManage.getDriver();
    }
//    搜索-公共搜索
    @Test
    public  void  BigSearch() throws  Exception{
        WaitTime.waitTime(5000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div/div[2]/span")).click();

        WaitTime.waitTime(2000);
        driver.findElement(By.cssSelector("input")).click();
        driver.findElement(By.cssSelector("input[type=\"search\"]")).clear();
        driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("测试");
        WaitTime.waitTime(2000);
        driver.findElement(By.cssSelector("div.cancel-btn-text")).click();
        WaitTime.waitTime(2000);
        log.debug("亲爱的你成功了");
////        选择时间
//        driver.findElement(By.cssSelector("p.active > span")).click();
//        WaitTime.waitTime(2000);
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[3]/aside/section[3]/div/ul/li[3]")).click();
//        WaitTime.waitTime(8000);
////        选择区域
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[3]/aside/ul/li[1]/p/span")).click();
//        WaitTime.waitTime(2000);
//        driver.findElement(By.xpath("//*[contains(text(),'北京')]")).click();
//        WebElement element =  driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[3]/aside/section[2]/div/div[1]/div/div[2]/ul/li/div[2]/img"));
//        if(element.getAttribute("src").contains("Fja4gAAAABJRU5ErkJggg==")){
//            System.out.print(element.getAttribute("src").contains("Fja4gAAAABJRU5ErkJggg=="));
//            MyClick.myClick(driver,element);
//        }
//        WaitTime.waitTime(2000);
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[3]/aside/section[2]/div/div[2]/div/button")).click();
//        WaitTime.waitTime(3000);
//
//
////      选择信息类型
//
//        driver.findElement(By.xpath("//div[@id='app']/div[5]/div[3]/aside/ul/li[3]/p/span")).click();
//        WaitTime.waitTime(2000);
//        driver.findElement(By.xpath("//*[contains(text(),'拟建项目')]")).click();
//        WaitTime.waitTime(3000);
////选择智能检索
//        driver.findElement(By.xpath("//div[@id='app']/div[5]/div[3]/aside/ul/li[4]/p/span")).click();
//        WaitTime.waitTime(2000);
//        driver.findElement(By.xpath("//*[contains(text(),'精准检索')]")).click();
//        WaitTime.waitTime(3000);
//        driver.findElement(By.xpath("//*[contains(text(),'标题检索')]")).click();
//        WaitTime.waitTime(3000);
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div[3]/aside/section[5]/div/div/div/button")).click();

    }
}
