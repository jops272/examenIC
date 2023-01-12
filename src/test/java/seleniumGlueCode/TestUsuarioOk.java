package seleniumGlueCode;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestUsuarioOk {
   
	private ChromeDriver driver;
	
	@Given("^El usuario se encuentra en la pagina Iniciar sesión$")
	public void el_usuario_se_encuentra_en_la_pagina_Iniciar_sesión() throws Throwable {
		System.out.println("El usuario se encuentra en el inicio de sesión");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\kako\\Documents\\proyectos eclipse\\Cucumber_Selenium\\src\\test\\java\\resources\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://localhost:8080/reservaHora/index.jsp");
	    driver.manage().window().maximize();
	    //throw new PendingException();
	}

	@When("^Ingresa usuario \"([^\"]*)\"$")
	public void ingresa_usuario(String string) throws Throwable {
		System.out.println("Se ingresa nombre de usuario almacenado en la base de datos");
	    driver.findElement(By.id("nombreUsuario")).sendKeys(string);
	    //throw new PendingException();
	}

	@When("^Ingresa contraseña \"([^\"]*)\"$")
	public void ingresa_contraseña(String string) throws Throwable {
		System.out.println("Se ingresa contraseña de usuario almacenada en la base de datos");
		driver.findElement(By.id("password")).sendKeys(string);
	    //throw new PendingException();
	}

	@Then("^Al presionar el botón ingresar, se válida el usuario/contraseña y se redirige a la página menu$")
	public void al_presionar_el_botón_ingresar_se_válida_el_usuario_contraseña_y_se_redirige_a_la_página_menu() throws Throwable {
		System.out.println("Se hace click en botón ingresar, válida los datos y redirecciona a la página menu");
		driver.findElement(By.id("btnIngresar")).click();
	    //throw new PendingException();
	}
	
}
