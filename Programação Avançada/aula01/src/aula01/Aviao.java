package aula01;

public class Aviao implements Voador {

	@Override
	public void voar() {
		System.out.println("Zummm");

	}

	@Override
	public void pousar() {
		System.out.println("Tac");

	}

	@Override
	public void decolar() {
		System.out.println("Zump");

	}

}
