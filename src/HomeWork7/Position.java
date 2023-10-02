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
        // Создаю объекты классов Director, Worker, Accountant
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        // Вызов метода printPosition() для объектов классов Director, Worker, Accountant
        director.printPosition();
        worker.printPosition();
        accountant.printPosition();
    }
}
