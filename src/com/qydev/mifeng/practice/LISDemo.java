package com.qydev.mifeng.practice;

import java.util.Scanner;

public class LISDemo {
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int caseNum = in.nextInt();
			for(int k=0;k<caseNum;k++){
				int integerNum = in.nextInt();
				int[] arr = new int[integerNum];
				for(int j=0;j<integerNum;j++){
					arr[j] = in.nextInt();
				}
				//solution(arr, i+1);
				int caseIndex = k+1;
				int[] dp = new int[arr.length];
				dp[0] = arr[0];
				int length = arr.length; int optSum = 0; int start=0;int end = 0;
				for(int i = 0;i<length-1; i++){
					if(dp[i]<0){
						dp[i+1] = arr[i+1];
						start = i+1;
					}else{
						dp[i+1] = dp[i] + arr[i+1];
					}
					end = dp[i+1]>dp[i]?i+1:i;
					optSum = Math.max(dp[i+1], dp[i]);
				}
				System.out.println("Case "+caseIndex+":");
				System.out.println(optSum+" "+(start+1)+" "+(end+1));
			}
		}
		
	}

	
	public static void solution(int[] arr){
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		int length = arr.length; int optSum = 0; int start=0;int end = 0;
		for(int i = 0;i<length-1; i++){
			if(dp[i]<=0){
				dp[i+1] = arr[i+1];
				start = i+1;
			}else{
				dp[i+1] = dp[i] + arr[i+1];
			}
			end = dp[i+1]>dp[i]?i+1:i;
			optSum = Math.max(dp[i+1], dp[i]);
			//System.out.println(optSum);
		}
		System.out.println("optiSum: "+optSum);
		System.out.println("start: "+start+", end: "+ end);
		
	}
	
	public static void solution(int[] arr, int caseIndex){
//		int[] dp = new int[arr.length];
//		dp[0] = arr[0];
//		int length = arr.length; int optSum = 0; int start=0;int end = 0;
//		for(int i = 1;i<length; i++){
//			if(dp[i-1]<0){
//				dp[i] = arr[i];
//				start = i;
//			}else{
//				dp[i] = dp[i-1] + arr[i];
//			}
//			end = dp[i]>dp[i-1]?i:i-1;
//			optSum = Math.max(dp[i], dp[i-1]);
//			//System.out.println(optSum);
//		}
//		System.out.println("optiSum: "+optSum);
//		System.out.println("start: "+start+", end: "+ end);
		
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		int length = arr.length; int optSum = 0; int start=0;int end = 0;
		for(int i = 0;i<length-1; i++){
			if(dp[i]<0){
				dp[i+1] = arr[i+1];
				start = i+1;
			}else{
				dp[i+1] = dp[i] + arr[i+1];
			}
			end = dp[i+1]>dp[i]?i+1:i;
			optSum = Math.max(dp[i+1], dp[i]);
		}
		System.out.println("Case "+caseIndex+":");
		System.out.println(optSum+" "+(start+1)+" "+(end+1));
		
	}

}
