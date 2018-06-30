import java.util.LinkedList;

public class Main {
  public static void main(String... args) {
    LinkedList rawList = new LinkedList();
    rawList.add("Hello");
    LinkedList<Integer> intList = (LinkedList<Integer>) rawList;
    System.out.println(intList.get(0));
    int i = intList.get(0);
    System.out.println(i);
  }
}
