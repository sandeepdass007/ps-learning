import javax.swing.text.html.parser.DTDConstants;

public class SwitchCaseOld {

        public static void main(String[] args) {

            boolean isTodayHoliday;
            String day = "TUESDAY";
            switch (day) {
                case "MONDAY":
                case "TUESDAY":
                case "WEDNESDAY":
                case "THURSDAY":
                case "FRIDAY":
                    isTodayHoliday = false;
                    break;
                case "SATURDAY":
                case "SUNDAY":
                    isTodayHoliday = true;
                    break;
                default:
                    throw new IllegalArgumentException("What's a " + day);
            }
            System.out.println(isTodayHoliday);

            int choice = 2;

            switch (choice) {
                case 1:
                    System.out.println(choice);
                    break;
                case 2:
                    System.out.println(choice);
                    break;
                case 3:
                    System.out.println(choice);
                    break;
                default:
                    System.out.println("integer is greater than 3");
            }


        }

    }



