public class Counter {
  int value;
  int initialValue;

  public Counter( int value) {
    value = 0;
    initialValue = 0;
  }

  public Counter() {
    value = 0;
    initialValue = 0;
  }


  public int add(int number){
    value += number;
    return value;
  }

  public int add(){
    value ++;
    return value;
  }

  public int get(){
    return value;
  }

  public int reset(){
    value = initialValue;
    return value;
  }
}
