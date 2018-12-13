package chapter2;

/**
 * @Author: cunxiaopan
 * @Date: 2018/12/14 12:55 AM
 * @Description: object/ShowProperties.java
 */
public class ShowProperties {

  public static void main(String[] args) {
//    System.getProperties().list(System.out);
    System.out.println(System.getProperties().getProperty("user.name"));
    System.out.println(System.getProperties().getProperty("java.library.path"));
  }
}
