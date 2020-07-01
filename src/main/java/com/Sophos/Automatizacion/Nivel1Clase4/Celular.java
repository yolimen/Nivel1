package com.Sophos.Automatizacion.Nivel1Clase4;

public class Celular {
	
	public String sistOperativo;
	public String gama;
	
	public Celular () {    // definición del constructor se llama igual que la clase
		sistOperativo = "Android";
		gama = "Alta";
	}
	
	public String getSistOperativo() {
		return sistOperativo;
	}
	
	public void setSistOperativo(String sistOperativo) {
		this.sistOperativo = sistOperativo;
	}
	
	public String getGama() {
		return gama;
	}
	
	public void setGama(String gama) {
		this.gama = gama;
	}
	
	

}
