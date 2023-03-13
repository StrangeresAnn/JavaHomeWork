// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8

package Ex_5;

public class Task_5_3 {
    public static void main(String[] args) {
        int[] queens = new int[8];

        position(queens, 0);

        for (int row = 0; row < queens.length; row++) {
            for (int col = 0; col < queens.length; col++) {
                if (queens[row] == col) {
                    System.out.print(" X ");
                } 
                else {
                    System.out.print(" 0 ");
                } 
            }
            System.out.println();
        }
    }

    public static boolean position(int[] queens, int row) {
        if (row == queens.length) {
            return true;
        } 
        for (int i = 0; i < queens.length; i++) {
            boolean isValid = true;
            for (int j = 0; j < row; j++) {
                if (queens[j] == i || queens[j] == i - row + j || queens[j] == i + row - j) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                queens[row] = i;
                if (position(queens, row + 1)) {
                    return true;
                } 
            }
        }
        return false;
    }
}
