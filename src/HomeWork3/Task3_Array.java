//3. Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух
//        отдельных строках. Посчитайте среднее арифметическое элементов каждого
//        массива и сообщите, для какого из массивов это значение оказалось больше
//        (либо сообщите, что их средние арифметические равны).

import java.util.Arrays;

public class Task3_Array {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < array1.length; i++) {
            sum1 = sum1 + array1[i];
            sum2 = sum2 + array2[i];
        }

        double average1 = (double) sum1 / array1.length;
        double average2 = (double) sum2 / array2.length;

        System.out.println("Массив 1: " + Arrays.toString(array1));
        System.out.println("Массив 2: " + Arrays.toString(array2));

        if (average1 > average2) {
            System.out.println("Среднее арифметическое массива 1 больше");
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое массива 2 больше");
        } else {
            System.out.println("Средние арифметические массивов равны");
        }
    }
}


