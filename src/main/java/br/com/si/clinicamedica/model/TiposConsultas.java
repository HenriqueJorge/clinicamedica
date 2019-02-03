package br.com.si.clinicamedica.model;

//import java.util.Date;

//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class TiposConsultas {
	
	@Id
	@Column(name = "id_tiposconsultas")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(unique = true, nullable = false)
	private String descrição;
	
	/*@Column
	@OneToMany
	@JoinColumn(name = "id_tiposconsultas")
	private List<Date> diaDisponivel;
	
	@Column
	@OneToMany
	@JoinColumn(name = "id_tiposconsultas")
	private List<Date> horarioDisponivel;
	*/
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	
	/*
	public List<Date> getDiaDisponivel() {
		return diaDisponivel;
	}

	public void setDiaDisponivel(List<Date> diaDisponivel) {
		this.diaDisponivel = diaDisponivel;
	}

	public List<Date> getHorarioDisponivel() {
		return horarioDisponivel;
	}

	public void setHorarioDisponivel(List<Date> horarioDisponivel) {
		this.horarioDisponivel = horarioDisponivel;
	}
	*/
}
