package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("first laba");
        window.setSize(400,150);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        JButton btn = new JButton("start");
        JTextField str1 = new JTextField();
        JTextArea res = new JTextArea();

        //створення компонентів

        window.getContentPane().add(str1,BorderLayout.CENTER);
        window.getContentPane().add(btn,BorderLayout.EAST);
        window.getContentPane().add(res,BorderLayout.SOUTH);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)  {
                String str;
                str = str1.getText();

                int i ;
                int  k ;
                char[] chArray = str.toCharArray();
                int[] chUnic = str.chars().distinct().toArray();
                String newline = "\n";
                System.out.println("char = " + Arrays.toString(chArray));

                for( i = 0; i < chUnic.length; i++)
                {
                    k=0;
                        for(int p=0; p < chArray.length;p++)
                        {
                            if ( chUnic[i]  == chArray[p] )
                           {
                                k++;

                           }

                        }
                    res.append((char)chUnic[i] + " " + k + newline);

                }
            }









        });
    }
}
