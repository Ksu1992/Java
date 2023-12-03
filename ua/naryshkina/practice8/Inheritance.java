package ua.naryshkina.practice8;
//Создайте пример наследования, реализуйте класс Student и класс Aspirant,
//аспирант отличается от студента наличием некой научной работы.
//а) Класс Student содержит переменные: String firstName, lastName,
//group. А также, double averageMark, содержащую среднюю оценку.
//б) Создать метод getScholarship() для класса Student, который
//возвращает сумму стипендии. Если средняя оценка студента равна 5, то
//сумма 100 грн, иначе 80.
//в) Переопределить этот метод в классе Aspirant. Если средняя оценка
//аспиранта равна 5, то сумма 200 грн, иначе 180.
//г) Создать массив типа Student, содержащий объекты класса Student и
//Aspirant. Вызвать метод getScholarship() для каждого элемента массива.

class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        return (averageMark == 5) ? 100 : 80;
    }
}

class Aspirant extends Student {
    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship() {
        return (averageMark == 5) ? 200 : 180;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Student student = new Student("Maria", "Doe", "A123", 4.8);
        Aspirant aspirant = new Aspirant("Alex", "Smith", "B456", 5.0, "Advanced Research");

        Student[] students = {student, aspirant};

        for (Student s : students) {
            System.out.println(s.getScholarship());
        }
    }
}
