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
	
	@Column(name = "titulo", nullable = false, unique = true)
	private String titulo;

	@Column(name = "descrição", nullable = false)
	private String descricao;
	/*
	 * @Column(name = "horario_inicial", nullable = false) private Date
	 * horarioInicial;
	 * 
	 * @Column(name = "horario_final", nullable = false) private Date horarioFinal;
	 */

	
	
	
	public Integer getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescrição() {
		return descricao;
	}

	public void setDescrição(String descrição) {
		this.descricao = descrição;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
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
