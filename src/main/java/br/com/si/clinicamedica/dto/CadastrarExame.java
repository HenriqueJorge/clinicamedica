package br.com.si.clinicamedica.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;

public class CadastrarExame {

	@NotNull(message = "Tipo exame vazio")
	private Integer tipoExame;

	@NotEmpty(message = "Data vazia")
	private Data dataExame;

	@NotEmpty(message = "Horario vazio")
	private Data horarioExame;

	@NotNull(message = "Paciente vazio")
	private Integer idPaciente;

	public Integer getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(Integer tipoExame) {
		this.tipoExame = tipoExame;
	}

	public Data getDataExame() {
		return dataExame;
	}

	public void setDataExame(Data dataExame) {
		this.dataExame = dataExame;
	}

	public Data getHorarioExame() {
		return horarioExame;
	}

	public void setHorarioExame(Data horarioExame) {
		this.horarioExame = horarioExame;
	}

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

}
