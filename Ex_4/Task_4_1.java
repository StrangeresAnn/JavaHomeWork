// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

package Ex_4;

import java.util.Arrays;
import java.util.LinkedList;


public class Task_4_1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("hello","hi","bye"));
        System.out.println("До: " + list);
        list = turnOver(list);
        System.out.println("После: " + list);
    }
    public static LinkedList<String> turnOver(LinkedList<String> list){
        LinkedList<String> listTurnOver = new LinkedList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            listTurnOver.add(list.get(i));
        }
        return listTurnOver;
    }
}
