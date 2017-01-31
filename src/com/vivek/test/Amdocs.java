package com.vivek.test;



/*import java.util.Scanner;

public class Amdocs {

	public static void main(String[] args) {

		int num = 0,temp = 0,counter=0,limit=0;
		System.out.println("Enter Limit:");
		Scanner sc = new Scanner(System.in);
		limit = sc.nextInt();
		sc.close();
		for(int i = 1; i <=limit;i++){
			int sum = 0;
			num = i;
			while(num>0){
				temp = num % 10;
				sum = sum + (temp*temp);
				num = num/10;
				
			} 			
			int chckNum = (int)Math.sqrt(sum); 
			if((chckNum*chckNum)== sum){
				counter++; 
			}			
		}
		System.out.println(counter);
	}
}*/
import java.util.Scanner;

import org.joda.time.LocalDate;

class Amdocs{
	
	public static void tellDayName(){
		
		System.out.println("Enter Date in format (yyyy,MM,dd):");
		Scanner input = new Scanner(System.in);
		String myDate = input.next();
		String delims = ",";
		
		String[] tokens = myDate.split(delims);
		String dayOfWeek = new LocalDate( Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]) ).dayOfWeek().getAsText( java.util.Locale.ENGLISH );
		System.out.println("Day : "+ dayOfWeek);
		
	}
	public static void main(String arg[]){	
		
		for(int i = 1 ; i <=6 ;i++){
			for(int j = 1 ; j <= i; j++){
				System.out.print("*");
			}
			for(int k = 5 ; k >= i; k--){
				System.out.print("#");
			}
			System.out.println();
		}
		
		int k = 1;
		for(int i = 1 ; i <= 5; i++){
			for(int j = 1 ; j <= i; j++){
				
				if(j!=i){
					System.out.print(k+"*");
				} else {
					System.out.print(k);
				}
				k++;				
			}			
			System.out.println();
			if(k>=10){
				break;
			}
		}
		int t = 7, c = 0;
		for(int i = 5; i >= 1; i--){			
			for(int j = i ; j > 1; j--){				
				if(j!=2){
				    System.out.print(t+"*");
				} else {
					System.out.print(t);
				}
				t++;
				c++;
			}
			t=(t-c)-(c-1);
			c=0;
			System.out.println();			
		}	
	}
	
	//print pattern
	/*int n = 5, c = 2, k = 1,f = 5,t = 1 ,l = 5;

	for(int i = 1; i <= n; i++){
		for(int j = 1 ; j <= n; j++ ){
			if(i%2 != 0)
				f = l ;
			else 
				f = t;
			if(i == k  && j == f){
				System.out.print(c);				
			}				
			else {
				System.out.print(i);
			}				
		}
		System.out.println();
		c++;
		k++;		

	}*/
	/*//print half array in Asc and half in Desc order
	public void AscAndDescArray(int arr[],int limit){
		int n = limit;			
		int arr1[] = new int[arr.length-n];

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		for(int i = arr.length-1, j = 0; i >=n ; i--, j++){
			arr1[j] = arr[i];			
		}

		for(int i = n, j = 0;i < arr.length; i++,j++){
			if(i>=n){
				arr[i] = arr1[j];
			} 
		}

		System.out.println(Arrays.toString(arr));
	}*/
}
