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

import br.com.si.clinicamedica.model.TiposConsultas;
import br.com.si.clinicamedica.service.TiposConsultasService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST Tipos de Consultas")
@Controller
@RequestMapping("/tiposconsultas")
public class TiposConsultasController {

	@Autowired
	TiposConsultasService service;
	
	@ApiOperation(value = "Criar tipos de consultas")
	@PostMapping()
	public ResponseEntity<TiposConsultas> create(@RequestBody TiposConsultas tiposConsultas)
	{	
		return new ResponseEntity<TiposConsultas>(service.create(tiposConsultas),HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Retorna todos os tipos de consulta existentes no banco")
	@GetMapping()
	public ResponseEntity<List<TiposConsultas>> readAll()
	{	return new ResponseEntity<List<TiposConsultas>>(service.readAll(),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Retorna o tipo de consulta por ID")
	@GetMapping(path = "/{id}")
	public ResponseEntity<TiposConsultas> readById(@PathVariable Integer id)
	{	return new ResponseEntity<TiposConsultas>(service.readById(id),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Atualiza o tipo de consulta existente")
	@PutMapping
	public ResponseEntity<TiposConsultas> update(@RequestBody TiposConsultas tiposConsultas)
	{	return new ResponseEntity<TiposConsultas>(service.update(tiposConsultas),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Deleta o tipo da consulta por ID")
	@DeleteMapping("/{id}")
	public ResponseEntity<TiposConsultas> delete(@PathVariable Integer id)
	{	service.delete(id);
		return new ResponseEntity<TiposConsultas>(HttpStatus.OK);
	}
	
}
