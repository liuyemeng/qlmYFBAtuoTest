package com.qlmYFB.autotest.module;
import com.qlmYFB.autotest.common.WaitTime;
import com.qlmYFB.autotest.component.FreeDyManage;
import com.qlmYFB.autotest.testCase.OrginManage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
/**
 * @program: selenium_demo
 * @description: qlmYFB Web Auto Project
 * @author: liumeng
 * @create: 2021-02-20 10:04
 **/
public class FreeDyModule {
    private static Logger log = Logger.getLogger(FreeDyModule.class);
    static WebDriver driver;
    public FreeDyModule() {
    }
    @BeforeClass
    public void beforeClass() {
        driver = OrginManage.getDriver();
    }
//    @Parameters({"1", "1"})
//    招标订阅
    @Test
    public static void  BiddingSubscription(){
        String KeyWords= "测试";
//        招标订阅编辑操作
        FreeDyManage.BiddingSubscriptionEditButton(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.RegionRegion(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.RegionSelectNationalButton(driver);
        FreeDyManage.RegionSelectBeijingButton(driver);
        FreeDyManage.RegionSubscriptionSaveButton(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.DeleteKeywords(driver);
        FreeDyManage.KeyWordsInput(driver,KeyWords);
        FreeDyManage.KeySaveButton(driver);
        FreeDyManage.DySaveButton(driver);

    }
//        招标订阅地区和产品筛选操作
    @Test
    public static void  BiddingSubscriptionSelect(){

        WaitTime.waitTime(2000);
        FreeDyManage.AreaSelectButton(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.AreaSelectBeijingButton(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.AreaSelectBeijingYES(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.AreaSelectConfirmButton(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ProductSelectButton(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ProductSelectFirst(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ProductSelectConfirmButton(driver);
    }

//    拟建订阅
    @Test
    public  void ProposedSubscription(){
//        拟建订阅编辑
        WaitTime.waitTime(2000);
        FreeDyManage.ProposedSubscription(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ProposedSubscriptionEditButton(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ProposedSubscriptionSelectStage(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.SelectStageLeft(driver);
        WaitTime.waitTime(3000);
        FreeDyManage.SelectStageRightLand(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.SelectStageConfirmButton(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ProposedSubscriptionSelectType(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.SelectTypeLeft(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.SelectTypeRight(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.SelectTypeConfirmButton(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ProposedSubscriptionSelecttRegion(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.PSRegionSelectNationalButton(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.PSRegionSelectBeijingButton(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.SelectRegionConfirmButton(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ProposedSubscriptionSaveButton(driver);

    }
    //       拟建筛地区、阶段、类型选项
    @Test
    public  void ProposedSubscriptionSelect(){
//        WaitTime.waitTime(2000);
//        FreeDyManage.ProposedSubscription(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.PSSelectArea(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.PSSelectAreaNational(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.PSSelectAreaBeijing(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.PSSelectAreaConfirm(driver);

        WaitTime.waitTime(2000);
        FreeDyManage.PSSelectStage(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.PSSelectStageLeftLand(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.PSSelectStageRightLand(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.PSSelectStageConfirm(driver);

        WaitTime.waitTime(2000);
        FreeDyManage.PSSelectType(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.PSSelectTypeLeftLand(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.PSSelectTypeRightLand(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.PSSelectTypeLConfirm(driver);
    }
    /*中标订阅*/
    @Test
    public static void  ZhongBiddingSubscription(){
        String KeyWords= "测试";
//        招标订阅编辑操作
        WaitTime.waitTime(2000);
        FreeDyManage.ZhongBiddingSubscription(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ZhongBiddingSubscriptionEditButton(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ZhongRegionRegion(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ZhongRegionSelectNationalButton(driver);
        FreeDyManage.ZhongRegionSelectBeijingButton(driver);
        FreeDyManage.ZhongRegionSubscriptionSaveButton(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ZhongDeleteKeywords(driver);
        FreeDyManage.ZhongKeyWordsInput(driver,KeyWords);
        WaitTime.waitTime(2000);
        FreeDyManage.ZhongKeySaveButton(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ZhongDySaveButton(driver);

    }
    //        中标订阅地区和产品筛选操作
    @Test
    public static void  ZhongBiddingSubscriptionSelect(){
//        FreeDyManage.ZhongBiddingSubscription(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ZhongAreaSelectButton(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ZhongAreaSelectBeijingButton(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ZhongAreaSelectBeijingYES(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ZhongAreaSelectConfirmButton(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ZhongProductSelectButton(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ZhongProductSelectFirst(driver);
        WaitTime.waitTime(2000);
        FreeDyManage.ZhongProductSelectConfirmButton(driver);
    }

}
