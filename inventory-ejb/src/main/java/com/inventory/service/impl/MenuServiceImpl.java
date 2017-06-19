/**
 * Clase MenuServiceImpl.java 16-06-2017
 * Copyright 2017 Toro Software.
 * Todos los derechos reservados.
 */
package com.inventory.service.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.inventory.entity.Menu;
import com.inventory.service.MenuService;

/**
 * @author Hp
 *
 */
@Stateless
public class MenuServiceImpl extends ServiceBase<Menu> implements MenuService {
	
	@PersistenceContext(name = "inventory-PU")
	private EntityManager em;

	/**
	 * @param entityClass
	 */
	public MenuServiceImpl() {
		super(Menu.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
