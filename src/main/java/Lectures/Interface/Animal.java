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

    static boolean isNull(String str){
        System.out.println("статический метод, который нельзя переопределять");
        return str == null ? true : "".equals(str) ? true : false;
    }
}
