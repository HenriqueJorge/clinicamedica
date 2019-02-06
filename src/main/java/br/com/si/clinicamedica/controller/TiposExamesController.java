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

import br.com.si.clinicamedica.dto.NovoTipo;
import br.com.si.clinicamedica.model.TiposExames;
import br.com.si.clinicamedica.service.TiposExamesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST Tipos de Exames")
@Controller
@RequestMapping("/tipos_exames")
public class TiposExamesController {

	@Autowired
	TiposExamesService service;
	
	@ApiOperation(value = "Criar tipos de exames")
	@CrossOrigin
	@PostMapping()
	public ResponseEntity<NovoTipo> create(@RequestBody NovoTipo tiposExames)
	{	
		TiposExames c = new TiposExames();
		c.setDescricao(tiposExames.getDescricao());
		c.setTitulo(tiposExames.getTitulo());
		service.create(c);
		return new ResponseEntity<NovoTipo>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Retorna todos os tipos de exames existentes no banco")
	@CrossOrigin
	@GetMapping()
	public ResponseEntity<List<TiposExames>> readAll()
	{	return new ResponseEntity<List<TiposExames>>(service.readAll(),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Retorna o tipo de exame por ID")
	@CrossOrigin
	@GetMapping(path = "/{id}")
	public ResponseEntity<TiposExames> readById(@PathVariable Integer id)
	{	return new ResponseEntity<TiposExames>(service.readById(id),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Atualiza o tipo de exame existente")
	@CrossOrigin
	@PutMapping
	public ResponseEntity<TiposExames> update(@RequestBody TiposExames tiposExames)
	{	return new ResponseEntity<TiposExames>(service.update(tiposExames),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Deleta o tipo do exame por ID")
	@CrossOrigin
	@DeleteMapping("/{id}")
	public ResponseEntity<TiposExames> delete(@PathVariable Integer id)
	{	service.delete(id);
		return new ResponseEntity<TiposExames>(HttpStatus.OK);
	}
}
