package com.qlmYFB.autotest.component;
import com.qlmYFB.autotest.common.MyClick;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;
/**
 * @program: selenium_demo
 * @description: qlmYFB Web Auto Project
 * @author: liumeng
 * @create: 2021-02-20 10:04
 **/
public class FreeDyManage {
    private static Logger log = Logger.getLogger(FreeDyManage.class);
    WebDriver driver;
 /*招标订阅*/
    public static void   BiddingSubscriptionEditButton(WebDriver driver){
        WebElement element= null;
        try {

            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[3]/div/div[1]/div[1]/div[3]/div"));
            driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
            log.debug("定位到，订阅编辑按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，订阅编辑按钮  元素");

        }
    }
    public static void   RegionRegion(WebDriver driver){
        WebElement element= null;
        try {
            driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
            element=driver.findElement(By.cssSelector("div.content-right-area-list"));
            if(element.isDisplayed()){
                JavascriptExecutor js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();", element);
                log.debug("定位到，选择编辑地区区域  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择编辑地区区域  元素");

        }
    }
    public static void   RegionSelectNationalButton(WebDriver driver){
        WebElement element= null;
        try {
            driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div[2]/div[1]/div[2]/div/div"));
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，选择全国按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择全国按钮  元素");

        }
    }
    public static void   RegionSelectBeijingButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div[2]/div[2]/div[2]/div[2]/div"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，选择北京按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择北京按钮  元素");
        }
    }

    public static void   RegionSubscriptionSaveButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div[1]/div"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，订阅地区保存  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，订阅地区保存  元素");
        }
    }
    public static void   DeleteKeywords(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[2]/div[3]/div[2]/div[1]/div"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，删除关键词  元素");
            }
        }catch (NoSuchElementException e){
                log.error("未定位到，删除关键词  元素");
        }
    }

    public static void   RecommendedKeywords(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[2]/div[4]/ul/li[1]/span"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，同行关键词 元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，同行关键词  元素");
        }
    }

    public static void   KeyWordsInput(WebDriver driver,String KeyWords){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[2]/div[2]/div/div[1]/label/div/input"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.sendKeys(KeyWords);
                log.debug("定位到，订阅词输入框  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，订阅词输入框  元素");
        }
    }
    public static void   KeySaveButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[2]/div[2]/div/div[1]/div/div/span"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，订阅词保存按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，订阅词保存按钮  元素");
        }
    }
    public static void   DySaveButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div/span"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，订阅保存按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，订阅保存按钮  元素");
        }
    }
    /*招标订阅筛选*/
    public static void   AreaSelectButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.cssSelector("div.subscriptions-item"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，地区筛选按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，地区筛选按钮  元素");
        }
    }
    public static void   AreaSelectBeijingButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[3]/div/div[1]/div[2]/div[3]/div[1]/ul/li"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，地区北京选项  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，地区北京选项  元素");
        }
    }
    public static void   AreaSelectBeijingYES(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.cssSelector("svg.icon.t-gray"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，地区北京选项  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，地区北京选项  元素");
        }
    }
    public static void   AreaSelectBeijingNO(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.cssSelector("svg.icon.t-blue"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，地区北京取消  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，地区北京取消  元素");
        }
    }

    public static void   AreaSelectConfirmButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[3]/div/div[1]/div[2]/div[3]/div[2]"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，筛选地区确认按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，筛选地区确认按钮  元素");
        }
    }
    public static void   ProductSelectButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[3]/div/div[1]/div[1]/div[2]"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，筛选产品确认按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，筛选产品确认按钮  元素");
        }
    }

    public static void   ProductSelectFirst(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[3]/div/div[1]/div[2]/div[1]/div[1]/ul/li/div[1]"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，选择第一个产品  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择第一个产品  元素");
        }
    }

    public static void   ProductSelectConfirmButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[3]/div/div[1]/div[2]/div[1]/div[2]"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，选择产品确定按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择产品确定按钮  元素");
        }
    }
