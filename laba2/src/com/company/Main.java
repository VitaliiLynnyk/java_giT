package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Pens
{
    String color ;
    float changeColor;
    int Pasta ;
    float changePasta ;
    boolean  broke ;
    float write ;
    float create ;
    int minuts;

    public String toString()
    {
        return " Pen : " +
                "percPasta = " + Pasta +","+ " Color = " +color + ","  + "broke = " + broke;

    }

    void create( int per , String col, boolean b)
    {
        Pasta = per ;
        color = col ;
        broke = b ;
    }


    void write( int p)
    {
      minuts = p ;
        int k=0 ;
        if( broke == false)
        {
            for (int i = 1; i <= minuts; i++) {
                if (Pasta <= 0) {
                    System.out.println("NOPasta");
                    k++;
                    break;
                } else {
                    Pasta = Pasta - 1;
                }

            }
            if( k == 1)
            {
                broke = true;
            }
        } else
        {
            System.out.println("PEN BROKEN");
        }
    }




}
public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("laba 2 ") ;
        window.setSize(100,100);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // JPanel panel = new JPanel();
        JButton btCreate = new JButton("create");
        JButton btWrite = new JButton("write");
        window.getContentPane().add(btCreate,BorderLayout.WEST);
        window.getContentPane().add(btWrite,BorderLayout.EAST);
        //bt1.setPreferredSize(new Dimension(100,100));
      //  bt2.setPreferredSize(new Dimension(100,100));
//        panel.add(bt2);
      //  window.add(panel);
        Pens Pen = new Pens();

        btCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pen.create(100,"black",false);
                System.out.println(Pen);




            }
        });
        btWrite.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pen.write(50);
                System.out.println(Pen);
            }
        }));








    }




}
