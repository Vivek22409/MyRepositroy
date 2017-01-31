package com.vivek.test;

public class MyRunnable implements Runnable 
{
    public void run() 
    {
        try {
			new Thread().sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("hello");
    }
    
    public static void main(String[] arg){
    	new Thread(new MyRunnable()).start();
    	try {
			new Thread().sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("Hi");
    	
    	
    }
}