/*拟建订阅*/
    public static void   ProposedSubscription(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[2]/div[2]/span"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，拟建Tab  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，拟建Tab  元素");
        }
    }
    public static void   ProposedSubscriptionEditButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[2]/div/div[1]/div/aside/ul/li[4]/div/div"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，拟建编辑按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，拟建编辑按钮  元素");
        }
    }
    public static void   ProposedSubscriptionSelectStage(WebDriver driver){
        WebElement element= null;
        try {
            element = driver.findElement(By.xpath("//*[contains(text(),'修改阶段')]"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，选择阶段  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择阶段  元素");
        }
    }
    public static void   SelectStageLeft(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div/div[2]/div/div/div[1]/ul/li[2]/div"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，选择左边工程选筹备  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择左边工程选筹备  元素");
        }
    }
    public static void   SelectStageRightLand(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div/div[2]/div/div/div[2]/ul/li[2]/div[2]/img"));
//            element=driver.findElement(By.cssSelector("li.row.padLeft2 > div.city-name"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()&&element.getAttribute("src").contains("EAAAAAASUVORK5CYII=")){
                MyClick.myClick(driver,element);
                log.debug("定位到，选择左右边的国土  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择左右边的国土  元素");
        }
    }

    public static void   SelectStageConfirmButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div/div[3]/button"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，选择阶段确定按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择阶段确定按钮  元素");
        }
    }

    public static void   ProposedSubscriptionSelectType(WebDriver driver){
        WebElement element= null;
        try {
//            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div[2]/div[2]/div[2]/div"));
            element = driver.findElement(By.xpath("//*[contains(text(),'修改类型')]"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，选择类型  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择类型  元素");
        }
    }
    public static void   SelectTypeLeft(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div/div[2]/div/div/div[1]/ul/li[2]/div"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，选择左边住宅  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择左边住宅  元素");
        }
    }
    public static void   SelectTypeRight(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div/div[2]/div/div/div[2]/ul/li[2]/div[2]/img"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()&&element.getAttribute("src").contains("EAAAAAASUVORK5CYII=")){
                MyClick.myClick(driver,element);
                log.debug("定位到，选择右边的别墅、洋房  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择右边的别墅、洋房   元素");
        }
    }

    public static void   SelectTypeConfirmButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div/div[3]/button"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，选择类型确定按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择类型确定按钮  元素");
        }
    }
    public static void   ProposedSubscriptionSelecttRegion(WebDriver driver){
        WebElement element= null;
        try {
            element = driver.findElement(By.xpath("//*[contains(text(),'添加地区')]"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，选择地区  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择地区  元素");
        }
    }

    public static void   SelectRegionConfirmButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[3]/div"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，拟建订阅地区保存按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，拟建订阅地区保存按钮  元素");
        }
    }
    public static void   ProposedSubscriptionSaveButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，拟建订阅保存按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，拟建订阅保存按钮  元素");
        }
    }
    public static void   PSRegionSelectNationalButton(WebDriver driver){
        WebElement element= null;
        try {
            driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div/div[1]/div[2]/div/div"));
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，选择全国按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择全国按钮  元素");

        }
    }
    public static void   PSRegionSelectBeijingButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div/div[2]/div[2]/div[2]/div"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，选择北京按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择北京按钮  元素");
        }
    }
