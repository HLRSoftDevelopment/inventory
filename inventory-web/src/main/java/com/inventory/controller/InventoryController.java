/**
 * Clase InventoryController.java 10-06-2017
 * Copyright 2017 Toro Software.
 * Todos los derechos reservados.
 */
package com.inventory.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.inventory.entity.Empresaria;
import com.inventory.service.EmpresariaService;

/**
 * @author Hp
 *
 */
@ManagedBean(name = "controller")
@ViewScoped
public class InventoryController {
	
	@EJB
	EmpresariaService empresariaService;
	
	List<Empresaria> empresarias;
	String identificacion, nombre, ubicacion, estado;
	
	@PostConstruct
	public void iniciar() {
		obtenerEmpresarias();
	}
	
	public void obtenerEmpresarias() {
		//System.out.println("Nombre:    " + getNombre());
		System.out.println("Datos ingresados:" +
                		   "\nIdentificacion:    " + getIdentificacion() +		
		                   "\nNombre        :    " + getNombre() +
		                   "\nUbicacion     :    " + getUbicacion() + 
		                   "\nEstado        :    " + getEstado());
		empresarias = empresariaService.obtenerEmpresarias();
	}

	public List<Empresaria> getEmpresarias() {
		return empresarias;
	}

	public void setEmpresarias(List<Empresaria> empresarias) {
		this.empresarias = empresarias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}