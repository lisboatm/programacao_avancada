package br.univeritas.aula;

public class Professor extends Pessoa implements Estudante {

	// Método construtor
	public Professor(String nome, int idade) {
		super(nome, idade);

	}

	// Método implementar
	@Override
	public void estudar() {
		System.out.println("Estudando para a Aula");
	}

}
