package com.Sophos.Automatizacion.Nivel1Clase4;

public class Edificacion {

	private String color;
	private int AreaConstruida;
	
	//atributos públicos
	public int nropisos;
	
	//atributos protected
	protected int nropuertas;
	
	
	protected int getNropuertas() {
		return nropuertas;
	}


	public void setNropuertas(int nropuertas) {
		if (nropuertas > 10) {
			System.out.println("[ALERTA], No es posible crear un edificio con más de 10 puertas");
		} else {
			this.nropuertas = nropuertas;
		}
		
	}


	public Edificacion() {  //constructor definido
		color = null;
		AreaConstruida = 0;
		
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getAreaConstruida() {
		return AreaConstruida;
	}


	public void setAreaConstruida(int areaConstruida) {
		AreaConstruida = areaConstruida;
	}
	
	
	
}
