package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.services.*;

public class DriverApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of currency notes in your country: ");
		int size = scan.nextInt();

		System.out.println("Enter currency denominations: ");
		int currency[] = new int[size];
		for (int i = 0; i < currency.length; i++) {
			currency[i] = scan.nextInt();
		}

		InsertionSort ms = new InsertionSort();
		ms.sort(currency);

		System.out.println("Enter ammount you want to exchange: ");
		int amount = scan.nextInt();

		CountOfNotes ns = new CountOfNotes();
		ns.count(currency, amount);

		scan.close();

	}

}
