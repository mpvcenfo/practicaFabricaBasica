package com.cenfotec.patrones.practicaFabrica.clases.entidades;

import java.util.ArrayList;

public class CuentaVIP extends Cuenta{
	private ArrayList<Integer> opcionesTasaZero = new ArrayList<Integer>();
	private float tasaCompras;
	private float tasaSaldos;
	private float saldoCompras;
	private float saldoSaldos;
	
	public CuentaVIP() {
		super();
		categoriaPersonaje = Categoria.VIP;
		descripcion = "Cuenta VIP";
	}
	public ArrayList<Integer> getOpcionesTasaZero() {
		return opcionesTasaZero;
	}
	public void setOpcionesTasaZero(ArrayList<Integer> opcionesTasaZero) {
		this.opcionesTasaZero = opcionesTasaZero;
	}
	public float getTasaCompras() {
		return tasaCompras;
	}
	public void setTasaCompras(float tasaCompras) {
		this.tasaCompras = tasaCompras;
	}
	public float getTasaSaldos() {
		return tasaSaldos;
	}
	public void setTasaSaldos(float tasaSaldos) {
		this.tasaSaldos = tasaSaldos;
	}
	public float getSaldoCompras() {
		return saldoCompras;
	}
	public void setSaldoCompras(float saldoCompras) {
		this.saldoCompras = saldoCompras;
	}
	public float getSaldoSaldos() {
		return saldoSaldos;
	}
	public void setSaldoSaldos(float saldoSaldos) {
		this.saldoSaldos = saldoSaldos;
	}
	@Override
	public String toString() {
		return "CuentaVIP [opcionesTasaZero=" + opcionesTasaZero + ", tasaCompras=" + tasaCompras + ", tasaSaldos="
				+ tasaSaldos + ", saldoCompras=" + saldoCompras + ", saldoSaldos=" + saldoSaldos
				+ ", categoriaPersonaje=" + categoriaPersonaje + ", descripcion=" + descripcion + ", consecutivo="
				+ consecutivo + ", saldo=" + saldo + "]";
	}

}
