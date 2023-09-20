//2. Создайте массив целых чисел. Удалите все вхождения заданного
//        числа из массива. Пусть число задается с консоли (класс Scanner).
//        Если такого числа нет - выведите сообщения об этом.
//        В результате должен быть новый массив без указанного числа.

import java.util.Scanner;
public class Task2_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаем и заполняем массив
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print("Введите число для удаления: ");
        int numberToDelete = scanner.nextInt();

        // Проверяем наличие числа в массиве
        boolean isnumberFound = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToDelete) {
                isnumberFound = true;
                break;
            }
        }

        if (!isnumberFound) {
            System.out.println("Число не найдено");
        } else {
            // Создаем новый массив с нужной длиной
            int[] newArray = new int[array.length - 1];

            // Копируем элементы из старого массива в новый, пропуская число для удаления
            int index = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] != numberToDelete) {
                    newArray[index] = array[i];
                    index++;
                }
            }

            // Выводим новый массив без удаленного числа
            System.out.print("Новый массив: ");

            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        }
    }
}


