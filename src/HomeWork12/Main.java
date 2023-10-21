package HomeWork12;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра коллекции
        CustomCollection<Integer> collection = new CustomCollection<>();
        // Добавление элементов
        collection.add(1);
        collection.add(2);
        collection.add(3);
        // Получаем элемент по индексу
        System.out.println(collection.get(1)); // Вывод: 2
        // Проверка наличия элемента
        System.out.println(collection.contains(3)); // Вывод: true
        // Удаление элемента
        collection.remove(2);
        // Проверка наличия элемента после удаления
        System.out.println(collection.contains(2)); // Вывод: false
        // Очистка коллекции
        collection.clear();
        // Проверка, что размер стал равен 0
        System.out.println(collection.size()); // Вывод: 0
    }
}