package com.greatlearning.model;
import java.util.Scanner;
import com.greatlearning.service.*;

public class Main {

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		NotesCount nc = new NotesCount();
		
		System.out.println("Enter the size of denomination: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("Enter the values of denomination: ");
		for(int i=0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("Enter the amount: ");
		int amount = sc.nextInt();
		ms.sort(notes, 0, notes.length-1);
		nc.notesCount(notes, amount);
		sc.close();
	}
}
