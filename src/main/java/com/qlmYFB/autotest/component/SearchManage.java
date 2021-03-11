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
 * @create: 2021-02-22 11:10
 **/
public class SearchManage {
    private static Logger logger = Logger.getLogger(SearchManage.class);
    WebDriver driver = null;

    /*点击搜索tab*/
    public static void SearchTab(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div/div[2]"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.click();
                logger.debug("定位到，搜索tab 元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，搜索tab 元素");
        }
    }

    /*我的里面VIP特权*/
    public static void SearchVip(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[1]/div[1]/div/img"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.click();
                logger.debug("定位到，搜索VIP特权 元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，搜索VIP特权 元素");
        }
    }

    /*大搜索*/
    public static void BigSearch(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.cssSelector("input"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.click();
                logger.debug("定位到,搜索-大搜索框 元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，搜索-大搜索框 元素");
        }
    }

    public static void BigSearchTwo(WebDriver driver, String KeyWords) {
        WebElement element = null;
        try {
            element = driver.findElement(By.cssSelector("input[type=\"search\"]"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.sendKeys(KeyWords);
                logger.debug("定位到,搜索-大搜索框-二级输入框 元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，搜索-大搜索框-二级输入框 元素");
        }
    }

    public static void BigSearchConfirm(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.cssSelector("div.cancel-btn-text"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.click();
                logger.debug("定位到,搜索-大搜索框-二级输入框-确认 元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，搜索-大搜索框-二级输入框-确认 元素");
        }
    }

    public static void SearchSeeM(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.cssSelector("div.list-view-content > p"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.click();
                logger.debug("定位到,搜索-大搜索框-查看信息 元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，搜索-大搜索框-查看信息 元素");
        }
    }

    public static void SearchSeeMBack(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.cssSelector("svg.icon"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.click();
                logger.debug("定位到,搜索-大搜索框-查看信息-返回 元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，搜索-大搜索框-查看信息-返回元素");
        }
    }

    public static void SearchSeeMBackBack(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.cssSelector("div.router-back > svg.icon"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.click();
                logger.debug("定位到,搜索-大搜索框-查看信息-返回-返回 元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，搜索-大搜索框-查看信息-返回-返回 元素");
        }
    }

    /*招标搜索*/
    public static void BiddingSearch(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.cssSelector("div.update-search-tab-sub.mr-new > img"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.click();
                logger.debug("定位到，搜索中招标搜索图标  元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，搜索中招标搜索图标  元素");
        }
    }

    public static void BiddingSearchTwo(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.cssSelector("input[type=\"search\"]"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.click();
                logger.debug("定位到，招标搜索第二级搜索框 元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，招标搜索第二级搜索框 元素");
        }
    }

    public static void BiddingSearchTwoInputKeyWords(WebDriver driver, String KeyWords) {
        WebElement element = null;
        try {
            element = driver.findElement(By.cssSelector("input[type=\"search\"]"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.sendKeys(KeyWords);
                logger.debug("定位到，招标搜索第二级搜索框输入框 元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，招标搜索第二级搜索框输入框 元素");
        }
    }

    public static void BiddingSearchConfirm(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.cssSelector("div.cancel-btn-text"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.click();
                logger.debug("定位到，招标搜索第二级搜索框-确定按钮  元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，招标搜索第二级搜索框-确定按钮  元素");
        }
    }

    public static void BiddingSearchSeeM(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.cssSelector("strong"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.click();
                logger.debug("定位到，招标搜索-查看信息  元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，招标搜索-查看信息  元素");
        }
    }

    public static void BiddingSearchSeeMBack(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.cssSelector("svg.icon"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.click();
                logger.debug("定位到，招标搜索-查看信息-返回  元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，招标搜索-查看信息-返回  元素");
        }
    }

    public static void BiddingSearchSeeMBackBack(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.cssSelector("div.left > div > svg.icon"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.click();
                logger.debug("定位到，招标搜索-查看信息-返回-返回  元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，招标搜索-查看信息-返回-返回  元素");
        }
    }

    /*拟建搜索*/
    public static void ProposedSearch(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[1]/div[4]/div/div/div[2]/img"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.click();
                logger.debug("定位到，拟建搜索图标 元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，拟建搜索图标 元素");
        }
    }

    public static void ProposedSearchTwo(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.cssSelector("input[type=\"search\"]"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.click();
                logger.debug("定位到，拟建搜索图标-二级搜索框 元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，拟建搜索图标-二级搜索框 元素");
        }
    }

    public static void ProposedSearchTwoInputKeyWords(WebDriver driver, String KeyWords) {
        WebElement element = null;
        try {
            element = driver.findElement(By.cssSelector("input[type=\"search\"]"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.sendKeys(KeyWords);
                logger.debug("定位到，拟建搜索图标-二级搜索框-输入内容 元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，拟建搜索图标-二级搜索框-输入内容 元素");
        }
    }

    public static void ProposedSearchTwoConfirm(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.cssSelector("div.cancel-btn-text"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.click();
                logger.debug("定位到，拟建搜索图标-二级搜索框-确认 元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，拟建搜索图标-二级搜索框-确认 元素");
        }
    }

    public static void ProposedSearchSeeM(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"122419699\"]/div/div/div/div[2]/div"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.click();
                logger.debug("定位到，拟建搜索图标-查看信息 元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，拟建搜索图标-查看信息 元素");
        }
    }

    public static void ProposedSearchSeeMBack(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.cssSelector("svg.icon"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.click();
                logger.debug("定位到，拟建搜索图标-查看信息-返回 元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，拟建搜索图标-查看信息-返回 元素");
        }
    }

    /*中标搜索*/
    public static void ZhongBiddingSearch(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[1]/div[4]/div/div/div[3]/img"));
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            if (element.isDisplayed()) {
                element.click();
                logger.debug("定位到，搜索中的中标搜索图标 元素");
            }
        } catch (NoSuchElementException e) {
            logger.error("未定位到，搜索中的中标搜索 元素");

        }
    }

    /*企业查询*/
    public static void CompanySearch(WebDriver driver) {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[1]/div[4]/div/div/div[4]/img"));
            driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                logger.debug("定位到，企业查询图标 元素");
            }
        }catch (NoSuchElementException e){
            logger.error("未定位到 企业查询图标 元素");
        }
    }
    public static void CompanySearchTwo(WebDriver driver){
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div/div[2]/input"));
            driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                element.click();
                logger.debug("定位到,企业查询-二级查询框 元素");
            }
        }catch (NoSuchElementException e){
            logger.error("未定位到,企业查询-二级查询框 元素");
        }
    }
    public static void CompanySearchTwoInput(WebDriver driver,String KeyWords){
        WebElement element = null;
        try {
            element = driver.findElement(By.id("input-focus"));
            driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.sendKeys(KeyWords);
                logger.debug("定位到，企业查询-二级查询-输入内容 元素");
            }
        }catch (NoSuchElementException e){
            logger.error("未定位到，企业查询-二级查询-输入内容 元素");
        }
    }
    public static void CompanySearchTwoInputConfirm(WebDriver driver){
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/form/span"));
            driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                logger.debug("定位到 企业查询-二级查询确认按钮 元素");
            }
        }catch (NoSuchElementException e){
            logger.error("未定位到 企业查询-二级查询确认按钮 元素");
        }
    }
    public static void CompanyAllType(WebDriver driver){
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/aside/ul/li/p/span"));
            driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                logger.debug("定位到 企业查询-搜索列表-全部类型 元素");
            }
        }catch (NoSuchElementException e){
            logger.error("未定位到 企业查询-搜索列表-全部类型 元素");
        }
    }
    public static void CompanyBiddingZhongBiddingType(WebDriver driver){
        WebElement element = null;
        try{
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/aside/section[2]/div/ul/li[2]"));
            driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                logger.debug("定位到，企业招中标类型 元素");
            }
        }catch (NoSuchElementException e){
            logger.error("未定位到，企业招中标类型 元素");
        }
    }
    public static void CompanySeeM(WebDriver driver){
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[3]/div/ul/li[1]/div/div/div/div/div[1]/div[2]/div[1]"));
            driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                element.click();
                logger.debug("定位到，企业查询-第一条信息 元素");
            }
        }catch (NoSuchElementException e){
            logger.error("未定位到，企业查询第一条信息 元素");
        }
    }

    public static void CompabySeeMBack(WebDriver driver){
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/header/div[1]/div/svg"));
            driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                logger.debug("定位到，企业查看信息-返回 元素");
            }
        }catch (NoSuchElementException e){
            logger.error("未定位到，企业查看信息-返回 元素");
        }
    }
    public static void CompabySeeMBackBack(WebDriver driver){
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/header/div[1]/div/img"));
            driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                logger.debug("定位到，企业查看信息-返回-返回 元素");
            }
        }catch (NoSuchElementException e){
            logger.error("未定位到，企业查看信息-返回-返回 元素");
        }
    }
    

}
