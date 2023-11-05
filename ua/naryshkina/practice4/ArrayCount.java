package ua.naryshkina.practice4;

import java.util.Arrays;
import java.util.Random;

public class ArrayCount {
    public static void main(String[] args) {
        int array[] = new int[1000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(400);
        }

            System.out.println(Arrays.toString(array));

        int primeCount = 0; // Счетчик простых чисел

        for (int i = 0; i < array.length; i++) {
            // Проверка текущего элемента,является ли оно простым
            if (isPrime(array[i])) {
                primeCount++;
            }
        }

        System.out.println("Количество простых чисел в массиве: " + primeCount);
    }

    // Метод для проверки, является ли число простым
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

    










