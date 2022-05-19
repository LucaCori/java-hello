package net.codejava;

import java.util.Scanner;

public class Es_NumeriNegativiPositiviUguali {

	public static void main(String[] args) {
		System.out.println("Quanti numeri vuoi inserire?:");
		double n= 0;
		Scanner read = new Scanner (System.in);
		n= read.nextDouble();
		double numero= 0;
		int cn= 0;
		int cp= 0;
		int cu= 0;
		for(int i= 0; i<n; i++) {
			System.out.println("Che numero vuoi inserire?:");
			numero= read.nextDouble();
			if(numero>0) {
				cp++;
			}
			else if(numero<0) {
				cn++;
			}
			else if(numero==0) {
				cu++;
			}
		}
		System.out.println("I numeri maggiori di 0 sono: " + cp);
		System.out.println("I nuemri minori di 0 sono: " + cn);
		System.out.println("I numeri uguali a 0 sono: " + cu);
	}

}
