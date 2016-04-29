package model;

import java.util.Date;

public class Usuario {

	private int idUsuario;
	private String nome;
	private String sobreNome;
	private Date dataNascimento;
	private String usuarioID;
	private int tempoPomodoro;
	private int tempoDescanco;
	private int tempoDescancoLongo;
	private int sessoesTrabalho;

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getUsuarioID() {
		return usuarioID;
	}

	public void setUsuarioID(String usuarioID) {
		this.usuarioID = usuarioID;
	}

	public int getTempoPomodoro() {
		return tempoPomodoro;
	}

	public void setTempoPomodoro(int tempoPomodoro) {
		this.tempoPomodoro = tempoPomodoro;
	}

	public int getTempoDescanco() {
		return tempoDescanco;
	}

	public void setTempoDescanco(int tempoDescanco) {
		this.tempoDescanco = tempoDescanco;
	}

	public int getTempoDescancoLongo() {
		return tempoDescancoLongo;
	}

	public void setTempoDescancoLongo(int tempoDescancoLongo) {
		this.tempoDescancoLongo = tempoDescancoLongo;
	}

	public int getSessoesTrabalho() {
		return sessoesTrabalho;
	}

	public void setSessoesTrabalho(int sessoesTrabalho) {
		this.sessoesTrabalho = sessoesTrabalho;
	}

	

}