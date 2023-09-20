//5. Вывести 10 первых чисел последовательности 0, -5,-10,-15..

public class Cycle_Task5_SequenceOfFirstTenNumbers {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(number);
            number = number - 5;
        }

    }
}