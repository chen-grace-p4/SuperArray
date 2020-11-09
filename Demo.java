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

    one.add("fish"); one.add("dog"); one.add("fish"); one.add("cat"); one.add("bird");
    two.add("fish"); two.add("bird"); two.add("lizard"); two.add("human");

    System.out.println(one);
    System.out.println(two);
    System.out.println(findOverlap(one,two));
  }
}
