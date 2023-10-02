package HomeWork7;
//2. Создать классы "Директор", "Рабочий", "Бухгалтер".
//Реализовать интерфейс с методом, который печатает название
//должности и имплементировать этот метод в созданные классы.


// Создаю интерфейс PositionPrinter с методом printPosition()
interface PositionPrinter {
    void printPosition();
}

// Создаю класс Director и имплементирую интерфейс PositionPrinter
class Director implements PositionPrinter {
    @Override
    public void printPosition() {
        System.out.println("Director");
    }
}
// Создаю класс Worker и имплементирую интерфейс PositionPrinter
class Worker implements PositionPrinter {
    @Override
    public void printPosition() {
        System.out.println("Worker");
    }
}

// Создаю класс Accountant и имплементирую интерфейс PositionPrinter
class Accountant implements PositionPrinter {
    @Override
    public void printPosition() {
        System.out.println("Accountant");
    }
}

 class Main {
    public static void main(String[] args) {
        // Создаем объекты классов Директор, Рабочий, Бухгалтер
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        // Вызываем метод printPosition() для объектов классов Директор, Рабочий, Бухгалтер
        director.printPosition();
        worker.printPosition();
        accountant.printPosition();
    }
}
