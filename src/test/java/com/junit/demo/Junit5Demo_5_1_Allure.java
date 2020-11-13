package com.junit.demo;

import com.util.Calculator;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


/***
 *
 * /*  @Step：测试步骤动作，放在具体业务逻辑方法中，可以放在关键步骤中，在报告中显示；\r\n" +
 *  "* @Attachments：附件信息，在截图或者其他方法上加上该注解即可（注意图片和文字区别），https://github.com/allure-framework/allure1/wiki/Attachments\r\n" +
 *  "* @Features：将case分类到某个feature中，报告中behaviore中显示，可以理解为testsuite，用于组织管理测试用例https://github.com/allure-framework/allure1/wiki/Features-and-Stories\r\n" +
 *  "* @Store：属于feature之下的结构，报告中features中显示，可以理解为testcase，说明此用例是某个feature中的某个story下的用例https://github.com/allure-framework/allure1/wiki/Features-and-Stories\r\n" +
 *  "* @Title: 测试用例的标题，报告中stories信息中展示\r\n" +
 *  "* @Description: 测试用例的描述，报告中stories信息中展示\r\n" +
 *  "* @Issue: 跟测试用例相关的bug Id（这是一个链接，可以配置bug管理系统的URL，直接跳转到bug管理系统中）https://github.com/allure-framework/allure1/wiki/Issues。pom文件中添加配置patterm，见下方\r\n" +
 *  "* @TestCaseId：测试用例的id（这是一个连接，可以配置用例管理系统的URL，直接跳转到用例管理系统中）https://github.com/allure-framework/allure1/wiki/Test-Case-ID，pom文件中添加配置patterm，见下方\r\n" +
 *    "* ……\r\n" +
 *
 *  */


public class Junit5Demo_5_1_Allure {
    @Test
    @Order(1)
    @Description("Description")
    @Story("Story 加法测试")
    @DisplayName("DisplayName 加法测试")
    @Severity(SeverityLevel.BLOCKER)
    @Issue("www.baidu.com")
    @Link(name = "Link 社区贴" ,type = "mylink", url ="https://ceshiren.com/t/topic/7718")
    public void addTest(){
        int result01= Calculator.add(4,2);
        System.out.println(result01);

        int result02= Calculator.add(5,2);
        System.out.println(result02);

        int result03= Calculator.add(6,2);
        System.out.println(result03);
        assertAll("计算结果校验： ",
                ()-> assertEquals(6,result01),
                ()-> assertEquals(7,result02),
                ()-> assertEquals(8,result03)
        );

    }

}
