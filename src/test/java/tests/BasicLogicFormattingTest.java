package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ProgrammingPracticeUtils;

import java.time.LocalDate;
import java.util.List;

public class BasicLogicFormattingTest extends BaseTest {
    @Test
    public void listProcessingAndStatisticsTest() {
        List<String> inputList = List.of("2", "5", "11", "46");
//        Conversion: Convert the list of strings to a list of integers.
        List<Integer> lstOfInt = inputList.stream().map(Integer::parseInt)
                .toList();
//        Average: Calculate the average value.
        double averageValue = lstOfInt.stream().mapToInt(Integer::intValue)
                .average().orElse(0);
//        Filtering: Extract: odd numbers, even numbers, numbers greater than the average,
//        and the min/max values.
        List<Integer> evens = lstOfInt.stream().filter(i -> i % 2 == 0).toList();
        List<Integer> odds = lstOfInt.stream().filter(i -> i % 2 != 0).toList();
        List<Integer> numsGreaterThanAver = lstOfInt.stream()
                .filter(i -> (double) i > averageValue).toList();
        int minValue = lstOfInt.stream().min(Integer::compare).orElse(0);
        int maxValue = lstOfInt.stream().max(Integer::compare).orElse(0);

        Assert.assertEquals(averageValue, 16);
        Assert.assertEquals(evens, List.of(2, 46));
        Assert.assertEquals(odds, List.of(5, 11));
        Assert.assertEquals(numsGreaterThanAver, List.of(46));
        Assert.assertEquals(minValue, 2);
        Assert.assertEquals(maxValue, 46);
    }

    @Test
    public void stringInterpolationTest() {
        String name = "Arsen";
        String phoneNumber = "+123456789";
        int age = 25;
        LocalDate dateOfBirth = LocalDate.of(1991, 3, 27);
        boolean isAdmin = true;

        String actualResult = String.format(
                "Name: %s, Phone: %s, Age: %d, DOB: %s, Admin: %b",
                name, phoneNumber, age, dateOfBirth, isAdmin
        );

        String expectedResult = "Name: Arsen, Phone: +123456789, Age: 25, DOB: 1991-03-27, Admin: true";
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void controlStatementsAndArithmeticTest() {
        Assert.assertEquals(ProgrammingPracticeUtils.weekdayFromIntToStringname(1), "Monday");
        Assert.assertEquals(ProgrammingPracticeUtils.weekdayFromIntToStringname(2), "Tuesday");
        Assert.assertEquals(ProgrammingPracticeUtils.weekdayFromIntToStringname(3),
                "I don't know this day name yet");

        int a = 1;
        int b = a++;
        int c = --a;
        Assert.assertEquals(a, 1);
        Assert.assertEquals(b, 1);
        Assert.assertEquals(c, 1);

        Assert.assertEquals(ProgrammingPracticeUtils.convertDollarsToMyLocalCurrency(2d, 300d), 600d);
    }
}
