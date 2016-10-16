package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Pens
{
    String color ;
    int Pasta ;
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
                    Pasta = Pasta - 2;
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

    void color()
    {
        if(color =="black")
        {
            color ="green";
            Pasta = 100;
        }else if(color =="green")
        {
           color = "black";
            Pasta = 100;
        }
    }


}
public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("laba 2 ") ;
        window.setSize(100,250);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        JButton btCreate = new JButton("create");
        JButton btWrite = new JButton("write");
        JButton btColor = new JButton("color");

        btCreate.setPreferredSize(new Dimension(100,50));
        btWrite.setPreferredSize(new Dimension(100,50));
        btColor.setPreferredSize(new Dimension(100,50));
        panel.add(btCreate);
        panel.add(btWrite);
        panel.add(btColor);
        window.add(panel);

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
                Pen.write(5);
                System.out.println(Pen);
            }
        }));

        btColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pen.color();
                System.out.println(Pen);
            }
        });






    }




}
