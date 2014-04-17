package com.tsinghua.one;


import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

public class TestSummation {

	@Test
	public void test() {
		
		Summation s=new Summation();
		
		Assert.assertEquals(BigInteger.valueOf(1), s.getResult(1));
		Assert.assertEquals(BigInteger.valueOf(5), s.getResult(2));
		Assert.assertEquals(BigInteger.valueOf(32), s.getResult(3));
		Assert.assertEquals(BigInteger.valueOf(288), s.getResult(4));
		Assert.assertEquals(BigInteger.valueOf(3413), s.getResult(5));
		Assert.assertEquals(BigInteger.valueOf(50069), s.getResult(6));
	}

}
