package ua.naryshkina.practice4;

import java.util.Arrays;
import java.util.Random;

public class ArrayParity {
    public static void main(String[] args) {
        int array[] = new int[2000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1500);
        }

        System.out.println(Arrays.toString(array));

        int evenCount = 0; // Счетчик четных чисел

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Количество четных чисел в массиве: " + evenCount);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }

        // Выводим обновленный массив
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}




