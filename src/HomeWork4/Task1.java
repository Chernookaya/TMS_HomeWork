package HomeWork4;
//1. Создать трехмерный массив из целых чисел. С помощью
//циклов "пройти" по всему массиву и увеличить каждый
//элемент на заданное число. Пусть число, на которое будет
//увеличиваться каждый элемент, задается из консоли
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Задаем размеры трехмерного массива
        System.out.print("Введите количество плоскостей (x): ");
        int x = scanner.nextInt();
        System.out.print("Введите количество строк (y): ");
        int y = scanner.nextInt();
        System.out.print("Введите количество столбцов (z): ");
        int z = scanner.nextInt();
        // Создаем трехмерный массив
        int[][][] array = new int[x][y][z];
        // Задаем число, на которое будем увеличивать каждый элемент
        System.out.print("Введите число, на которое нужно увеличить элементы: ");
        int increment = scanner.nextInt();
        // Заполняем массив случайными значениями
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    array[i][j][k] = array[i][j][k] + increment;
                }
            }
        }
        // Выводим результат
        System.out.println("Измененный трехмерный массив:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
