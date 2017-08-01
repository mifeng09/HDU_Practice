package com.qydev.mifeng.practice;

import java.util.Scanner;

public class LIS {
	public static void main(String args[]){
      
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int caseNum = in.nextInt();
			for(int k=0;k<caseNum;k++){
				int integerNum = in.nextInt();
				int[] arr = new int[integerNum];
				int length = arr.length; 
				int optSum = Integer.MIN_VALUE; 
				int start=0;
				int end = 0;
				int caseIndex = k+1;
				int[] dp = new int[integerNum];
				for(int j=0;j<integerNum;j++){
					arr[j] = in.nextInt();
				}
				
				dp[0] = arr[0];
				
				for(int i = 0;i<length-1; i++){
					if(dp[i]<0){
						dp[i+1] = arr[i+1];
						start = i+1;
					}else{
						dp[i+1] = dp[i] + arr[i+1];
					}
				}
				optSum = dp[0];
				end = 0;
				for(int i = 1;i<length; i++){
					
//					if(dp[i+1]>dp[i]){
//						end=i+1;
//						optSum=dp[i+1];
//					}else{
//						end=i;
//						optSum=dp[i];
//					}
					if(dp[i]>optSum){
						optSum = dp[i];
						end = i;
					}
//					optSum = dp[i]>optSum?dp[i]:optSum;
//					end = i;
				}
				int s =0;
				start = end;
				for(int m = end;m>=0;m--){
					s+=arr[m];
					if(s==optSum){
						start = m;
					}
				}
//				if(k<caseNum-1){
//					System.out.println();
//				}
				System.out.println("Case "+caseIndex+":");
				System.out.println(optSum+" "+(start+1)+" "+(end+1));
				if(k<caseNum-1){
					System.out.println();
				}
			}
		
	}
			
		}
			
		
			

}

