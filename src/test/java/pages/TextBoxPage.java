package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TextBoxPage extends Form {
    private static final ITextBox fullNameField = AqualityServices.getElementFactory().getTextBox(
            By.xpath("//input[@id='userName']"), "Full Name Field"
    );
    private static final ITextBox emailField = AqualityServices.getElementFactory().getTextBox(
            By.xpath("//input[@id='userEmail']"), "Email Field"
    );
    private static final IButton submitButton = AqualityServices.getElementFactory().getButton(
            By.xpath("//button[@id='submit']"), "Submit Button"
    );

    public TextBoxPage() {
        super(By.xpath("//body"), "Text Box Page");
    }

    public static void open() {
        AqualityServices.getBrowser().goTo("https://demoqa.com/text-box");
    }

    public static void fillFullnameAndEmail(String fullname, String email) {
        fullNameField.clearAndType(fullname);
        emailField.clearAndType(email);
    }

    public static void clickSubmitButton() {
        if (submitButton.state().isExist()) {
            submitButton.getJsActions().click();
        }
    }

    public static void outputIsDisplayed() {
        AqualityServices.getElementFactory().getTextBox(
                By.xpath("//*[@id='output']"), "Output")
                .state().waitForDisplayed(Duration.of(3, ChronoUnit.SECONDS));
    }

    public static boolean fullnameIsDisplayedInOutput(String expectedFullnameXpath) {
        return AqualityServices.getElementFactory().getLabel(By.xpath(expectedFullnameXpath), "Output Fullname")
                .state().isExist();
    };

    public static boolean emailIsDisplayedInOutput(String expectedEmailXpath) {
        return AqualityServices.getElementFactory().getLabel(By.xpath(expectedEmailXpath), "Output Email")
                .state().isExist();
    };
}
