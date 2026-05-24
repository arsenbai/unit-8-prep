package tests;

import org.testng.annotations.Test;

public class StringTest extends BaseTest{

    @Test
    public void stringTest() {
        String text = "Hello";
        byte[] res = text.getBytes();
        System.out.println(res[0]);

        char[] myArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(myArray);

        String myStr = "Hello, World!";
        myStr.getChars(7, 12, myArray, 1);
        System.out.println(myArray);

        String reg = "hey|wow|[0-9]";
        System.out.println("19".matches(reg));
    }


}
