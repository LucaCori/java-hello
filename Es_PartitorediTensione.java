package net.codejava;

import java.util.Scanner;

public class Es_PartitorediTensione {
	
	static final int lunghezza= 50;
	
	
	public static double calcolaCorrenteTotale(double resistenze[], double tensione_generale, int numero_reistenze) {
		double rtot= 0;
		for(int i= 0; i<numero_reistenze; i++) {
			rtot+=resistenze[i];
		}
		return tensione_generale/rtot;
	}
	
	public static void printCute(double resistenzeInserite[], int i, double tensione_generale) {
		if(i==0) {
			return;
		}
		else {
			if(tensione_generale== 0) {
				System.out.println("V_G...");
			}
			else {
				System.out.println("V_G= " + tensione_generale + "Volt");
			}
			for(int j= 0; j<i; j++) {
				System.out.println("|");
				System.out.println(">R" + (j+1) + "=" + resistenzeInserite[j] + "Ohm");
				System.out.println(">");
				System.out.println("|");
			}
		}
		}
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		double []resistenze = new double[lunghezza];
		int n;
		double tensione_generale;
		tensione_generale= 0;
		System.out.println("Inserisci il numero delle resistenze che desideri mettere nel pertitore(massimo: "+ lunghezza +"):");
		n= read.nextInt();
		if(n>50) {
			while(n>50) {
			System.out.println("ATTENZIONE! Dimensione non consentita!Rimetti il numero di resistenze nel partitore!");
			n= read.nextInt();
			}
		}
		if(n<=50) {
			for(int i= 0; i<n; i++) {
				System.out.println("Inserisci i valori alle resisenze (OHM):");
				resistenze[i]= read.nextDouble();
			}
			printCute(resistenze, n, tensione_generale);
			}
		double []tensioni= new double [lunghezza];
		System.out.println("Inserisci un valore alla tensione generale del partitore:");
		tensione_generale= read.nextDouble();
		printCute(resistenze, n, tensione_generale);
		double CT= calcolaCorrenteTotale(resistenze, tensione_generale, n);
		System.out.println("La corrente totale nel partitore è: " + CT + "Ampere");
		for(int i= 0; i<n; i++) {
			double R= resistenze[i]*CT;
			System.out.println("Il valore della tensione ai capi di R: " + (i+1) + " è di " + R + "Volt");
		
		}

}
}
