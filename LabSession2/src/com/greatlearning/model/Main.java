package com.greatlearning.model;

import java.util.Scanner;
import com.greatlearning.service.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]){
		System.out.println("Enter the size of transaction array: ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		int i;
		System.out.println("Enter the value of array: ");
		
		for(i=0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Enter the no. of targets that need to be acheived: ");
		int target = sc.nextInt();
		
		TransactionServices ts = new TransactionServices();
		ts.service(array, target);
		sc.close();
	}
}
