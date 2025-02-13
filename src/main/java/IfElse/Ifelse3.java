package IfElse;

//Пользователь вводит в консоли длины сторон треугольника (три числа), выводим
//сообщение, является ли треугольник равнобедренным, равносторонним или
//разносторонним.

import java.util.Scanner;

public class Ifelse3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scan.nextInt();

        if (num1 + num2 <= num3 || num1 + num3 <= num2 || num2 + num3 <= num1) {
            System.out.println("Такой треугольник не может существовать");
        } else if (num1 == num2 && num2 == num3) {
            System.out.println("Треугольник равносторонний");
        } else if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("Треугольник равнобедренный");
        } else {
            System.out.println("Треугольник разносторонний");
        }
        scan.close();
    }
}