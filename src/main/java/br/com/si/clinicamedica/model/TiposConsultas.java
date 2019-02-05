package br.com.si.clinicamedica.model;

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
	/*
	 * @Column(name = "horario_inicial", nullable = false) private Date
	 * horarioInicial;
	 * 
	 * @Column(name = "horario_final", nullable = false) private Date horarioFinal;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descrição == null) ? 0 : descrição.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		TiposConsultas other = (TiposConsultas) obj;
		if (descrição == null) {
			if (other.descrição != null)
				return false;
		} else if (!descrição.equals(other.descrição))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	/*
	 * public Date getHorarioInicial() { return horarioInicial; }
	 * 
	 * public void setHorarioInicial(Date horarioInicial) { this.horarioInicial =
	 * horarioInicial; }
	 * 
	 * public Date getHorarioFinal() { return horarioFinal; }
	 * 
	 * public void setHorarioFinal(Date horarioFinal) { this.horarioFinal =
	 * horarioFinal; }
	 */

}
