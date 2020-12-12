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

  public void add(int index, T element){
    if (element == null) {
      throw new IllegalArgumentException("No null values are allowed in a NoNullArrayList");
    }
    super.add(index, element);
  }

  public T set(int index, T element){
    if (element == null) {
      throw new IllegalArgumentException("No null values are allowed in a NoNullArrayList");
    }
    return super.set(index, element);
  }

}
