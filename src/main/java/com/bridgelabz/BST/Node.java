package com.bridgelabz.BST;

//Program for Node of the BinarySearchTree.
public class Node{
    int key;     //data value
    Node parent; //points to the parent node.
    Node left;   //points to the right child.
    Node right;  //points to the left child.

    public Node(int data){
        this.key=data;
        this.parent=null;
        this.left=null;
        this.right=null;
    }

}