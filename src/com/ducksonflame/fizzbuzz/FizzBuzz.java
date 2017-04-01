package com.ducksonflame.fizzbuzz;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
	
    public static void main(String[] args) {
    	
    	List<String> list = new ArrayList<>();
    	int n;
    	
    	Scanner input = new Scanner(System.in);
    	System.out.println("Welcome to FizzBuzz!");
        System.out.println("Please provide an integer:");
        
        while(true) {
        	try {
        		n = input.nextInt();
        		input.close();
        		break;
        	}
        	catch (InputMismatchException iME) {
        		System.out.println("Wrong input! Please provide and integer!");
        		input.nextLine();
        	}
        }
        

        for (int i = 1; i < n+1; i++) {
        	
            if(i % 3 == 0) {
                if (i % 5 == 0) {
                    list.add("FizzBuzz");
                }
                else {
                    list.add("Fizz");
                }
            }
            
            else if (i % 5 == 0) {
                list.add("Buzz");
            }
            
            else {
                list.add(String.valueOf(i));
            }
        }
        
        System.out.println(list);
        
    }
}
