package com.Sophos.Automatizacion.Nivel1.ArchivoCSV;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class LecturaCSV {
	
	public void leerContenidoCSV () {
		String marca, cilindraje, modelo, color;
		String rutaArchivo = "./Vehiculo.csv";
		try {
			Reader lector=Files.newBufferedReader(Paths.get(rutaArchivo));
			CSVParser csvDatos = new CSVParser(lector, CSVFormat.DEFAULT.withFirstRecordAsHeader()
					.withIgnoreHeaderCase().withTrim());
			for(CSVRecord linea: csvDatos) {
				marca = linea.get("marca");
				cilindraje = linea.get("cilindraje");
				modelo = linea.get("modelo");
				color = linea.get("color");
				
				System.out.println("\nVehiculo número: "+linea.getRecordNumber());
				System.out.println("Vehiculo marca: "+ marca);
				System.out.println("Vehiculo cilidraje: "+ cilindraje);
				System.out.println("Vehiculo modelo: "+ modelo);
				System.out.println("Vehiculo color: "+ color);
				
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
      }			
	

	public List<CSVRecord> csvMercadoLibre(String rutaArchivo){
	List<CSVRecord> lista = null;
	String marca, cilindraje, modelo, color;
	try {
		Reader lector=Files.newBufferedReader(Paths.get(rutaArchivo));
		CSVParser csvDatos = new CSVParser(lector, CSVFormat.DEFAULT.withFirstRecordAsHeader()
				.withIgnoreHeaderCase().withTrim());
		lista = csvDatos.getRecords();		
		return lista;
		}
	catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
		return lista ;
	}
  }

}

