/**
 * Clase EmpresariaServiceImpl.java 10-06-2017
 * Copyright 2017 Toro Software.
 * Todos los derechos reservados.
 */
package com.inventory.service.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.inventory.entity.Empresaria;
import com.inventory.service.EmpresariaService;

/**
 * @author Hp
 *
 */
@Stateless
public class EmpresariaServiceImpl implements EmpresariaService {
	
	@PersistenceContext(unitName = "inventory-PU")
    private EntityManager entityManager;
    
	/* (non-Javadoc)
	 * @see com.inventory.service.EmpresariaService#obtenerEmpresarias()
	 */
	@Override
	public List<Empresaria> obtenerEmpresarias() {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Empresaria> query = builder.createQuery(Empresaria.class);
        Root<Empresaria> variableRoot = query.from(Empresaria.class);
        query.select(variableRoot);
        return entityManager.createQuery(query).getResultList();
	}

}