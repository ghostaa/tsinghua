package com.tsinghua.functiontest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import com.tsinghua.functiontest.common.JDSuit;

public class TestGoodsDetail {
	
	private Selenium selenium = JDSuit.getSelenium();
	
	@Before
	public void setUp() throws Exception {
		selenium.start();
		selenium.windowMaximize();
	}
	
	//3959 搜索CPU i7 4770k，查看商品介绍，商品参数
	@Test
	public void test3959() throws Exception {
		selenium.open("http://item.jd.com/899719.html");
		assertEquals("商品名称：英特尔Core i7-4770k", selenium.getText("css=li[title=\"英特尔Core i7-4770k\"]"));
		assertEquals("商品编号：899719", selenium.getText("//div[@id='product-detail-1']/ul/li[2]"));
		selenium.click("link=规格参数");
		assertEquals("英特尔 Intel", selenium.getText("//div[@id='product-detail-2']/table/tbody/tr[3]/td[2]"));
		assertEquals("i7-4770K", selenium.getText("//div[@id='product-detail-2']/table/tbody/tr[5]/td[2]"));
		assertEquals("Haswell", selenium.getText("//div[@id='product-detail-2']/table/tbody/tr[4]/td[2]"));
	}

	
	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
