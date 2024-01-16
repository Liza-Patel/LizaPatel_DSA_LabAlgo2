package com.greatlearning.services;

public class CountOfNotes {

	public void count(int[] currency, int amount) {

		int noOfNotes[] = new int[currency.length];

		int count = 0;

		for (int i = 0; i < noOfNotes.length; i++) {
			noOfNotes[i] = amount / currency[i];
			amount = amount % currency[i];
			count += noOfNotes[i];
		}

		for (int i = 0; i < noOfNotes.length; i++) {

			if (noOfNotes[i] != 0) {
				System.out.println(noOfNotes[i] + " x " + currency[i]);
			}
		}

		System.out.println("Total number of notes " + count);
		System.out.println("Balance: " + amount);
	}

}
