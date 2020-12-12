import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int initialCapacity){
    super(initialCapacity);
  }

  public boolean add(T element){
    if (element == null) {
      throw new IllegalArgumentException("No null values are allowed in a NoNullArrayList");
    }
    super.add(element);
    return true;
  }

  /*public String set(int index, String element){

  }*/

  /*public void add(int index, String element){

  }*/

}
