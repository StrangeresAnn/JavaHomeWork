// Пусть дан список сотрудников.
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.
package Ex_5;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Task_5_2 {
    public static void main(String[] args) {
        Map<String, Integer> names = new HashMap<>();

        String[] namesArr = {
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
        };

        for (String el: namesArr) {
            String name = el.split(" ")[0];

            if (names.containsKey(name)) {
                names.replace(name, names.get(name) + 1);
            }
            else {
                names.put(name, 1);
            }
        }
        Map<String, Integer> sorted = sortMap(names);
        System.out.println(names);
        System.out.println(sorted);
    }

    public static Map<String, Integer> sortMap(Map<String, Integer> names) {
        Map<String, Integer> sorted = new LinkedHashMap<>();
        int max = 1;

        for (int value: names.values()) {
            if (value > max) {
                max = value;
            }
        }
            
        for (int i = max; i > 0; i--) {
            for (var el: names.entrySet()){
                if (names.get(el.getKey()) == i){
                    sorted.put(el.getKey(), el.getValue());
                }
            }   
        }
        return sorted;
    }
}
