package colecao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		
		//Colecao<Tipo> nome = new Colecao<Tipo>();
		//String[] 1Nome = new String[10];
		ArrayList<String> lNomes = new ArrayList<String>(10);
		lNomes.add("Thiago");
		lNomes.add("Matheus");
		lNomes.add("Pedro");
		lNomes.add("Miguel");
		lNomes.add("Matheus");
		
		//Collections.sort(lNomes);//Ordena a Lista
		
		//System.out.println(lNomes.get(2)); //Imprime o pedro
		
		/*Imprime a lista
		for (String aux : lNomes) {
			System.out.println(aux);
		}*/

		/*Iterator<String> it = lNomes.iterator();
		while(it.hasNext()) {
		String aux = it.next();
		System.out.println(aux);
		}*/
		
		
	}

}
