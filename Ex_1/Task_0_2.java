// Вывести все простые числа от 1 до 1000
package Ex_1;
public class Task_0_2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++)
            if (IsPrime(i))
                System.out.print(i + " ");
    }

    private static boolean IsPrime(int number) {
        for (int i = 2; i * i <= number; i++)
        {
           if (number % i == 0) return false;
        }
        return true;
    }
}

