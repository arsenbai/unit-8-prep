package tests;

import aquality.selenium.browser.AqualityServices;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TextBoxPage;
import utils.TestData;


public class DataDrivenTestingTaskTest {
    @BeforeMethod
    public void setUp() {
        AqualityServices.getBrowser().maximize();
    }

    @Test(dataProvider = "demoqa.com Text Box data", dataProviderClass = TestData.class)
    public void testTextBox(
            String fullname,
            String email) {
        TextBoxPage.open();
        TextBoxPage.fillFullnameAndEmail(fullname, email);
        TextBoxPage.clickSubmitButton();
        TextBoxPage.outputIsDisplayed();
        Assert.assertTrue(TextBoxPage.fullnameIsDisplayedInOutput(fullname),
                "Fullname does not exist in output");
        Assert.assertTrue(TextBoxPage.emailIsDisplayedInOutput(email),
                "Email does not exist in output");
    }

    @AfterMethod
    public void tearDown() {
        AqualityServices.getBrowser().quit();
    }
}
