package homework.lesson_1.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if ((Check_sum(a, b))){
            System.out.println("This function  returns true");
        }
       else{
            System.out.print("This function  returns false\n");
        }
    }

    public static boolean Check_sum(int a, int b) {
        int sum;
        sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;
        }
       return false;

    }
}

