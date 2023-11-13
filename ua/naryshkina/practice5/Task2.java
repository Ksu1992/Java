package ua.naryshkina.practice5;
//Проверить заданный массив на упорядоченность по убыванию.
//*передать массив в метод, получить boolean

public class Task2 {
    public static void main(String[] args) {
        int[]array={5,4,3,2,1};
        System.out.println(sorted(array));


    }

    public static boolean sorted (int[]array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i+1]) {
                return false;
            }
        }
        return true;
    }
}

