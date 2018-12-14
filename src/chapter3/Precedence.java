package chapter3;

/**
 * @Author: cunxiaopan
 * @Date: 2018/12/14 11:15 PM
 * @Description:
 */
public class Precedence {

  public static void main(String[] args) {
    int x =1,y=2,z=3;
    int a=x+y-2/2+z;
    int b=x+(y-2)/(2+z);
    System.out.println("a="+a+" b="+b);
  }
}
