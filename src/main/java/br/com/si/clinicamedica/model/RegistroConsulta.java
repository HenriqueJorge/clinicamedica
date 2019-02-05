package br.com.si.clinicamedica.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class RegistroConsulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_regitroconsulta")
	private Integer idConsulta;
	
	@Column(name = "tipo_consulta")
	private Integer tipoConsulta;
	
	@Column(name = "horario_consulta")
	private Date horarioConsulta;
	
	@Column(name = "data_consulta")
	private Date dataConsulta;

	@Column(name = "id_paciente")
	private Integer idPaciente;

	public Integer getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(Integer idConsulta) {
		this.idConsulta = idConsulta;
	}

	public Integer getTipoConsulta() {
		return tipoConsulta;
	}

	public void setTipoConsulta(Integer tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	public Date getHorarioConsulta() {
		return horarioConsulta;
	}

	public void setHorarioConsulta(Date horarioConsulta) {
		this.horarioConsulta = horarioConsulta;
	}

	public Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}
	

	/*public TiposConsultas getTiposConsultas() {
		return tiposConsultas;
	}

	public void setTiposConsultas(TiposConsultas tiposConsultas) {
		this.tiposConsultas = tiposConsultas;
	}*/

}
