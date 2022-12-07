package com.ittg.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Empleado {
	@Id
	@GeneratedValue
	private Long id;
    private String nombre;
    private String apellidos; 
public Empleado() {
// TODO Auto-generated constructor stub
}
public Empleado(Long id, String nombre, String apellidos) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.apellidos = apellidos;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
}
