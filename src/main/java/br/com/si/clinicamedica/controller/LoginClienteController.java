package br.com.si.clinicamedica.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.si.clinicamedica.dto.InfoCliente;
import br.com.si.clinicamedica.dto.Login;
import br.com.si.clinicamedica.dto.LoginClienteV;
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
	@CrossOrigin
	@PostMapping
	public ResponseEntity<LoginClienteV> createLogin(@RequestBody @Valid LoginClienteV login) {
		LoginCliente c = new LoginCliente();
		c.setCpf(login.getCpf());
		c.setEmail(login.getEmail());
		c.setNome(login.getNome());
		c.setSenha(login.getSenha());
		c.setSexo(login.getSexo());
		c.setTelefone(login.getTelefone());
		loginClienteService.createLogin(c);
		return new ResponseEntity<LoginClienteV>(HttpStatus.CREATED);
	}

	@ApiOperation(value = "Retorna um login")
	@CrossOrigin
	@GetMapping("/{id}")
	public ResponseEntity<LoginCliente> readLogin(@PathVariable(name = "id") String id) {
		return new ResponseEntity<LoginCliente>(loginClienteService.readLogin(id), HttpStatus.OK);
	}

	@ApiOperation(value = "Retorna todos os logins")
	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<LoginCliente>> readAllLogin() {
		return new ResponseEntity<List<LoginCliente>>(loginClienteService.readAllLogin(), HttpStatus.OK);
	}

	@ApiOperation(value = "Atualiza um Login")
	@CrossOrigin
	@PutMapping
	public ResponseEntity<LoginCliente> updateLogin(@RequestBody LoginCliente login) {
		loginClienteService.updateLogin(login);
		return new ResponseEntity<LoginCliente>(HttpStatus.OK);
	}

	@ApiOperation(value = "Delete um Login")
	@CrossOrigin
	@DeleteMapping("/{id}")
	public ResponseEntity<LoginCliente> deleteLogin(@PathVariable(name = "id") String id) {
		loginClienteService.deleteLogin(id);
		return new ResponseEntity<LoginCliente>(HttpStatus.OK);
	}

	@ApiOperation(value = "Retorna informacoes do cliente")
	@CrossOrigin
	@GetMapping("/info/{id}")
	public ResponseEntity<InfoCliente> readInfoCliente(@PathVariable(name = "id") String id) {
		LoginCliente n = loginClienteService.readLogin(id);
		InfoCliente i = new InfoCliente();
		i.setNome(n.getNome());
		i.setSexo(n.getSexo());
		i.setTelefone(n.getTelefone());
		i.setEmail(n.getEmail());
		return new ResponseEntity<InfoCliente>(i, HttpStatus.OK);
	}

	@ApiOperation(value = "Retorna senha e cpf")
	@CrossOrigin
	@GetMapping("/login/{id}")
	public ResponseEntity<Login> readSenha(@PathVariable(name = "id") String id) {
		LoginCliente n = loginClienteService.readLogin(id);
		Login i = new Login();
		i.setCpf(n.getCpf());
		i.setSenha(n.getSenha());
		return new ResponseEntity<Login>(i, HttpStatus.OK);
	}

}
