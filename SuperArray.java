public class SuperArray {
  private String [] data;
  private int size; //The current size

  public SuperArray() {
    data = new String [10];
  }

  public int size() {
    int counter = 0;
    for (int i = 0; i < data.length; i++) {
      if (data[i] != null) {
        counter++;
      }
    }
    return counter;
  }

  public boolean add(String element) {
    data[size] = element;
    size++;
    return true;
  }



}
