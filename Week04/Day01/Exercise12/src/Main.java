public class Main {
  public static void main(String[] args) {
    Counter counting = new Counter(18);

    counting.add(3);
    counting.add();

    System.out.println(counting.get());
    counting.reset();
    System.out.println(counting.get());
  }

}
