//3. Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного  пользователем числа. Для ввода числа воспользуйтесь классом Scanner.

import java.util.Scanner;

public class Cycle_Task3_InputPositivInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое положительное число: ");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("Сумма чисел от 1 до " + number + " = " + sum);
    }
}
