package util.datastructures;

public class DArray<T> {
  transient T[] array;
  private int capacity;
  private int count;
  private static final int DEFAULT_CAPACITY = 4;
  private static final Object[] EMPTY_ARRAY= {};
  
  DArray<T>() {
    array = EMPTY_ARRAY;
    capacity = 0;
    count = 0;
  }
  
  DArray<T>(int initialCapacity) {
    array = new T[initialCapacity];
    capacity = initialCapacity;
    count = 0;
  }
  
  T array(int idx) {
    return (T) array[idx];
  }
  
  public void insert(T elm) {
    
  }
  
  public void insert(T elm, int idx) {
  }
  
  public T delete(int idx) {
  }
  
  public boolean delete(T elm) {
  }
  
  public T getAt(int idx) {
  }
  
  public void setAt(T elm, int idx) {
  }
 
}
