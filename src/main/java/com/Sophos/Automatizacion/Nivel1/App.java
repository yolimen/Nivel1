package com.Sophos.Automatizacion.Nivel1;

import java.net.InterfaceAddress;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.InterfaceImplementation;

import com.Sophos.Automatizacion.Nivel1.EjercicioClase4.Carro;
import com.Sophos.Automatizacion.Nivel1.EjercicioClase4.Vehiculo;
import com.Sophos.Automatizacion.Nivel1.PageObject.VistaHomeMercadoLibre;
import com.Sophos.Automatizacion.Nivel1.PageObject.vistaResultados;
import com.Sophos.Automatizacion.Nivel1Clase4.Apartamentos;
import com.Sophos.Automatizacion.Nivel1Clase4.Constantes;
import com.Sophos.Automatizacion.Nivel1Clase4.Edificacion;
import com.Sophos.Automatizacion.Nivel1Clase4.EntradasySalidas;
import com.libreria.Libreria.Calculadora;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		App app = new App();
		app.mercadoLibreClase11();

	}

	public void mercadoLibreClase11() {
		Drivers objDriver = new Drivers();
		objDriver.lanzarNavegador("google");
		objDriver.navegarA("https://www.mercadolibre.com.co/");
		VistaHomeMercadoLibre vistaHome = new VistaHomeMercadoLibre(objDriver.getDrivers());
		vistaHome.setTextAndLookFor("silla gamer");
		vistaResultados resultados = new vistaResultados(objDriver.getDrivers());
		resultados.seleccionePrimerElemento();
				
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: Auto-generated catch block
			e.printStackTrace();
		}
		
		objDriver.cierreNavegador();

	}

	// clase6();

	public static void clase10() {
		// Patrón Builder
		// Se crea el builder new BankAccountBuilder(accountNumber) que por defecto
		// necesita el número de cuenta
		// porque es un valor indispensable. Luego se usa el builder y se envían los
		// parametros uno por uno

		BankAccountBuilder builder = new BankAccountBuilder(12345l);

		BankAccount bankAccount = builder.withBalance(1000.20).withOwner("Oaken").withRate(10.15).withType(BankAccountType.PLATINUM).build();

		System.out.println(bankAccount);
	}

	public static void clase9() {

		EjercicioRandom objEjercicio = new EjercicioRandom();
		objEjercicio.arregloPrimitivo();
	}

	public static void clase6() {

		EntradasySalidas io = new EntradasySalidas();

		System.out.println(io.lectorArchivoPlano());

		String variable1 = io.lecturaConsola("Por favor digite el valor 1: ");
		String variable2 = io.lecturaConsola("Por favor digite el valor 2: ");
		Calculadora ObjCalculadora = new Calculadora();

		System.out.println("El resultado de la suma es: "
				+ ObjCalculadora.suma(Integer.parseInt(variable1), Integer.parseInt(variable2)));

		// WebDriver objWebDriver = new ChromeDriver()

//		Calculadora ObjCalculadora = new Calculadora();

		// System.out.println(ObjCalculadora.suma(17, 9));
		// System.out.println(ObjCalculadora.resta(17, 9));
		// System.out.println(ObjCalculadora.multiplicacion(17, 9));
		// System.out.println(ObjCalculadora.division(17, 9));
		// System.out.println(ObjCalculadora.modulo(17, 9));

	}

	public static void clase8() {
		Drivers objDrivers = new Drivers();
		objDrivers.lanzarNavegador("google");
		objDrivers.navegarA("https://www.google.com");
		WebElement cajaTexto = objDrivers.getDrivers()
				.findElement(By.xpath("" + "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		cajaTexto.sendKeys("Sophos Chronus");

		// WebElement cajaTexto2 = objDrivers.getDrivers().findElement(By.name("q"));
		// cajaTexto.clear();
		// cajaTexto.sendKeys(" Code");

		// cajaTexto2.submit();

		// WebElement botonBuscar =
		// objDrivers.getDrivers().findElement(By.name("btnK"));
		// botonBuscar.click();

		try {
			Thread.sleep(2000); // Este tiempo se describe en milisegundos
		} catch (Exception e) {
			// TODO: handle exception
		}

		// ArrayList<WebElement> listaElementos = (ArrayList<WebElement>)
		// objDrivers.getDrivers()
		// .findElements(By.className("LC20lb DKV0Md"));
		// System.out.println("Se han encontrado " + listaElementos.size() + "
		// elementos");

		// try {
		// Thread.sleep(5000); //Este tiempo se describe en milisegundos
		// } catch (Exception e) {
		// // TODO: handle exception

		objDrivers.cierreNavegador();
	}

	public static void clase7() {

		Drivers objDrivers = new Drivers();

	}

	public static void clase4() {

		Vehiculo objVehiculo = new Vehiculo();
		objVehiculo.getTipoFuenteEnergia();
		Carro objCarro = new Carro();
		objCarro.setCantidadLlantas(4);

		System.out.println("La fuente de energía de mi vehículo es: " + objVehiculo.getTipoFuenteEnergia() + "\n");

		System.out.println("El color del carro es: " + objCarro.getColor());
		System.out.println("Cantidad de llantas: " + objCarro.getCantidadLlantas());
		System.out.println("Tipo de fuente de energía: " + objCarro.getTipoFuenteEnergia());

	}

	public void ejemploclase4() {

		Edificacion objEdificacion = new Edificacion();
		Edificacion objEdificacion2 = new Edificacion();

		objEdificacion.setAreaConstruida(70);
		objEdificacion.nropisos = 4;

		objEdificacion2.setAreaConstruida(78);
		objEdificacion2.nropisos = 5;

		objEdificacion.setNropuertas(11);

		System.out.println("Número de pisos obj1: " + objEdificacion.nropisos);
		System.out.println("Area construida obj1: " + objEdificacion.getAreaConstruida() + "\n");

		System.out.println("Número de pisos obj2: " + objEdificacion2.nropisos);
		System.out.println("Area construida obj2: " + objEdificacion2.getAreaConstruida());

		System.out.println("El área de Colombia es: " + Constantes.AREACOLOMBIA + " Km2");
		System.out.println("***************************************************");

		Apartamentos objApto = new Apartamentos();
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

		// String paso = "1";
		// switch (paso) {
		// case "1":
		// System.out.println("Ingrese al caso 1");
		// break;
		// case "2":
		// System.out.println("Ingrese al caso 2");
		// break;

		// default:
		// System.out.println("El otro item no existe");

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
