package ua.naryshkina.practice2;

public class lessmodul {
    public static void main(String[] args) {
        double number1 = -5;
        double number2 = 7;
        double number3 = 11;

        // Знаходимо модулі кожного числа
        double absNumber1 = Math.abs(number1);
        double absNumber2 = Math.abs(number2);
        double absNumber3 = Math.abs(number3);

        // Знаходимо менший модуль серед трьох чисел
        double minAbsoluteValue = Math.min(absNumber1, Math.min(absNumber2, absNumber3));

        // Знаходимо відповідне вихідне число
        double result = (absNumber1 == minAbsoluteValue) ? number1 :
                (absNumber2 == minAbsoluteValue) ? number2 : number3;

        // Виводимо результат
        System.out.println("Менше число за модулем: " + result);
    }
}