/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Component;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author Duc3m
 */
public class LetterButton extends JButton{
    
    public boolean hidden = false;
    
    public LetterButton(Character text) {
        setText(text.toString());
        setFont(new Font("Arial", Font.BOLD, 18));
        setBackground(Color.white);
        this.setPreferredSize(new Dimension(56, 56));
    }
    
    public void hide() {
        setText("");
        setBorder(null);
        setFocusable(false);
        setEnabled(false);
        hidden = true;
    }
}
