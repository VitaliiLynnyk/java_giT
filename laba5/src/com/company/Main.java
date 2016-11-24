package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {


 static   class  Pens extends JPanel
    {
           Color Color ;
            String Brend;
            String TypeOfPen;

        Pens()
        {
            Color = java.awt.Color.blue ;
            Brend = "Lecce_Pen";
            TypeOfPen = "feather";
        }



        public void paint (Graphics g)
        {
            g.drawOval(50, 10, 100, 100);
        }


    }



    static class Felt_tip_pen extends  Pens
    {
         String Packing_type ;
          String Form ;
          String Type_caps;

                Felt_tip_pen()
                {
                    Packing_type = "cardboard box" ;
                    Form = "round" ;
                    Type_caps = "with a ventilated" ;
                    Color = java.awt.Color.GREEN;
                }



        public  void paint (Graphics g)
        {
            g.setColor(Color);
            g.drawRect(20,10,180,180);
            g.drawString(Form,60,60);

        }
    }






    public static void main(String[] args)
    {

        String[] ChooseClass = {
                "Pen",
                "Felt_tip_pen",
        };

        String[] ChooseColor = {
                Color.BLUE.toString(),
                Color.GREEN.toString()
        };


              JFrame window = new JFrame("Laba5");
              window.setSize(550, 500);
              window.setLocationRelativeTo(null);
              window.setVisible(true);
              window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);









        JPanel Panel = new JPanel();

        JComboBox BoxClass  = new JComboBox(ChooseClass);
        JComboBox BoxItem  = new JComboBox(ChooseColor);
        JTextArea Information = new JTextArea();

        JButton btCreate = new JButton("Create");

        window.setLayout(null);

        BoxClass.setBounds(20,5,100,30);
        window.getContentPane().add(BoxClass);

        BoxItem.setBounds(120,5,100,30);
        window.getContentPane().add(BoxItem);

        Panel.setBounds(50,100,500,500);
        window.add(Panel);

        btCreate.setBounds(120,38,100,30);
        window.getContentPane().add(btCreate);



        btCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if(BoxClass.getSelectedItem() == "Pen")
                {

                    Pens Pen = new Pens();
                    Panel.repaint();
                    Pen.setBounds(60,110,100,100);
                    Panel.add(Pen);


                 //   Information.append("" + Pen+ "\n");
                }
                else if ( BoxClass.getSelectedItem() == "Felt_tip_pen")
                {

                    Panel.repaint();
                    Felt_tip_pen feltPen = new Felt_tip_pen() ;
                    feltPen.setBounds(60,110,60,60);
                    Panel.add(feltPen);

                 //  Information.append("" + feltPen + "\n");
                }


            }
        });



    }
}
