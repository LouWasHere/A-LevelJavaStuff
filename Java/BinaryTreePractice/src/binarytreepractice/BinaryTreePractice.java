/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytreepractice;

/**
 *
 * @author l-bishop
 */
public class BinaryTreePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        BinaryTree bt = new BinaryTree();
        bt.newNode("Waterman");
        bt.newNode("Louis");
        bt.newNode("Dilan");
        bt.newNode("Nid");
        bt.newNode("Jake");
        bt.newNode("Peter");
        bt.newNode("William");
        bt.preOrderTraversal(bt.root);
        bt.values.forEach(name ->
        {
            System.out.println(name);
        });
        bt.values.clear();
        System.out.println("\n");
        bt.postOrderTraversal(bt.root);
        bt.values.forEach(name ->
        {
            System.out.println(name);
        });
        bt.values.clear();
        System.out.println("\n");
        bt.inOrderTraversal(bt.root);
        bt.values.forEach(name ->
        {
            System.out.println(name);
        });
    }
    
}
