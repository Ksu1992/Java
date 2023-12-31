package ua.naryshkina.practice10;
//Реализовать метод поиска индекса телефона в массиве, если телефона нет - вернуть пустой
//Optional.

import java.util.Objects;
import java.util.Optional;

public class PhoneBook {
    private static final String[] PHONE_BOOK = new String[3];

    public static void main(String[] args) {
        PHONE_BOOK[0] = "016/161616";
        PHONE_BOOK[1] = "016/161617";
        PHONE_BOOK[2] = "016/161618";

        String phoneNumberToFind = "016/161617";
        Optional<Integer> indexOptional = findIndexByPhoneNumber(phoneNumberToFind);

        if (indexOptional.isPresent()) {
            int index = indexOptional.get();
            System.out.println("Phone number found at index: " + index);
        } else {
            System.out.println("Phone number not found");
        }
    }

    public static Optional<Integer> findIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < PHONE_BOOK.length; i++) {
            if (Objects.equals(PHONE_BOOK[i], phoneNumber)) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}



