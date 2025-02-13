package IfElse;

// Пользователь вводит в консоли число. Если оно больше 10, выдаем в консоли сообщение
// “Число больше десяти”, если меньше – “Число меньше десяти”


import java.util.Scanner;

public class Ifelse1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scan.nextInt();

        if (number < 10) {
            System.out.println("Число меньше десяти");
        } else if (number > 10) {
            System.out.println("Число больше десяти");
        } else {
            System.out.println("Число равно десяти");
        }
        scan.close();
    }
}