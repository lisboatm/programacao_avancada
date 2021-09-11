package colecao;

import java.util.LinkedList;

public class Questao5 {

	public static void main(String[] args) {
		
		LinkedList<String> lista = new LinkedList<String>();
		//FIFO ou PEPS
		lista.add("Flamengo");
		lista.add("Vasco");
		lista.add("São Paulo");
		lista.add("Botafogo");
		lista.add("Fluminense");
		
		System.out.println(lista.removeFirst());
		System.out.println(lista.removeFirst());

	}

}
