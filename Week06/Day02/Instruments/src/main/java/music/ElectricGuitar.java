package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar() {
    SoundSet("Twang");
    Strings(6);
    SetName("E-Guitar");
  }

  public ElectricGuitar(int numberOfStrings){
    Strings(numberOfStrings);
    SoundSet("Twang");
    SetName("E-Guitar");
  }
}
