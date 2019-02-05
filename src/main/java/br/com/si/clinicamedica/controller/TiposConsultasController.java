package br.com.si.clinicamedica.controller;

import java.util.List;

import javax.validation.Valid;

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

import br.com.si.clinicamedica.dto.NovoTipo;
import br.com.si.clinicamedica.model.TiposConsultas;
import br.com.si.clinicamedica.service.TiposConsultasService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST TiposConsultas")
@Controller
@RequestMapping("/tiposconsultas")
public class TiposConsultasController {

	@Autowired
	TiposConsultasService service;

	@ApiOperation(value = "Cria um novo tipo de consulta")
	@PostMapping()
	public ResponseEntity<NovoTipo> create(@RequestBody @Valid NovoTipo tiposConsultas) {
		TiposConsultas c = new TiposConsultas();
		c.setDescrição(tiposConsultas.getDescricao());
		c.setTitulo(tiposConsultas.getTitulo());
		service.create(c);
		return new ResponseEntity<NovoTipo>(HttpStatus.CREATED);
	}

	@ApiOperation(value = "Retorna todos os tipos de consultas")
	@GetMapping()
	public ResponseEntity<List<TiposConsultas>> readAll() {
		return new ResponseEntity<List<TiposConsultas>>(service.readAll(), HttpStatus.OK);
	}

	@ApiOperation(value = "Retorna uma consulta")
	@GetMapping(path = "/{id}")
	public ResponseEntity<TiposConsultas> readById(@PathVariable Integer id) {
		return new ResponseEntity<TiposConsultas>(service.readById(id), HttpStatus.OK);
	}

	@ApiOperation(value = "Atualiza um tipo de consulta")
	@PutMapping
	public ResponseEntity<TiposConsultas> update(@RequestBody TiposConsultas tiposConsultas) {
		return new ResponseEntity<TiposConsultas>(service.update(tiposConsultas), HttpStatus.OK);
	}

	@ApiOperation(value = "Deleta um tipo de consulta")
	@DeleteMapping("/{id}")
	public ResponseEntity<TiposConsultas> delete(@PathVariable Integer id) {
		service.delete(id);
		return new ResponseEntity<TiposConsultas>(HttpStatus.OK);
	}

}
