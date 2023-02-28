// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
package Ex_1;

import java.util.Scanner;

public class Task_0_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int num = in.nextInt();
        int res_Sum = 0;
        int fact = 1;

        for(int i = 1; i <= num; i++) {
            res_Sum += i;
            if (i > 1) {
                fact *= i;
            }  
        }
        System.out.println("Сумма чисел от 1 до " + num + " = " + res_Sum + "; Факториал числа " + num + " = " + fact);
        in.close();
    }
}
