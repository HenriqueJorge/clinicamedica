package br.com.si.clinicamedica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.si.clinicamedica.model.LoginCliente;
import br.com.si.clinicamedica.repository.LoginClienteRepository;

@Service
public class LoginClienteService {

	@Autowired
	private LoginClienteRepository loginClienteRepository;

	public void createLogin(LoginCliente login) {
		loginClienteRepository.save(login);
	}

	public LoginCliente readLogin(String id) {
		return loginClienteRepository.findById(id).get();
	}

	public List<LoginCliente> readAllLogin() {
		return loginClienteRepository.findAll();
	}

	public void updateLogin(LoginCliente login) {
		loginClienteRepository.save(login);
	}

	public void deleteLogin(String id) {
		loginClienteRepository.deleteById(id);
	}

}
