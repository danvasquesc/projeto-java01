package curso.java.dan;

import java.util.Date;

public class Pessoa {

	private String nome;

	private String sobrenome;

	private int idade;

	private Date dataNascimento;

	public Date getInicioCurso() {
		return inicioCurso;
	}

	public void setInicioCurso(Date inicioCurso) {
		this.inicioCurso = inicioCurso;
	}

	private Date inicioCurso;

	public int getIdade() {
		return idade;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
