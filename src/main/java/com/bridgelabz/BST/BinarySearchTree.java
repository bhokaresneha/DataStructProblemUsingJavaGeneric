package com.bridgelabz.BST;//Program to implement BinarySearchTree.

public class BinarySearchTree{


    static Node root;   //root of the tree.

    public BinarySearchTree(){
        root=null;
    }

    //function to find specific data elements in the tree.
    public static Node find(int data){
        Node temp=root;
        Node prev=null;

        while(temp!=null){
            prev=temp;

            if(temp.key==data){
                return prev;
            }
            if(temp.key>data){
                temp=temp.left;
            }
            else{
                temp=temp.right;
            }
        }
        return prev;
    }

    //function to add elements in the tree.
    public static void add(int data){
        System.out.println("Inserting data : " + data);
        Node node = new Node(data);
        Node positionNode = find(data);
        if(positionNode==null){
            root=node;
            return;
        }

        node.parent=positionNode;

        if(node.key>positionNode.key){
            positionNode.right=node;
        }
        else{
            positionNode.left=node;
        }
    }




    //function for InOrder Traversal of the tree.
    private static void inorderTraversal(Node rootNode){
        if(rootNode==null){
            return;
        }
        inorderTraversal(rootNode.left);
        System.out.print(rootNode.key + " ");
        inorderTraversal(rootNode.right);
    }

    //function for PreOrder Traversal of the tree.
    private static void preorderTraversal(Node rootNode){
        if(rootNode==null){
            return;
        }
        System.out.print(rootNode.key + " " );
        preorderTraversal(rootNode.left);
        preorderTraversal(rootNode.right);
    }

    //function for  PostOrder Traversal of the Tree.
    private static void postorderTraversal(Node rootNode){
        if(rootNode==null){
            return;
        }
        postorderTraversal(rootNode.left);
        postorderTraversal(rootNode.right);
        System.out.print(rootNode.key + " ");
    }

    //function to display the tree.
    public static void display(){
        System.out.println();
        System.out.println("Inorder Traversal");
        inorderTraversal(root);

        System.out.println();
        System.out.println("PreOrder Traversal");
        preorderTraversal(root);

        System.out.println();
        System.out.println("PostOrder Traversal");
        postorderTraversal(root);

        System.out.println();
    }

    //main function to run the program.
    public static void main(String [] args){
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(56);
        tree.add(30);
        tree.add(70);

        tree.display();



    }
}

		

		
		
			
			

			
			

		
		






























							