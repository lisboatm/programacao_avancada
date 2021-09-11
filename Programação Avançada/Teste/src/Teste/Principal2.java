package Teste;

import java.util.Scanner;

public class Principal2 {
	public static void main(String[] args) {
		// variáveis
		int num[] = new int[4];
		Scanner in = new Scanner(System.in);
		// lê
		for (int i = 0; i <= 4; i++) {
			System.out.println("Digite um número");
			num[i] = in.nextInt();
		}

		try {
			comando(s);
		} catch (FileNotFoundException f) {
			comando(s);
		} catch (Exception e) {
			comando(s);
		}

		// imprime
		// for(auxiliar: lista)
		for (int aux : num) {
			System.out.println(aux * aux);
		}
		in.close();
	}

}