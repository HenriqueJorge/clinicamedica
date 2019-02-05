package br.com.si.clinicamedica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.si.clinicamedica.model.Medicos;
import br.com.si.clinicamedica.repository.MedicosRepository;

@Service
public class MedicosService {

	@Autowired
	MedicosRepository repository;
	
	public Medicos create(Medicos medicos) 
	{	return repository.save(medicos);
	}
	
	public List<Medicos> readAll() 
	{	return repository.findAll();
	}
	
	public Medicos readById(Integer id) 
	{	if(repository.existsById(id)) 
		{	return repository.findById(id).get();
		}
		return null;
	}
	
	public Medicos update(Medicos medicos) 
	{	if(repository.existsById(medicos.getId())) 
		{	return repository.save(medicos);
		}
		return null;
	}
	
	public void delete(Integer id) 
	{	repository.deleteById(id);
	}
}