/*拟建订阅筛选*/
    public static void PSSelectArea(WebDriver driver){
        WebElement element =null;
        try {
            element=driver.findElement(By.cssSelector("p > span"));
            driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                element.click();
                log.debug("定位到，拟建订阅地区筛选按钮 元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，拟建订阅地区筛选按钮 元素");
        }
    }

    public static void PSSelectAreaNational(WebDriver driver){
        WebElement element =null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[2]/div/div[1]/div/aside/section[2]/div[1]/div[2]/div[1]"));
            driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                element.click();
                log.debug("定位到，拟建订阅地区筛选全国按钮 元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，拟建订阅地区筛选全国按钮 元素");
        }
    }
    public static void PSSelectAreaBeijing(WebDriver driver){
        WebElement element =null;
        try {
            element=driver.findElement(By.xpath("//div[@id='app']/div[4]/div/div/div[2]/div/div/div/aside/section[2]/div/div[2]/div[2]"));
            driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                element.click();
                log.debug("定位到，拟建订阅地区筛选北京按钮 元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，拟建订阅地区筛选北京按钮 元素");
        }
    }
    public static void PSSelectAreaConfirm(WebDriver driver){
        WebElement element =null;
        try {
            element=driver.findElement(By.xpath("//button[@type='button']"));
            driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                element.click();
                log.debug("定位到，拟建订阅地区筛选确定按钮 元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，拟建订阅地区筛选确定按钮 元素");
        }
    }
    public static void PSSelectStage(WebDriver driver){
        WebElement element =null;
        try {
            element=driver.findElement(By.xpath("//div[@id='app']/div[4]/div/div/div[2]/div/div/div/aside/ul/li[2]/p"));
            driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                element.click();
                log.debug("定位到，拟建订阅阶段筛选按钮 元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，拟建订阅阶段筛选按钮 元素");
        }
    }
    public static void PSSelectStageLeftLand(WebDriver driver){
        WebElement element =null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[2]/div/div[1]/div/aside/section[3]/div[1]/div/div/div[1]/ul/li[3]/div"));
            driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                MyClick.myClick(driver,element);
                log.debug("定位到，拟建订阅阶段筛选工程筹备 元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，拟建订阅阶段筛选工程筹备 元素");
        }
    }
    public static void PSSelectStageRightLand(WebDriver driver){
        WebElement element =null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[2]/div/div[1]/div/aside/section[3]/div[1]/div/div/div[2]/ul/li[2]/div[1]"));
            driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                MyClick.myClick(driver,element);
                log.debug("定位到，拟建订阅阶段筛选工国土 元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，拟建订阅阶段筛选工国土 元素");
        }
    }

    public static void PSSelectStageConfirm(WebDriver driver){
        WebElement element =null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[2]/div/div[1]/div/aside/section[3]/div[2]/div/button"));
            driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                element.click();
                log.debug("定位到，拟建订阅阶段筛选确定按钮 元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，拟建订阅阶段筛选确定按钮 元素");
        }
    }


    public static void PSSelectType(WebDriver driver){
        WebElement element =null;
        try {
            element=driver.findElement(By.xpath("//div[@id='app']/div[4]/div/div/div[2]/div/div/div/aside/ul/li[3]/p"));
            driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                element.click();
                log.debug("定位到，拟建订阅类型筛选按钮 元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，拟建订阅类型筛选按钮 元素");
        }
    }
    public static void PSSelectTypeLeftLand(WebDriver driver){
        WebElement element =null;
        try {
            element=driver.findElement(By.xpath("//div[@id='app']/div[4]/div/div/div[2]/div/div/div/aside/section[4]/div/div/div/div/ul/li[2]/div"));
            driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                element.click();
                log.debug("定位到，拟建订阅类型左侧筛选按钮 元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，拟建订阅类型左侧筛选按钮 元素");
        }
    }
    public static void PSSelectTypeRightLand(WebDriver driver){
        WebElement element =null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[2]/div/div[1]/div/aside/section[4]/div[1]/div/div/div[2]/ul/li[2]/div[1]"));
            driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                MyClick.myClick(driver,element);
                log.debug("定位到，拟建订阅类型右侧筛选按钮 元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，拟建订阅类型右侧筛选按钮 元素");
        }
    }

    public static void PSSelectTypeLConfirm(WebDriver driver){
        WebElement element =null;
        try {
            element=driver.findElement(By.xpath("(//button[@type='button'])[3]"));
            driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                element.click();
                log.debug("定位到，拟建订阅类型筛选确定按钮 元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，拟建订阅类型筛选确定按钮 元素");
        }
    }
