//1. Создайте массив целых чисел. Напишете программу, которая
//        выводит сообщение о том, входит ли заданное число в массив или нет.
//        Пусть число для поиска задается с консоли (класс Scanner).

import java.util.Scanner;
public class Task1_array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для поиска: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число " + target + " найдено в массиве.");
        } else {
            System.out.println("Число " + target + " не найдено в массиве.");
        }
    }
}
