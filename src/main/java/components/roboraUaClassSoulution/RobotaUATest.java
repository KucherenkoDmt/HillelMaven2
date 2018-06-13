package components.roboraUaClassSoulution;

import components.ElaementBaseClasses.ElementBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RobotaUATest {
    @Test
    public void checkJobTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rabota.ua/jobsearch/vacancy_list?regionId=4&keyWords=QA+automation+engineer");

        WebElement element = driver.findElement(By.cssSelector(".f-vacancyList-leftwrup"));

        Table table = new Table(element);

        List<Vacancy> vacancies = table.vacancies();

        vacancies.get(0).city().getText();
        vacancies.get(0).name().getText();
        vacancies.get(0).companyName().getText();
        vacancies.get(0).datePosted().getText();

    }
}
