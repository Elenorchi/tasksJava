package Loop;

//Вывести в консоль таблицу умножения на 4

public class Loop1 {
    public static void main(String[] args) {

        for (int i = 1; i<=10; i++) {
            int product = 4*i;
            System.out.println ("4 * "+i+" = "+product);
        }
    }
}
