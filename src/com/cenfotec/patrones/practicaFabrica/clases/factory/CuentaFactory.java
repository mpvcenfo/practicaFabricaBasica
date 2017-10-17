package com.cenfotec.patrones.practicaFabrica.clases.factory;

import com.cenfotec.patrones.practicaFabrica.clases.entidades.Categoria;
import com.cenfotec.patrones.practicaFabrica.clases.entidades.Cuenta;
import com.cenfotec.patrones.practicaFabrica.clases.entidades.CuentaNormal;
import com.cenfotec.patrones.practicaFabrica.clases.entidades.CuentaPremium;
import com.cenfotec.patrones.practicaFabrica.clases.entidades.CuentaVIP;

public final class CuentaFactory {
	public static Cuenta createCuenta(Categoria cat) {
		switch(cat) {
		case Regular:
			return new CuentaNormal();
		case Premium:
			return new CuentaPremium();
		case VIP:
			return new CuentaVIP();
		default:
			return null;
		}
	}
}
