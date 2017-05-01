public enum CarType {
  BMW(0), SUZUKI(1), FORD(2), MERCEDES(3), CITROEN(4);

  private int value;

  CarType(int value) {
    this.value = value;
  }

  private static int size = CarType.values().length;

  public static int getSize() {
    return size;
  }

}