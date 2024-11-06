package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alert {

	public static void main(String[] args)  {
 
    WebDriver ravi=new EdgeDriver();
    ravi.get("https://demo.automationtesting.in/Alerts.html");
    ravi.findElement(By.xpath("//*[@id=\"OKTab\"]")).click();
    ravi.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    ravi.switchTo().alert().accept();
	}
}
