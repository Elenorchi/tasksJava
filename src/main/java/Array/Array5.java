package Array;

//Дан массив с целыми числами. Вывести в консоль наиболее часто встречающееся. Если
//таких несколько, то вывести наибольшее из них, если повторяющихся нет, вывести
//соответствующее сообщение.

public class Array5 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 4};
        int number = 0;
        int maxCount = 0;

        for (int a : arr) {
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (a == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount || (count == maxCount && number < a)) {
                maxCount = count;
                number = a;
            }
        }
        System.out.print(maxCount == 1 ? "Повторяющихся чисел нет." : "Максимальное часто встречающееся число: " + number);
    }
}