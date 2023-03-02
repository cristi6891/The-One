package ITschool.practice.session7;

public class FlowControl {

    public static void main(String[] args) {

        boolean isActive = true;
        if (isActive) {             //ex of "if"
            //code to execute
        } else {
            //code to execute if boolean cond is false
        }

        //switch construction

        String dayOfWeek = "Monday";
        switch (dayOfWeek) {

            case "Monday":
                System.out.println("is Monday");
                //break;
            case "Tuesday":
                System.out.println("is Tuesday");
                // break;
            default:
                System.out.println("this is default case");
                break; //"break" e important pt switch
        }

        if (dayOfWeek.equals("Monday")) {      //ex of "if" doing what "switch" does
            System.out.println("is Monday");
        } else if (dayOfWeek.equals("Tuesday")) {
            System.out.println("is Tuesday");
        } else {
            System.out.println("this is default case");
        }


        switch (dayOfWeek) {
            case "Monday" -> System.out.println("is Monday");
            case "Tuesday" -> System.out.println("is Tuesday");
            default -> System.out.println("this is default case");

        }


    }
}
