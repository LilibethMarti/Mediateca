package familia;

public class hogar {
	public String papa;
	public String mama;
	public String hijos;
	public String mascota;
	//
	public hogar(String papa, String mama, String hijos, String mascota) {
		super();
		this.papa = papa;
		this.mama = mama;
		this.hijos = hijos;
		this.mascota = mascota;
	}
	//
	public hogar() {
		super();
	}
	//
	public String getPapa() {
		return papa;
	}
	public void setPapa(String papa) {
		this.papa = papa;
	}
	public String getMama() {
		return mama;
	}
	public void setMama(String mama) {
		this.mama = mama;
	}
	public String getHijos() {
		return hijos;
	}
	public void setHijos(String hijos) {
		this.hijos = hijos;
	}
	public String getMascota() {
		return mascota;
	}
	public void setMascota(String mascota) {
		this.mascota = mascota;
	}
	//
	@Override
	public String toString() {
		return "hogar [papa=" + papa + ", mama=" + mama + ", hijos=" + hijos + ", mascota=" + mascota + ", getPapa()="
				+ getPapa() + ", getMama()=" + getMama() + ", getHijos()=" + getHijos() + ", getMascota()="
				+ getMascota() + "]";
	}
	
}
//