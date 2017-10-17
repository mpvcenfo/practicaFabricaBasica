package com.cenfotec.patrones.practicaFabrica.clases.entidades;

import java.math.BigDecimal;

public class Cuenta {
	protected Categoria categoriaPersonaje;
	protected String descripcion;
	protected int consecutivo;
	protected BigDecimal saldo;
	
	public Cuenta() {
		
	}
	
	public Categoria getCategoriaPersonaje() {
		return categoriaPersonaje;
	}
	public void setCategoriaPersonaje(Categoria categoriaPersonaje) {
		this.categoriaPersonaje = categoriaPersonaje;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getConsecutivo() {
		return consecutivo;
	}
	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
}
