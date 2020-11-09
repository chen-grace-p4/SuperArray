public class Demo{
  public static void removeDuplicates(SuperArray s){
    for (int i = 0; i < s.size(); i++) {
      for (int j = s.size(); j > i; j -= 1) {
        if (s.get(i).equals(s.get(j))) {
          s.remove(j);
        }
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray retarray = new SuperArray();
    removeDuplicates(a);
    removeDuplicates(b);

    int largersize = 0;
    int smallersize = 0;
    if (a.size() > b. size()) {
      largersize += a.size();
      smallersize += b.size();
    } else {
      largersize += b.size();
      smallersize += a.size();
    }

    for (int i = 0; i < largersize; i++) {
      for (int j = 0; j < smallersize; j ++) {
        if (a.get(i).equals(b.get(j))) {
          retarray.add(a.get(i));
        }
      }
    }

    return retarray;
  }

  public static SuperArray zip(SuperArray a, SuperArray b) {
    int largersize = 0;
    int smallersize = 0;
    SuperArray largerone = new SuperArray();
    if (a.size() > b. size()) {
      largersize += a.size();
      smallersize += b.size();
      largerone = a;
    } else {
      largersize += b.size();
      smallersize += a.size();
      largerone = b;
    }

    SuperArray retarray = new SuperArray();

    int restoflarger = 0;
    for (int i = 0; i < smallersize; i++) {
      retarray.add(a.get(i));
      retarray.add(b.get(i));
      restoflarger++;
    }

    for (int i = restoflarger; i < largersize; i++) {
      retarray.add(largerone.get(i));
    }

    return retarray;
  }

  public static void main(String[]args){
    // SuperArray words = new SuperArray();
    // //grouped to save vertical space
    // words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    // words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    // words.add("una");    words.add("ebi");     words.add("toro");
    //
    // System.out.println(words);
    // removeDuplicates(words);
    // System.out.println(words);  }

    SuperArray one = new SuperArray();
    SuperArray two = new SuperArray();

    // one.add("fish"); one.add("dog"); one.add("fish"); one.add("cat"); one.add("bird");
    // two.add("fish"); two.add("bird"); two.add("lizard"); two.add("human");
    one.add("a"); one.add("b"); one.add("c"); one.add("d"); one.add("e");
    two.add("one"); two.add("two"); two.add("three");
    System.out.println(one);
    System.out.println(two);
    // System.out.println(findOverlap(one,two));
    System.out.println(zip(one,two));
  }
}
