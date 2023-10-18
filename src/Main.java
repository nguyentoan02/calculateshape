import common.Validate;

import model.Circle;
import model.Rectangle;
import model.Triangle;

public class Main {

    private static void display(Triangle triangle, Rectangle rectangle, Circle circle) {
        System.out.println("\n----Rectangle----");
        rectangle.printResult();
        System.out.println("----Circle----");
        circle.printResult();
        System.out.println("----Triangle----");
        triangle.printResult();
    }

    public static void main(String[] args) {
        
        System.out.println("=====Calculator Shape Program=====");
        Validate validate = new Validate();

        Rectangle rectangle = validate.inputRectangle();
        Circle circle = validate.inputCircle();
        Triangle triangle = validate.inputTriangle();

        display(triangle, rectangle, circle);
    }
}
