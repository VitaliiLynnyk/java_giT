package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("first laba");
		 window.setSize(300,125);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.setVisible(true);
        JButton btn = new JButton("start");
        JTextField str1 = new JTextField();
        JTextField res = new JTextField();
        //створення компонентів
        window.getContentPane().add(str1,BorderLayout.CENTER);
        window.getContentPane().add(btn,BorderLayout.EAST);
        window.getContentPane().add(res,BorderLayout.SOUTH);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a;
                int k,i;

                k = 0;
                a = str1.getText();
                for (i = 0; i<a.length();i++)
                {
                    k++;
                }
               
                res.setText(" number :"+k);




            }
        });
    }
}
