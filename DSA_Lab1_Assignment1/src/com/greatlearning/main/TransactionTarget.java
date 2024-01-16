package com.greatlearning.main;

import java.util.Scanner;

public class TransactionTarget {

	static int dayAchieved;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of Days Shop was open");
		int noOfDays = scan.nextInt();

		int revenue[] = new int[noOfDays];
		System.out.println("Enter the collection for each day");
		for (int i = 0; i < revenue.length; i++) {
			revenue[i] = scan.nextInt();
		}

		System.out.println("Please enter number of targets");
		int noOftargets = scan.nextInt();

		scan.close();

		for (int i = 1; i <= noOftargets; i++) {

			System.out.println("Please enter value of Target " + i);
			int target = scan.nextInt();

			if (targetAchieved(revenue, target)) {
				System.out.println("Target achieved at day " + dayAchieved);
			} else {
				System.out.println("Target not achieved");
			}

		}

	}

	private static boolean targetAchieved(int[] revenue, int target) {

		int sum = 0;
		boolean flag = false;

		for (int i = 0; i < revenue.length; i++) {
			sum += revenue[i];
			if (sum > target) {
				dayAchieved = i + 1;
				flag = true;
				break;
			}
		}
		return flag;
	}

}
