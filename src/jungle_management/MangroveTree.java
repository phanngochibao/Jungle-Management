package jungle_management;

public class MangroveTree extends Tree {
  protected int salinityToleranceLevel;
  public MangroveTree(String type, int rareLevel,int salinityToleranceLevel, long waterInTree, int height, int bodyRadius,int coverRadius){
    this.type=type;
    this.rareLevel=rareLevel;
    this.salinityToleranceLevel=salinityToleranceLevel;
    this.waterInTree=waterInTree;
    this.height=height;
    this.bodyRadius=bodyRadius;
    this.coverRadius=coverRadius;
  }
  @Override
  public boolean testLackOfWater() {
    return false;
  }
  @Override
  public void print(){
    super.print();
    System.out.println("Muc do chiu man: "+salinityToleranceLevel);
  }
}
