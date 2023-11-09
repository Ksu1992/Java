package ua.naryshkina.practice5;
//Заполнение двумерного массива значениями индекса (от 1 и до кол-ва элементов в
//массиве), при этом каждая вторая строка - отрицательными значениями.
public class Task1 {
    public static void main(String[] args) {
        int numRows = 4;
        int numCols = 3;
        int[][] array = fillArray(numRows, numCols);

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] fillArray(int numRows, int numCols) {
        int[][] result = new int[numRows][numCols];
        int counter = 1;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (i % 2 == 0) {
                   result[i][j] = counter;
                } else {
                    result[i][j] = -counter;
                }
                counter++;
            }
        }

        return result;
    }
}