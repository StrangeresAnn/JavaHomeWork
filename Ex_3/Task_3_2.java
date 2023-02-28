// 2) Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка
package Ex_3;

import java.util.ArrayList;
import java.util.Arrays;


public class Task_3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-1,2,-3,4,5,-6,7,8,9,-10));
        list.sort(null);
        int min = list.get(0); 
        int max = list.get(list.size() - 1);
        System.out.println("Минимальное значение: " + min + '\n' + "Максимальное значение: " + max);
        arithmeticMean(list);
    }
    public static void arithmeticMean(ArrayList<Integer> list) {
        double res = 0;
        for (int i = 0; i < list.size(); i++) {
            res += list.get(i); 
        }
        res = res / (list.size());
        System.out.println("Среднее арифметическое: " + res);
    }
}
