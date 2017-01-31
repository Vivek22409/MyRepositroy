package com.vivek.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.util.SystemPropertyUtils;

class Parent{	
}

public class Child {

	public static void main(String arg[]) throws ParseException{
		
		SimpleDateFormat smpdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = smpdf.parse("13/11/1990");
		System.out.println(smpdf.format(d));
		//giveReverseOfSomeNumber();
		//linearSearch();
		binarySearch();
	}
	
	//Binary Search
	public static void binarySearch(){
		int arr[] = new int[]{1,2,3,4,5};
		boolean flag = false;
		int key = 6, start = 0, last = arr.length, mid = 0;
		
		while(start<last){
			mid = (start + last)/2;
			if(key == arr[mid]){
				flag = true;
				break;
			} else if(key < arr[mid]){
				last = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		if(flag){
			System.out.println("Num found !");
		} else {
			System.out.println("Num not found...");
		}
	}
	
	//Linear search
	public static void linearSearch(){
		int arr[] = new int[]{8,7,6,5,4};
		boolean flag = false;
		int key = 5;
		
		for(int num: arr){
			if(num == key){
				flag = true;
				break;
			} 
		}
		
		if(flag){
			System.out.println("Num found !");
		} else {
			System.out.println("Num not found");
		}
	}
	
	//Find reverse of number
	public static void giveReverseOfSomeNumber(){
		int num = 123, temp = 0, revNum = 0;
		
		while(num > 0) {
			temp = num % 10;
			revNum = revNum * 10 + temp;
			num = num / 10;
		}
		
		System.out.println(revNum);
	}
}
