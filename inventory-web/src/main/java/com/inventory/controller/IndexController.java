/**
 * Clase IndexController.java 13-06-2017
 * Copyright 2017 Toro Software.
 * Todos los derechos reservados.
 */
package com.inventory.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author Hp
 *
 */
@ManagedBean(name = "indexController")
@ViewScoped
public class IndexController {
	
	String usuario, clave;
	
	public String iniciarSesion() {
		String redireccion = null;
		redireccion = "/pages/principal?faces-redirect=true";
		return redireccion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	

}
