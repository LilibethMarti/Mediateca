package com.senati.mediateca;

public class Libros extends Soporte{
	int nropag;
	int nroisbn;
	//
	public Libros(int id, String titulo, String autor, float precio, int nropag, int nroisbn) {
		super(id, titulo, autor, precio);
		this.nropag = nropag;
		this.nroisbn = nroisbn;
	}
//
	public Libros() {
		super();
	}
	//
	public int getNropag() {
		return nropag;
	}
	public void setNropag(int nropag) {
		this.nropag = nropag;
	}
	public int getNroisbn() {
		return nroisbn;
	}
	public void setNroisbn(int nroisbn) {
		this.nroisbn = nroisbn;
	}
	//
	@Override
	public String toString() {
		return "Libros [nropag=" + nropag + ", nroisbn=" + nroisbn + ", getNropag()=" + getNropag() + ", getNroisbn()="
				+ getNroisbn() + "]";
	}
	
	
}
