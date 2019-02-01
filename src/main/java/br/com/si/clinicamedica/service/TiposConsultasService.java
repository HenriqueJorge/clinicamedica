package br.com.si.clinicamedica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.si.clinicamedica.model.TiposConsultas;
import br.com.si.clinicamedica.repository.TiposConsultasRepository;

@Service
public class TiposConsultasService {
	
	@Autowired
	TiposConsultasRepository repository;
	
	public TiposConsultas create(TiposConsultas tiposConsultas) 
	{	return repository.save(tiposConsultas);
	}
	
	public List<TiposConsultas> readAll() 
	{	return repository.findAll();
	}
	
	public TiposConsultas readById(Integer id) 
	{	if(repository.existsById(id)) 
		{	return repository.findById(id).get();
		}
		return null;
	}
	
	public TiposConsultas update(TiposConsultas tiposConsultas) 
	{	if(repository.existsById(tiposConsultas.getId())) 
		{	return repository.save(tiposConsultas);
		}
		return null;
	}
	
	public void delete(Integer id) 
	{	repository.deleteById(id);
	}
	
}
