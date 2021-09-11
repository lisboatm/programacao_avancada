package br.univeritas.aula;

public class Pessoa {

	private String nome;
	private int idade;

	// Método Construtor
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	// Sobrecarga
	public void andar() {
		System.out.println("Andando");
	}

	public void andar(String msg) {
		System.out.println("Andando " + msg);
	}

	// Métodos Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	// Método toString
	@Override
	public String toString() {
		return "Pessoa [nome= " + nome + ", idade= " + idade + "]";
	}

}
