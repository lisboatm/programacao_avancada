package colecao;

import java.util.LinkedList;

public class Questao4 {

	public static void main(String[] args) {

		LinkedList<String> pilha = new LinkedList<String>();
		pilha.push("Rio de Janeiro");
		pilha.push("São Paulo");
		pilha.push("Bahia");
		pilha.push("Recife");

		// Remover
		pilha.poll();
		pilha.poll();

		for (String aux : pilha) {
			System.out.println(aux);
		}

	}
}
