public class SwitchCaseInJava14 {


    public static void main(String[] args) {


        System.out.println(holidayTest("SUNDAY"));

        // from java 13(PREVIEW) onwards - multi-label case statements
        int choice = 2;

        switch (choice) {
            case 1, 2, 3 -> System.out.println(choice);
            default -> System.out.println("integer is greater than 3");
        }

        // switch expressions, use yield to return, in Java 12 it was break
        //Yield isn’t a new keyword in Java. It’s just used in switch expressions.
        int x = switch (choice) {
            case 1, 2, 3:
                yield  choice;
            default:
                yield -1;
        };
        System.out.println("x = " + x);



    }

    static boolean holidayTest(String day) {
        boolean isTodayHoliday;
        return isTodayHoliday = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> false;
            case "SATURDAY", "SUNDAY" -> true;
            default -> throw new IllegalArgumentException("What's a " + day);
        };
    }
}
