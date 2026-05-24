package tests;

import org.testng.annotations.Test;
import utils.ProgrammingPracticeUtils;

public class ErrorHandlingTest extends BaseTest {
    @Test
    public void databaseSimulationTest() {
        try {
            ProgrammingPracticeUtils.readDatabase();
        } catch (RuntimeException e) {
            System.out.println("Custom Error message: " + e.getMessage());
            e.printStackTrace();
        } finally{
            System.out.println("Database access attempt");
        }
        System.out.println("Program continues...");
    }
}
