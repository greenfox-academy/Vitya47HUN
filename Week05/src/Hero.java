
public class Hero {
  int level;
  int maxHP;
  int defensePoints;
  int  strikePoints;

  public Hero(int level, int maxHP, int defensePoints, int strikePoints) {
    this.level = level;
    this.maxHP = maxHP;
    this.defensePoints = defensePoints;
    this.strikePoints = strikePoints;
  }

  @Override
  public String toString() {
    return "Hero{" +
            "level=" + level +
            ", maxHP=" + maxHP +
            ", defensePoints=" + defensePoints +
            ", strikePoints=" + strikePoints +
            '}';
  }
}
