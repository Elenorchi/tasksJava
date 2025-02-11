package ifElse;

//Пользователь вводит в консоли три числа, выводим самое большое из них.

import java.util.Scanner;

public class ifelse5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Введите число №" + i + ": ");
            int num = scan.nextInt();

            if (num > max) {
                max = num;
            }
        }
        System.out.println("Максимальное число: " + max);
        scan.close();
    }
}