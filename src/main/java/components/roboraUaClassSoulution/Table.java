package components.roboraUaClassSoulution;

import components.ElaementBaseClasses.ElementBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Table extends ElementBase {
    public Table(WebElement element) {
        super(element);
    }
    public ElementBase header(){
      WebElement element = getElement("//div[@class='f-vacancylist-foundblock']");
      return new ElementBase(element);
    }

    public List<Vacancy> vacancies(){
        List<WebElement> webElements = getElements("//tr");
        return webElements.stream().map(Vacancy::new).collect(Collectors.toList());
    }

}
