package com.tsinghua.one;

import java.math.BigInteger;
import java.util.Scanner;

public class Summation {

	private BigInteger result;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//获得数据
		Scanner cin=new Scanner(System.in);
		int number=cin.nextInt();
		System.out.println(new Summation().getResult(number));
	}
	
	protected BigInteger getResult(int number) {
		result=new BigInteger("0");
		BigInteger bigNumber;
		for (int i = 1; i <= number; i++) {
			bigNumber=BigInteger.valueOf(i);
			result=result.add(bigNumber.pow(i));
		}
		 return result;
	}
}
