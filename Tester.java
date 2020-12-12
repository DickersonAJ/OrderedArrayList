import java.util.ArrayList;
public class Tester{

  public static void main(String[] args){
    NoNullArrayList<String> words = new NoNullArrayList<String>();
    System.out.println(words);
    NoNullArrayList<double[]> nums = new NoNullArrayList<double[]>(20);
    System.out.println(words);

    words.add("hello");
    System.out.println(words);
    //words.add(null);
    //System.out.println(words);

    words.add(0, "greetings");
    System.out.println(words);
    //words.add(1, null);
    //System.out.println(words);

    words.set(1, "salutations");
    System.out.println(words);
    //words.set(1, null);
    //System.out.println(words);

    OrderedArrayList<String> sophisticated = new OrderedArrayList<String>();
    System.out.println(sophisticated);
    OrderedArrayList<String> deluxe = new OrderedArrayList<String>(30);
    System.out.println(deluxe);
    sophisticated.add("alpaca");
    sophisticated.add("dog");
    sophisticated.add("cat");
    sophisticated.add(0, "cat");
    sophisticated.set(3, "bat");
    System.out.println(sophisticated);
  }

}