/*中标订阅*/
    public static void ZhongBiddingSubscription(WebDriver driver){
        WebElement element =null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[1]/div[3]/span"));
            driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
            if (element.isDisplayed()){
                element.click();
                log.debug("定位到，中标订阅tab 元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，中标订阅tab 元素");
        }
    }
    public static void   ZhongBiddingSubscriptionEditButton(WebDriver driver){
        WebElement element= null;

        try {

            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[3]/div/div[1]/div[3]/div"));
            driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，订阅编辑按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，订阅编辑按钮  元素");

        }
    }
    public static void   ZhongRegionRegion(WebDriver driver){
        WebElement element= null;
        try {
            driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
            element=driver.findElement(By.cssSelector("div.content-right-area-list"));
            if(element.isDisplayed()){
                JavascriptExecutor js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();", element);
                log.debug("定位到，选择编辑地区区域  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择编辑地区区域  元素");

        }
    }
    public static void   ZhongRegionSelectNationalButton(WebDriver driver){
        WebElement element= null;
        try {
            driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div[2]/div[1]/div[2]/div/div"));
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，选择全国按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择全国按钮  元素");

        }
    }
    public static void   ZhongRegionSelectBeijingButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div[2]/div[2]/div[2]/div[2]/div"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，选择北京按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择北京按钮  元素");
        }
    }

    public static void   ZhongRegionSubscriptionSaveButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div[1]/div"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，订阅地区保存  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，订阅地区保存  元素");
        }
    }
    public static void   ZhongDeleteKeywords(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[2]/div[3]/div[2]/div[1]/div"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，删除关键词  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，删除关键词  元素");
        }
    }

    public static void   ZhongRecommendedKeywords(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[2]/div[4]/ul/li[1]/span"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，同行关键词 元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，同行关键词  元素");
        }
    }

    public static void  ZhongKeyWordsInput(WebDriver driver,String KeyWords){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[2]/div[2]/div/div[1]/label/div/input"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.sendKeys(KeyWords);
                log.debug("定位到，订阅词输入框  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，订阅词输入框  元素");
        }
    }
    public static void   ZhongKeySaveButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[2]/div[2]/div/div[1]/div/div/span"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，订阅词保存按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，订阅词保存按钮  元素");
        }
    }
    public static void   ZhongDySaveButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，订阅保存按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，订阅保存按钮  元素");
        }
    }
/*中标筛选*/
    public static void  ZhongAreaSelectButton(WebDriver driver){
    WebElement element= null;
    try {
        element=driver.findElement(By.cssSelector("div.subscriptions-item"));
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        if(element.isDisplayed()){
            element.click();
            log.debug("定位到，地区筛选按钮  元素");
        }
    }catch (NoSuchElementException e){
        log.error("未定位到，地区筛选按钮  元素");
    }
}
    public static void   ZhongAreaSelectBeijingButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[3]/div/div[1]/div[4]/div[3]/div[1]/ul/li"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，地区北京选项  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，地区北京选项  元素");
        }
    }
    public static void   ZhongAreaSelectBeijingYES(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.cssSelector("svg.icon.t-gray"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，地区北京选项  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，地区北京选项  元素");
        }
    }
    public static void   ZhongAreaSelectBeijingNO(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.cssSelector("svg.icon.t-blue"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，地区北京取消  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，地区北京取消  元素");
        }
    }

    public static void   ZhongAreaSelectConfirmButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[3]/div/div[1]/div[4]/div[3]/div[2]"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，筛选地区确认按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，筛选地区确认按钮  元素");
        }
    }
    public static void   ZhongProductSelectButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[3]/div/div[1]/div[2]/div[1]/span"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，筛选产品确认按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，筛选产品确认按钮  元素");
        }
    }

    public static void   ZhongProductSelectFirst(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[3]/div/div[1]/div[4]/div[1]/div[1]/ul/li/div"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，选择第一个产品  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择第一个产品  元素");
        }
    }

    public static void   ZhongProductSelectConfirmButton(WebDriver driver){
        WebElement element= null;
        try {
            element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div/div[3]/div/div[1]/div[4]/div[1]/div[2]"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            if(element.isDisplayed()){
                element.click();
                log.debug("定位到，选择产品确定按钮  元素");
            }
        }catch (NoSuchElementException e){
            log.error("未定位到，选择产品确定按钮  元素");
        }
    }
}


