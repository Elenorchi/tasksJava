package Loop;

//Пользователь вводит число - х. Выдаем число из последовательности фибоначчи с индексом х

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scan.nextInt();

        if (x < 0) {
            System.out.println("Вы ввели отрицательное число.");
            return;
        } else if (x == 0) {
            System.out.print("Число из последовательности фибоначчи с индексом 0: 0 ");
            return;
        }

        int[] arr = new int[x + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= x; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.print("Число из последовательности фибоначчи с индексом " + x + ": " + arr[x]);
        scan.close();
    }
}
