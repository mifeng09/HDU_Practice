package com.qydev.mifeng.practice;

import java.util.Scanner;

public class Problem1003 {
	
	public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int n=s.nextInt();
            int sum=0,max=-1001;
            int start=0,end=0,z=0;int b = 0;
            for(int j=0;j<n;j++){
                int a=s.nextInt();
//                sum=sum+a;
//                if(max<sum){
//                    max=sum;
//                    end=j;
//                    start=z;
                
//                }
//                if(sum<0){
//                    sum=0;
//                    z=j+1;
//                }
                if(b<0){
                	b = a;
                	if(b > 0){
                		//start = j - 1;
                    	//end = start;
                    	z = j - 1;
                	}
         //       	z = j +1;
         //       	z = j;
                }else{
                	b = b + a;
                	if(b>0){
                		//z = z + 1;
                	}
                	//z = z + 1;
                }
                if(max < b){
                	max = b;
                	//z = j;
                	end = j;
                	start = z;
//                	z = z + 1;
//                	end = z;
                }
                //end = z;
            }
           
            System.out.println("Case "+(i+1)+":");
            System.out.println(max+" "+(start+1)+" "+(end+1));
            if(i<T-1)
                System.out.println();
        }
    }
}
