package chapter1;

/**
 * @Author: cunxiaopan
 * @Date: 2018/12/12 1:13 AM
 * @Description:
 */
public class Triangle extends Shape{

  @Override
  void draw() {
    System.out.println("draw triangle");
  }

  @Override
  void erase() {
    System.out.println("erase triangle");
  }
  void flipVertical(){
    System.out.println("flip vertical triangle");
  }
  void flipHorizontal(){
    System.out.println("flip horizontal triangle");
  }
}
