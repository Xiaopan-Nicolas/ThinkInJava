package chapter1;

/**
 * @Author: cunxiaopan
 * @Date: 2018/12/12 1:12 AM
 * @Description:
 */
public class Shape {

  /**
   * variable of color
   */
  private String color;

  /**
   * methods : draw erase move ...
   */
  void draw(){
    System.out.println("draw a shape");
  }
  void erase(){
    System.out.println("erase a shape");
  }
  void move(){
    System.out.println("move shape");
  }
  String getColor(){
    return this.color;
  }
  void setColor(String color){
    this.color=color;
  }
}
