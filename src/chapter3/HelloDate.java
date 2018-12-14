package chapter3;

import java.util.*;
import static net.mindview.util.Print.*;
/**
 * @Author: cunxiaopan
 * @Date: 2018/12/14 11:01 PM
 * @Description:
 */
public class HelloDate {

  public static void main(String[] args) {
    //normal 正常打印
    System.out.println("Hello, it's :");
    System.out.println(new Date());

    // import static method to print 导入静态方法打印
    print("Hello, it's :");
    print(new Date());

  }

}
