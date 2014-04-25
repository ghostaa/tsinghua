package com.tsinghua.functiontest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)  
@Suite.SuiteClasses({
	TestLogin.class,
	TestSearch.class,
	TestGoodsDetail.class
})  
public class TestSuite {
		//批量测试所有case，默认使用的是IE的方式，请点右键，run as junit test
		//若要改成火狐，请参照文档"功能测试的使用文档.txt"
}
