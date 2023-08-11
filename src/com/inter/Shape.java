package com.inter;

public class Shape {

    public void calculateAndPrintArea(Area areaCalculator, int sides) {
        areaCalculator.calculateArea(sides);
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
          shape.calculateAndPrintArea((sides) -> {
            int area = sides * sides;
            System.out.println("Area " + area);
        }, 4);
    }
}
