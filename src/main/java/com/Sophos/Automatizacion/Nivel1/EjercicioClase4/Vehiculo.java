package com.Sophos.Automatizacion.Nivel1.EjercicioClase4;

public class Vehiculo {

	private int cantidadLlantas;
	private String tipoFuenteEnergia;
	
	public Vehiculo() {
		cantidadLlantas = 0;
		tipoFuenteEnergia = "Gasolina";
		
	}

	public int getCantidadLlantas() {
		return cantidadLlantas;
	}

	public void setCantidadLlantas(int cantidadLlantas) {
		this.cantidadLlantas = cantidadLlantas;
	}

	public String getTipoFuenteEnergia() {
		return tipoFuenteEnergia;
	}

	public void setTipoFuenteEnergia(String tipoFuenteEnergia) {
		this.tipoFuenteEnergia = tipoFuenteEnergia;
	}
}
