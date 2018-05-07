package basicStaff;

import HomeWork.DiamondProblem.C;
import components.pages.AddCommentPageObject;
import components.pages.NewCommentPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageList {
    WebDriver driver = new ChromeDriver();

    public NewCommentPage newCommentPage(){
        return new NewCommentPage(driver);
    }
    public AddCommentPageObject addCommentPageObject(){
        return new AddCommentPageObject(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
