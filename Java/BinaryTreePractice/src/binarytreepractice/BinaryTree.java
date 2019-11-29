/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytreepractice;

import java.util.ArrayList;

/**
 *
 * @author l-bishop
 */
public class BinaryTree
{
    int elements = 0;
    Node parent = null;
    Boolean found = false;
    Node root = null;
    ArrayList<String> values = new ArrayList<>();
    
    public void newNode(String value)
    {
        if(elements == 0)
        {
            root = new Node(value);
            elements++;
        }
        else
        {
            Node newNode = new Node(value);
            parent = root;
            found = false;
            while(found==false)
            {
                if(parent.desc.compareToIgnoreCase(value) >= 0)
                {
                    if(parent.left==null)
                    {
                        parent.left = newNode;
                        found = true;
                        elements++;
                    }
                    else
                    {
                        parent = parent.left;
                    }
                }
                else
                {
                    if(parent.right==null)
                    {
                        parent.right = newNode;
                        found = true;
                        elements++;
                    }
                    else
                    {
                        parent = parent.right;
                    }
                }
            }
        }
    }
    
    public void preOrderTraversal(Node pointer)
    {
        values.add(pointer.desc);
        if(pointer.left != null)
        {
            preOrderTraversal(pointer.left);
        }
        if(pointer.right != null)
        {
            preOrderTraversal(pointer.right);
        }
    }
    
    public void postOrderTraversal(Node pointer)
    {
        if(pointer.left != null)
        {
            postOrderTraversal(pointer.left);
        }
        if(pointer.right != null)
        {
            postOrderTraversal(pointer.right);
        }
        values.add(pointer.desc);
    }
    
    public void inOrderTraversal(Node pointer)
    {
        if(pointer.left != null)
        {
            inOrderTraversal(pointer.left);
        }
        values.add(pointer.desc);
        if(pointer.right != null)
        {
            inOrderTraversal(pointer.right);
        }
    }
}