package ITschool.practice.session23feb;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class UtilityClasses {

    public static void main(String[] args) {

        Object object = new Object();


        LocalDate localDateNow = LocalDate.now(); //no 'new' necessary, LocalDate is static
        System.out.println(localDateNow);
        LocalDate yesterday = LocalDate.of(2023, 02, 20);

        System.out.println(localDateNow.isAfter(yesterday));
        System.out.println(localDateNow.isBefore(yesterday));

        System.out.println(localDateNow.plusYears(20));
        System.out.println(localDateNow.minusYears(10));

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        LocalDate test = localDateTimeNow.toLocalDate();
        System.out.println(localDateTimeNow);
        System.out.println("Test: " + test);

        //  DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(localDateTimeNow.format(dateTimeFormatter));


        Date utilDate = new Date();
        System.out.println("UtilDate: " + utilDate);

        long timestampNow = 1677177491;
        Timestamp timestamp = Timestamp.from(Instant.EPOCH);
        java.sql.Date sqlDate = new java.sql.Date(timestampNow);
        System.out.println("SqlDate: " + sqlDate);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide input: ");
        int userInput = scanner.nextInt();
        System.out.println("User input " + userInput);


        Random random = new Random();
        int randomNumber = random.nextInt(userInput);
        System.out.println("Random number is: " + randomNumber);

        int printRandom;
        for (int i = 0; i < 6; i++) {
            printRandom = random.nextInt(1, 49);
            System.out.println(printRandom);

            scanner.close();
        }

    }
}
