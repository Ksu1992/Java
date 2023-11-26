package ua.naryshkina.practice9;

//Создайте класс с main( ), который выбрасывает объект класса Exception
//внутри блока try.
//Передайте конструктору Exception аргумент String.
//Поймайте исключение внутри блока catch и напечатайте сообщение
//String из объекта exception.
//Добавьте блок finally и напечатайте сообщение, чтобы убедится, что вы
//были там.

public class Exceptions {
    public static void main(String[] args) {
        try {
           RealException();
        } catch (Exception e) {
            System.out.println("Caught exceptions: " + e.getMessage());
        } finally {
            System.out.println("Hello World");
        }
    }

    public static void RealException() throws Exception {
        // Бросаем объект Exception с аргументом String
        throw new Exception("Hello World");
    }
}


