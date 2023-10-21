package HomeWork10;
//Написать программу со следующим функционалом:
//На вход передать строку (будем считать, что это номер документа).
//Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
//- Вывести на экран в одну строку два первых блока по 4 цифры.
//- Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
//- Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
//- Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
// (реализовать с помощью класса StringBuilder).
//Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет
// (причем, abc и ABC считается одинаковой последовательностью).
//- Проверить начинается ли номер документа с последовательности 555.
//- Проверить заканчивается ли номер документа на последовательность 1a2b.
//Все эти методы реализовать в отдельном классе в статических методах,
//которые на вход (входным параметром) будут принимать вводимую на вход
//программы строку.

public class DocumentBuilder {
    public static void main(String[] args) {
        String documentNumber = "1234-abc-5678-def-1a2b";

        printFirstTwoBlocks(documentNumber);
        printDocumentWithMaskedLetters(documentNumber);
        printOnlyLettersInLowercase(documentNumber);
        printLettersInUppercase(documentNumber);
        checkIfContainsSequence(documentNumber, "abc");
        checkIfStartsWithSequence(documentNumber, "555");
        checkIfEndsWithSequence(documentNumber, "1a2b");
    }

    // Вывод на экран два первых блока по 4 цифры
    public static void printFirstTwoBlocks(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        System.out.println("First two blocks: " + blocks[0] + "-" + blocks[1]);
    }

    // Вывод на экран номера документа, но заменяет блоки из трех букв на ***
    public static void printDocumentWithMaskedLetters(String documentNumber) {
        String maskedNumber = documentNumber.replaceAll("[a-zA-Z]{3}", "***");
        System.out.println("Masked document number: " + maskedNumber);
    }

    // Вывод на экран только одних букв из номера документа в формате yyy/yyy/y/y в нижнем регистре
    public static void printOnlyLettersInLowercase(String documentNumber) {
        String letters = documentNumber.replaceAll("[^a-zA-Z]", "");
        letters = letters.toLowerCase();
        StringBuilder formattedLetters = new StringBuilder();
        for (int i = 0; i < letters.length(); i++) {
            formattedLetters.append(letters.charAt(i));
            if (i < letters.length() - 1) {
                formattedLetters.append("/");
            }
        }
        System.out.println("Letters in lowercase: " + formattedLetters);
    }

    // Вывод на экран букв из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
    public static void printLettersInUppercase(String documentNumber) {
        String letters = documentNumber.replaceAll("[^a-zA-Z]", "");
        letters = letters.toUpperCase();
        StringBuilder formattedLetters = new StringBuilder("Letters:");
        for (int i = 0; i < letters.length(); i++) {
            formattedLetters.append(letters.charAt(i));
            if (i < letters.length() - 1) {
                formattedLetters.append("/");
            }
        }
        System.out.println(formattedLetters);
    }

    // Проверка, содержит ли номер документа последовательность и вывод сообщения содержит или нет
    public static void checkIfContainsSequence(String documentNumber, String sequence) {
        String lowercaseNumber = documentNumber.toLowerCase();
        if (lowercaseNumber.contains(sequence.toLowerCase())) {
            System.out.println("Document number contains the sequence: " + sequence);
        } else {
            System.out.println("Document number does not contain the sequence: " + sequence);
        }
    }

    // Проверка, начинается ли номер документа с последовательности и вывод сообщения да или нет
    public static void checkIfStartsWithSequence(String documentNumber, String sequence) {
        String lowercaseNumber = documentNumber.toLowerCase();
        if (lowercaseNumber.startsWith(sequence.toLowerCase())) {
            System.out.println("Document number starts with the sequence: " + sequence);
        } else {
            System.out.println("Document number does not start with the sequence: " + sequence);
        }
    }

    // Проверка, заканчивается ли номер документа на последовательность и вывод сообщения да или нет
    public static void checkIfEndsWithSequence(String documentNumber, String sequence) {
        String lowercaseNumber = documentNumber.toLowerCase();
        if (lowercaseNumber.endsWith(sequence.toLowerCase())) {
            System.out.println("Document number ends with the sequence: " + sequence);
        } else {
            System.out.println("Document number does not end with the sequence: " + sequence);
        }
    }
}

