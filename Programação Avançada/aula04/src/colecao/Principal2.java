package colecao;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {

		LinkedList<String> pilha = new LinkedList<String>();
		Scanner in = new Scanner(System.in);
		while (true) {
			String str = in.nextLine();
			if (str.equals("sair"))
				break;
			pilha.push(str);
		}
		pilha.pop();
	}

}
