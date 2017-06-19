package com.inventory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the "MENU" database table.
 * 
 */
@Entity
@Table(name="\"MENU\"")
@NamedQuery(name="Menu.findAll", query="SELECT m FROM Menu m")
public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"CODIGO\"", nullable=false, precision=4)
	private BigDecimal codigo;

	@Column(name="\"ESTADO\"", nullable=false, length=1)
	private String estado;

	@Column(name="\"ICONO\"", length=30)
	private String icono;

	@Column(name="\"NOMBRE\"", nullable=false, length=100)
	private String nombre;

	@Column(name="\"TIPO_MENU\"", nullable=false, length=1)
	private String tipoMenu;

	@Column(name="\"TIPO_USUARIO\"", nullable=false, length=1)
	private String tipoUsuario;

	@Column(name="\"URL\"", nullable=false, length=150)
	private String url;
	
	@ManyToOne
	@JoinColumn(name = "\"CODIGO_MENU\"")
	private Menu codigoMenu;
	
	
	

	public Menu() {
	}

	public BigDecimal getCodigo() {
		return this.codigo;
	}

	public void setCodigo(BigDecimal codigo) {
		this.codigo = codigo;
	}

	public Menu getCodigoMenu() {
		return codigoMenu;
	}

	public void setCodigoMenu(Menu codigoMenu) {
		this.codigoMenu = codigoMenu;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getIcono() {
		return this.icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoMenu() {
		return this.tipoMenu;
	}

	public void setTipoMenu(String tipoMenu) {
		this.tipoMenu = tipoMenu;
	}

	public String getTipoUsuario() {
		return this.tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}