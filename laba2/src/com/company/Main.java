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
    String Brend;
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


    void write(int p) {
        minuts = p;
        int k = 0;
        if (broke == false)
        {
            for (int i = 1; i <= minuts; i++) {
                if (Pasta == 0)
                {
                    System.out.println("NOPasta");
                    k++;
                    break;

                } else if( Pasta < 0)
                {
                    Pasta = 0;

                }
                else
                {
                    Pasta = Pasta - kkd ;
                }

            }
            if ( k == 1)
            {

                System.out.println("Change color");
            }

        }
        else
        {
            System.out.println("Pen broken ,please ,  CREATE new Pen");
        }
    }
    void ChangeCol() {
         Pasta = 100 ;
        if (color == "black") {
            color = "green";

        } else if (color == "green") {
            color = "black";

        }
    }

    void ChangeBre() {
        Pasta = 100;
        if (Brend == "Lecce_Pen") {
            Brend = "Parker_Pen";
            kkd = 1;
        } else if (Brend == "Parker_Pen") {
            Brend = "Lecce_Pen";
            kkd = 2;
        }
    }


    void Eat ()
    {
        Pasta = Pasta - 125;
        if(Pasta < 0)
        {
            Pasta = 0;
            broke = true;
            System.out.println("PEN BROKEN");
        }
    }
}
public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("laba 2 ") ;
        window.setSize(60,325);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        JButton btCreate = new JButton("create");
        JButton btWrite = new JButton("write");
        JButton btColor = new JButton("color");
        btColor.setBackground(Color.BLACK);
        btColor.setForeground(Color.green);
        JButton btBrend = new JButton("Brend");
        JButton btEat = new JButton("eat");
        btCreate.setPreferredSize(new Dimension(150,50));

        btWrite.setPreferredSize(new Dimension(150,50));
        btColor.setPreferredSize(new Dimension(150,50));
        btBrend.setPreferredSize(new Dimension(150,50));
        btEat.setPreferredSize(new Dimension(150,50));
        panel.add(btCreate);

        panel.add(btWrite);
        panel.add(btColor);
        panel.add(btBrend);
        panel.add(btEat);
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
                if((Pen.broke == false) &&  ( Pen.Pasta > 0)){
                    Pen.write(5);
                    System.out.println(Pen);
                } else if( Pen.broke == true)
                {
                    System.out.println("Pen broken ,please ,  CREATE new Pen");
                }
                else{
                    System.out.println("Please , change Color");
                }

            }
        }));

        btColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Pen.broke == false) {
                    Pen.ChangeCol();
                    if (Pen.color == "green") {
                        btColor.setBackground(Color.green);
                        btColor.setForeground(Color.black);

                    } else {
                        btColor.setBackground(Color.BLACK);
                        btColor.setForeground(Color.green);
                    }
                    System.out.println(Pen);

                } else {
                    System.out.println("Pen broken ,please ,  CREATE new Pen");
                }
            }
        });

        btBrend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Pen.broke == false){
                    Pen.ChangeBre();
                    System.out.println(Pen);
                }
                else {
                    System.out.println("Pen broken ,please ,  CREATE new Pen");
                }

            }
        });

        btEat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Pen.broke == false) {
                    Pen.Eat();
                    System.out.println(Pen);
                }
                else
                {
                    System.out.println("Pen broken ,please ,  CREATE new Pen");
                }
            }
        });



    }




}
