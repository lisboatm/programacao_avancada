package colecao;

import java.util.ArrayList;
import java.util.Collections;

public class Questao2 {

	public static void main(String[] args) {

		ArrayList<String> lNomes = new ArrayList<String>();
		lNomes.add("Thiago");
		lNomes.add("Matheus");
		lNomes.add("Bruno");
		lNomes.add("Miguel");

		lNomes.remove(3);

		Collections.sort(lNomes);// Ordena a Lista

		for (String aux : lNomes) {
			System.out.println(aux);

		}

	}

}
