package ua.naryshkina.practice5;

//Дан двумерный массив NxN(количество строк = количество столбцов), написать программу
//которая поменяет местами столбцы и строки.
//нужно не просто вывести массив в другом порядке, а преобразовать массив
//ну и методы нужно именовать с маленькой буквы
public class Task3 {
    public static void main(String[] args) {
        int[][] OriginalArray = {
                {1, 2},
                {3, 4}
        };
        int[][] CloneArray = copy(OriginalArray);
        System.out.println("Оригинальный массив");
        output(OriginalArray);
        System.out.println("Измененный массив");
        reverse(CloneArray);
        output(CloneArray);
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
    public static void reverse(int[][] array) {
        int temp = array[0][1];
        array[0][1] = array[1][0];
        array[1][0] = temp;
    }
};
