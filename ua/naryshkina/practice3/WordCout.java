package ua.naryshkina.practice3;
public class WordCout {
    public static void main(String[] args) {
        String text = " text                text text  text text                        text  ";
        System.out.println("Исходный текст: " + text);

        String stringWithoutSpaces = removeSpaces(text);
        System.out.println("Текст без пробелов: " + stringWithoutSpaces);

        int wordCount = countWords(text);
        System.out.println("Количество слов: " + wordCount);
    }

    // Метод для удаления пробелов из текста
    public static String removeSpaces(String text) {
        return text.replace(" ", "");
    }

    // Метод для подсчета количества слов в тексте
    public static int countWords(String text) {
        text = text.trim();
        String[] words = text.split("\\s+");
        return words.length;
    }
}

