package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiters {
    public static void main(String[] args) {
        WebDriver driver = null;
        WebDriverWait wait = new WebDriverWait(driver, 10,100);
//       wait.until(driver -> driver.findElement(locator));
wait.withMessage("some massage");
    }
}
