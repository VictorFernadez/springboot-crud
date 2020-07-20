package com.crudejemplo.dao;

import org.springframework.data.repository.CrudRepository;

import com.crudejemplo.model.Persona;

public interface PersonaDAO extends CrudRepository<Persona, Long> {
	

}
