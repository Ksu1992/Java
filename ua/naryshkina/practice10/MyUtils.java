package ua.naryshkina.practice10;

//Реализовать утильный класс со статическими методами:
//• getSum(List<Integer> numbers) - возвращает сумму элементов списка
//• getOddNumber(List<Integer> numbers) - возвращает новый список нечетных чисел
//• convertToStringList(List<Integer> numbers) - возвращает новый список строк
//• doubling(List<String> strings) – возвращает новый список, в котором дублирует
//каждую строку и конкатенирует ее
//- input: “2i”
//- output: “2i2i”

import java.util.ArrayList;
import java.util.List;

public class MyUtils {
    // Метод для получения суммы элементов списка
    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Метод для получения списка нечетных чисел
    public static List<Integer> getOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    // Метод для преобразования списка чисел в список строк
    public static List<String> convertToStringList(List<Integer> numbers) {
        List<String> stringList = new ArrayList<>();
        for (int number : numbers) {
            stringList.add(String.valueOf(number));
        }
        return stringList;
    }

    // Метод для удвоения и конкатенации строк
    public static List<String> doubling(List<String> strings) {
        List<String> doubledStrings = new ArrayList<>();
        for (String str : strings) {
            doubledStrings.add(str + str);
        }
        return doubledStrings;
    }

    public static void main(String[] args) {
        // Пример использования методов
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println("Сумма элементов списка: " + getSum(numbers));
        System.out.println("Список нечетных чисел: " + getOddNumbers(numbers));
        System.out.println("Список строк: " + convertToStringList(numbers));

        List<String> strings = List.of("2i", "3j", "4k");
        System.out.println("Удвоенные и конкатенированные строки: " + doubling(strings));
    }
}
