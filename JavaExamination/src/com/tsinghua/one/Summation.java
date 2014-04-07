package com.tsinghua.one;

import java.util.Scanner;

public class Summation {

	private long result;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//获得数据
		Scanner cin=new Scanner(System.in);
		int number=cin.nextInt();
		System.out.println(new Summation().getResult(number));
	}
	
	private long getResult(int number) {
		
		for (int i = 1; i <= number; i++) {
			long temp=i;
			for (int j = 1; j < i; j++) {
				temp*=i;
			}
			result+=temp;
		}
		 return result;
	}
}
