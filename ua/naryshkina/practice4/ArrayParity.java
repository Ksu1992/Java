package ua.naryshkina.practice4;

import java.util.Arrays;
import java.util.Random;
//Заполнить одномерный массив случайными целочисленными значениями.
//• Все четные значения заменить на нули. Размер массива - 2000 элементов.
//вынесем замену четных чисел на нули в отдельный метод

public class ArrayParity {
    public static void main(String[] args) {
        int array[] = new int[2000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1500);
        }

        System.out.println(Arrays.toString(array));

        // Вызов метода replace
        int[] modifiedArray = replace(array);

        // Выводим обновленный массив
        System.out.println("Измененный массив: " + Arrays.toString(modifiedArray));
    }

    public static int[] replace(int array[]) {
        // Создаем копию массива
        int[] copyArray = Arrays.copyOf(array, array.length);

        int evenCount = 0; // Счетчик четных чисел

        for (int i = 0; i < copyArray.length; i++) {
            if (copyArray[i] % 2 == 0) {
                evenCount++;
                copyArray[i] = 0; // Замена четных чисел на 0
            }
        }

        System.out.println("Количество четных чисел в массиве: " + evenCount);

        return copyArray; // Возвращаем измененную копию массива
    }
}




