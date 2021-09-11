package com.univeritas.exemplo;

public class Pessoa {
	public String nome;
	private int idade;

	public Pessoa(String nome, int idade) { // Caminho: Source -> Generate Constructor using Fields.
		this.nome = nome;
		this.idade = idade;
	}

	// Caminho: Source -> Generate Getters and Setters
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
		if (idade > 0)
			this.idade = idade;
	}

	// Caminho: Source -> Generate toString()
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

	public void avaliar() {
		System.out.println("Avaliar Pessoas");
	}
}
