package br.univeritas.aviaopapel;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int qfp = in.nextInt();
		int qfc = in.nextInt();
		int numC = in.nextInt();

		if (numC * qfc <= qfp)
			System.out.println("S");
		else
			System.out.println("N");
	}
}
