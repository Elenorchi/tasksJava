package IfElse;

//Пользователь вводит в консоли число. Выводим сообщение о том, четное число, или
//нечетное

import java.util.Scanner;

public class Ifelse7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("Введенное число четное.");
        } else {
            System.out.println("Введенное число нечетное.");
        }
        scan.close();
    }
}