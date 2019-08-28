package com.senati.mediateca;

public class Cintaaudio extends Soporte{
	int lugar;
	int duracion;
//
	public Cintaaudio(int id, String titulo, String autor, float precio, int lugar, int duracion) {
		super(id, titulo, autor, precio);
		this.lugar = lugar;
		this.duracion = duracion;
	}
	//
public Cintaaudio() {
	super();
}
	//
public int getLugar() {
	return lugar;
}
public void setLugar(int lugar) {
	this.lugar = lugar;
}
public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}
//
@Override
public String toString() {
	return "Cintaaudio [lugar=" + lugar + ", duracion=" + duracion + ", getLugar()=" + getLugar() + ", getDuracion()="
			+ getDuracion() + "]";
}

}
