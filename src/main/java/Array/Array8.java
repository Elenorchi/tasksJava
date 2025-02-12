package Array;

//Дан двумерный массив 5х5 с целыми числами. Посчитать суммы чисел в каждом столбце и
//вывести наибольшую из них

public class Array8 {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        int max = Integer.MIN_VALUE;

        for (int j = 0; j < 5; j++) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += arr[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.print("Максимальная сумма по столбцу: " + max);
    }
}
