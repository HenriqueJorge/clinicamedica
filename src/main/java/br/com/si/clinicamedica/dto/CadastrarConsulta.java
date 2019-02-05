package br.com.si.clinicamedica.dto;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CadastrarConsulta {

	@NotNull(message = "Consulta vazia")
	private Integer consulta;

	@NotEmpty(message = "Horario vazio")
	private Date horarioConsulta;

	@NotEmpty(message = "Dia da consulta vazia")
	private Date diaConsulta;

	@NotNull(message = "Paciente vazio")
	private Integer idPaciente;

	public Integer getConsulta() {
		return consulta;
	}

	public void setConsulta(Integer consulta) {
		this.consulta = consulta;
	}

	public java.sql.Date getHorarioConsulta() {
		return (java.sql.Date) horarioConsulta;
	}

	public void setHorarioConsulta(Date horarioConsulta) {
		this.horarioConsulta = horarioConsulta;
	}

	public java.sql.Date getDiaConsulta() {
		return (java.sql.Date) diaConsulta;
	}

	public void setDiaConsulta(Date diaConsulta) {
		this.diaConsulta = diaConsulta;
	}

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

}
