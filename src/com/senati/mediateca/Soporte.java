package com.senati.mediateca;

public class Soporte {
	//atributos de la clase soporte
	public int id;
	public String titulo;
	public String autor;
	public float precio;
	
	//constructor sin atributos
	public Soporte(int id, String titulo, String autor, float precio) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	//constructor sin atributos
	public Soporte() {
		super();
	}
	//Getters y setters --->>>obtener y modificar
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	//metodo ToString
	@Override
	public String toString() {
		return "Soporte [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}
	
}
