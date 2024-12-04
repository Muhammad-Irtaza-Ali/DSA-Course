
package com.mycompany.avltree;

/**
 *
 * @author Irtaza Ali
 */
public class AVLTree{
    private class Node{
        int key;
        int height;
        Node left,right;
 Node(int key){
            this.key=key;
            this.height=1;
       }}

    Node root;
    public void insert(int key){
        root =insertRec(root,key);  }
    
    Node insertRec(Node node,int key){
        if(node==null){
            return new Node(key);
        }
        if(key<node.key){
            node.left = insertRec(node.left,key);}
        else if (key > node.key){
            node.right = insertRec(node.right,key);
        }else{
            return node;
        }
        node.height=1+Math.max(getHeight(node.left),getHeight(node.right));

        int balance = getBalance(node);

        if(balance>1&& key<node.left.key)
        {return rightRotate(node);}
        if(balance<-1 && key>node.right.key){
            return leftRotate(node);}
        if(balance>1 && key>node.left.key){
            node.left =leftRotate(node.left);
            return rightRotate(node);
        }
        if(balance<-1 && key<node.right.key){
            node.right =rightRotate(node.right);
            return leftRotate(node);
        }
        return node;    }

   
    public void delete(int key){
        root = deleteRec(root,key);
    }

    Node deleteRec(Node node,int key){
        if(node==null){
            return node;
        }
        if(key<node.key){
            node.left=deleteRec(node.left, key);}
        else if(key>node.key){
            node.right = deleteRec(node.right, key);
        }else {
            if((node.left==null) || (node.right==null)){
                Node temp=(node.left != null) ? node.left : node.right;

                if(temp==null){
                    node=null;
                } else{
                    node=temp;
                }
            }else{
                Node temp = minValueNode(node.right);
                node.key = temp.key;
                node.right = deleteRec(node.right,temp.key);
            }
        }

        if(node==null){
            return node;
        }
        node.height=Math.max(getHeight(node.left),getHeight(node.right))+1;

        int balance=getBalance(node);

        if(balance>1 && getBalance(node.left)>=0){
            return rightRotate(node);}
        if(balance>1 && getBalance(node.left)<0){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if(balance<-1 && getBalance(node.right)<=0)
        {return leftRotate(node);}
        if(balance<-1 && getBalance(node.right)>0){
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
       return node;
    }

    Node minValueNode(Node node){
        Node current = node;
        while(current.left!=null){
            current = current.left;}
        return current;
    }

    // Search for a key
    public boolean search(int key){
        return searchRec(root, key);
    }

    boolean searchRec(Node node,int key){
        if(node==null){
            return false;}
        if(key==node.key){
            return true;}
        return key<node.key ? searchRec(node.left, key):searchRec(node.right, key);
    }

     Node rightRotate(Node y){
        Node x=y.left;
        Node T2=x.right;

        x.right=y;
        y.left=T2;

        y.height = Math.max(getHeight(y.left),getHeight(y.right))+1;
        x.height = Math.max(getHeight(x.left),getHeight(x.right))+1;

        return x;
    }

    
     Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(getHeight(x.left),getHeight(x.right))+1;
        y.height = Math.max(getHeight(y.left),getHeight(y.right))+1;

        return y;
    }

    
     int getHeight(Node node){
        if(node==null){
        return 0;}
        else{
        return node.height;}
    }

    
     int getBalance(Node node){
        return node==null?0: getHeight(node.left)-getHeight(node.right);
    }

    
    public static void main(String[] args){
        AVLTree tree = new AVLTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        System.out.println("Search 30: "+tree.search(30)); 
        System.out.println("Search 60: "+tree.search(60)); 

    
        tree.delete(40);
        System.out.println("Search 40 after deletion: "+tree.search(40));
    }
}



