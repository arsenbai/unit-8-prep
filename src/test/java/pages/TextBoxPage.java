package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
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

    private static ILabel getOutputNameElement() {
        ILabel outputNameElement = AqualityServices.getElementFactory().getLabel(
                By.xpath("//p[@id='name']"), "Output Name"
        );
        outputNameElement.state().waitForDisplayed();
        return outputNameElement;
    };
    private static ILabel getOutputEmailElement() {
        ILabel outputEmailElement = AqualityServices.getElementFactory().getLabel(
                By.xpath("//p[@id='email']"), "Output Name"
        );
        outputEmailElement.state().waitForDisplayed();
        return outputEmailElement;
    };

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

    public static boolean fullnameIsDisplayedInOutput(String fullname) {
        System.out.println(getOutputNameElement().getElement().getText());
        return getOutputNameElement().getElement().getText().contains(fullname);
    };

    public static boolean emailIsDisplayedInOutput(String email) {
        System.out.println(getOutputEmailElement().getElement().getText());
        return getOutputEmailElement().getElement().getText().contains(email);
    };
}
