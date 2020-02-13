import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;
        System.out.println("Enter the Year:");
        year = input.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}