package ua.naryshkina.practice3;

public class PalindromeCheck2Impl {
    public static void main(String[] args) {
        String text = "stringWithoutSpaces";
        String stringWithoutSpaces = text;

        if (isPalindrome(stringWithoutSpaces)) {
            System.out.println("Это палиндром.");
        } else {
            System.out.println("Это не палиндром.");
        }
    }

    private static boolean isPalindrome(String stringWithoutSpaces) {
        stringWithoutSpaces = stringWithoutSpaces.replaceAll("\\s", "").toLowerCase();

        // Теперь можно проверить, является ли строка палиндромом
        int left = 0;
        int right = stringWithoutSpaces.length() - 1;
        while (left < right) {
            if (stringWithoutSpaces.charAt(left) != stringWithoutSpaces.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

