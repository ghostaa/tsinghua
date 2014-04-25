package com.tsinghua.functiontest.common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public  class JDSuit {
	private static Selenium selenium;
	private String url="localhost";
	private int port = 4444;
	private String JDWebSite="http://www.jd.com/";
	
	public JDSuit() {
		//IE已经测试通过
		/*IE已经测试通过,默认使用IE测试
		 * 火狐已经测试通过，请使用Browser.Firefox.toString()
		 * 我自己的环境使用，会使用Browser.Firefox_for_myself.toString()
		 */
		selenium = new DefaultSelenium(url, port, Browser.IE.toString(), JDWebSite);
		
	}
	public enum Browser { 
		//IE已经测试通过
	    IE("*iexplore"), 
	    
	    //火狐已经测试通过
	    Firefox("*firefox"),
	    
	    //由于我的火狐没有在默认目录下安装，所以使用以下方式测试，老师或者助教可以使用上面的IE和火狐的方式测试
	    Firefox_for_myself("*firefox D:\\Program Files\\Mozilla Firefox\\firefox.exe");  
	    private String browser;
	    private  Browser(String browser){
	    	this.browser=browser;
	    }
	    //覆盖方法  
	     @Override  
	     public String toString() {  
	            return this.browser;  
	     }  

	}  


	public static Selenium getSelenium() {
		
		if(null==selenium){
			new JDSuit();
		}
		return selenium ;
	}
	
	
}
