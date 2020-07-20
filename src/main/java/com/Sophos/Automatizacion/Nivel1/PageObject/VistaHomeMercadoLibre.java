package com.Sophos.Automatizacion.Nivel1.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class VistaHomeMercadoLibre {

	private WebDriver Drivers;
	
	
	public VistaHomeMercadoLibre (WebDriver drivers) {
		this.Drivers = drivers;
		PageFactory.initElements(new AjaxElementLocatorFactory(drivers, 10), this );
	}
	
	
	@FindBy(name = "as_word")
	WebElement cajaTextoBusqueda;
	
	public void setTextAndLookFor (String text) {
		cajaTextoBusqueda.sendKeys(text);
		cajaTextoBusqueda.submit();
			
	}
	
}
