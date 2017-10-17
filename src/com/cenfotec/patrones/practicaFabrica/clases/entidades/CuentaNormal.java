package com.cenfotec.patrones.practicaFabrica.clases.entidades;

public class CuentaNormal extends Cuenta {
	private float interes;

	public CuentaNormal() {
		super();
		categoriaPersonaje = Categoria.Regular;
		descripcion = "Cuenta regular";
	}

	public float getInteres() {
		return interes;
	}

	public void setInteres(float interes) {
		this.interes = interes;
	}

	@Override
	public String toString() {
		return "CuentaNormal [interes=" + interes + ", categoriaPersonaje=" + categoriaPersonaje + ", descripcion="
				+ descripcion + ", consecutivo=" + consecutivo + ", saldo=" + saldo + "]";
	}
}
