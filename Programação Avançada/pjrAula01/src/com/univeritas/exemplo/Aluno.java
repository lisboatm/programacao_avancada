package com.univeritas.exemplo;

public class Aluno extends Pessoa {

	public Aluno(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Aluno []";
	}

	public void avaliar() {
		System.out.println("Avaliando");
	}

	//Sobrecarga
	public void avaliar(String msg) {
		System.out.println("Avaliando" + msg);
	}

}
