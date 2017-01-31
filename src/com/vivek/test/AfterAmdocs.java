package com.vivek.test;

import java.util.Arrays;

class AfterAmdocs {
	
	public static void main(String arg[]){
		
		int arr[] = {7,11,5,15,3,2};
		int apple[] = {3,4,1};
		int orange[] = {9,-7,-7};
		int noOfApp = 0, noOfOra = 0;		
		
		for(int i =0;i < apple.length;i++){
			if((5+(apple[i]))>=7 && (5+(apple[i]))<=15 )		
			noOfApp = ++noOfApp;
		}				
		for(int i =0;i < orange.length;i++){
			if((15+(orange[i]))>=7 && (15+(orange[i]))<=15 )
			noOfOra = ++noOfOra;
		}
		System.out.print(noOfApp+"\n"+noOfOra);
		
	}
}
