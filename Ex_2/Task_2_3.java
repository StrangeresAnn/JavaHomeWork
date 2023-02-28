// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение).
package Ex_2;

import java.util.Scanner;

public class Task_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"Cp866");
        System.out.println("Введите строку: ");
        String str = sc.next();
        if (str.length() > 1){
            if (Palindrome_Finding(str) == true ) {
                System.out.println("Строка является палиндромом");
            }
            else {
                System.out.println("Строка не является палиндромом");
            }
        }
        else {
            System.out.println("1 Символ не может являться палиндромом");
        }
        sc.close();
    }
    public static boolean Palindrome_Finding(String str) {
        for (int i = 0, j = 1; i <= (str.length()/2); i++, j++) {
            if (str.charAt(i) != str.charAt(str.length() - j)){
                return false;
            }
        }
    return true;
    }
}

