package components.ElaementBaseClasses;

import components.InterfasesForElementBase.Checkbox;
import org.openqa.selenium.WebElement;

public class CheckBox extends ElementBase implements Checkbox {
    public CheckBox(WebElement element) {
        super(element);
    }

    @Override
    public void check() {
        if(!isChecked()){
            click();
        }
    }

    @Override
    public void unCheck() {
        if (isChecked()){
            click();
        }
    }

    @Override
    public boolean isChecked() {
        return getWebElement().isSelected();
    }
}
