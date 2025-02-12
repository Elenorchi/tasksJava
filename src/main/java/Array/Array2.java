package Array;

//Дан массив с целыми числами. Вывести в консоль сумму элементов с четными индексами

public class Array2 {
    public static void main(String[] args) {

        int[] arr = {-1, -55, 16, 78, 6, 0};
        int sum = 0;

        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        System.out.println("Сумма элементов массива с четными индексами: " + sum);
    }
}
