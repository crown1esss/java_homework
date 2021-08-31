package com.company;
import javafx.event.ActionEvent;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class simpleGUI extends JFrame {
    int i , n ;
    private  JButton button = new JButton("AC Milan");
    private  JButton button1 = new JButton("Real Madrid");
    private  JLabel label = new JLabel(" Result  : 0 X 0");
    private  JLabel label1 = new JLabel("Last Scorer : N/A");
    private  JLabel label2 = new JLabel("Winner : DRAW");

    public simpleGUI(){
        //super("Simple for example");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5,5,5,5));
        container.add(label);
        container.add(label1);
        container.add(label2);
        ButtonGroup group = new ButtonGroup();
        button.addActionListener(new ButtonEventListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                i++;
                label.setText("Result :"+ i + " X " + n);
                label1.setText("Last Scorer AC Milan");
                if ( i > n ){
                    label2.setText(" Winner : AC Milan");
                }
            }
        });
        container.add(button);
        button1.addActionListener(new ButtonEventListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                n ++ ;
                label.setText("Result :"+ i + " X " + n);
                label1.setText("Last Scorer Real Madrid");

                if ( i < n ){
                    label2.setText(" Winner : Real Madrid");
                }
            }
        });
        container.add(button1);
    }



    abstract class ButtonEventListener implements  ActionListener {
        public void actionPerformed(ActionEvent e ){
            String message = "dsdsdsdds ";
            message += " Button was press\n";
            JOptionPane.showMessageDialog(null,message, " Output " , JOptionPane.PLAIN_MESSAGE);
        }
    }

}