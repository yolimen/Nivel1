package com.Sophos.Automatizacion.Nivel1.ConsolaNumeroMayor;

import java.util.Scanner;

public class NumeroMayorConsola {
	
	public void numeroMayor() {
		int nume1, nume2, nume3, nume4, nume5, nume6, nume7, nume8, nume9, nume10;
		Scanner nromayor = new Scanner (System.in);
		System.out.print("Digite por favor el primer número: ");
		nume1= nromayor.nextInt();
		System.out.print("Digite por favor el segundo número: ");
		nume2= nromayor.nextInt();
		System.out.print("Digite por favor el tercer número: ");
		nume3= nromayor.nextInt();
		System.out.print("Digite por favor el cuarto número: ");
		nume4= nromayor.nextInt();
		System.out.print("Digite por favor el quinto número: ");
		nume5= nromayor.nextInt();
		System.out.print("Digite por favor el sexto número: ");
		nume6= nromayor.nextInt();
		System.out.print("Digite por favor el séptimo número: ");
		nume7= nromayor.nextInt();
		System.out.print("Digite por favor el octavo número: ");
		nume8= nromayor.nextInt();
		System.out.print("Digite por favor el noveno número: ");
		nume9= nromayor.nextInt();
		System.out.print("Digite por favor el décimo número: ");
		nume10= nromayor.nextInt();
		
		int [] arregloMayores = new int[10];
		arregloMayores [0] = nume1;
		arregloMayores [1] = nume2;
		arregloMayores [2] = nume3;
		arregloMayores [3] = nume4;
		arregloMayores [4] = nume5;
		arregloMayores [5] = nume6;
		arregloMayores [6] = nume7;
		arregloMayores [7] = nume8;
		arregloMayores [8] = nume9;
		arregloMayores [9] = nume10;
		
		int mayor = arregloMayores[0];
		for(int i1=0; i1<arregloMayores.length; i1++) {
			if(mayor < arregloMayores[i1]) {
				mayor = arregloMayores[i1];
			}
		}
		
		System.out.println("El número mayor es: " + mayor);
  }
}