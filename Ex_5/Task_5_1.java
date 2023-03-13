// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции:
// 1) Добавление номера
// 2) Вывод всего
package Ex_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_5_1 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        Scanner sc = new Scanner(System.in,"cp866");
        boolean Cycle = true;
        System.out.println("Это телефонная книга!");
        while(Cycle) {
            System.out.print("\nВведите команду: \n 1: Добавить номер в телефонную книгу.");
            System.out.print("\n 2: Показать все записи. \n 3: Выход.\nВаш выбор: ");
            String option = sc.next();

            switch(option) {
                case "1":
                    addContact(phoneBook,sc);
                    break;
                case "2":
                    showContacts(phoneBook);
                    break;
                case "3":
                    Cycle = false;
                    System.out.println("Пока-пока!");
                    break;
                default:
                    System.out.println("ERROR!");
            }
            
        }
        sc.close();
    }
        
        public static void addContact(Map<String, ArrayList<String>> phoneBook,Scanner sc) {
            int index = 1;
            Object[] names = phoneBook.keySet().toArray();
            System.out.println("Выберите, кому вы хотите добавить номер:");
        
            for (Object el: names) {
                System.out.println(index + ". " + el);
                index++;
            }

            System.out.print("0. Добавить новый контакт\nВаш выбор: ");

            int option = sc.nextInt();
            sc.nextLine();

            if (option <= names.length && option > 0) {
                System.out.print("Введите номер телефона: ");
                String phoneNumber = sc.nextLine();
                phoneBook.get(names[option - 1]).add(phoneNumber);
            }
            else if (option == 0) {
                System.out.print("Введите ФИО нового контакта: ");
                String name = sc.nextLine();

                System.out.print("Введите номер телефона: ");
                String phoneNumber = sc.nextLine();

                ArrayList<String> numbers = new ArrayList<>();
                numbers.add(phoneNumber);

                phoneBook.put(name, numbers);
            }
            else {
                System.out.println("ERROR!");
            }
        }

        public static void showContacts(Map<String, ArrayList<String>> phoneBook) {
            if(phoneBook.size() < 1) {
                System.out.println("Телефонная книга пуста!");
            }
            
            for (var el: phoneBook.entrySet()) {
                System.out.println("\n" + el.getKey() + ":");
                for (String inner: el.getValue()) {
                    System.out.print(inner + " ");
                }   
            }
        }
}
            