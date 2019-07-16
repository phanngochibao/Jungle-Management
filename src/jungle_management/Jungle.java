package jungle_management;

import java.io.Serializable;

public class Jungle implements Serializable {
  protected String name;
  protected int maximunNumberOfTrees;
  protected int numberOfTrees;
  protected Tree[] trees;
  public Jungle(){}
  public Jungle(String name,int maximunNumberOfTrees,int numberOfTrees){
    this.name = name;
    this.maximunNumberOfTrees = maximunNumberOfTrees;
    this.numberOfTrees = numberOfTrees;
    this.trees=new Tree[maximunNumberOfTrees];
  }
  public int numberOfTrees(){
    return numberOfTrees;
  }
  public int numberOfTreesCanPlant() {
    return maximunNumberOfTrees - numberOfTrees;
  }
  public boolean plantTree(Tree tree){
    int a=numberOfTreesCanPlant();
    int b=numberOfTrees();
    if (a<=0) return false;
    else {
      trees[b]=tree;
      numberOfTrees++;
      return true;
    }
  }
}
