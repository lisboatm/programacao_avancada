package colecao;

import java.util.LinkedList;

public class Questao7 {

	public static void main(String[] args) {
		
		// Utilizar um LinkedList e inserir nele os números múltiplos de 3 e 7 0 a 1000.
		LinkedList<Integer> lista = new LinkedList<Integer>();
		for (int i = 0; i <= 1000; i++) {
			if (i % 3 == 0 && i % 7 == 0) {
				lista.add(i);
			}
		}
		// imprima
		for (Integer aux : lista) {
			System.out.println(aux);
		}

	}
}
