package feb19;

public class SwitchStatement {

    public static void main(String[] args) {

        int marime = 44;
        String size;

        //switch statement to check size
        switch (marime) {
            case 29:
                size = "Small";
                break;

            case 42:
                size = "Medium";
                break;

            case 44:
                size = "Large";
                break;

            case 48:
                size = "Extra Large";
                break;

            default:
                size = "Unknown";
                break;
        }
        System.out.println("Your size is " + size);
    }
}
