package Loop;

//Пользователь вводит число - х. Выводим в консоль все четные числа от нуля до х

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int x = scan.nextInt();

        if (x < 0) {
            System.out.println("Вы ввели отрицательное число.");
        } else {
            for (int i = 0; i <= x; i += 2) {
                System.out.println(i);
            }
        }
        scan.close();
    }
}