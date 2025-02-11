package ifElse;

//Пользователь вводит в консоли два числа, выводим сообщение “первое число
//больше/меньше, чем второе” в зависимости от результата их сравнения

import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scan.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scan.nextInt();

        if (number1 > number2) {
            System.out.print("Первое число больше второго");
        } else if (number1 < number2) {
            System.out.print("Первое число меньше второго");
        } else {
            System.out.print("Числа равны");
        }
        scan.close();
    }
}
