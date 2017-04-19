package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    SoundSet("Duum-duum-duum");
    Strings(4);
    SetName("Bass-Guitar");
  }

  public BassGuitar(int numberOfStrings){
    Strings(numberOfStrings);
    SoundSet("Duum-duum-duum");
    SetName("Bass-Guitar");
  }
}
