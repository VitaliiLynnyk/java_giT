package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Pens
{
    String color ;
    float changeColor;
    float percPasta ;
    float changePasta ;
    boolean  broke ;
    float write ;
    float create ;

    public String toString()
    {
        return " Pen" +
        "Color" +color + "percPasta" + percPasta + " broke" + broke;

    }

    void create( float per , String col, boolean b)
    {
        percPasta = per ;
        color = col ;
        broke = b ;
    }


    void write( float pp)
    {
      percPasta = pp ;
    }

}
public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("laba 2 ") ;
        window.setSize(600,600);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // JPanel panel = new JPanel();
        JButton bt1 = new JButton("create");
        JButton bt2 = new JButton("write");
        window.getContentPane().add(bt1,BorderLayout.EAST);
        //bt1.setPreferredSize(new Dimension(100,100));
      //  bt2.setPreferredSize(new Dimension(100,100));
//        panel.add(bt2);
      //  window.add(panel);
        Pens Pen = new Pens();

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pen.create(100,"black",false);
                System.out.println(Pen);
                JTextField Inform = new JTextField(" Starts inform");
                Inform


            }
        });
        bt2.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        }));








    }




}
