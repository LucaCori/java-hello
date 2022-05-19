package net.codejava;

import java.util.Scanner;

public class Es_FunzioniTraVettori {
	
	public static int Differenza(int vmax, int vmin) {
	int differenza= vmax-vmin;
	return differenza;
	}

	public static void main(String[] args) {
	final int costante = 50;
	Scanner read = new Scanner (System.in);
	int []vett= new int [costante];
	int vmax;
	int vmin;
	int n;
	int differenza;
	System.out.println("Inserisci il numero di elementi (massimo"+ costante +"):");
	n= read.nextInt();
	for(int i= 0; i<n; i++) {
		System.out.println("Inserisci il valore del vettore in posizione " + i +":");
		vett[i]= read.nextInt();
	}
	vmax= vett[0];
	vmin= vett[0];
	for(int i= 0; i<n; i++) {
		if(vmax<vett[i]) {
			vmax= vett[i];
		}
		if(vmin>vett[i]) {
			vmin= vett[i];
		}
	}
	differenza= Differenza(vmax, vmin);
	System.out.println("Il valore massimo all'interno del vettore è:" + vmax);
	System.out.println("Il valore minimo all'interno del vettore è: "+ vmin);
	System.out.println("La differenza tra questi 2 valori è di: "+ differenza);

	}

}
