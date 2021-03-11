package com.qlmYFB.autotest.module;

import com.qlmYFB.autotest.common.WaitTime;
import com.qlmYFB.autotest.component.MoreManage;
import com.qlmYFB.autotest.testCase.OrginManage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



/**
 * @program: selenium_demo
 * @description: qlmYFB Web Auto Project
 * @author: liumeng
 * @create: 2021-02-22 11:25
 **/
public class MoreModule {
    private  static  Logger logger = Logger.getLogger(MoreModule.class);
    static WebDriver driver ;
    static String KeyWords="测试";
    public MoreModule() {
    }

    @BeforeClass
    public void beforeClass() {
        driver = OrginManage.getDriver();
    }
    /*供求市场*/
    @Test
    public static void SupplySearch(){
        WaitTime.waitTime(2000);
        MoreManage.MoreTab(driver);
        WaitTime.waitTime(2000);
        MoreManage.SupplySearch(driver);
        WaitTime.waitTime(2000);
        MoreManage.SupplySearchTwo(driver);
        WaitTime.waitTime(2000);
        MoreManage.SupplySearchTwoInput(driver,KeyWords);
        WaitTime.waitTime(2000);
        MoreManage.SupplySearchTwoInputConfirm(driver);
        WaitTime.waitTime(2000);
        MoreManage.SupplySearchSeeM(driver);
        WaitTime.waitTime(2000);
        MoreManage.SupplySearchSeeMBack(driver);
        WaitTime.waitTime(2000);
        MoreManage.SupplySearchSeeBackBack(driver);
    }
}
