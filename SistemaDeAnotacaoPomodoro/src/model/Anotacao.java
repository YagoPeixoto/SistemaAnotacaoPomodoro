package model;

import java.util.Date;

public class Anotacao {

	private int idAnotacao;
	private int idUser;
	private String titulo;
	private String conteudo;
	private Date lembrete;
	private Date dataCricacao;
	private Date ultimaModificacao;
	private String cor;
	private int idMarcacao;

	public int getIdAnotacao() {
		return idAnotacao;
	}

	public void setIdAnotacao(int idAnotacao) {
		this.idAnotacao = idAnotacao;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Date getLembrete() {
		return lembrete;
	}

	public void setLembrete(Date lembrete) {
		this.lembrete = lembrete;
	}

	public Date getDataCricacao() {
		return dataCricacao;
	}

	public void setDataCricacao(Date dataCricacao) {
		this.dataCricacao = dataCricacao;
	}

	public Date getUltimaModificacao() {
		return ultimaModificacao;
	}

	public void setUltimaModificacao(Date ultimaModificacao) {
		this.ultimaModificacao = ultimaModificacao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIdMarcacao() {
		return idMarcacao;
	}

	public void setIdMarcacao(int idMarcacao) {
		this.idMarcacao = idMarcacao;
	}

}
