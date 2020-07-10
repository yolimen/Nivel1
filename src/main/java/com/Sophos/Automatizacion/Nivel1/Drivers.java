package com.Sophos.Automatizacion.Nivel1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers {
	
 WebDriver drivers;
 
	public Drivers() {
		
	}
	
	public void navegadorGoogle() {
		String rutaDrivers = ".\\src\\main\\java\\resources\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",rutaDrivers);
		drivers = new ChromeDriver();
		drivers.get("https://www.google.com/");
		drivers.close();
	}
	
	public void navegadorFirefox () {
		String rutaDrivers = ".\\src\\main\\java\\resources\\Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",rutaDrivers);
		drivers = new FirefoxDriver ();
		drivers.get("https://www.google.com/");
		try {
			Thread.sleep(5000);
		}catch (InterruptedException e) {
			//todo: handle exception
		}
		drivers.close();
	}
	
	public void navegadorExplorer () {
		String rutaDrivers = ".\\src\\main\\java\\resources\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",rutaDrivers);
		drivers = new InternetExplorerDriver();
		drivers.get("https://www.google.com/");
		
		drivers.close();			
				
				
	}

}
