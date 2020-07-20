package com.crudejemplo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.crudejemplo.commons.GenericServiceImpl;
import com.crudejemplo.dao.PersonaDAO;
import com.crudejemplo.model.Persona;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaService {

	@Autowired
	private PersonaDAO personaDao;

	@Override
	public CrudRepository<Persona, Long> getDao() {
		// TODO Auto-generated method stub
		return personaDao;
	}

}
