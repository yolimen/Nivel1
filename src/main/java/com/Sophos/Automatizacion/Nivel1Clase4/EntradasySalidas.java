package com.Sophos.Automatizacion.Nivel1Clase4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.Scanner;

public class EntradasySalidas {
	
	public String lecturaConsola (String mensaje) {
		String salida;
		Scanner lector = new Scanner(System.in);
		System.out.println(mensaje);
		salida = String.valueOf(lector.nextInt());
		//lector.close();
		return salida;
	}
	
	public String lectorArchivoPlano () {
		File file = new File("‪C:\\Users\\alexa\\eclipse-workspace\\Nivel1\\Prueba.txt");
		try {
			FileReader fileR = new FileReader(file);
			BufferedReader bf = new BufferedReader(fileR);
			return bf.readLine();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "";
	}

}
