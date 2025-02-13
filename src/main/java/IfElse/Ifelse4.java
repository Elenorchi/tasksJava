package IfElse;

//Пользователь вводит в консоли четыре числа. Рассчитываем и выводим в консоль
//количество отрицательных и положительных чисел

import java.util.Scanner;

public class Ifelse4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int positive = 0;
        int negative = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Введите число №" + i + ": ");
            int num = scan.nextInt();

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        }
        System.out.print("Количество положительных чисел: " + positive + ", количество отрицательных чисел: " + negative);
        scan.close();
    }
}
