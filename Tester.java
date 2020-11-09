import java.util.Arrays;
public class Tester{
  public static void main(String[]args) {
    // SuperArray something = new SuperArray();

    // SuperArray something = new SuperArray(20);
    // // System.out.println(something.size());
    // // something.add("hello");
    // // System.out.println(something.size());
    // // System.out.println(something.get(0));
    // //
    // // something.set(0, "bye");
    // // System.out.println(something.size());
    // // System.out.println(something.get(0));
    //
    // // something.add("hello");
    // // something.add("bye");
    // // something.add("your welcome");
    // // something.add("sorry");
    // // something.set(3, "nevermind");
    //
    // something.add("one");
    // something.add("two");
    // something.add("three");
    // something.add("four");
    // something.add("five");
    // something.add("six");
    // something.add("seven");
    // something.add("eight");
    // something.add("nine");
    // something.add("ten");
    // something.add("eleven");
    //
    // System.out.println("Current size of data is " + something.size());
    // System.out.println("Data contains...");
    // // for(int i = 0; i < something.size(); i++){
    // //   System.out.println( something.get(i) );
    // // }
    // // something.clear();
    // // System.out.println(something.isEmpty());
    //
    // System.out.println(something.toString());
    // System.out.println(something.contains("hello"));

    // SuperArray something = new SuperArray();
    // something.add("one");
    // something.add("two");
    // something.add("three");
    // something.add("four");
    // something.add("five");
    // something.add("six");
    // something.add("seven");
    // something.add("eight");
    // something.add("nine");
    // something.add("ten");
    //
    // something.remove(9);
    // System.out.println("Current size of data is " + something.size());
    // System.out.println("Data after addition contains...");
    // System.out.println(something.toString());

    // System.out.println(something.indexOf("five"));
    // System.out.println(something.indexOf("123123"));

    // System.out.println("Current size of data is " + something.size());
    // System.out.println("Data contains...");
    // System.out.println(something.toString());
    //
    // something.add(3, "anotherthree!");
    // System.out.println("Current size of data is " + something.size());
    // System.out.println("Data after addition contains...");
    // System.out.println(something.toString());

    // something.remove(3);
    // something.add(3, "newthree!");
    // System.out.println("Current size of data is " + something.size());
    // System.out.println("Data after addition contains...");
    // System.out.println(something.toString());
    // System.out.println(something.indexOf("four")); // should be -1
    // System.out.println(something.indexOf("two")); // should be 1

    // System.out.println(something.data); //changed data to public temporarily
    // System.out.println(something.toArray());
    //Result was:
    // [Ljava.lang.String;@71dac704
    // [Ljava.lang.String;@123772c4
    // System.out.println(something);
    // System.out.println(Arrays.toString(something.toArray()));

    SuperArray something = new SuperArray();
    something.add("cat"); something.add("dog"); something.add("cat"); something.add("cat"); something.add("fish");
    // System.out.println(something.lastIndexOf("cat")); //should be 3
    // System.out.println(something.lastIndexOf("dog")); // should be 1
    // System.out.println(something.lastIndexOf("bat")); // should be -1
    // System.out.println(something.lastIndexOf("fish")); // should be 4
    SuperArray something2 = new SuperArray(20);
    // something2.add("cat"); something2.add("dog"); something2.add("cat"); something2.add("cat"); something2.add("fish");
    // something2.add("cat"); something2.add("dog"); something2.add("cat"); something2.add("cat"); something2.add("fish");
    something2.add("happy");
    System.out.println(something.equals(something2));
  }
}
