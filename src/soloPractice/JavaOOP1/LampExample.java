package soloPractice.JavaOOP1;

public class LampExample {

    //stores the value for light
    //true if light is on
    //false if light is off
    boolean isOn; //instance variable -- each obj. of this classwill have it s own copy of the variable

    //method to turn on the light
    void turnOn() {
        isOn = true;
        System.out.println("Light on? " + isOn);
    }

    //method to turn off the light
    void turnOff() {
        isOn = false;
        System.out.println("Light on? " + isOn);
    }


        public static void main(String[] args) {

            //creates objects led and halogen
            LampExample led = new LampExample();
            LampExample halogen = new LampExample();

            //turn on the light for led
            led.turnOn();

            //turn off the light for halogen
            halogen.turnOff();

        }

    }


