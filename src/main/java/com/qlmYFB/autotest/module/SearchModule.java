package com.qlmYFB.autotest.module;

import com.qlmYFB.autotest.common.WaitTime;
import com.qlmYFB.autotest.component.SearchManage;
import com.qlmYFB.autotest.testCase.OrginManage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @program: selenium_demo
 * @description: qlmYFB Web Auto Project
 * @author: liumeng
 * @create: 2021-02-22 11:10
 **/
public class SearchModule {
    private static Logger logger = Logger.getLogger(SearchModule.class);
    static WebDriver driver;
    static  String KeyWords= "测试";
    public SearchModule() {
    }

    @BeforeClass
    public void beforeClass() {
        driver = OrginManage.getDriver();
    }

/*搜索中的VIp特权*/
    @Test
    public static void SearchVip() {
        WaitTime.waitTime(2000);
        SearchManage.SearchTab(driver);
        WaitTime.waitTime(2000);
        SearchManage.SearchVip(driver);
        WaitTime.waitTime(2000);
        driver.navigate().back();
    }
    /*搜索中的大搜索*/
    @Test
    public  static  void SearchBig(){
        WaitTime.waitTime(2000);
        SearchManage.BigSearch(driver);
        WaitTime.waitTime(2000);
        SearchManage.BigSearchTwo(driver, KeyWords);
        WaitTime.waitTime(2000);
        SearchManage.BigSearchConfirm(driver);
        WaitTime.waitTime(2000);
        SearchManage.SearchSeeM(driver);
        WaitTime.waitTime(2000);
        SearchManage.SearchSeeMBack(driver);
        WaitTime.waitTime(2000);
        SearchManage.SearchSeeMBackBack(driver);
    }
    /*招标查询*/
    @Test
    public static void BiddingSearch(){
        WaitTime.waitTime(2000);
        SearchManage.BiddingSearch(driver);
        WaitTime.waitTime(2000);
        SearchManage.BiddingSearchTwo(driver);
        WaitTime.waitTime(2000);
        SearchManage.BiddingSearchTwoInputKeyWords(driver, KeyWords);
        WaitTime.waitTime(2000);
        SearchManage.BiddingSearchConfirm(driver);
        WaitTime.waitTime(2000);
        SearchManage.BiddingSearchSeeM(driver);
        WaitTime.waitTime(2000);
        SearchManage.BiddingSearchSeeMBack(driver);
        WaitTime.waitTime(2000);
        SearchManage.BiddingSearchSeeMBackBack(driver);
    }
    /*拟建查询*/
    @Test
    public static void ProposedSearch(){
        WaitTime.waitTime(2000);
        SearchManage.ProposedSearch(driver);
        WaitTime.waitTime(2000);
        SearchManage.ProposedSearchTwo(driver);
        WaitTime.waitTime(2000);
        SearchManage.ProposedSearchTwoInputKeyWords(driver,KeyWords);
        WaitTime.waitTime(2000);
        SearchManage.ProposedSearchTwoConfirm(driver);
        WaitTime.waitTime(2000);
        SearchManage.ProposedSearchSeeM(driver);
        WaitTime.waitTime(2000);
        SearchManage.ProposedSearchSeeMBack(driver);
        WaitTime.waitTime(2000);
        SearchManage.ProposedSearchSeeMBack(driver);
    }
    /*中标查询*/
    @Test
    public static void ZhongBiddingSearch(){
        WaitTime.waitTime(2000);
        SearchManage.ZhongBiddingSearch(driver);
        WaitTime.waitTime(2000);
        SearchManage.BiddingSearchTwo(driver);
        WaitTime.waitTime(2000);
        SearchManage.BiddingSearchTwoInputKeyWords(driver, KeyWords);
        WaitTime.waitTime(2000);
        SearchManage.BiddingSearchConfirm(driver);
        WaitTime.waitTime(2000);
        SearchManage.BiddingSearchSeeM(driver);
        WaitTime.waitTime(2000);
        SearchManage.BiddingSearchSeeMBack(driver);
        WaitTime.waitTime(2000);
        SearchManage.BiddingSearchSeeMBackBack(driver);
    }
    /*企业查询*/
    @Test
    public static void CompanySearch(){
        WaitTime.waitTime(2000);
        SearchManage.CompanySearch(driver);
        WaitTime.waitTime(2000);
        SearchManage.CompanySearchTwo(driver);
        WaitTime.waitTime(2000);
        SearchManage.CompanySearchTwoInput(driver,KeyWords);
        WaitTime.waitTime(2000);
        SearchManage.CompanySearchTwoInputConfirm(driver);
        WaitTime.waitTime(2000);
        SearchManage.CompanyAllType(driver);
        WaitTime.waitTime(2000);
        SearchManage.CompanyBiddingZhongBiddingType(driver);
        WaitTime.waitTime(2000);
        SearchManage.CompanySeeM(driver);
        WaitTime.waitTime(2000);
        driver.navigate().back();
//        SearchManage.CompabySeeMBack(driver);
        WaitTime.waitTime(2000);
        driver.navigate().back();
//        SearchManage.CompabySeeMBack(driver);
        WaitTime.waitTime(2000);
        driver.navigate().back();
//        SearchManage.CompabySeeMBackBack(driver);

    }

    /*企业监控*/
    @Test
    public static void FocusedEnterprise(){

    }
    /*找人脉*/
    @Test
    public static void FindContacts(){

    }
    /*找业主*/
    @Test
    public static void FindYflmProject(){

    }
}