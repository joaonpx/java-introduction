import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    /* common array */
    int[] arr = new int[10];

    /* dynamic array */
    ArrayList<String> fruits = new ArrayList<String>();
    fruits.add("abacaxi");
    fruits.add("banana");
    fruits.add("maça");
    fruits.forEach(System.out::println);

    /* casting int to string */
    int id = 31854879;
    String idStr;
    idStr = String.valueOf(id);

   System.out.println(idStr + idStr.getClass().getName());
  }
}