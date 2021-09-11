package br.univeritas.exemplo;

import java.util.Scanner;

public class Principal {

	// Validar se a pessoa escreveu Bruno
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str = str.toUpperCase();
		boolean t = str.matches("BRUNO");
		System.out.println(t);

	}

}
