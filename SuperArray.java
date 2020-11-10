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
    String [] newdata = new String [(data.length*2) + 1];
    for (int i = 0; i < data.length; i++) {
      newdata[i] = data[i];
    }
    data = newdata;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void clear() {
    size = 0;
    for (int i = 0; i < data.length; i++) {
      if (data[i] != null) {
        data[i] = null;
      }
    }

  }

  public String toString() {
    String returnstr = "[";
    for (int i = 0; i < data.length; i++) {
      if (data[i] != null) {
        if (i != size - 1){
          returnstr += data[i] + ", ";
        } else {
          returnstr += data[i];
        }
      }
    }
    returnstr += "]";
    return returnstr;
  }

  public boolean contains (String s) {
    String boo = "f";
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) return true;
    }
    return false;
  }

  public SuperArray(int initialCapacity) {
    data = new String[initialCapacity];
  } // SHOULDN'T WORK IF CAPACITY IS NEGATIVE

  public void add(int index, String element) {
    if (data[index] != null) {
      for (int i = size; i >= index; i -= 1) {
        if (size == data.length) {
          resize();
        }
        data[i+1] = data[i];
      }
    }
    data[index] = element;
    size = size();
  }

  public String remove(int index) {
    String retdata = data[index];
    data[index] = null;
    for (int i = index+1; i < size; i++) {
      data[i-1] = data[i];
      if (i == size-1) {
        data[i] = null;
      }
    }
    size = size();
    return retdata;
  }

  public int indexOf(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) {
        return i;
      }
    }
    return -1;
  }

  public String[] toArray() {
    String [] newdata = new String [size];
    for (int i = 0; i < size; i++) {
      newdata[i] = data[i];
    }
    return newdata;
  }

  public int lastIndexOf(String value) {
    for (int i = size-1; i >= 0; i -= 1) {
      if (data[i].equals(value)) {
        return i;
      }
    }
    return -1;
  }

  public boolean equals(SuperArray other) {
    if (this.size() == 0 && other.size() == 0) {
      return true;
    }
    if (this.size() != other.size()) {
      return false;
    }
    String boo = "f";
    for (int i = 0; i < this.size(); i ++) {
      if (this.data[i].equals(other.data[i])) {
        boo = "t";
      } else {
        boo = "f";
      }
    }
    return boo == "t";
  }

}
