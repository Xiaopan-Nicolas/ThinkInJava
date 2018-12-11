package chapter1;

/**
 * @Author: cunxiaopan
 * @Date: 2018/12/12 1:30 AM
 * @Description:
 */
public class RunOne {

  public static void main(String[] args) {
    Shape shape = new Shape();
    shape.draw();
    shape.setColor("yellow");
    System.out.println(shape.getColor());

    Circle circle = new Circle();
    circle.draw();
    circle.erase();
    circle.move();
    circle.setColor("red");
    System.out.println(circle.getColor());

    Square square = new Square();
    square.draw();

    Triangle triangle = new Triangle();
    triangle.draw();
    triangle.flipVertical();
    System.out.println(triangle.getColor());

  }
}
