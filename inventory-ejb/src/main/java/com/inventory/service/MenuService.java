/**
 * Clase MenuService.java 16-06-2017
 * Copyright 2017 Toro Software.
 * Todos los derechos reservados.
 */
package com.inventory.service;

import java.util.List;

import javax.ejb.Local;

import com.inventory.entity.Menu;

/**
 * @author Hp
 *
 */
@Local
public interface MenuService {
	
	void create(Menu menu);

    void edit(Menu menu);

    void remove(Menu menu);

    Menu find(Object id);

    List<Menu> findAll();

    List<Menu> findRange(int[] range);

    int count();

}
