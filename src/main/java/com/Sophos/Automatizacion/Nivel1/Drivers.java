package com.Sophos.Automatizacion.Nivel1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;


public class Drivers {
	
 private WebDriver drivers;
 
 	public Drivers() {
		
	}
 
	public WebDriver getDrivers() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: Auto-generated catch block
			e.printStackTrace();
		}
		return drivers;
	}

	public void setDrivers(WebDriver drivers) {
		this.drivers = drivers;
	}

	
	public void lanzarNavegador (String navegador) {
		navegador = navegador.toLowerCase(); //convertir todo a minúscula
		
	switch (navegador) {
	case "google":
		System.setProperty("webdriver.chrome.driver", "src\\main\\java\\resources\\Drivers\\chromedriver.exe");
		drivers.manage().window().maximize();
		drivers = new ChromeDriver();
		break;
			
	case "firefox":
		System.setProperty("webdriver.gecko.driver", "src\\main\\java\\resources\\Drivers\\geckodriver.exe");
		drivers = new FirefoxDriver();
		break;
			
	case "ie":
		String rutaDrivers = ".\\src\\main\\java\\resources\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",rutaDrivers);
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.ignoreZoomSettings();
		options.introduceFlakinessByIgnoringSecurityDomains();
		options.enablePersistentHovering();
		options.disableNativeEvents();
				
		drivers = new InternetExplorerDriver(options);
		break;
	default: 
		System.out.println("El navegador seleccionado no está programado o no existe");
		break;
		}
	} // método lanzar navegador
	
	public void navegarA (String url) {
		drivers.get(url);
	}
	
	public void cierreNavegador() {
		drivers.close();
	}		
  }

