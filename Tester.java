public class Tester{
  public static void main(String[]args) {
    SuperArray something = new SuperArray();
    System.out.println(something.size());
    something.add("hello");
    System.out.println(something.size());
    System.out.println(something.get(0));

    something.set(0, "bye");
    System.out.println(something.size());
    System.out.println(something.get(0));
  }
}
