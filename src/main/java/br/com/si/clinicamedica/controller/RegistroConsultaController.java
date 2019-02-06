package br.com.si.clinicamedica.controller;

import java.util.List;

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

import br.com.si.clinicamedica.dto.CadastrarConsulta;
import br.com.si.clinicamedica.model.RegistroConsulta;

import br.com.si.clinicamedica.service.RegistroConsultasService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST Registro de Consulta")
@Controller
@RequestMapping("/registro_consultas")
public class RegistroConsultaController {

	@Autowired
	RegistroConsultasService service;
	
	@ApiOperation(value = "Registrar consultas")
	@CrossOrigin
	@PostMapping()
	public ResponseEntity<CadastrarConsulta> create(@RequestBody CadastrarConsulta registroConsulta)
	{	RegistroConsulta c = new RegistroConsulta();
		c.setDataConsulta(registroConsulta.getDiaConsulta());
		c.setHorarioConsulta(registroConsulta.getHorarioConsulta());
		c.setIdPaciente(registroConsulta.getIdPaciente());
		c.setTipoConsulta(registroConsulta.getConsulta());
		service.create(c);
		return new ResponseEntity<CadastrarConsulta>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Retorna todos os registros de consulta existentes no banco")
	@CrossOrigin
	@GetMapping()
	public ResponseEntity<List<RegistroConsulta>> readAll()
	{	return new ResponseEntity<List<RegistroConsulta>>(service.readAll(),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Retorna o registro de consulta por ID")
	@CrossOrigin
	@GetMapping(path = "/{id}")
	public ResponseEntity<RegistroConsulta> readById(@PathVariable Integer id)
	{	return new ResponseEntity<RegistroConsulta>(service.readById(id),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Atualiza o registro de consulta existente")
	@CrossOrigin
	@PutMapping
	public ResponseEntity<RegistroConsulta> update(@RequestBody RegistroConsulta registroConsulta)
	{	return new ResponseEntity<RegistroConsulta>(service.update(registroConsulta),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Deleta o registro de consulta por ID")
	@CrossOrigin
	@DeleteMapping("/{id}")
	public ResponseEntity<RegistroConsulta> delete(@PathVariable Integer id)
	{	service.delete(id);
		return new ResponseEntity<RegistroConsulta>(HttpStatus.OK);
	}
}
