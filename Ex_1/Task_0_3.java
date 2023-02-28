// Реализовать простой калькулятор (+ - / *)
package Ex_1;

import java.util.Scanner;

public class Task_0_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вас приветствует простой калькулятор!");
        System.out.print("Введите первое число: ");
        double num1 = in.nextDouble();
        System.out.print("Введите символ действия (+ - / *): ");
        String sign = in.next();
        System.out.print("Введите второе число: ");
        double num2 = in.nextDouble();
        double res = 0;
        switch (sign) {
            case "*" :
                res = num1 * num2;
                System.out.println(num1 + " " + sign + " " + num2 + " = " + res);
                break;
            case "/" :
                res = num1 / num2;
                System.out.println(num1 + " " + sign + " " + num2 + " = " + res);
                break;
            case "+" :
                res = num1 + num2;
                System.out.println(num1 + " " + sign + " " + num2 + " = " + res);
                break;
            case "-" :
                res = num1 - num2;
                System.out.println(num1 + " " + sign + " " + num2 + " = " + res);
                break;
            default:
                System.out.println("ERROR");
                break;
        }
        in.close();
    }
}
