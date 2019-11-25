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
public class BinaryTree
{
    int elements = 0;
    Node parent = null;
    Boolean found = false;
    Node root = null;
    
    public void newNode(String value)
    {
        Boolean positionFound = false;
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
                else
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
            }
        }
    }
    
}
