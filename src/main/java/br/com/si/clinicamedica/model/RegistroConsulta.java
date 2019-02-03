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
	private Integer id;

	/*@Column
	@ManyToMany
	@MapsId
	private TiposConsultas tiposConsultas;
	*/
	@Column
	private Date horarioConsulta;
	
	@Column
	private Date diaConsulta;

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/*public TiposConsultas getTiposConsultas() {
		return tiposConsultas;
	}

	public void setTiposConsultas(TiposConsultas tiposConsultas) {
		this.tiposConsultas = tiposConsultas;
	}*/

	public Date getHorarioConsulta() {
		return horarioConsulta;
	}

	public void setHorarioConsulta(Date horarioConsulta) {
		this.horarioConsulta = horarioConsulta;
	}

	public Date getDiaConsulta() {
		return diaConsulta;
	}

	public void setDiaConsulta(Date diaConsulta) {
		this.diaConsulta = diaConsulta;
	}
}
