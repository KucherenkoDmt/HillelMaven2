package WebDriver;

import components.InterfasesForElementBase.ElementBaseInterface;
import components.InterfasesForElementBase.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Element implements ElementBaseInterface, Getter {

    private WebElement element;

    private Element() {
    }

    public Element(WebElement element) {
        this.element = element;
    }

      @Override
    public boolean isDisplayed() {
        return this.element.isDisplayed();
    }

    @Override
    public void click() {
        this.element.click();
    }

    @Override
    public String getText() {
        return this.element.getText();
    }

    @Override
    public List<WebElement> getElements(String xpath) {
        return this.element.findElements(By.xpath(xpath));
    }

    @Override
    public WebElement getElement(String xpath) {
        return this.element.findElement(By.xpath(xpath));
    }
    protected WebElement getElement(){
        return this.getElement();
    }
}
