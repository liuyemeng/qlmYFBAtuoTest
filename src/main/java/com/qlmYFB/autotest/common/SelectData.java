package com.whaty.autotest.common;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;

/**
 * Created by lm1121 on 2018/11/9.
 */
public class SelectData {
    private static Logger log = Logger.getLogger(SelectData.class);
    WebDriver driver;
    //  定位书籍名称搜索输入框
    public static void selectBookNameTwo(WebDriver driver, String selectBookName) {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
            if (element.isEnabled()) {
                element.sendKeys(selectBookName);
                log.debug("定位到 书籍名称搜索输入框 元素！PASS");
            }
        } catch (NoSuchElementException e) {
            log.error("没有定位到 书籍名称搜索输入框 元素！");
        }
    }
    //  定位书籍名称搜索输入框
    public static void selectBookNameOne(WebDriver driver, String selectBookName) {
        WebElement element = null;
        try {
            element =driver.findElement(By.cssSelector("input.el-input__inner"));
            if (element.isEnabled()) {
                log.debug("定位到 书籍名称搜索输入框 元素！PASS");
                element.sendKeys(selectBookName);
            }
        } catch (NoSuchElementException e) {
            log.error("没有定位到 书籍名称搜索输入框 元素！");
        }
    }

    //        定位搜索按钮元素
    public static void selectButton(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.linkText("搜索"));
            if (element.isDisplayed()) {
                //                element.click();
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();", element);
                log.debug("定位到 书籍搜索按钮 元素！PASS");
            }
        } catch (NoSuchElementException e) {
            log.error("没有定位到 书籍搜索按钮 元素！");
        }
    }


}
