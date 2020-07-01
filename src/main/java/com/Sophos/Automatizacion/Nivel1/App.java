package com.Sophos.Automatizacion.Nivel1;

import com.Sophos.Automatizacion.Nivel1.EjercicioClase4.Carro;
import com.Sophos.Automatizacion.Nivel1.EjercicioClase4.Vehiculo;
import com.Sophos.Automatizacion.Nivel1Clase4.Apartamentos;
import com.Sophos.Automatizacion.Nivel1Clase4.Constantes;
import com.Sophos.Automatizacion.Nivel1Clase4.Edificacion;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		Vehiculo objVehiculo = new Vehiculo();
		objVehiculo.getTipoFuenteEnergia();
		Carro objCarro = new Carro();
		objCarro.setCantidadLlantas(4);
		
		
		System.out.println("La fuente de energía de mi vehículo es: " + objVehiculo.getTipoFuenteEnergia()+ "\n");
		
		System.out.println("El color del carro es: " + objCarro.getColor());
		System.out.println("Cantidad de llantas: " + objCarro.getCantidadLlantas());
		System.out.println("Tipo de fuente de energía: " + objCarro.getTipoFuenteEnergia());
			
		
	}
		
	public void ejemploclase4 () {	
		
		Edificacion objEdificacion = new Edificacion();
		Edificacion objEdificacion2 = new Edificacion();
		
		objEdificacion.setAreaConstruida(70);
		objEdificacion.nropisos = 4;
		
		objEdificacion2.setAreaConstruida(78);
		objEdificacion2.nropisos = 5;
		
		objEdificacion.setNropuertas(11);

		
		System.out.println("Número de pisos obj1: " + objEdificacion.nropisos);
		System.out.println("Area construida obj1: " + objEdificacion.getAreaConstruida()+"\n");

		System.out.println("Número de pisos obj2: " + objEdificacion2.nropisos);
		System.out.println("Area construida obj2: " + objEdificacion2.getAreaConstruida());

		
		System.out.println("El área de Colombia es: " + Constantes.AREACOLOMBIA + " Km2");
		System.out.println("***************************************************");

		Apartamentos objApto = new Apartamentos ();
		objApto.setAreaConstruida(52);
				
		System.out.println("Area construida Apto: " + objApto.getAreaConstruida() + "\n");
		
	}

	public void clase3() {
		System.out.println("Hello World");

		byte casoByte = 65; // A
		short casoShort = 32000; //
		int casoInt = 2147000000; // 4 bytes
		long casoLong = 555555;
		float casoFloat = (float) -5.5;
		double casoDouble = -5.252545455555555555;
		boolean casoBoolean = true;
		char casoChar = 'H';

		// int b = 66;
		// char letraB = (char) b;

		char[] nombre = { 'H', 'E', 'I', 'D', 'I' }; // Arreglo de caracteres

		int valor;

		for (int i = 0; i < nombre.length; i++) { // ej. de algoritmo de encriptación
			valor = (int) nombre[i] + 2;
			System.out.print((char) valor);
			System.out.print(",");

		}

		System.out.println();
		String casoString = "Clase 3"; //
		System.out.println(casoString.contains("3"));

		int a = 5;
		int b = 6;

		if (a > b) {
			System.out.println("valor a si es mayor que 3");
		} else {
			System.out.println("valor de variable b es mayor que a");
		}

		a = 10;

		if (a > 5 && a < 10) {
			System.out.println("a > 5 y a < 10");
		} else if (a > 10 && a < 20) {
			System.out.println("a < 10 y a < 20");
		} else {
			System.out.println("El valor no está dentro de los rangos definidos");
		}

		String item = "1";
		switch (item) {
		case "1":
			System.out.println("Ingrese al caso 1");
			break;
		case "2":
			System.out.println("Ingrese al caso 2");
			break;

		default:
			System.out.println("El otro item no existe");

		}

		// System.out.println (casoByte);
		// System.out.println (casoShort);
		// System.out.println (casoInt);
		// System.out.println (casoLong);
		// System.out.println (casoFloat);
		// System.out.println (casoDouble);
		// System.out.println (casoBoolean);
		// System.out.println (casoChar);
		// System.out.println (letraB);
	
	}

}
