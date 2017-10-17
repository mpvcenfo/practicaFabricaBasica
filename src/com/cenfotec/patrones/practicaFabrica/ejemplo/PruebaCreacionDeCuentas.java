package com.cenfotec.patrones.practicaFabrica.ejemplo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.cenfotec.patrones.practicaFabrica.clases.entidades.Categoria;
import com.cenfotec.patrones.practicaFabrica.clases.entidades.Cuenta;
import com.cenfotec.patrones.practicaFabrica.clases.factory.CuentaFactory;

public class PruebaCreacionDeCuentas {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Cuenta> listaCuenta = new ArrayList<Cuenta>();
		int opcion =0;
		do {
			System.out.println("Escoga la accion: ");
			System.out.println("1. Crear cuenta normal ");
			System.out.println("2. Crear cuenta premium ");
			System.out.println("3. Crear cuenta VIP ");
			System.out.println("4. Listar cuentas creadas ");
			System.out.println("5. Salir ");
			opcion = Integer.parseInt(br.readLine());
			if (esOpcionValida(opcion)){
				if(opcion == 4){
					imprimirCuentas(listaCuenta);
				}else {
					listaCuenta.add(CrearCuenta(opcion));					
				}
			}
		} while (opcion != 5);
		
	}

	private static void imprimirCuentas(ArrayList<Cuenta> listaCuenta) {
		for (Cuenta cuentaActual: listaCuenta){
			System.out.println(cuentaActual);
		}
	}

	private static Cuenta CrearCuenta(int opcion) {
		return CuentaFactory.createCuenta(Categoria.values()[opcion-1]);
	}

	private static boolean esOpcionValida(int opcion) {
		return opcion > 0 && opcion < 5;
	}

}
