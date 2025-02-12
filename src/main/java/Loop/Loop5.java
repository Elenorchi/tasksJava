package Loop;

//Пользователь вводит строку. Выводим в консоль эту строку посимвольно (одна строка –
//один символ)

import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scan.nextLine();

        int length = input.length();

        System.out.println("Посимвольный вывод вашей строки: ");
        for (int i = 0; i < length; i++) {
            System.out.println(input.charAt(i));
        }
        scan.close();
    }
}
