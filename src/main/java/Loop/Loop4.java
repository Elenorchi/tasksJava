package Loop;

//Пользователь вводит число. Выводим в консоль факториал этого числа

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scan.nextInt();
        int factorial = 1;

        if (x < 0) {
            System.out.println("Пожалуйста введите положительное число");
            return;
        }

        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + x + " равен " + factorial);
        scan.close();
    }
}
