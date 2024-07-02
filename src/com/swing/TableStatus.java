/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.swing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class TableStatus extends JLabel{

    public TableStatus() {
        setForeground(Color.WHITE);
    }
    private StatusType type;
//    public void setType (StatusType  type){
//        this.type =type; 
////        setText(type.toString());
//        repaint();
//    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        if (type!=null) {
                     Graphics2D g2 = (Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g ;
        if (type == StatusType.NHANVIEN) {
            g=new GradientPaint(0, 0, new Color(186,123,247), 0, getHeight(), new Color(167,94,236));
        }else{
             g=new GradientPaint(0, 0, new Color(142,142,250), 0, getHeight(), new Color(123,123,245));
        }
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintComponent(grphcs); 
    }    
        }
  
}