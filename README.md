# OrderedArrayList
Constructor would call SuperArray(int capacity) constructor with an initalCapacity of 0
SuperArray(0);

public NoNullArrayList() {
  ArrayList<T> ans = new ArrayList<T>(0);
}

***make sure that get never returns null***

resize by 1 to not get() nulls

for the adds and set, check
if(element == null){
  throw new IllegalArgumentException();
}
ArrayList<T>.add(element);
