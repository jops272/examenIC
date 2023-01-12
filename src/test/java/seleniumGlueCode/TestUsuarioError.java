package seleniumGlueCode;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestUsuarioError {

	private ChromeDriver driver;
	
	@Given("^El usuario se encuentra en la pantalla inicio de sesión$")
	public void el_usuario_se_encuentra_en_la_pantalla_inicio_de_sesión() throws Throwable {
		System.out.println("El usuario se encuentra en la pantalla inicio de sesión e inicia el navegador web");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\kako\\Documents\\proyectos eclipse\\Cucumber_Selenium\\src\\test\\java\\resources\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://localhost:8080/reservaHora/index.jsp");
	    driver.manage().window().maximize();
	    //throw new PendingException();
	}

	@When("^Al ingresar nombre de usuario incorrecto \"([^\"]*)\"$")
	public void al_ingresar_nombre_de_usuario_incorrecto(String string) throws Throwable {
		System.out.println("Se ingresa nombre de usuario incorrecto");
	    driver.findElement(By.id("nombreUsuario")).sendKeys(string);
	    //throw new PendingException();
	}

	@When("^Al ingresar password incorrecto \"([^\"]*)\"$")
	public void al_ingresar_password_incorrecto(String string) throws Throwable {
		System.out.println("Se ingresa contraseña de usuario incorrecta");
		driver.findElement(By.id("password")).sendKeys(string);
	    //throw new PendingException();
	}

	@Then("^Al presionar el botón ingresar, se debe redirigir a la pantalla error$")
	public void al_presionar_el_botón_ingresar_se_debe_redirigir_a_la_pantalla_error() throws Throwable {
		System.out.println("Al hacer click en botón ingresar, inválida los datos y se redirecciona a la pantalla error");
		driver.findElement(By.id("btnIngresar")).click();
	    //throw new PendingException();
	}
	
}
