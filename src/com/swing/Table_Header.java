/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Admin
 */
public class Table_Header extends JLabel{

    public Table_Header(String Text) {
        super(Text);
        setOpaque(true);
        setBackground(Color.WHITE);
        setFont(new Font("sansserif",1,12));
        setForeground(new Color(102,102,102));
        setBorder(new EmptyBorder(10,5,10,5));
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        grphcs.setColor(new Color(230,230,230));
        grphcs.drawLine(0, getHeight()-1, getWidth(),getHeight()-1);
    }
    
}
