package colecao;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {

		LinkedList<String> lista = new LinkedList<String>();
		lista.add("Thiago");
		lista.add("Miguel");
		lista.add("Bruno");
		lista.add("Matheus");
		lista.add("Arnobio");

		Collections.sort(lista);// Ordena a Lista

		lista.remove(1);
		
		Iterator<String> it = lista.iterator();
		while (it.hasNext()) {
			String aux = it.next();
			System.out.println(aux);
			
		}

		
	}

}
