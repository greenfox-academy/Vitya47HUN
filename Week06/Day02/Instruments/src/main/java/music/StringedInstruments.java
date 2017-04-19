package main.java.music;

abstract class StringedInstrument extends Instrument {
  private String sound;
  private int numberOfStrings;
  public String formatForPlay = "%s, a %d-stringed instrument that %s\n";

  public void Strings(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }
  public void SoundSet(String sound) {
    this.sound = sound;
  }
  public void SetName(String name){
    this.name = name;
  }

  @Override
  public void play() {
    System.out.printf(formatForPlay,name,numberOfStrings, sound);
  }
}