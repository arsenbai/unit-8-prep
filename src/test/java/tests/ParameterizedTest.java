package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.TestData;

public class ParameterizedTest extends BaseTest {
    private String season;

    @Test
    @Parameters({"month", "expectedSeason"})
    public void switchTest(int month, String expectedSeason) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
        }
        Assert.assertEquals(season, expectedSeason);
    }

    @Test(dataProvider = "string formatter", dataProviderClass = TestData.class)
    public void stringFormatTest(String name, int age, String expectedStringText) {
        String myStr = "Hey, %s! You are %d";
        String res = String.format(myStr, name, age);
        Assert.assertEquals(res, expectedStringText);
    }


}
