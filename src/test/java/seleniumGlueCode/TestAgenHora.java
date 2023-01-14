package seleniumGlueCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestAgenHora {
	
	WebDriver driver;

	@Given("^El usuario está en la pantalla de inicio sesión en google chrome$")
	public void el_usuario_está_en_la_pantalla_de_inicio_sesión_en_google_chrome() throws Throwable {
		System.out.println("El usuario se encuentra en la pantalla inicio de sesión e inicia el navegador web");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\kako\\Documents\\proyectos eclipse\\Cucumber_Selenium\\src\\test\\java\\resources\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://localhost:8080/reservaHora/index.jsp");
	    driver.manage().window().maximize();
	    //throw new PendingException();
	}

	@When("^Se inicia sesión con usuario \"([^\"]*)\" y password \"([^\"]*)\"$")
	public void se_inicia_sesión_con_usuario_y_password(String string, String string2) throws Throwable {
		System.out.println("Se ingresa nombre de usuario y password para ser validados");
	    driver.findElement(By.id("nombreUsuario")).sendKeys(string);
	    driver.findElement(By.id("password")).sendKeys(string2);
	    //throw new PendingException();
	}

	@When("^Presiona el botón ingresar, es redireccionado a la pantalla menu$")
	public void preciona_el_botón_ingresar_es_redireccionado_a_la_pantalla_menu() throws Throwable {
		System.out.println("Se hace click en botón ingresar, válida los datos y redirecciona a la pantalla del menu");
		driver.findElement(By.id("btnIngresar")).click();
	    //throw new PendingException();
	}

	@Then("^En el menu presiona el link agendar hora y se redirecciona a la pantalla del formulario$")
	public void en_el_menu_presiona_el_link_agendar_hora_y_se_redirecciona_a_la_pantalla_del_formulario() throws Throwable {
		System.out.println("Se hace click en el link agendar hora, se redirecciona a la pantalla donde esta el formulario");
		driver.findElement(By.id("agendarHora")).click();
	    //throw new PendingException();
	}
	
}
