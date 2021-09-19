package com.greatlearning.service;
import java.util.Scanner;

public class TransactionServices {
	
	public void service(int[] arr, int targetcount ) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		int i;
		while(targetcount != 0) {
			System.out.println("Enter the target value: ");
			int tgt = sc.nextInt();
			for(i=0; i <= arr.length; i++) {
				sum += arr[i];
				if(sum >= tgt) {
					System.out.println("Target is acheived after " + (i+1) + " transactions");
					break;
				}
				else {
					System.out.println("Given target is not acheived.");
				}
				
			}
			targetcount--;
		}
		System.out.println("You're done!");
		sc.close();
	}

	
}
