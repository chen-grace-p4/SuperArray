public class Tester{
  public static void main(String[]args) {
    SuperArray something = new SuperArray();
    // System.out.println(something.size());
    // something.add("hello");
    // System.out.println(something.size());
    // System.out.println(something.get(0));
    //
    // something.set(0, "bye");
    // System.out.println(something.size());
    // System.out.println(something.get(0));

    something.add("hello");
    something.add("bye");
    something.add("your welcome");
    something.add("sorry");
    something.set(3, "nevermind");
    System.out.println("Current size of data is " + something.size());
    System.out.println("Data contains...");
    for(int i = 0; i < something.size(); i++){
      System.out.println( something.get(i) );
    }
  }
}
