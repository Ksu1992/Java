package ua.naryshkina.practice9;

//Создайте класс с двумя методами f( ) и g( ).
//В g( ) выбросите исключение
//В f( ) вызовите g( ), поймайте его исключение и, в блоке catch, выбросите
//другое исключение
//Проверьте ваш код в main( ).

public class Task2 {
    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }
    }

    public static void f() throws CustomException {
        try {
            g();
        } catch (Exception ex) {
            // Поймали исключение в g() и выбросили другое исключение
            throw new CustomException("Exception in method f");
        }
    }

    public static void g() throws Exception {
        // В g() выбрасываем исключение
        throw new Exception("Exception in method g");
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

