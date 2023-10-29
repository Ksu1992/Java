public class Task2 {
    public static void main(String[] args) {
        byte a = 1;
        byte b = 2;

        System.out.println("До обміну: a = " + a + ", b = " + b);

        // Використовуємо тимчасову змінну для обміну значеннями a і b
        byte temp = a;
        a = b;
        b = temp;

        System.out.println("Після обміну: a = " + a + ", b = " + b);
    }
}


