// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
package Ex_4;

import java.util.Arrays;
import java.util.LinkedList;

public class Task_4_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(9,2,8,3,6,4));
        System.out.println("Первоначальный список: " + list);
        enqueue(list, 0);
        System.out.println("Добавлен элемент в конец списка: " + list);

        System.out.println("Будет удален 1ый элемент списка: " + dequeue(list));
        System.out.println("Измененный список: " + list);

        System.out.println("Взяли 1 элемент не удаляя: " + first(list));
        System.out.println("Итоговый список: " + list);
    }
    public static void enqueue(LinkedList<Integer> list, int value) {
        list.add(value);
    }
    public static int dequeue(LinkedList<Integer> list) {
        return list.removeFirst();
    }
    public static int first(LinkedList<Integer> list) {
        return list.getFirst();
    }
}
