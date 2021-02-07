package homework.lesson_1.task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = 0;
        a = Get_digits(a);
        Print_digit(a);
    }

    static int Get_digits(int a) {
        System.out.println("Enter a digit :");
        Scanner scanner = new Scanner(System.in);
         a = scanner.nextInt();
        return a;
    }

    static void Print_digit(int a) {
        if (a >= 0) {
            System.out.println("This digit is positive\n");
        }
        if (a < 0) {
            System.out.println("This digit is negative\n");
        }
    }
}

