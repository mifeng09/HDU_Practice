package com.qydev.mifeng.practice;

import java.util.Scanner;

public class Problem1000 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a , b;
		//System.out.println("before");
		//while(in.hasNext()){
		while(in.hasNextInt()){
			//System.out.println("operating");
			 a = in.nextInt();
			 b = in.nextInt();
			System.out.println(a+b);
			//break;
		}
//		a = in.nextInt();
//		 b = in.nextInt();
//		System.out.println("result");
	}//
}
