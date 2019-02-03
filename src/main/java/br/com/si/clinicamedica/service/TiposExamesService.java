package br.com.si.clinicamedica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.si.clinicamedica.model.TiposExames;
import br.com.si.clinicamedica.repository.TiposExamesRepository;

@Service
public class TiposExamesService{

	@Autowired
	TiposExamesRepository repository;
	
	public TiposExames create(TiposExames tiposExames) 
	{	return repository.save(tiposExames);
	}
	
	public List<TiposExames> readAll() 
	{	return repository.findAll();
	}
	
	public TiposExames readById(Integer id) 
	{	if(repository.existsById(id)) 
		{	return repository.findById(id).get();
		}
		return null;
	}
	
	public TiposExames update(TiposExames tiposExames) 
	{	if(repository.existsById(tiposExames.getId())) 
		{	return repository.save(tiposExames);
		}
		return null;
	}
	
	public void delete(Integer id) 
	{	repository.deleteById(id);
	}

}
