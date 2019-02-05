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

import br.com.si.clinicamedica.dto.CadastrarMedico;
import br.com.si.clinicamedica.model.Medicos;
import br.com.si.clinicamedica.service.MedicosService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST Medicos")
@Controller
@RequestMapping("/medicos")
public class MedicosController {

	@Autowired
	MedicosService service;
	
	@ApiOperation(value = "Criar Medicos")
	@PostMapping()
	public ResponseEntity<CadastrarMedico> create(@RequestBody CadastrarMedico medicos)
	{	Medicos c = new Medicos();
		c.setCrm(medicos.getCrm());
		c.setEspecialidade(medicos.getEspecialidade());
		c.setFormacaoAcademica(medicos.getFormacaoAcademica());
		c.setNome(medicos.getNome());
		service.create(c);
		return new ResponseEntity<CadastrarMedico>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Retorna todos os Medicos existentes no banco")
	@GetMapping()
	public ResponseEntity<List<Medicos>> readAll()
	{	return new ResponseEntity<List<Medicos>>(service.readAll(),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Retorna o Medico por ID")
	@GetMapping(path = "/{id}")
	public ResponseEntity<Medicos> readById(@PathVariable Integer id)
	{	return new ResponseEntity<Medicos>(service.readById(id),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Atualiza o Medico existente")
	@PutMapping
	public ResponseEntity<Medicos> update(@RequestBody Medicos medicos)
	{	return new ResponseEntity<Medicos>(service.update(medicos),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Deleta o Medico por ID")
	@DeleteMapping("/{id}")
	public ResponseEntity<Medicos> delete(@PathVariable Integer id)
	{	service.delete(id);
		return new ResponseEntity<Medicos>(HttpStatus.OK);
	}
}
