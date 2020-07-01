package com.Sophos.Automatizacion.Nivel1Clase4;

public class Apartamentos extends Edificacion {

	private String NroTorre; 
	
	
	public Apartamentos() {   //definición de constructor
		
		NroTorre = null ;
						
	}

	public String getNroTorre() {
		return NroTorre;
	}

	public void setNroTorre(String nroTorre) {
		NroTorre = nroTorre;
	}

}
