package test01;

import java.util.Scanner;

abstract class Shape {
    abstract double getPerimeter();
    abstract double getArea();

    @Override
    public String toString() {
        return "Shape{" +
                "perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                '}';
    }
}

class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    double getArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("������Ҫ�����ͼ�����ͣ�1.������ 2.���� 3.Բ��");
        int shapeType = scanner.nextInt();

        if (shapeType == 1) {
            System.out.println("�����������ε����߳���");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            Shape triangle = new Triangle(a, b, c);
            System.out.println(triangle);
        } else if (shapeType == 2) {
            System.out.println("��������εĳ��Ϳ�");
            double length = scanner.nextDouble();
            double width = scanner.nextDouble();
            Shape rectangle = new Rectangle(length, width);
            System.out.println(rectangle);
        } else if (shapeType == 3) {
            System.out.println("������Բ�İ뾶��");
            double radius = scanner.nextDouble();
            Shape circle = new Circle(radius);
            System.out.println(circle);
        } else {
            System.out.println("����������������г�����ȷ���롣");
        }

        scanner.close();
    }
}