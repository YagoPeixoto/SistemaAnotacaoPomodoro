package model;

import java.util.Date;

public class Pomodoro {

	private int idPomodoro;

	public int getIdPomodoro() {
		return idPomodoro;
	}

	public void setIdPomodoro(int idPomodoro) {
		this.idPomodoro = idPomodoro;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdAnotacao() {
		return idAnotacao;
	}

	public void setIdAnotacao(int idAnotacao) {
		this.idAnotacao = idAnotacao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	private int idUsuario;
	private int idAnotacao;
	private Date dataInicio;
	private Date dataFim;

}
