/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indigo.com;

import javax.swing.*;

/**
 *
 * @author Matt
 */
public class Window 
{
    JFrame frame = new JFrame("Indigo");
    private final int FRAME_HEIGHT = 500;
    private final int FRAME_WIDTH = 500;
    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("Hello");
    // creates first window
    Window()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_HEIGHT, FRAME_WIDTH);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        
        
        frame.setVisible(true); //must be last line
    }

  
}
