package com.qydev.mifeng.practice;

import java.util.Scanner;

public class Problem1001 {

//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		while(in.hasNext()){
//			int count = in.nextInt();
//			int[] arr = new int[count];
//			//int sum = 0;
//			for(int i =0; i<count; i++){
//				//int a = in.nextInt();
//				arr[i] = in.nextInt();
//			}
//			for(int i = 0; i<count; i++){
//				int sum = 0;
//				for(int j = 1; j<=arr[i]; j++){
//						sum = sum + j;
//						//System.out.println(sum);
////						if(i== count -1){
////							System.out.println(sum);
////						}
//						if(j == arr[i]){
//							System.out.println(sum);
//							if(i!=count -1){
//								System.out.println();
//							}
//							
//						}
//				}
//				
//			}
//		}
//	
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("before");
		while(sc.hasNext()){
			System.out.println("operatting");
			int n = sc.nextInt();
			int sum = 0;
			for(int i = 1; i<=n;i++){
				sum+=i;
			}
			System.out.println(sum);
			System.out.println();
		}
	}
}
