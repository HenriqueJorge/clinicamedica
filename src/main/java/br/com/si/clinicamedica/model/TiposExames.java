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
	
	@Column(name = "titulo", nullable = false, unique = true)
	private String titulo;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	/*@Column
	private List<Date> diasDisponiveis;
	
	@Column
	private List<Date> horariosDisponiveis;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
		TiposExames other = (TiposExames) obj;
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
