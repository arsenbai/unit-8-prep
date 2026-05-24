package tests;

import org.testng.annotations.Test;

public class AppointmentTest extends BaseTest {
    @Test(priority = 0, groups = "group1")
    public void scheduleAppointment() {
        System.out.println("TEST - 0");
        System.out.println("::::::: CREATE appointment :::::::");
    }

    @Test(priority = 1, groups = "group2")
    public void deleteAppointment() {
        System.out.println("TEST - 1");
        System.out.println("::::::: DELETE appointment :::::::");
    }
}
