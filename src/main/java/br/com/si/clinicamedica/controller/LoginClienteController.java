package br.com.si.clinicamedica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.si.clinicamedica.model.LoginCliente;
import br.com.si.clinicamedica.service.LoginClienteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST LoginCliente")
@Controller
@RequestMapping("/login")
public class LoginClienteController {
	
	@Autowired
	private LoginClienteService loginClienteService;
	
	@ApiOperation(value = "Cadastrar um novo Login")
	@PostMapping
	public ResponseEntity<LoginCliente> createLogin(@RequestBody LoginCliente login){
		loginClienteService.createLogin(login);
		return new ResponseEntity<LoginCliente>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Retorna um login")
	@GetMapping("/{id}")
	public ResponseEntity<LoginCliente> readLogin(@PathVariable(name = "id") int id){
		return new ResponseEntity<LoginCliente>(loginClienteService.readLogin(id),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Retorna todos os logins")
	@GetMapping
	public ResponseEntity<List<LoginCliente>> readAllLogin(){
		return new ResponseEntity<List<LoginCliente>>(loginClienteService.readAllLogin(),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Atualiza um Login")
	@PutMapping
	public ResponseEntity<LoginCliente> updateLogin(@RequestBody LoginCliente login){
		loginClienteService.updateLogin(login);
		return new ResponseEntity<LoginCliente>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Delete um Login")
	@DeleteMapping("/{id}")
	public ResponseEntity<LoginCliente> deleteLogin(@PathVariable(name = "id") int id){
		loginClienteService.deleteLogin(id);
		return new ResponseEntity<LoginCliente>(HttpStatus.OK);
	}
	
	

}
