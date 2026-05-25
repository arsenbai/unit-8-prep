package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pckg.Animal;
import pckg.Monkey;

public class SoftAssertTest extends BaseTest {
    @Test
    public void softAssertExampleTest() {
        Animal animal = new Animal(2, 22d);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("qqq", "www");
        softAssert.assertTrue(animal instanceof Monkey, "monkey is not instance of animal");
        softAssert.assertAll();
    }
}
