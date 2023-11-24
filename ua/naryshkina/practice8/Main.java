package ua.naryshkina.practice8;
//Создать функциональный интерфейс Pow с методом pow(int number, int
//pow), который принимает 2 параметра:
//1 - число которое возводится в степень,
//2 - степень в которую возводится число.
//
//Реализовать этот интерфейс в методе main через лямбду (без использования
//сторонних пакетов типа Math).

@FunctionalInterface
interface Pow {
    int pow(int number, int exponent);
}

public class Main {
    public static void main(String[] args) {
        // Реализация интерфейса с использованием лямбда-выражения
        Pow powOperation = (number, exponent) -> {
            int result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= number;
            }
            return result;
        };

        // Пример использования
        int base = 2;
        int power = 3;
        int result = powOperation.pow(base, power);

        System.out.println(base + " в степени " + power + " равно " + result);
    }
}