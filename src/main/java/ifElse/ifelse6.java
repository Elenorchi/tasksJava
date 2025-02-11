package ifElse;

//Пользователь вводит в консоли три числа. Рассчитываем и выводим в консоль сумму
//наибольшего и наименьшего из них

import java.util.Scanner;

public class ifelse6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Введите число №" + i + ": ");
            int num = scan.nextInt();

            if (num > max) {
                max = num;
            }
            if (num<min) {
                min = num;
            }
        }
        int sum = min+max;
        System.out.println("Сумма наибольшего и наименьшего чисел: "+sum);
        scan.close();
    }
}