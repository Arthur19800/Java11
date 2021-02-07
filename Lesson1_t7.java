package homework.lesson_1.task7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        Get_name(S);
    }
    public static void Get_name(String S) {

                System.out.println("Hello, " + S);
        }
    }

