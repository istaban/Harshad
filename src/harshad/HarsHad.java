package harshad;

import java.util.Scanner;

public class HarsHad {

    public static String checkNum(int number) {
        int sum = 0;
        String a = Integer.toString(number);
        for (int i = 0; i < a.length(); i++) {
            sum += a.charAt(i) - '0';
        }
        if (number % sum == 0) {
            return "Harshad number";
        } else {
            return "Not Harshad number";
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt(); 
        reader.close();
        System.out.println(HarsHad.checkNum(n));
    }
}
