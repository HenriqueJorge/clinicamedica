package br.com.si.clinicamedica.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.crypto.Data;

@Entity
public class RegistroExame {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_consulta")
	private Integer idExame;

	@Column(name = "tipo_exame")
	private Integer tipoExame;

	@Column(name = "data_exame")
	private Date dataExame;

	@Column(name = "horario_Exame")
	private Date horarioExame;

	@Column(name = "id_paciente")
	private Integer idPaciente;

	public Integer getidExame() {
		return idExame;
	}

	public void setidExame(Integer idExame) {
		this.idExame = idExame;
	}

	public Integer getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(Integer tipoExame) {
		this.tipoExame = tipoExame;
	}

	public Date getDataExame() {
		return dataExame;
	}

	public void setDataExame(Data data) {
		this.dataExame = (Date) data;
	}

	public Date getHorarioExame() {
		return horarioExame;
	}

	public void setHorarioExame(Data data) {
		this.horarioExame = (Date) data;
	}

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataExame == null) ? 0 : dataExame.hashCode());
		result = prime * result + ((horarioExame == null) ? 0 : horarioExame.hashCode());
		result = prime * result + ((idExame == null) ? 0 : idExame.hashCode());
		result = prime * result + ((idPaciente == null) ? 0 : idPaciente.hashCode());
		result = prime * result + ((tipoExame == null) ? 0 : tipoExame.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroExame other = (RegistroExame) obj;
		if (dataExame == null) {
			if (other.dataExame != null)
				return false;
		} else if (!dataExame.equals(other.dataExame))
			return false;
		if (horarioExame == null) {
			if (other.horarioExame != null)
				return false;
		} else if (!horarioExame.equals(other.horarioExame))
			return false;
		if (idExame == null) {
			if (other.idExame != null)
				return false;
		} else if (!idExame.equals(other.idExame))
			return false;
		if (idPaciente == null) {
			if (other.idPaciente != null)
				return false;
		} else if (!idPaciente.equals(other.idPaciente))
			return false;
		if (tipoExame == null) {
			if (other.tipoExame != null)
				return false;
		} else if (!tipoExame.equals(other.tipoExame))
			return false;
		return true;
	}

}
