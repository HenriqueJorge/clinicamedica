package br.com.si.clinicamedica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.si.clinicamedica.model.RegistroConsulta;
import br.com.si.clinicamedica.repository.RegistroConsultaRepository;


@Service
public class RegistroConsultasService {

	@Autowired
	RegistroConsultaRepository repository;
	
	public RegistroConsulta create(RegistroConsulta registroConsulta) 
	{	return repository.save(registroConsulta);
	}
	
	public List<RegistroConsulta> readAll() 
	{	return repository.findAll();
	}
	
	public RegistroConsulta readById(Integer id) 
	{	if(repository.existsById(id)) 
		{	return repository.findById(id).get();
		}
		return null;
	}
	
	public RegistroConsulta update(RegistroConsulta registroConsulta) 
	{	if(repository.existsById(registroConsulta.getIdConsulta())) 
		{	return repository.save(registroConsulta);
		}
		return null;
	}
	
	public void delete(Integer id) 
	{	repository.deleteById(id);
	}
}
