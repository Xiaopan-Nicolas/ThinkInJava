package chapter1;

/**
 * @Author: cunxiaopan
 * @Date: 2018/12/12 1:13 AM
 * @Description:
 */
public class Square extends Shape{

  @Override
  void draw() {
    System.out.println("draw square");
  }

  @Override
  void erase() {
    System.out.println("erase square");
  }
}
