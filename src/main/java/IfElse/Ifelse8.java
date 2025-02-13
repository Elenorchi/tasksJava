package IfElse;

//Программа “Магазин”, выводим меню из трех товаров с ценами. Пользователь выбирает
//товар, вводит сумму денег. Если сумма меньше цены, выводим сообщение: “Денег не
//хватает!”, если сумма равна цене – “Спасибо за покупку!”, если больше – “Ваша сдача:
//[сумма сдачи]”

import java.util.Scanner;

public class Ifelse8 {
    public static void main(String[] args) {

        double price1 = 2.2;
        double price2 = 3.5;
        double price3 = 4.1;

        System.out.println("Товар\tЦена");
        System.out.println("-----------------------------------");
        System.out.printf("Хлеб\t%.2f\n", price1);
        System.out.printf("Молоко\t%.2f\n", price2);
        System.out.printf("Греча\t%.2f\n", price3);
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1 товар к покупке: ");
        String userChoice = scan.nextLine();

        double cash = -1;
        while (cash < 0) {
            System.out.println("Введите ваш бюджет: ");
            if (scan.hasNextDouble()) {
                cash = scan.nextDouble();
            } else {
                System.out.println("Введено не число. Попробуйте снова.");
                scan.next();
            }
        }

        double change = switch (userChoice) {
            case "Хлеб" -> cash - price1;
            case "Молоко" -> cash - price2;
            case "Греча" -> cash - price3;
            default -> {
                System.out.println("Товар не найден.");
                System.exit(0);
                yield 0;
            }
        };

        if (change == 0) {
            System.out.println("Спасибо за покупку!");
        } else if (change > 0) {
            System.out.println("Ваша сдача: " + change);
        } else if (change < 0) {
            System.out.println("Денег не хватает!");
        }
        scan.close();
    }
}
