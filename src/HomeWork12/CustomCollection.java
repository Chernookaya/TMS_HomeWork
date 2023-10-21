package HomeWork12;
//Представим, что в Java нет коллекции типа ArrayList.
//Создать свой класс, симулирующий работу класса динамической коллекции -
// т.е. создать свою кастомную коллекцию. В основе коллекции будет массив.
// Кастомная коллекция должна хранить элементы разных классов(т.е. это generic).
//Предусмотреть операции добавления элемента, удаления элемента, получение элемента
// по индексу, проверка есть ли элемент в коллекции, метод очистки все коллекции.
//Предусмотреть конструктор без параметров - создает массив размером по умолчанию.
//Предусмотреть конструктор с задаваемым размером внутреннего массива.
//Предусмотреть возможность автоматического расширения коллекции при добавлении элемента
// в том случае, когда коллекция уже заполнена.

public class CustomCollection<T> {
    private T[] array;
    private int size;
    private static final int DEFAULT_SIZE = 10;
    // Конструктор без параметров
    public CustomCollection() {
        this.array = (T[]) new Object[DEFAULT_SIZE];
        this.size = 0;
    }
    // Конструктор с задаваемым размером внутреннего массива
    public CustomCollection(int capacity) {
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }
    // Метод для добавления элемента в коллекцию
    public void add(T element) {
        // Проверяем, заполнен ли массив
        if (this.size == this.array.length) {
            // Если заполнен, увеличиваем размер массива в два раза
            T[] newArray = (T[]) new Object[this.array.length * 2];
            // Копируем элементы из старого массива в новый
            System.arraycopy(this.array, 0, newArray, 0, this.array.length);
            // Обновляем ссылку на массив
            this.array = newArray;
        }
        // Добавляем элемент в конец коллекции и увеличиваем размер
        this.array[this.size] = element;
        this.size++;
    }
    // Метод для удаления элемента из коллекции
    public void remove(T element) {
        // Ищем индекс элемента
        int index = indexOf(element);
        // Если элемент найден, удаляем его
        if (index >= 0) {
            // Смещаем элементы после удаляемого на одну позицию влево
            System.arraycopy(this.array, index + 1, this.array, index, this.size - index - 1);
            // Уменьшаем размер
            this.size--;
        }
    }
    // Метод для получения элемента по индексу
    public T get(int index) {
        // Проверяем, что индекс находится в допустимых пределах
        if (index >= 0 && index < this.size) {
            return this.array[index];
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
    }
    // Метод для проверки, содержится ли элемент в коллекции
    public boolean contains(T element) {
        return indexOf(element) >= 0;
    }
    // Метод для очистки коллекции
    public void clear() {
        // Создаем новый пустой массив
        this.array = (T[]) new Object[DEFAULT_SIZE];
        this.size = 0;
    }
    // Вспомогательный метод для поиска индекса элемента
    private int indexOf(T element) {
        // Ищем элемент в массиве
        for (int i = 0; i < this.size; i++) {
            if (this.array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
    // Метод для получения размера коллекции
    public int size() {
        return this.size;
    }
}