public class Main {
  public static void main(String[] args) {
    Counter counting = new Counter(45);

    counting.add(55);
    counting.add();
    System.out.println(counting.get());
    counting.reset();
    System.out.println(counting.get());
  }

}
