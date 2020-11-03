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
    if (size == data.length) {
      resize();
    }
    data[size] = element;
    size++;
    return true;
  }

  public String get(int index) {
    return data[index];
  }

  public String set(int index, String element) {
    String something = data[index];
    data[index] = element;
    return something;
  }

  private void resize() {
    String [] newdata = new String [data.length + 10];
    for (int i = 0; i < data.length; i++) {
      newdata[i] = data[i];
    }
    data = newdata;
  }

}
