package com.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
	Scanner scanner = new Scanner(System.in);
	List<Meal> meals = new ArrayList<>();
	public void on(){
		
		int a=1;
		while(a>0){
			String data= scanner.nextLine();
			switch (data){
			 case "1" :
				 
				System.out.println();
				break;
			case "2" :
				
				System.out.println();
				break;
			case "3" :
				 
				System.out.println();
				break;
			case "4" :
				 
				System.out.println();
				break;
			case "5" :
				
				System.out.println();
				break;
			case "6" :
				 
				System.out.println();
				break;
			case "7":
				
			case "0":
				a = -1;
				break;
			}
		}
	}
}
