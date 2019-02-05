package br.com.si.clinicamedica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.si.clinicamedica.model.RegistroExame;
import br.com.si.clinicamedica.repository.ResgitroExameRepository;

@Service
public class RegistroExameService {

	@Autowired
	private ResgitroExameRepository registroExameRepository;
	
	public void createRegistroExame(RegistroExame eRegistro) {
		registroExameRepository.save(eRegistro);
	}
	
	public RegistroExame readRegistroExame(int id) {
		return registroExameRepository.findById(id).get();
	}
	
	public List<RegistroExame> readAllExame(){
		return registroExameRepository.findAll();
	}
	
	public void updateRegistroExame(RegistroExame eRegistro) {
		registroExameRepository.save(eRegistro);
	}
	
	public void deleteRegistroExame(int id) {
		registroExameRepository.deleteById(id);
	}
}
