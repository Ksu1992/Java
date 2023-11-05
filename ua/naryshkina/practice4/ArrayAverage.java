import java.util.Random;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = new int[400];
        Random random = new Random();

        // Заполняем массив случайными значениями от 1 до 10
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        // Находим среднее арифметическое
        double arithmeticMean = calculateArithmeticMean(array);
        System.out.println("Среднее арифметическое: " + arithmeticMean);

        // Находим среднее геометрическое
        double geometricMean = calculateGeometricMean(array);
        System.out.println("Среднее геометрическое: " + geometricMean);
    }

    // Метод для вычисления среднего арифметического
    public static double calculateArithmeticMean(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }

    // Метод для вычисления среднего геометрического
    public static double calculateGeometricMean(int[] array) {
        double product = 1.0;
        for (int value : array) {
            product *= value;
        }
        return Math.pow(product, 1.0 / array.length);
    }
}
