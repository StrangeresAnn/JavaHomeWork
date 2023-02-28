// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), 
// результат после каждой итерации запишите в лог-файл.
package Ex_2;

import java.io.IOException;
import java.util.logging.*;
import java.nio.file.Paths;
import java.util.Arrays;

public class Task_2_1 {
    public static void main(String[] args) throws IOException {
        int[] array = {9, 7, 8, 10, 6, 5, 3, 2, 4, 1};

        Logger logger = Logger.getLogger(Task_2_1.class.getName());
        String currentPath = Paths.get("").toAbsolutePath().toString();
        String logsPath = currentPath + "\\Ex_2/log.txt";
        
        
        FileHandler fh = new FileHandler(logsPath);
        logger.addHandler(fh);

        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

        bubbleSort(array, logger);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] array, Logger logger) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i) ; j++) {
                if (array[j - 1] > array [j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array [j];
                    array [j] = temp; 
                    logger.info(Arrays.toString(array)); 
                } 
            }
        }
    }       
}
