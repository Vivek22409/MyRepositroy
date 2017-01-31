package com.vivek.test;

public class StackImplementation {
	
	private static int  counter = 0;
	private int intArr[] = new int[3];

	private void push(int element){
		
		intArr[counter] = element;
		counter++;
	}
	private int pop(){
		int element = intArr[counter-1];
		counter--;
		return element;
	}
	public static void main(String[] arg){
		
		StackImplementation stImpl = new StackImplementation();
		stImpl.push(23);
		stImpl.push(25);
		stImpl.push(56);
		
		System.out.println(stImpl.pop());
		System.out.println(stImpl.pop());
		stImpl.push(67);
		System.out.println(stImpl.pop());
		
		
	}

}
