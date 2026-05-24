package utils;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "string formatter")
    public Object[][] parameterProvider() {
        return new Object[][]{
                {"Arsen", 35, "Hey, Arsen! You are 35"},
                {"Aset", 30, "Hey, Aset! You are 30"},
                {"Alen", 18, "Hey, Alen! You are 18"}
        };
    }

    @DataProvider(name = "demoqa.com Text Box data")
    public Object[][] demoqaComTextBoxParameterProvider() {
        return new Object[][]{
            {"Arsen Baiseupov",
                    "a.baiseupov@example.com",
                    "//p[@id='name' and contains(., 'Arsen Baiseupov')]",
                    "//p[@id='email' and contains(., 'a.baiseupov@example.com')]"
            },
            {"John Dowe",
                    "j.dowe@example.com",
                    "//p[@id='name' and contains(., 'John Dowe')]",
                    "//p[@id='email' and contains(., 'j.dowe@example.com')]"
            },
            {"Russel Crows",
                    "r.crows@example.com",
                    "//p[@id='name' and contains(., 'Russel Crows')]",
                    "//p[@id='email' and contains(., 'r.crows@example.com')]"
            },
        };
    }
}
