package ua.naryshkina.practice5;

//Дан двумерный массив NxN(количество строк = количество столбцов), написать программу
//которая поменяет местами столбцы и строки.
//нужно не просто вывести массив в другом порядке, а преобразовать массив
//ну и методы нужно именовать с маленькой буквы
public class Task3 {
    public static void main(String[] args) {
        int[][] originalArray = {
                {1, 2},
                {3, 4}
        };
        int[][] cloneArray = copy(originalArray);
        System.out.println("Оригинальный массив");
        output(originalArray);
        System.out.println("Измененный массив");
        int [][] reverseMatrix = reverseMatrix(cloneArray);
        output(reverseMatrix);
    }

    public static int[][] copy(int[][] src) {
        int[][] copy = new int[src.length][];
        for (int i = 0; i < src.length; i++) {
            copy[i] = src[i].clone();
        }
        return copy;
    }
    public static void output(int[][] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print(array[i][j] + " "); // Выводим значение элемента
            }
            System.out.println();
        }
    }
    public static int[][] reverseMatrix(int[][] array) {
        int[][] reverse = new int[array.length][array[0].length];
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[0].length ; j++) {
                reverse[j][i] = array[i][j];
            }
        }
        return reverse;
    }
};
