// К калькулятору из предыдущего дз добавить логирование.
package Ex_2;


import java.util.Scanner;
import java.util.logging.*;
import java.nio.file.Paths;

public class Task_2_4 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Task_2_4.class.getName());
        String currentPath = Paths.get("").toAbsolutePath().toString();
        String logsPath = currentPath + "\\Ex_2/LogCalculator.txt";

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
    
    public static void calculator(Logger logger) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вас приветствует простой калькулятор!");
        System.out.print("Введите первое число: ");
        double num1 = in.nextDouble();
        System.out.print("Введите символ действия (+ - / *): ");
        String sign = in.next();
        System.out.print("Введите второе число: ");
        double num2 = in.nextDouble();
        double res = 0;

        in.close();
        
        switch (sign) {
            case "*" :
                res = num1 * num2;
                logger.info(num1 + " " + sign + " " + num2 + " = " + res + "\n");
                break;
            case "/" :
                res = num1 / num2;
                logger.info(num1 + " " + sign + " " + num2 + " = " + res + "\n");
                break;
            case "+" :
                res = num1 + num2;
                logger.info(num1 + " " + sign + " " + num2 + " = " + res + "\n");
                break;
            case "-" :
                res = num1 - num2;
                logger.info(num1 + " " + sign + " " + num2 + " = " + res + "\n");
                break;
            default:
                System.out.println("ERROR");
                break;
        }    
    }
}