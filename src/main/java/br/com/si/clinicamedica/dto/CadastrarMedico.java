package br.com.si.clinicamedica.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CadastrarMedico {

	@NotEmpty(message = "Nome vazio")
	private String nome;

	@NotNull(message = "Numero vazio")
	private Integer crm;

	@NotEmpty(message = "Especialidade vazia")
	private String especialidade;

	@NotEmpty(message = "Formacao vazia")
	private String formacaoAcademica;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCrm() {
		return crm;
	}

	public void setCrm(Integer crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getFormacaoAcademica() {
		return formacaoAcademica;
	}

	public void setFormacaoAcademica(String formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((crm == null) ? 0 : crm.hashCode());
		result = prime * result + ((especialidade == null) ? 0 : especialidade.hashCode());
		result = prime * result + ((formacaoAcademica == null) ? 0 : formacaoAcademica.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		CadastrarMedico other = (CadastrarMedico) obj;
		if (crm == null) {
			if (other.crm != null)
				return false;
		} else if (!crm.equals(other.crm))
			return false;
		if (especialidade == null) {
			if (other.especialidade != null)
				return false;
		} else if (!especialidade.equals(other.especialidade))
			return false;
		if (formacaoAcademica == null) {
			if (other.formacaoAcademica != null)
				return false;
		} else if (!formacaoAcademica.equals(other.formacaoAcademica))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
