package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Pens {
    String color;
    int Pasta;
    int minuts;
    boolean broke;
    String Brend;
    int kkd = 2;

    public Pens() {
        Pasta = 100;
        color = "black";
        Brend = "Lecce_Pen";
        broke = false;

    }


    public String toString() {
        return " Pen : " +
                "percPasta = " + Pasta + "," + " Color = " + color + "," + "Brend = " +Brend +"," + " broke = " + broke ;

    }


    void write(int p) {
        minuts = p;
        int k = 0;
        if (broke == false) {
            for (int i = 1; i <= minuts; i++) {
                if (Pasta <= 0) {
                    System.out.println("NOPasta");
                    k++;
                    break;
                } else {
                    Pasta = Pasta - kkd;
                }

            }
            if (k == 1) {
                broke = true;
            }
        } else {
            System.out.println("PEN BROKEN");
        }
    }

    void ChangeCol() {
        if (color == "black") {
            color = "green";
            Pasta = 100;
        } else if (color == "green") {
            color = "black";
            Pasta = 100;
        }
    }

    void ChangeBre() {
        if (Brend == "Lecce_Pen") {
            Brend = "Parker_Pen";
            kkd = 1;
        } else if (Brend == "Parker_Pen") {
            Brend = "Lecce_Pen";
            kkd = 2;
        }
    }
}
public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("laba 2 ") ;
        window.setSize(100,230);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();


        JButton btWrite = new JButton("write");
        JButton btColor = new JButton("color");
        btColor.setBackground(Color.BLACK);
        btColor.setForeground(Color.green);
        JButton btBrend = new JButton("Brend");


        btWrite.setPreferredSize(new Dimension(100,50));
        btColor.setPreferredSize(new Dimension(100,50));
        btBrend.setPreferredSize(new Dimension(100,50));

        panel.add(btWrite);
        panel.add(btColor);
        panel.add(btBrend);
        window.add(panel);

        Pens Pen = new Pens();


        System.out.println(Pen);


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
                if (Pen.color =="green")
                {
                    btColor.setBackground(Color.green);
                    btColor.setForeground(Color.black);

                }
                else
                {
                    btColor.setBackground(Color.BLACK);
                    btColor.setForeground(Color.green);
                }

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
