package generalstore.pages;

import generalstore.utils.Driver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class FormSayfasi {
    public FormSayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }




}
