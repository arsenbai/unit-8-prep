package utils;

public class ProgrammingPracticeUtils {
    public static String weekdayFromIntToStringname(int intVal) {
        String res;
        switch (intVal) {
            case 1:
                res = "Monday";
                break;
            case 2:
                res = "Tuesday";
                break;
            default:
                res = "I don't know this day name yet";
        }
        return res;
    }

    public static double convertDollarsToMyLocalCurrency(double usdAmount, double rate) {
        return usdAmount * rate;
    }

    public static void readDatabase() {
        throw new RuntimeException("-- run time exception !!! --");
    }
}
