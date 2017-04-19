package main.java.music;

public class Violin extends StringedInstrument {
  public Violin() {
  SoundSet("screeches");
  Strings(4);
  SetName("Violin");
}

  public Violin(int numberOfStrings){
    Strings(numberOfStrings);
    SoundSet("screeches");
    SetName("Violin");
  }
}
