package com.qlmYFB.autotest.common;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CheckPoint {
    private static Logger log = Logger.getLogger(CheckPoint.class);
    WebDriver driver;

    public CheckPoint() {
    }

    public static void checkPoint(WebDriver driver, String checkPoint) {
        WebElement element = null;

        try {
            element = driver.findElement(By.linkText(checkPoint));
            if (element.isDisplayed()) {
                log.debug("定位到 检查点 元素！PASS");
            }
        } catch (NoSuchElementException var4) {
            log.error("没有定位到 检查点 元素！");
        }

    }

    public static void checkSourcePoint(WebDriver driver) {
        WebElement element = null;

        try {
            element = driver.findElement(By.xpath("//*[contains(text(),'视频素材')]"));
            if (element.isDisplayed()) {
                log.error("定位到  视频素材 元素（数据未删除成功）！PASS");
                return;
            }
        } catch (NoSuchElementException var3) {
            log.debug("没有定位到 视频素材 未锁定 元素（数据删除成功）！");
        }

    }

    public static void checkAddSourcePoint(WebDriver driver) {
        WebElement element = null;

        try {
            element = driver.findElement(By.xpath("//*[contains(text(),'视频素材')]"));
            if (element.isDisplayed()) {
                log.debug("定位到  视频素材 元素（数据添加成功）！PASS");
                return;
            }
        } catch (NoSuchElementException var3) {
            log.error("没有定位到 视频素材 未锁定 元素（数据添加失败）！");
        }

    }
}
