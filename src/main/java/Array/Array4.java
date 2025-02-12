package Array;

//Дан массив с целыми числами. Вывести в консоль наибольшее из них

public class Array4 {
    public static void main(String[] args) {

        int[] arr = {-1, -55, 16, 78, 6, 0};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное число из массива: " + max);
    }
}
