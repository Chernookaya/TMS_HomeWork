//2. Создайте и заполните массив случайным числами и выведете
//        максимальное, минимальное и среднее значение. Для генерации случайного
//        числа используйте метод Math.random(). Пусть будет возможность создавать
//        массив произвольного размера. Пусть размер массива вводится с консоли.

import java.util.Scanner;
public class Task2_randomArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100); // генерация случайного числа от 0 до 100
        }

        int min = array[0];
        int max = array[0];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] > max) {
                max = array[i];
            }

            sum = sum + array[i];
        }

        double average = (double) sum / size;

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}


