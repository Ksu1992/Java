package ua.naryshkina.practice1;

public class Task3 {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("До обміну: a = " + a + ", b = " + b);

        a = a + b;  // Тепер a = 8
        b = a - b;  // Тепер b = 5
        a = a - b;  // Тепер a = 3

        System.out.println("Після обміну: a = " + a + ", b = " + b);
    }
}