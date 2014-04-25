package com.tsinghua.functiontest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import com.tsinghua.functiontest.common.JDSuit;

public class TestLogin {
	private Selenium selenium = JDSuit.getSelenium();

	@Before
	public void setUp() throws Exception {
		
		selenium.start();
		selenium.windowMaximize();
	}
	
	//3954 登录时，使用不存在的用户名
	@Test
	public void test3954() throws Exception {
		selenium.open("/");
		selenium.click("link=[登录]");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=loginname", "abcdefghijklmn1111111111");
		selenium.type("id=nloginpwd", "123");
		selenium.click("id=loginsubmit");
		selenium.click("id=JD_Verification1");
		assertEquals("您输入的账户名不存在，请核对后重新输入", selenium.getText("id=loginname_error"));
	}
	//3955 登录时，使用错误密码
	@Test
	public void test3955() throws Exception {
		selenium.open("/");
		selenium.click("link=[登录]");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=loginname", "test2014220761");
		selenium.type("id=nloginpwd", "123");
		selenium.click("id=loginsubmit");
		selenium.click("id=JD_Verification1");
		assertEquals("您输入的账户名和密码不匹配，请重新输入", selenium.getText("id=loginpwd_error"));
	}
	//4144 登录时忘记密码

	@Test
	public void test4144() throws Exception {
		selenium.open("/");
		selenium.click("link=[登录]");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=exact:忘记密码?");
		selenium.waitForPageToLoad("30000");
		assertEquals("找回密码", selenium.getText("css=h2"));
		assertEquals("填写账户名", selenium.getText("css=li.one.cur"));
		assertEquals("账户名：", selenium.getText("css=span.label"));
	}
	//3953 登录时，输入正确的用户名和密码
	@Test
	public void testLogin3953() throws Exception {
		
		selenium.open("/");
		selenium.click("link=[登录]");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=loginname", "test2014220761");
		selenium.type("id=nloginpwd", "12qwaszx");
		selenium.click("id=loginsubmit");
		selenium.waitForPageToLoad("30000");
		assertEquals("您好，test2014220761！[退出]", selenium.getText("id=loginbar"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
