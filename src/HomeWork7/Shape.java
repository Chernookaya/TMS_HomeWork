package HomeWork7;
//Task1. Написать иерархию классов «Фигуры».
//Фигура -> Треугольник -> Прямоугольник -> Круг.
//Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
//Создать массив из 5 фигур. Вывести на экран сумму периметра всех фигур в массиве.

abstract class Shape {
    abstract double square();
    abstract double perimetr();
}
// Класс Triangle, наследующийся от класса Shape
class Triangle extends Shape {
    private double osnovanie;
    private double height;
    private double side1;
    private double side2;
    private double side3;
    // Конструктор класса Triangle
    public Triangle(double osnovanie, double height, double side1, double side2, double side3) {
        this.osnovanie = osnovanie;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side2 = side3;
    }
    // Переопределение методов подсчета площади и периметра для треугольника
    @Override
    double square() {
        return (osnovanie * height) / 2;
    }
    @Override
    double perimetr() {
        return side1 + side2 + side3;
    }
}
// Класс Rectangle, наследующийся от класса Shape
class Rectangle extends Shape {
    private double width;
    private double length;
    // Конструктор класса Rectangle
    public Rectangle (double width, double length) {
        this.width = width;
        this.length = length;
    }
    // Переопределение методов подсчета площади и периметра для прямоугольника
    @Override
    double square() {
        return width * length;
    }
    @Override
    double perimetr() {
        return 2 * (width + length);
    }
}
// Класс Circle, наследующийся от класса "Shape"
class Circle extends Shape {
    private double radius;
    // Конструктор класса Circle
    public Circle (double radius) {
        this.radius = radius;
    }
    // Переопределение методов подсчета площади и периметра для круга
    @Override
    double square() {
        return Math.PI * radius * radius;
    }
    @Override
    double perimetr() {
        return 2 * Math.PI * radius;
    }
}
class ShapeTestDrive {
    public static void main(String[] args) {
        // Создаю массив из 5 фигур
        Shape[] shapes = new Shape[5];
        // Инициализируем каждый элемент массива фигурами разных типов
        shapes[0] = new Triangle(4, 3, 5, 4, 3);
        shapes[1] = new Rectangle(6, 8);
        shapes[2] = new Circle(5);
        shapes[3] = new Rectangle(3, 7);
        shapes[4] = new Triangle(5, 4, 6, 5, 4);
        // Cумма периметров всех фигур и вывод на экран
        double sumPerimetrov = 0;
        for ( Shape sh : shapes) {
            sumPerimetrov +=  sh.perimetr();
        }
        System.out.println("Сумма периметров всех фигур: " + sumPerimetrov);
    }
}