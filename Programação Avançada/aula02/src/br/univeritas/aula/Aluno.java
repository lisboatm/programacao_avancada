package br.univeritas.aula;

public class Aluno extends Pessoa implements Estudante {

	// Método construtor
	public Aluno(String nome, int idade) {
		super(nome, idade);

	}

	// Método implementar
	@Override
	public void estudar() {
		System.out.println("Estudando para a Prova");
	}

}
