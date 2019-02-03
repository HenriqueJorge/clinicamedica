package br.com.si.clinicamedica.model;

//import java.util.Date;
//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TiposExames {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_tiposExames")
	private Integer id;
	
	@Column(unique = true, nullable = false)
	private String descricao;
	
	/*@Column
	private List<Date> diasDisponiveis;
	
	@Column
	private List<Date> horariosDisponiveis;
	*/
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/*public List<Date> getDiasDisponiveis() {
		return diasDisponiveis;
	}

	public void setDiasDisponiveis(List<Date> diasDisponiveis) {
		this.diasDisponiveis = diasDisponiveis;
	}

	public List<Date> getHorariosDisponiveis() {
		return horariosDisponiveis;
	}

	public void setHorariosDisponiveis(List<Date> horariosDisponiveis) {
		this.horariosDisponiveis = horariosDisponiveis;
	}
	
	*/
}
