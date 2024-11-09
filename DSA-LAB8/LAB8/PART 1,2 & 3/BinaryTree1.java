/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binarytree1;

/**
 *
 * @author Irtaza Ali
 */
public class BinaryTree1 {
     private TreeNode root;
     BinaryTree1(int data) {
this.root=new TreeNode(data);
}
   
//  public void add(int data){
//  root=insert(root,data);
//  }  
      
  
    
     
     
    public static void main(String[] args) {
        BinaryTree1 Bt=new BinaryTree1(8);
    
        Bt.root.insert(new TreeNode(50));
        Bt.root.insert(new TreeNode(30));
        Bt.root.insert(new TreeNode(20));
        Bt.root.insert(new TreeNode(40));
        Bt.root.insert(new TreeNode(70));
        Bt.root.insert(new TreeNode(60));
        Bt.root.insert(new TreeNode(80));   
      
        System.out.println("In-Order Traversal:");
        Bt.root.inOrderTraversal(Bt.root);
        System.out.println("\nPre-Order Traversal:");
        Bt.root.preOrderTraversal(Bt.root);
        System.out.println("\nPost-Order Traversal:");
        Bt.root.postOrderTraversal(Bt.root);
        System.out.println("\nlevel-Order Traversal:");
        Bt.root.levelOrder();
        
        System.out.println("Hello World!");
    }
}
