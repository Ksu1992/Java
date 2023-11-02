package ua.naryshkina.practice2;

public class Areatriangle {
    public static void main(String[] args) {
        // Задані координати точок A, B і C
        int x1 = 1;
        int y1 = 5;
        int x2 = 3;
        int y2 = 5;
        int x3 = 6;
        int y3 = 7;

        // Обчислення площі трикутника за формулою Гаусса
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // Виведення результату в консоль
        System.out.println("Площа трикутника: " + area);

        if (area %2==0) {
            System.out.println(area + "є парним числом.");
        } else {
            System.out.println(area + "є не парним числом.");
        }
    }
}
