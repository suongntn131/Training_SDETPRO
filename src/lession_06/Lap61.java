package lession_06;

import java.util.Scanner;

public class Lap61 {
    public static void main(String[] args) {
        System.out.println("Lap 6.1:" + lap61("2hrs and 5 minutes"));
        System.out.println("=================================");

        System.out.println("Lap 6.2:");
        lap62("password123");
        System.out.println("=================================");

        System.out.println("Lap 6.3: " + lap63("12345nabc678"));
        System.out.println("=================================");

        System.out.println("Lap 6.4:");
        lap64("https://google.com");
    }

    public static int lap61(String timeStr){
        /**
         * Given input string: "2hrs and 5 minutes"
         * Please calculate how many minutes in total
         */
        int minutesTotal;
        String[] splitStr = timeStr.split("and");
        String hoursStr = splitStr[0].replaceAll("[^0-9]","");
        String minutesStr = splitStr[1].replaceAll("[^0-9]","");
        minutesTotal = Integer.parseInt(hoursStr) * 60 + Integer.parseInt(minutesStr);
        return minutesTotal;
    }

    public static void lap62(String passwordStr){
        /**
         * String myPassword = "password123";
         * Allow user to input maximum 3 times
         */
        Scanner scanner = new Scanner(System.in);
        boolean isContinuing = true;
        int timeInput = 0;
        while (isContinuing && timeInput < 3){
            System.out.print("Please enter password: ");
            String passwordInput = scanner.nextLine();
            if (passwordInput.equals(passwordStr)){
                isContinuing = false;
            } else {
                ++timeInput;
            }
        }
        if (!isContinuing){
            System.out.println("Your password is correct!");
        } else {
            System.out.println("You have input wrong password 3 times, please try again later!");
        }
    }

    public static String lap63(String inputStr){
        /**
         * String myStr = "100 minutes";
         * NOT using REGEX, extract digit character from that String
         * Expected output: "100".
         * EX: "12345nabc678" -> "12345678"
         */
        String digitStr = new String();
        char[] strCharacters = inputStr.toCharArray();
        for (char character : strCharacters) {
            if (Character.isDigit(character)){
                digitStr = digitStr.concat(String.valueOf(character));
            }
        }
        return digitStr;
    }

    public static void lap64(String urlStr){
        /**
         * String url = "https://google.com";
         * Check http OR https; domain name, .com OR .net
         */
        System.out.println("URL information:");
        if (urlStr.contains("Protocol: http")){
            System.out.print("Protocol: http");
        }else {
            System.out.print("https, ");
        }
        System.out.println("Protocol: " + urlStr.split(":")[0]);
        System.out.println("Domain name: " + urlStr.split("//")[1]);
        System.out.println("Domain name extension: " + urlStr.split("\\.")[1]);

    }
}
