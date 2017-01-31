package com.vivek.test;
import java.util.UUID;

public class ExceptionTest {
	
	public static void main(String arg[]) throws ArithmeticException{
		
		String uuid = UUID.randomUUID().toString();
		System.out.println("uuid = " + uuid);
		
		System.out.println(Long.toHexString(Double.doubleToLongBits(Math.random())));
		
		/*try {
		int i = 5/0;
		//System.out.println("Hello...");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally");
		}*/
		
	}
	public static void display(){
		
	}
}
