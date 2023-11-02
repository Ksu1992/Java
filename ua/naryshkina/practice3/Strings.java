
public class Strings {
    public static void main(String[] args) {
        String text = "public static void main(String[] args) {";
        System.out.println(text);

        String stringWithoutSpaces = text.replace(" ", ""); // Заменяем пробелы на пустую строку
        System.out.println(stringWithoutSpaces);

        System.out.println(text.split(" ").length);
    }
}