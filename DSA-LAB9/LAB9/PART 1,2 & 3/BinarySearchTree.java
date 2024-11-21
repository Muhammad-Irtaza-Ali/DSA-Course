

package com.mycompany.binarysearchtree;
import java.util.LinkedList;
import java.util.Queue;




public class BinarySearchTree{
 Node root; 
 BinarySearchTree(){
 this.root=null;
} 
 
 public void insert(int value){
        root=insertRecursive(root, value);
    }
 Node insertRecursive(Node current,int value){
        if(current==null){
            return new Node(value);
        }
        if(value<current.value){
            current.left=insertRecursive(current.left,value);
        }else if(value>current.value){
            current.right=insertRecursive(current.right,value);
        }
        return current;
    }

 public int countNodes(){
        return count(root);
    }
 
     int count(Node current){
        if(current==null){
            return 0;
        }
        return 1+count(current.left)+count(current.right);  }

  
    public boolean search(int value){
        return searchNode(root,value);
    }

     boolean searchNode(Node current, int value) {
    if(current==null){
        return false;}
    if(value==current.value){
        return true; }
    if(value<current.value){
        return searchNode(current.left,value);
    }else{
        return searchNode(current.right,value);
    }}


    
    public void inOrder(){
        System.out.print("In-order: ");
        inOrderTraversal(root);
        System.out.println();
    }

     void inOrderTraversal(Node current){
        if(current!=null){
            inOrderTraversal(current.left); 
            System.out.print(current.value + " "); 
            inOrderTraversal(current.right);         }
    }

    public void preOrder(){
        System.out.print("Pre-order: ");
        preOrderTraversal(root);
        System.out.println();
    }

  void preOrderTraversal(Node current){
        if(current!=null){
            System.out.print(current.value + " "); 
            preOrderTraversal(current.left); 
            preOrderTraversal(current.right);
        }
    }

    public void postOrder(){
        System.out.print("Post-order: ");
        postOrderTraversal(root);
        System.out.println();
    }

 void postOrderTraversal(Node current){
        if(current!=null){
            postOrderTraversal(current.left); 
            postOrderTraversal(current.right);
            System.out.print(current.value + " ");
        }}

    public void levelOrder() {
        System.out.print("Level-order: ");
        if(root==null){
            System.out.println();
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
while(!queue.isEmpty()){
            Node current=queue.poll();
            System.out.print(current.value+" "); 
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        System.out.println();
    }


    public static void main(String[] args){
   BinarySearchTree bst=new BinarySearchTree();
        int[] elements = {50,30,20,40,70,60,80};
        System.out.println("Inserting elements:");
        for(int value:elements) {
            bst.insert(value);
            System.out.println("Inserted: "+value);}
        System.out.println("Total nodes: " + bst.countNodes());
        System.out.println("\nSearching elements:");
        int[] searchValues={20,60,90};
        for(int value:searchValues){
            System.out.println("Search "+value+": "+(bst.search(value)?"Found":"Not Found"));
        }
        System.out.println("\nTree Traversals:");
        bst.inOrder();    
        bst.preOrder();   
        bst.postOrder();  
        bst.levelOrder();  
    }        

    
    
    
}
