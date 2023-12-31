package ua.naryshkina.practice6;
//Класс Phone.
//а) Создайте класс Phone, который содержит переменные(поля) number,
//model и weight.
//б) Добавить конструктор в класс Phone, который принимает на вход
//три параметра для инициализации переменных класса - number, model
//и weight.
//в) Добавить конструктор, который принимает на вход два параметра
//для инициализации переменных класса - number, model.
//г) Добавить конструктор без параметров.
//д) Создайте три экземпляра этого класса.
//ж) Присвоить значения полям класса.
//з) Выведите на консоль значения их полей.
//и) Добавить в класс Phone методы: receiveCall, имеет один параметр
//– имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
//getNumber – возвращает номер телефона. Вызвать эти методы для
//каждого из объектов.

public class Phone {
    int number;
    String model;
    int weight;
    //конструктор,три параметра
    public Phone(int number,String model,int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    //конструктор, два параметра
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 50;
    }
    // конструктор без параметров

    public Phone(){
        this.number = 7775588;
        this.model = "Motorola";
        this.weight = 45;
    }
    //метод receiveCall
    public static void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    // Метод getNumber
    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Phone samsung = new Phone(7668976,"samsung",55);
        Phone huawei = new Phone(7556776,"huawei");
        Phone motorola = new Phone();
// Выводим значения полей на консоль
        System.out.println("Phone 1: Number - " + samsung.number + ", Model - " + samsung.model + ", Weight - " + samsung.weight);
        System.out.println("Phone 2: Number - " + huawei.number + ", Model - " + huawei.model + ", Weight - " + huawei.weight);
        System.out.println("Phone 3: Number - " + motorola.number + ", Model - " + motorola.model + ", Weight - " + motorola.weight);

        // Вызываем методы для каждого объекта
        samsung.receiveCall("John");
        System.out.println("Phone 1 Number: " + samsung.getNumber());

        huawei.receiveCall("Alice");
        System.out.println("Phone 2 Number: " + huawei.getNumber());

        motorola.receiveCall("Bob");
        System.out.println("Phone 3 Number: " + motorola.getNumber());
    }
}


