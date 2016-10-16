package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Pens
{
    String color ;
    int Pasta ;
    boolean  broke ;
    int minuts;
    float write;
    float create;
    String ChangeCol;
    String Brend;
    String ChangeBre;
    int kkd = 2;
    public String toString()
    {
        return " Pen : " +
                "percPasta = " + Pasta +","+ " Color = " +color + ","  + "Brend = "+ Brend +","+" broke = "+ broke;

    }

    void create( int per , String col,String br ,boolean b)
    {
        Pasta = per ;
        color = col ;
        broke = b ;
        Brend = br;
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
                    Pasta = Pasta - kkd;
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

    void ChangeCol()
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

     void ChangeBre()
     {
         if(Brend == "Lecce_Pen")
         {
             Brend = "Parker_Pen";
             kkd = 1;
         }
         else if(Brend =="Parker_Pen")
         {
             Brend = "Lecce_Pen";
             kkd = 2;
         }
     }
}
public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("laba 2 ") ;
        window.setSize(100,300);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        JButton btCreate = new JButton("create");
        JButton btWrite = new JButton("write");
        JButton btColor = new JButton("color");
        JButton btBrend = new JButton("Brend");

        btCreate.setPreferredSize(new Dimension(100,50));
        btWrite.setPreferredSize(new Dimension(100,50));
        btColor.setPreferredSize(new Dimension(100,50));
        btBrend.setPreferredSize(new Dimension(100,50));
        panel.add(btCreate);
        panel.add(btWrite);
        panel.add(btColor);
        panel.add(btBrend);
        window.add(panel);

        Pens Pen = new Pens();

        btCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pen.create(100,"black","Lecce_Pen",false);
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
                Pen.ChangeCol();
                System.out.println(Pen);
            }
        });

        btBrend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pen.ChangeBre();
                System.out.println(Pen);
            }
        });




    }




}
