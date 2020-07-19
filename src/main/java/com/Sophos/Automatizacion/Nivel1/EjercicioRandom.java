package com.Sophos.Automatizacion.Nivel1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjercicioRandom  {
	
	protected String nombrevariable;
	protected int atributoInterno;
	
	public String getNombrevariable() {
		return nombrevariable;
	}
	public void setNombrevariable(String nombrevariable) {
		this.nombrevariable = nombrevariable;
	}
	public int getAtributoInterno() {
		return atributoInterno;
	}
	public void setAtributoInterno(int atributoInterno) {
		this.atributoInterno = atributoInterno;
	}
	
	public void arregloPrimitivo() {
		String [] arregloPalabras = {"Posicion 1", "Posicion 2", "Posicion 3"};
		int [] arregloNumeros = new int[5];
		arregloNumeros [0] = 11;
		arregloNumeros [1] = 95;
		arregloNumeros [2] = 3;
		arregloNumeros [3] = 54;
		arregloNumeros [4] = 250;
		
		int pivo = arregloNumeros[0];
		for(int i=0; i<arregloNumeros.length; i++) {
			if(pivo < arregloNumeros[i]) {
				pivo = arregloNumeros[i];
			}
		}
		
		System.out.println("El número mayor es: " + pivo);
		
		
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(1100);
		lista.add(99);
		lista.add(80);
		lista.add(190);
		lista.add(51);
		lista.add(55246);
		lista.add(11);
		
		System.out.println("Esta es la lista en desorden: " + lista);
		
		Collections.sort(lista);
		
		System.out.println("Esta es la lista ordenada: " + lista);
		System.out.println("Uno de los valores es: " + lista.get(6));
		System.out.println("El tamaño de la lista es: " + lista.size());
		
		
		//BigInteger numeroGrande = new BigInteger ("5000000000000000000055555000");
		//System.out.println(numeroGrande.add(numeroGrande));
		
	}	

}
