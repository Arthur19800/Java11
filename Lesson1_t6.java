package homework.lesson_1.task6;

import java.util.Scanner;
                     //Написать метод, которому в качестве параметра передается целое число.
                     // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
         public class Main {
        public static void main(String[] args) {
            int a = 0;
            a = Get_digits(a);

            if (Return_value(a)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }

    static int Get_digits(int a) {
        System.out.println("Enter a digit :");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        return a;
    }

    static boolean Return_value(int a) {
        if (a < 0) {
            return true;
        }
        else if (a > 0) {
            return false;
        }
        return true;
    }
}
