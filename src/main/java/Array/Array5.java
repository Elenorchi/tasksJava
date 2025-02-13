package Array;

//Дан массив с целыми числами. Вывести в консоль наиболее часто встречающееся. Если
//таких несколько, то вывести наибольшее из них, если повторяющихся нет, вывести
//соответствующее сообщение.

public class Array5 {
    public static void main(String[] args) {

        int[] nums = {1, 3, 3, 2, 2, 4};
        int result = 0;
        int maxCount = 0;

        for (int num : nums) {
            int count = 0;

            for (int i = 0; i < nums.length; i++) {
                if (num == nums[i]) {
                    count++;
                }
            }
            if (count > maxCount || (count == maxCount && result < num)) {
                maxCount = count;
                result = num;
            }
        }
        System.out.print(maxCount == 1 ? "Повторяющихся чисел нет." : "Максимальное часто встречающееся число: " + result);
    }
}