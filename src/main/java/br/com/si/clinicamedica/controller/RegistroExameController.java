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

import br.com.si.clinicamedica.dto.CadastrarExame;
import br.com.si.clinicamedica.model.RegistroExame;
import br.com.si.clinicamedica.service.RegistroExameService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST RegistroExame")
@Controller
@RequestMapping("/registro/exame")
public class RegistroExameController {

	@Autowired
	private RegistroExameService registroExameService;

	@ApiOperation(value = "Registra um exame")
	@CrossOrigin
	@PostMapping
	public ResponseEntity<CadastrarExame> createRegistroExame(@RequestBody @Valid CadastrarExame eRegistro) {
		RegistroExame e = new RegistroExame();
		e.setTipoExame(eRegistro.getTipoExame());
		e.setDataExame(eRegistro.getDataExame());
		e.setHorarioExame(eRegistro.getHorarioExame());
		e.setIdPaciente(eRegistro.getIdPaciente());
		registroExameService.createRegistroExame(e);
		return new ResponseEntity<CadastrarExame>(HttpStatus.CREATED);
	}

	@ApiOperation(value = "Retorna um registro de exame")
	@CrossOrigin
	@GetMapping("/{id}")
	public ResponseEntity<RegistroExame> readRegistroExame(@PathVariable(name = "id") int id) {
		return new ResponseEntity<RegistroExame>(registroExameService.readRegistroExame(id), HttpStatus.OK);
	}

	@ApiOperation(value = "Retorna todos os registro de exames")
	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<RegistroExame>> readAllRegistroExame() {
		return new ResponseEntity<List<RegistroExame>>(registroExameService.readAllExame(), HttpStatus.OK);
	}

	@ApiOperation(value = "Atualiza um regitro")
	@CrossOrigin
	@PutMapping
	public ResponseEntity<RegistroExame> updateRegistroExame(@RequestBody RegistroExame eRegistro) {
		registroExameService.updateRegistroExame(eRegistro);
		return new ResponseEntity<RegistroExame>(HttpStatus.OK);
	}

	@ApiOperation(value = "Delete um registro de exameq")
	@CrossOrigin
	@DeleteMapping("/{id}")
	public ResponseEntity<RegistroExame> deleteRegistroExame(@PathVariable(name = "id") int id) {
		registroExameService.deleteRegistroExame(id);
		return new ResponseEntity<RegistroExame>(HttpStatus.OK);
	}

}
