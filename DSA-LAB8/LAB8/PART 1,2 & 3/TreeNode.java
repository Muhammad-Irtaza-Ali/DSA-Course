/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binarytree1;
    /**
 *
 * @author Irtaza Ali
 */
import java.util.Queue;
import java.util.LinkedList;
public class TreeNode {
    int data;
    TreeNode left,right;
    public TreeNode(int data){
    this.data=data;
    this.left=this.right=null;
    }

  // Method to insert
   public void insert(TreeNode node) {
        if(node==null){
            return;
        }
        if(this.data<node.data){
            if (this.right==null){
                this.right=node;
            } else{
                this.right.insert(node);
            }
        } else if(this.data>node.data){
            if(this.left==null){
                this.left=node;
            }else{
                this.left.insert(node);
            }}}
    
    

// Count total nodes
    int countNodes(TreeNode node){
        if(node==null){
            return 0; }
        return 1+countNodes(node.left) +countNodes(node.right);
    }  
    
    
    
    
    
 public void inOrderTraversal(TreeNode node){
 if(node!=null){
 inOrderTraversal(node.left);
     System.out.println(node.data+" ");
     inOrderTraversal(node.right);
 } }   
  

 
 public void preOrderTraversal(TreeNode node){
 if(node!=null){
     System.out.println(node.data+" ");
     preOrderTraversal(node.left);

     preOrderTraversal(node.right);
 } }       
 
 
 public void postOrderTraversal(TreeNode node){
 if(node!=null){
 postOrderTraversal(node.left);
 postOrderTraversal(node.right);    
 System.out.println(node.data+" ");
    
 } }    
 

 
 public void levelOrder(){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(this); 
while(!queue.isEmpty()){
            TreeNode currentNode=queue.poll();
            System.out.print(currentNode.data + " "); 
            if(currentNode.left!=null){
                queue.add(currentNode.left);
            }
            if(currentNode.right!=null) {
                queue.add(currentNode.right);
            }}}

    
    
    
    
   }
    
    

