package com.senati.mediateca;

public class Prestamo {
	int idprestamos;
	int idsocio;
	int idsoporte;
	int cantidad;
	float monto;
	//
	public Prestamo(int idprestamos, int idsocio, int idsoporte, int cantidad, float monto) {
		super();
		this.idprestamos = idprestamos;
		this.idsocio = idsocio;
		this.idsoporte = idsoporte;
		this.cantidad = cantidad;
		this.monto = monto;
	}
	//
	public Prestamo() {
		super();
	}
	//
	public int getIdprestamos() {
		return idprestamos;
	}
	public void setIdprestamos(int idprestamos) {
		this.idprestamos = idprestamos;
	}
	public int getIdsocio() {
		return idsocio;
	}
	public void setIdsocio(int idsocio) {
		this.idsocio = idsocio;
	}
	public int getIdsoporte() {
		return idsoporte;
	}
	public void setIdsoporte(int idsoporte) {
		this.idsoporte = idsoporte;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
	//
	@Override
	public String toString() {
		return "Prestamo [idprestamos=" + idprestamos + ", idsocio=" + idsocio + ", idsoporte=" + idsoporte
				+ ", cantidad=" + cantidad + ", monto=" + monto + ", getIdprestamos()=" + getIdprestamos()
				+ ", getIdsocio()=" + getIdsocio() + ", getIdsoporte()=" + getIdsoporte() + ", getCantidad()="
				+ getCantidad() + ", getMonto()=" + getMonto() + "]";
	}
	
}
