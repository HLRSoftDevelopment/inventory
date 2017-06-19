/**
 * Clase EmpresariaService.java 10-06-2017
 * Copyright 2017 Toro Software.
 * Todos los derechos reservados.
 */
package com.inventory.service;

import java.util.List;

import javax.ejb.Local;

import com.inventory.entity.Empresaria;

/**
 * @author Hp
 *
 */
@Local
public interface EmpresariaService {
	
	public List<Empresaria> obtenerEmpresarias();

}
