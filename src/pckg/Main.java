package pckg;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(final String[] args) {

        byte b = 5;
        short s = b;
        int i = s;
        long l = s;
        float f = s;
        double d = s;
        System.out.println("Examples of Widening Type casting...!!");
        System.out.println("byte to short : "+s);
        System.out.println("byte to int : "+i);
        System.out.println("byte to long : "+l);
        System.out.println("byte to float : "+f);
        System.out.println("byte to double : "+d);


//        double input = 65.25 ;
//        byte b = (byte) input ;
//        System.out.println(b);

//
//        Parent cobj = new Child();
//        Parent par = cobj;
//        if (par instanceof Child) {
//            System.out.println(
//                    "Value accessed through "
//                            + "parent reference with typecasting is "
//                            + par.value);
//
//            System.out.println("cobj -- " + cobj.value);
//            System.out.println("par -- " + par.value);
//            System.out.println("(Child) cobj -- " + ((Child) cobj).value);
//            System.out.println("(Child) par -- " + ((Child) par).value);
//        }


//        int month = 3;
//        switch (month) {
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("Winter");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Spring");
//                break;
//        }

//        int[] nums = {1, 2, 3, 4, 5};
//        for (int n : nums) {
//            System.out.println(n);
//        }

        // single

//        /*
//            multi line
//         */
//
//        /**
//         * documentation comment
//         */

//        String sTarget2 = "abc";
//        String sCapitals = "ABC";
//        String sLong = "123abc";
//        String text = "A😊B";
//
//        String myStr = "Hey! %s-- %,6.2f";
//
//        String res = String.format(myStr, "Ars", 122.4433);
//
//        System.out.println(res);
//
//        double myNumber = 123456.78;
//        String result;
//
// Default
//        result = String.format("%f", myNumber);
//        System.out.println(result);
//
// Two decimal digits
//        result = String.format("%.2f", myNumber);
//        System.out.println(result);
//
// No decimal digits
//        result = String.format("%.0f", myNumber);
//        System.out.println(result);
//
//        // No decimal digits but keep the decimal point
//        result = String.format("%#.0f", myNumber);
//        System.out.println(result);
//
//        // Group digits
//        result = String.format("%,.2f", myNumber);
//        System.out.println(result);
//
// Scientific notation with two digits of precision
//        result = String.format("%.2e", myNumber);
//        System.out.println(result);

//        String result;
// Represent characters from their unicode code points
//        result = String.format("%c%c%c%c%c", 72, 101, 108, 108, 111);
//        System.out.println(result);
// Force unicode characters to uppercase
//        result = String.format("%C%C%C%C%C", 72, 101, 108, 108, 111);
//        System.out.println(result);

//        String text = "Hello";
//        byte[] res = text.getBytes();
//        System.out.println(res[0]);

//        char[] myArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
//        System.out.println(myArray);
//
//        String myStr = "Hello, World!";
//        myStr.getChars(7, 12, myArray, 1);
//        System.out.println(myArray);

//        String reg = "hey|wow|[0-9]";
//        System.out.println("19".matches(reg));


//        String text = "apple banana apple orange banana apple";
//        Map<String, Long> freq =
//                Arrays.stream(text.split(" "))
//                        .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
//        System.out.println(freq);


//        List<String> names = List.of("Alice", "Bob", "Aria", "Charlie", "Austin");
//        Map<Character, List<String>> result = names.stream()
//                .collect(Collectors.groupingBy(name -> name.charAt(0)));
//        System.out.println(result);

//        Map<String, Double> storeA = Map.of("apple", 1.5, "milk", 2.0);
//        Map<String, Double> storeB = Map.of("apple", 1.2, "bread", 1.5);
//        Map<String, Double> res = new HashMap<>(storeA);
//        storeB.forEach((k, v) ->
//                res.merge(k, v, Math::min));
//        System.out.println(res);

//        Map<String, Integer> inp = Map.of(
//                "bread", 10,
//                "milk", 2,
//                "eggs", 12,
//                "cheese", 3);
//        Map<String, Integer> res = inp.entrySet().stream()
//                .filter(e -> e.getValue() < 5)
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue
//                ));
//        System.out.println(res);

//        Map<String, Integer> inp = Map.of(
//                "John", 10,
//            "Anna", 50,
//            "Greg", 77,
//            "Alice", 44);
//        Map<String, String> passedStudents = inp.entrySet().stream()
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        e -> e.getValue() > 50 ? "Pass" : "Fail"
//                ));
//        System.out.println(passedStudents);



//        List<String> inp = List.of("2", "5", "11", "46");
////        Conversion: Convert the list of strings to a list of integers.
//        List<Integer> lstOfInt = inp.stream().map(Integer::parseInt)
//                .toList();
////        Average: Calculate the average value.
//        double aver = lstOfInt.stream().mapToInt(Integer::intValue)
//                .average().orElse(0);
////        Filtering: Extract: odd numbers, even numbers, numbers greater than the average,
////        and the min/max values.
//        List<Integer> odds = lstOfInt.stream().filter(i -> i % 2 == 0).toList();
//        List<Integer> evens = lstOfInt.stream().filter(i -> i % 2 != 0).toList();
//        List<Integer> numsGreaterThanAver = lstOfInt.stream()
//                .filter(i -> (double) i > aver).toList();
//        int minValue = lstOfInt.stream().min(Integer::compare).orElse(0);
//        int maxValue = lstOfInt.stream().max(Integer::compare).orElse(0);
//        System.out.println(odds);
//        System.out.println(evens);
//        System.out.println(numsGreaterThanAver);
//        System.out.println(minValue);
//        System.out.println(maxValue);



//        String name = "Arsen";
//        String phoneNumber = "+123456789";
//        int age = 25;
//        LocalDate dateOfBirth = LocalDate.of(1991, 3, 27);
//        boolean isAdmin = true;
//
//        String result = String.format(
//                "Name: %s, Phone: %s, Age: %d, DOB: %s, Admin: %b",
//                name, phoneNumber, age, dateOfBirth, isAdmin
//        );
//        System.out.println(result);



    }
}
