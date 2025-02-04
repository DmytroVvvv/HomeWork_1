package org.example;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape quad = new Quad();
        Shape polygon = new Polygon();
        Shape triangle = new Triangle();

        System.out.println("Фігура: " + circle.getName());
        System.out.println("Фігура: " + triangle.getName());
        System.out.println("Фігура: " + quad.getName());
        System.out.println("Фігура: " + polygon.getName());
        System.out.println("Фігура: " + rectangle.getName());
    }
}