package com.tsinghua.functiontest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import com.tsinghua.functiontest.common.JDSuit;

public class TestSearch {
	private Selenium selenium=JDSuit.getSelenium();

	@Before
	public void setUp() throws Exception {
		selenium.start();
		selenium.windowMaximize();
	}

	//3956 搜索存在的商品-手机
	@Test
	public void test3956() throws Exception {
		selenium.open("/");
		selenium.click("id=key");
		selenium.type("id=key", "手机");
		selenium.click("css=input.button");
		selenium.waitForPageToLoad("30000");
		assertEquals("手机  商品筛选", selenium.getText("css=h1"));
	}

	//3957 搜索不存在的商品-超市发优惠劵
	@Test
	public void test3957() throws Exception {
		selenium.open("/");
		selenium.click("id=key");
		selenium.type("id=key", "超市发优惠劵");
		selenium.click("css=input.button");
		selenium.waitForPageToLoad("30000");
		assertEquals("抱歉，没有找到“超市发优惠劵”的搜索结果，为您推荐以下结果", selenium.getText("css=div.ns-content > span"));
	}
	
	//3958 搜索物品不存在时，联想出其他结果，或者是模糊查询结果
	@Test
	public void test3958() throws Exception {
		selenium.open("/");
		selenium.type("id=key", "大马猴");
		selenium.click("css=input.button");
		selenium.waitForPageToLoad("30000");
		assertEquals("大马猴  商品筛选", selenium.getText("css=h1"));
		assertEquals("华尔街的大马猴", selenium.getText("link=华尔街的大马猴"));
		assertEquals("马猴", selenium.getText("css=a[title=\"[超强大促]一整月，每满1000都减100！往下看（满还送大礼哦）领导太放肆了！立即抢购！\"] > font.skcolor_ljg"));
	}
	
	
	
	//4115 搜索关键字“电信”
	@Test
	public void test4115() throws Exception {
		selenium.open("/");
		selenium.click("id=key");
		selenium.type("id=key", "电信");
		selenium.click("css=input.button");
		selenium.waitForPageToLoad("30000");
		assertEquals("电信  商品筛选", selenium.getText("css=h1"));
		assertEquals("小米（MI） 红米1s电信 3G手机（金属灰） CDMA2000/GSM 双模双待小米限量到货2G RAM超高性价比阅丰2S现货火热抢购中！", selenium.getText("link=小米（MI） 红米1s电信 3G手机（金属灰） CDMA2000/GSM 双模双待小米限量到货2G RAM超高性价比阅丰2S现货火热抢购中！"));
	}
	//4116 测试GB18030中文字符集- 秊€㐇༘༙同ᠥꀎبةتثجحخد郂
	@Test
	public void test4116() throws Exception {
		selenium.open("/");
		selenium.type("id=key", "秊€㐇༘༙同ᠥꀎبةتثجحخد郂");
		selenium.click("css=input.button");
		selenium.waitForPageToLoad("30000");
		assertEquals("抱歉，没有找到“秊€㐇༘༙同ᠥꀎبةتثجحخد郂”的搜索结果，为您推荐以下结果", selenium.getText("css=div.ns-content > span"));
	}
	//4117 搜索团购相关信息
	@Test
	public void test4117() throws Exception {
		selenium.open("/");
		selenium.click("id=key");
		selenium.type("id=key", "团购");
		selenium.click("css=input.button");
		selenium.waitForPageToLoad("30000");
		assertEquals("【京品惠】京东团购、限时抢购", selenium.getTitle());
		assertEquals("商品惠", selenium.getText("link=商品惠"));
	}

	//4118 切换搜索结果的布局方式
	@Test
	public void testListAndGrid4118() throws Exception {
		selenium.open("/");
		selenium.type("id=key", "软件测试教程");
		selenium.click("css=input.button");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=list-unselected");
		selenium.click("id=grid-unselected");
		assertEquals("m psearch", selenium.getAttribute("id=plist@class"));
		selenium.click("id=list-unselected");
		assertEquals("m psearch plist-book", selenium.getAttribute("id=plist@class"));
	}
	
	
	
	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
