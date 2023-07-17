/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidb;

import javax.swing.*;
import java.awt.*;

public class GuiDb extends JFrame {

    private JPanel appPanel;
    private JPanel inputPanel;
    private JPanel buttonPanel;
    
    private JLabel appName;
    
    public GuiDb(){
    super("Names");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(300,300);
    this.setResizable(false);
    this.setLayout(new FlowLayout(FlowLayout.CENTER));
    
    this.add(appPanel);
    setLocationRelativeTo(null);
    this.setVisible(true);
    
    this.add(appPanel);
    appName = new JLabel ("Database");
    appPanel.add(appName);
    }
    public static void main(String[] args) {
        
    }
    
}
