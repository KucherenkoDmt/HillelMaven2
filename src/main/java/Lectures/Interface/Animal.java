package Lectures.Interface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public interface Animal {
    public void eat();

    public void travel();

    Animal a = new MammalInt();

    default void defoult() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        System.out.println("Defoult interface method");
    }
}
