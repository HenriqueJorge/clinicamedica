package br.com.si.clinicamedica.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TiposConsultas {
	
	@Id
	@Column(name = "id_tiposConsultas")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "descrição", nullable = false, unique = true)
	private String descrição;
	
	@Column(name = "horario_inicial", nullable = false)
	private Date horarioInicial;
	
	@Column(name = "horario_final", nullable = false)
	private Date horarioFinal;
	

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
	public Date getHorarioInicial() {
		return horarioInicial;
	}
	public void setHorarioInicial(Date horarioInicial) {
		this.horarioInicial = horarioInicial;
	}
	public Date getHorarioFinal() {
		return horarioFinal;
	}
	public void setHorarioFinal(Date horarioFinal) {
		this.horarioFinal = horarioFinal;
	}
	
	

}
