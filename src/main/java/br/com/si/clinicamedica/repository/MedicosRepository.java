package br.com.si.clinicamedica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.si.clinicamedica.model.Medicos;

@Repository
public interface MedicosRepository extends JpaRepository<Medicos, Integer>{

}
