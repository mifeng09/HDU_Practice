package com.qydev.mifeng.practice;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int n=s.nextInt();
            int sum=0,max=-1001;
            int start=0,end=0,z=0;
            for(int j=0;j<n;j++){
                int a=s.nextInt();
                sum=sum+a;
                if(max<sum){
                    max=sum;
                    end=j;
                    start=z;
                }
                if(sum<0){
                    sum=0;
                    z=j+1;
                }
            }
            System.out.println("Case "+(i+1)+":");
            System.out.println(max+" "+(start+1)+" "+(end+1));
            if(i<T-1)
                System.out.println();
        }
    }
}
