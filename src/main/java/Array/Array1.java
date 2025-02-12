package Array;

//Дан массив с целыми числами. Вывести в консоль количество положительных и
//отрицательных чисел в нем

public class Array1 {
    public static void main(String[] args) {

        int[] arr = {-1, -55, 16, 78, 6, 0};

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negative++;
            } else if (arr[i] > 0) {
                positive++;
            }
        }
        System.out.println("Количество положительных чисел в массиве: " + positive +
                "\nКоличество отрицательных чисел в массиве: " + negative);
    }
}
