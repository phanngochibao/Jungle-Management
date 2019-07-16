package jungle_management;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main implements Serializable {
  public static void main(String args[]){
    Jungle jungleSG = new Jungle("La Phoi Sai Gon",3,0);
    Tree tree1=new Tree("cao su",6,500,10,3,10);
    Tree tree2=new Tree("bach dan",7,1000,15,9,30);
    Tree tree3=new MangroveTree("bach xanh",9,6,800,10,10,20);
    jungleSG.plantTree(tree1);
    jungleSG.plantTree(tree2);
    jungleSG.plantTree(tree3);
    int numberOfTrees= jungleSG.numberOfTrees();
    Tree tree;
    for (int i=0; i<numberOfTrees; i++)
    {
      tree= jungleSG.trees[i];
      if((tree.rareLevel>=7)&&(tree.testLackOfWater()==true)) {
        System.out.println("cay quy hiem thieu nuoc: ");
        tree.print();
      }
    }
    Tree tree4=new Tree("cao su",6,800,10,4,20);

    boolean s= jungleSG.plantTree(tree4);
    System.out.println("ket qua trong cay: "+s);
    try {
      FileOutputStream fos= new FileOutputStream("laphoiSG.dat");
      ObjectOutputStream oos= new ObjectOutputStream(fos);
      oos.writeObject(jungleSG);
      oos.close();
      fos.close();
    } catch (IOException e) {
      System.out.print("co loi xay ra"+e);
    }
  }
}
