package HomeWork8;
//Создайте класс Phone, который содержит переменные number, model и weight.
// Создайте три экземпляра этого класса. Выведите на консоль значения их  переменных.
//Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
// Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона.
// Вызвать эти методы для каждого из объектов.
//Добавить конструктор в класс Phone, который принимает на вход три параметра
// для инициализации переменных класса - number, model и weight.
// Добавить конструктор, который принимает на вход два параметра для
//инициализации переменных класса - number, model.
//Добавить конструктор без параметров.
//Вызвать из конструктора с тремя параметрами конструктор с двумя.
//Добавьте перегруженный метод receiveCall, который принимает два
//параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
//Создать метод sendMessage с аргументами переменной длины. Данный
//метод принимает на вход номера телефонов, которым будет отправлено
//сообщение. Метод выводит на консоль номера этих телефонов.

public class Phone {
    private String number;
    private String model;
    private double weight;
    // Конструктор с тремя параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    // Конструктор с двумя параметрами
    public Phone(String number, String model) {
        this(number, model, 0.0); // Вызов конструктора с тремя параметрами, передавая вес равный 0.0
    }
    // Конструктор без параметров
    public Phone() {
            }
    // Метод receiveCall с одним параметром
    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }
    // Перегруженный метод receiveCall с двумя параметрами
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + ", номер телефона: " + callerNumber);
    }
    // Метод getNumber
    public String getNumber() {
        return number;
    }
    // Метод sendMessage с переменным числом аргументов
    public void sendMessage(String... numbers) {
        System.out.print("Отправка сообщения на номера: ");
        for (String number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    // Вывод значений переменных объекта
    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
    // Тестирование класса
    public static void main(String[] args) {
        Phone phone1 = new Phone("+3753366060326", "iPhone 12 Pro", 13.3);
        Phone phone2 = new Phone("+375336594160", "Samsung Galaxy S21", 16.9);
        Phone phone3 = new Phone("+375336606096", "Xiaomi Mi 10T Pro", 15.8);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Sergio");
        phone2.receiveCall("Vasilina", "+375336594160");
        phone3.sendMessage("+375291234556, ", "+375336543221, ", "+375447789965");
    }
}