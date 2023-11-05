package ua.naryshkina.practice3;
public class WordCout {
    public static void main(String[] args) {
        String text = "London is the capital of England and the United Kingdom. The history of this modern city goes back to the times of the Romans. In the very center of London is the Houses of Parliament - the Palace of Westminster, as well as the famous clock tower Big Ben and Westminster Abbey. This church is the site of the coronation of British monarchs. On the opposite bank of the Thames there is the London Eye Ferris wheel, which offers panoramic views not only of the south bank, but of the entire city.";
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
        String[] words = text.split(" ");
        return words.length;
    }
}

