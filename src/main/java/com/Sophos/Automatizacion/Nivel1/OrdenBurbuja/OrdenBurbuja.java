package com.Sophos.Automatizacion.Nivel1.OrdenBurbuja;

public class OrdenBurbuja  {

	public void ordenarBurbuja (int[] arreglo) {
		
		int aux;
		boolean cambios = false;
		
		while (true) 
		{
			cambios=false;
			for(int i=1; i < arreglo.length; i++) 
			{
				if(arreglo[i] < arreglo[i-1] )
				{
					aux=arreglo[i];
					arreglo[i]= arreglo[i-1];
					arreglo[i-1]=aux;
					cambios = true;
				}
			}
			if(cambios == false)
				break;
		}
		
	}
}
