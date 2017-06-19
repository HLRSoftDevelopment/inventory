package com.inventory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "EMPRESARIA" database table.
 * 
 */
@Entity
@Table(name="\"EMPRESARIA\"")
@NamedQuery(name="Empresaria.findAll", query="SELECT e FROM Empresaria e")
public class Empresaria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EMPRESARIA_CODIGO_GENERATOR", sequenceName="SEQ_EMPRESARIA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMPRESARIA_CODIGO_GENERATOR")
	@Column(name="\"CODIGO\"", unique=true, nullable=false, precision=10)
	private long codigo;

	@Column(name="\"ESTADO\"", length=3)
	private String estado;

	@Column(name="\"IDENTIFICACION\"", length=10)
	private String identificacion;

	@Column(name="\"NOMBRE\"", length=30)
	private String nombre;

	@Column(name="\"UBICACION\"", length=30)
	private String ubicacion;

	public Empresaria() {
	}

	public long getCodigo() {
		return this.codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

}