package jungle_management;

import java.io.Serializable;

public class Tree implements Serializable {
  protected String type;
  protected int rareLevel;
  protected long waterInTree;
  protected int height;
  protected int bodyRadius;
  protected int coverRadius;

  public Tree(){}

  public Tree(String type, int rareLevel, long waterInTree, int height, int bodyRadius,int coverRadius){
    this.type = type;
    this.rareLevel = rareLevel;
    this.waterInTree = waterInTree;
    this.height = height;
    this.bodyRadius = bodyRadius;
    this.coverRadius = coverRadius;
  }

  public boolean testLackOfWater(){

    if (waterInTree /(bodyRadius)<100){
      return true;
    }

    else {
      return false;
    }
  }

  public void print(){
    System.out.println("type: "+ type);
    System.out.println("Muc do quy hiem: "+ rareLevel);
    System.out.println("Nuoc: "+ waterInTree);
    System.out.println("Cao: "+ height);
    System.out.println("R than: "+ bodyRadius);
    System.out.println("R phu: "+ coverRadius);
  }
}
