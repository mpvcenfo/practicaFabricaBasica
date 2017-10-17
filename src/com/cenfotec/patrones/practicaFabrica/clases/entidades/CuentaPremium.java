package com.cenfotec.patrones.practicaFabrica.clases.entidades;

public class CuentaPremium extends Cuenta{
	private float tasaComercial;
	private float tasaSalud;
	private float tasaCashback;
	
	public CuentaPremium() {
		super();
		categoriaPersonaje = Categoria.Premium;
		descripcion = "Cuenta premium";
	}
	public float getTasaCashback() {
		return tasaCashback;
	}
	public void setTasaCashback(float tasaCashback) {
		this.tasaCashback = tasaCashback;
	}
	public float getTasaSalud() {
		return tasaSalud;
	}
	public void setTasaSalud(float tasaSalud) {
		this.tasaSalud = tasaSalud;
	}
	public float getTasaComercial() {
		return tasaComercial;
	}
	public void setTasaComercial(float tasaComercial) {
		this.tasaComercial = tasaComercial;
	}
	@Override
	public String toString() {
		return "CuentaPremium [tasaComercial=" + tasaComercial + ", tasaSalud=" + tasaSalud + ", tasaCashback="
				+ tasaCashback + ", categoriaPersonaje=" + categoriaPersonaje + ", descripcion=" + descripcion
				+ ", consecutivo=" + consecutivo + ", saldo=" + saldo + "]";
	}
}
