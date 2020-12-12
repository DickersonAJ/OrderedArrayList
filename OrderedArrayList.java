public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }

  private int place(T element){
    for (int i = 0; i < size(); i++) {
      if (element.compareTo(this.get(i)) < 1) {
        return i;
      }
    }
    return size();
  }

  public boolean add(T element){
    super.add(place(element), element);
    return true;
  }

  public void add(int index, T element){
    super.add(place(element), element);
  }

  /*public T set(int index, T element){

  }*/

}
