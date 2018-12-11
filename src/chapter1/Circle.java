package chapter1;

/**
 * @Author: cunxiaopan
 * @Date: 2018/12/12 1:13 AM
 * @Description:
 */
public class Circle extends Shape{

  @Override
  void draw() {
    System.out.println("draw circle");
  }

  @Override
  void erase() {
    System.out.println("erase circle");
  }
}
