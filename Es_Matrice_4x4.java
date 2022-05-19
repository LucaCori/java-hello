package net.codejava;

import java.util.Scanner;

public class Es_Matrice_4x4 {

	public static void main(String[] args) {
		int[][] matrice= new int [4][4];
		Scanner read = new Scanner (System.in);
		for(int i= 0; i<4; i++) {
			for(int j= 0; j<4; j++) {
				System.out.println("Che valore vuoi inserire nella posizione " + (i+1) + " e " + (j+1) + ": ");
				matrice[i][j]= read.nextInt();
				if(matrice[i]!=matrice[j]) {
					System.out.println("La matrice non è simmetrica!");
				}
				else if(matrice[i]==matrice[j]) {
					System.out.println("La matrice è simmetrica!");
				}
			}
		}
	}

}
