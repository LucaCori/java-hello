package net.codejava;

import java.util.Scanner;

public class AnnoBisestile {

	public static void main(String[] args) {
		int year = 0;
		Scanner read = new Scanner (System.in);
		System.out.print("Anno da verificare: ");
		year = read.nextInt();
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.print("Bisestile!");
		}
		else {
			System.out.print("Non Bisestile!");
		}
	}

}
