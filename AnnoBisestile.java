package net.codejava;

import java.util.Scanner;

public class AnnoBisestile {

	public static void main(String[] args) {
		int year = 0; //anno
		Scanner read = new Scanner (System.in); //input
		System.out.print("Anno da verificare: "); //richiesta
		year = read.nextInt(); //utente
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) { //controllo
			System.out.print("Bisestile!"); //risposta affermativa
		}
		else { //altrimenti
			System.out.print("Non Bisestile!"); //risposta negativa
		}
	}

}
