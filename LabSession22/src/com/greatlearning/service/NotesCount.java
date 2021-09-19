package com.greatlearning.service;

public class NotesCount {
	
	public void notesCount(int[] notes, int amount) {
		int[] notescounter = new int[notes.length];
		
		try {
			for(int i = 0; i < notes.length; i++) {
				if(amount >= notes[i]) {
					notescounter[i] = amount/notes[i];
					amount = amount - notescounter[i] * notes[i];
				}
			}
			
			if(amount > 0) {
				System.out.println("Exact denomination cannot be given for this amount.");
			}
			else {
				System.out.println("Your payment denomination to give min number of notes will be: ");
				for(int i = 0; i < notes.length; i++) {
					if(notescounter[i] != 0) {
						System.out.println(notes[i] + ":" + notescounter[i]);
					}
				}
			}
		}catch(ArithmeticException e){
			System.out.println(e + "notes of denomination 0 is invalid");
		}
	}

}
