/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indigo.com;

import java.util.ArrayList;

/**
 *
 * @author Matt
 */
public class Map
{
    /*
    make a map
    add node(ifyes node, ifno node)
    add node()
    */
    ArrayList layer = new ArrayList();
    ArrayList yes, no;
    public Map()
    {
        DecisionNode root = new DecisionNode();
        layer.add(root);
    }
    public void addNode(RunNode rNode)
    {
        
    }
    public void addNode(DecisionNode dNode)
    {
        
    }
}
