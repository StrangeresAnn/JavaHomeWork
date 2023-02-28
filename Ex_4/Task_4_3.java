// В калькулятор добавьте возможность отменить последнюю операцию.
package Ex_4;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.*;
import java.nio.file.Paths;

public class Task_4_3 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Task_4_3.class.getName());
        String currentPath = Paths.get("").toAbsolutePath().toString();
        String logsPath = currentPath + "\\Ex_4/LogCalculator.txt";

        try{
            FileHandler fh = new FileHandler(logsPath,true);
            logger.addHandler(fh);
    
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);  
        }
        catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
        calculator(logger);
    }   
    public static void calculator(Logger logger){
        LinkedList<Double> result = new LinkedList<>();
        Scanner sc = new Scanner(System.in, "Cp866");
        System.out.println("Вас приветствует простой калькулятор!");
        System.out.print("Введите первое число: ");
        result.add(sc.nextDouble());
        
        sc.nextLine();
    
        while(true){
            double num1 = result.getFirst();
            System.out.print("Введите символ действия (+ - / *): ");
            String sign = sc.nextLine();

            if ("".equals(sign)) break;
            else if ("Отмена".equals(sign)|| "отмена".equals(sign)) {
                logger.info("Отмена операции");
                result.removeFirst();
                if (result.size() == 0) {
                    result.add(0.0);
                }
            }
            else {
                System.out.print("Введите второе число: ");
                double num2 = sc.nextDouble();

                process(result, sign , num2);
                sc.nextLine();
                logger.info(num1 + " " + sign + " " + num2 + " = " + result.getFirst() + "\n");
            }
            System.out.println("Результат: " + result.getFirst()); 
            
        }  
        sc.close();    
    }       
    public static void process(LinkedList<Double> result, String sign, double num2) {
        switch (sign) {
            case "*" :
                result.add(0, result.getFirst() * num2);
                break;
            case "/" :
                if(num2 == 0){
                    System.out.println("Деление на ноль запрещено!");
                    break;
                }
                result.add(0, result.getFirst() / num2);
                break;
            case "+" :
                result.add(0, result.getFirst() + num2);
                break;
            case "-" :
                result.add(0, result.getFirst() - num2);
                break;
            default:
                System.out.println("ERROR");
                break;
        }     
    }    
}
