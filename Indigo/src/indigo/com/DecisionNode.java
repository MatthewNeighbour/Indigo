/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indigo.com;

/**
 *
 * @author Matt
 */
public class DecisionNode implements INode
{
    DecisionNode parent;
    DecisionNode yNode;
    DecisionNode nNode;
    
    // root node
    DecisionNode(DecisionNode y, DecisionNode n)
    {
        y = yNode;
        n = nNode;
    }

    DecisionNode()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void process()
    {
        
    }
}
