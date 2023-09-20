//1. Написать программу для вывода названия поры года по номеру месяца. При решении используйте оператор switch-case.

public class Task1_SeasonByMonth {
    public static void main(String[] args) {
        int month = 17; // номер месяца

        String season;

        switch (month) {
            case 1:
            case 2:
            case 12:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "Неверный номер месяца";
                break;
        }

        System.out.println("Пора года для месяца " + month + " это " + season);
    }
}


