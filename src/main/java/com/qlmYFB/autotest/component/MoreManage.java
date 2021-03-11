package com.qlmYFB.autotest.component;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 * @program: selenium_demo
 * @description: qlmYFB Web Auto Project
 * @author: liumeng
 * @create: 2021-02-22 11:24
 **/
public class MoreManage {
    private  static Logger logger = Logger.getLogger(MoreManage.class);
    WebDriver driver = null;
    /*点击进入更多模块*/
    public static void MoreTab(WebDriver driver){
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div/div[3]"));
            driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                element.click();
                logger.debug("定位到，更多Tab 元素");
            }
        }catch (NoSuchElementException e){
            logger.error("未定位到，更多Tab 元素");
        }
    }

    /*供求市场*/
    public static void SupplySearch(WebDriver driver){
        WebElement element =null;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div/div[2]/ul/li[1]/div/div[1]/img"));
            driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                logger.debug("定位到，供求市场图标 元素");
            }
        }catch (NoSuchElementException e){
            logger.error("未定位到，供求市场图标 元素");
        }
    }
    public static void SupplySearchTwo(WebDriver driver){
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div/div[2]/div[2]/div"));
            driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                element.click();
                logger.debug("定位到，供求市场-二级搜索框 元素");
            }
        }catch (NoSuchElementException e){
            logger.error("未定位到，供求市场-二级搜索框 元素");
        }
    }
    public static void SupplySearchTwoInput(WebDriver driver,String KeyWords){
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div/div[3]/div/div[1]/form/input"));
            driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                element.sendKeys(KeyWords);
                logger.debug("定位到，供求市场-二级输入内容 元素");
            }
        }catch (NoSuchElementException e){
            logger.error("未定位到，供求市场-二级输入内容 元素");
        }
    }

    public static void SupplySearchTwoInputConfirm(WebDriver driver){
        WebElement element = null;
        try{
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div/div[3]/div/div[2]"));
            driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                element.click();
                logger.debug("定位到，供求市场-二级搜索-确定按钮 元素");
            }
        }catch (NoSuchElementException e){
            logger.error("未定位到，供求市场-二级搜索-确认按钮 元素");
        }
    }
    public static void SupplySearchSeeM(WebDriver driver){
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div/div[4]/div[1]/div[1]"));
            driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                element.click();
                logger.debug("定位到，供求市场-第一条信息 元素");
            }
        }catch (NoSuchElementException e){
            logger.error("未定位到，供求市场-第一条信息 元素");
        }
    }
    public static void SupplySearchSeeMBack(WebDriver driver){
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/header/div[1]/div"));
            driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                element.click();
                logger.debug("定位到，供求市场-信息返回 元素");
            }
        }catch (NoSuchElementException e){
            logger.error("未定位到，供求市场-信息返回 元素");
        }
    }

    public static void SupplySearchSeeBackBack(WebDriver driver){
        WebElement element = null;
        try{
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div/header/div[1]/div"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()){
                element.click();
                logger.debug("定位到，供求市场-信息返回-返回 元素");
            }
        }catch (NoSuchElementException e){
            logger.error("未定位到，供求市场-信息返回-返回 元素");
        }
    }


}
