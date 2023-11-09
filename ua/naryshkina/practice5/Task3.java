package ua.naryshkina.practice5;

//Дан двумерный массив NxN(количество строк = количество столбцов), написать программу
//которая поменяет местами столбцы и строки.
public class Task3 {
    public static void main(String[] args) {
        int[][] OriginalArray = {
                {1, 2},
                {3, 4}
        };

        int[][] CloneArray = Copy(OriginalArray);
        System.out.println("Оригинальный массив");
        DefaultOutput(OriginalArray);
        System.out.println("Измененный массив");
        ReverseOutput(CloneArray);
    }

    public static int[][] Copy(int[][] src) {
        int[][] copy = new int[src.length][];
        for (int i = 0; i < src.length; i++) {
            copy[i] = src[i].clone();
        }
        return copy;
    }
    public static void DefaultOutput(int[][] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print(array[i][j] + " "); // Выводим значение элемента
            }
            System.out.println();
        }
    }
    public static void ReverseOutput(int[][] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print(array[j][i] + " "); // Выводим значение элемента
            }
            System.out.println();
        }
    }
};
