// 1) Пусть дан произвольный список целых чисел, удалить из него четные числа
package Ex_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_3_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-1,2,-3,4,5,-6,7,8,9,-10));
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        } 
    }
}
