package ua.naryshkina.practice10;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {
        // Создаем ArrayList и добавляем элементы
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        // 1. Обход с использованием цикла for
        System.out.println("1. Обход с использованием цикла for:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // 2. Обход с использованием цикла for-each
        System.out.println("\n2. Обход с использованием цикла for-each:");
        for (String element : arrayList) {
            System.out.println(element);
        }

        // 3. Обход с использованием цикла while
        System.out.println("\n3. Обход с использованием цикла while:");
        int index = 0;
        while (index < arrayList.size()) {
            System.out.println(arrayList.get(index));
            index++;
        }

        // 4. Обход с использованием итератора
        System.out.println("\n4. Обход с использованием итератора:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
