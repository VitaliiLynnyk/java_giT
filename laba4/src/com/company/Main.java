package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Pens {
    private String Color;
    private String Brend;
    private String Type_Pen;
    private String numberOfPen;
    private int price;

    public String toString() {
        return " Pen : " + "\n" +
                "Number of Pen = " + numberOfPen + "\n" + " Type = " + Type_Pen + "\n" + "Brend = " + Brend + "\n" + " Color = " + Color + "\n" + "Price = " + price;
    }

    public void setNumberOfPen(String numberOfPen) {
        this.numberOfPen = numberOfPen;
    }

    public String getNumberOfPen() {
        return numberOfPen;
    }

    public void setType_Pen(String type_Pen) {
        this.Type_Pen = type_Pen;
    }

    public String getType_Pen() {
        return Type_Pen;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getColor() {
        return Color;
    }

    public void setBrend(String Brend) {
        this.Brend = Brend;
    }

    public String getBrend() {
        return Brend;
    }


    public int getPrice()
    {
        return price;
    }

    public void setPrice( String numb, String col,String type ,String bren)
    {
        int i = 0 ;
        price = 0 ;
        int numbi=Integer.parseInt(numb);
        while  (i < numbi)
        {
            price = price + 10;
            i++;
        }

        if ( col ==  "Blue")
        {
            price = price + 5;
        }
        else if ( col ==  "Yellow")
        {
            price = price + 3 ;
        }
        else{
            price = price + 7 ;
        }


        if(bren ==  "Lecce_Pen")
        {
            price = price + 20 ;
        }
        else if (bren =="Parker_Pen" )
        {
            price = price + 40;
        }
        else
        {
            price = price + 30 ;
        }



        if(type ==  "feather")
        {
            price = price + 50;
        }
        else if ( type =="rollers" )
        {
            price = price + 30 ;
        }
        else {
            price = price + 30;
        }

    }

}
public class Main {

    public static void main(String[] args) {
        String[] numbColor = {
                "Blue",
                "Yellow",
                "Green"
        };

        String[] Brend = {
                "Lecce_Pen",
                "Parker_Pen",
                "AURORA"
        };

        String[]  Type = {
                "feather",
                "rollers",
                "ball-point"
        };








        JFrame window = new JFrame("laba 4 ");
        window.setSize(550, 300);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);






        JTextField strPen = new JTextField();

        JButton btBuy = new JButton("Buy");


        JComboBox BoxColVar  = new JComboBox(numbColor);
        JComboBox BoxBreVar  = new JComboBox(Brend);
        JComboBox BoxTypeVar  = new JComboBox(Type);
        JButton btCheck = new JButton("Check");

        JLabel LPen = new JLabel("number of Pen");
        JLabel LColor = new JLabel("Color");
        JLabel LBrend = new JLabel("Brend");
        JLabel LType  = new JLabel("Type of Pen");
        JTextArea Information = new JTextArea();

        window.setLayout(null);

        LPen.setBounds(20,5,100,30);
        window.add(LPen);

        strPen.setBounds(20,40,100,25);
        window.add(strPen);

        LType.setBounds(122,5,80,30);
        window.add(LType);

        BoxTypeVar.setBounds(120,40,80,25);
        window.add(BoxTypeVar);

        LBrend.setBounds(200,5,100,30);
        window.add(LBrend);

        BoxBreVar.setBounds(200,40,100,25);
        window.add(BoxBreVar);


        LColor.setBounds(300,5,100,30);
        window.add(LColor);


        BoxColVar.setBounds(300,40,100,25);
        window.add(BoxColVar);



        btCheck.setBounds(400,40,80,60);
        window.add(btCheck);


        btBuy.setBounds(470,40,60,60);
        window.add(btBuy);

        Information.setBounds(20,100,200,100);
        window.add(Information);




        Pens pen = new Pens();



        btCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pen.setBrend(BoxBreVar.getSelectedItem().toString());
                pen.setColor(BoxColVar.getSelectedItem().toString());
                pen.setType_Pen(BoxTypeVar.getSelectedItem().toString());
                pen.setNumberOfPen(strPen.getText().toString());
                pen.setPrice(pen.getNumberOfPen(), pen.getColor(), pen.getType_Pen(), pen.getBrend());




            }
        });


        btBuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (( pen.getBrend() == null) || (pen.getColor() == null) || (pen.getNumberOfPen() == "0")  || (pen.getType_Pen() == null)   || ( pen.getPrice() == 0 ))
                {
                    Information.setText("pen is not Check");
                }else{
                    Information.setText(null);
                    Information.append(pen + "");}


            }
        });











    }
}
