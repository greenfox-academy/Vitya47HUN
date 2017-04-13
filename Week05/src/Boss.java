public class Boss extends Character {

  public Boss(int x, int y, String imageName,int maxHp,int currentHp,int attackP) {
    super(x,y, imageName,maxHp,currentHp,attackP);
    x = (int)(Math.random() * 3) - 1;
    y = (int)(Math.random() * 3) - 1;
  }

  @Override
  public void update(int[][] map, int keyCode) {
  }
}