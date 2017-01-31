package com.vivek.test;

import java.util.*;


public class AlternateSortArray {
	
	public static void main(String[] args){
		
		int[] intArr = {3,2,5,9,6,8};
		
		//sortArray(intArr);
		for(int intValue:giveAlternateSortedArray(intArr)){
			System.out.println(intValue);
		}
		
		int a = 6, b= 9;
		System.out.println("a:"+a+" b:"+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a:"+a+" b:"+b);
		/*System.out.print("[");		
		for (int i = 0 ; i < giveAlternateSortedArray(intArr).length; i++){
			if(i != giveAlternateSortedArray(intArr).length-1)
				System.out.print(giveAlternateSortedArray(intArr)[i]+",");
			else
				System.out.print(giveAlternateSortedArray(intArr)[i]);	
		}
		System.out.print("]");*/
		
	}
	
	public static int[] giveAlternateSortedArray(int[] arrOfInt){
		
		int newIntArr[] = new int[(arrOfInt.length/2)]; // make the newIntArr's size half of size of arrOfInt
		
		//Arrays.sort(arrOfInt);
		sortArray(arrOfInt);
		
		for(int counter = 0, i = 0; i < arrOfInt.length ; i+=2 ){
			newIntArr[counter] = arrOfInt[i];
			counter++;
		}
		
		return newIntArr;
	}
	
	public static void sortArray(int[] arr){
		
		for(int i = 0 ; i<arr.length ; i++){
			for(int j = i+1  ;j<arr.length ; j++ ){
				int temp;
				if (arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		/*System.out.print("{");
		int counter = 0;
		for(int intValue:arr) {			
			if(counter == arr.length-1)
				System.out.print(intValue);
			else 
				System.out.print(intValue+",");
			counter++;
		}
		System.out.print("}");*/
		//reverseTheNubmer(837685743);
	}
	public static void reverseTheNubmer(int num){		
		int temp, reverseNum = 0;
		while(num>0){			
			temp = num % 10;
			reverseNum = reverseNum * 10 + temp;
			num = num/10;
		}
		System.out.print(reverseNum);
		//isPalindrome(456);
	}
	/*public static void isPalindrome(int num){
		nu
	}*/
	
}
