package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;






     class Pens extends JPanel {
        Color color;
        String Brend;
        String TypeOfPen;
        int numbOfPen;
        int Width;
        int Height;

        Pens() {
            numbOfPen = 0;
            Brend = "Lecce_Pen";
            TypeOfPen = "feather";
            Height = 300;
            Width = 300;

        }

        public String toString() {
            return " Pen : " + "\n" +
                    "Number of Pen = " + numbOfPen + "\n" + " Type = " + TypeOfPen + "\n" + "Brend = " + Brend + "\n";
        }

        void setPenWidth(int PenWingt) {
            this.Width = PenWingt;
        }

        void setPenHeight(int PenHeight) {
            this.Height = PenHeight;
        }

        void setColor(Color col) {
            this.color = col;
        }

        void setNumbOfPen(int numb) {
            this.numbOfPen = numb;
        }

        void setBrend(String bre) {
            this.Brend = bre;
        }

        void setTypeOfPen(String type) {
            this.TypeOfPen = type;
        }

        public void paint(Graphics g) {
            int h = Height;
            int w = Width;
            g.setColor(color);
            g.drawOval(0, 30, h, w);


        }


        public void draw_window(Pens pen, JFrame window) {
            String[] Brend = {
                    "Lecce_Pen",
                    "Parker_Pen",
                    "AURORA"
            };


            String[] Type = {
                    "feather",
                    "rollers",
                    "ball-point"
            };


            JFrame windowTwo = new JFrame("BuyPen");
            windowTwo.setSize(500, 800);

            windowTwo.setLocationRelativeTo(null);
            windowTwo.setLayout(null);
            windowTwo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            //btBuy
            JButton btBuy = new JButton("Buy");
            btBuy.setBounds(200, 100, 80, 25);
            windowTwo.add(btBuy);

            // btSize
            JButton btSize = new JButton("Size");
            btSize.setBounds(20, 175, 80, 25);
            windowTwo.add(btSize);

            //draw
            pen.setBounds(0, 300, 800, 800);
            windowTwo.add(pen);

            //Height
            JLabel HLabel = new JLabel("Height");
            HLabel.setBounds(20, 75, 100, 25);
            windowTwo.add(HLabel);

            JTextField TxtHeight = new JTextField("0");
            TxtHeight.setBounds(20, 100, 100, 25);
            windowTwo.add(TxtHeight);
            //Width
            JLabel WLabel = new JLabel("Width");
            WLabel.setBounds(20, 125, 100, 25);
            windowTwo.add(WLabel);

            JTextField TxtWidth = new JTextField("0");
            TxtWidth.setBounds(20, 150, 100, 25);
            windowTwo.add(TxtWidth);

            //color

            JButton btColor = new JButton("Color");
            btColor.setBounds(120, 100, 80, 25);
            windowTwo.add(btColor);


            JLabel LPen = new JLabel("number of Pen");
            LPen.setBounds(20, 5, 100, 30);
            windowTwo.add(LPen);

            JTextField numbPen = new JTextField("0");
            numbPen.setBounds(20, 40, 100, 25);
            windowTwo.add(numbPen);


            //type
            JLabel LType = new JLabel("Type of Pen");
            LType.setBounds(122, 5, 80, 30);
            windowTwo.add(LType);

            JComboBox BoxTypeVar = new JComboBox(Type);
            BoxTypeVar.setBounds(120, 40, 80, 25);
            windowTwo.add(BoxTypeVar);

            //brend
            JLabel LBrend = new JLabel("Brend");
            LBrend.setBounds(200, 5, 100, 30);
            windowTwo.add(LBrend);

            JComboBox BoxBreVar = new JComboBox(Brend);
            BoxBreVar.setBounds(200, 40, 100, 25);
            windowTwo.add(BoxBreVar);

            //inform
            JTextArea Information = new JTextArea();
            Information.setBounds(280, 100, 200, 100);
            windowTwo.add(Information);

            //btExit
            JButton btExit = new JButton("exit");
            btExit.setBounds(280, 200, 80, 25);
            windowTwo.add(btExit);


            btExit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    windowTwo.dispose();
                    window.setVisible(true);

                }
            });


            btColor.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Color choosenColor = JColorChooser.showDialog(null, "Choose color", Color.white);
                    if (choosenColor != null) {
                        pen.setColor(choosenColor);
                        pen.setOpaque(true);

                        windowTwo.repaint();

                    }
                }
            });

            btSize.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    pen.setPenHeight(Integer.valueOf(TxtHeight.getText().toString()));
                    pen.setPenWidth(Integer.valueOf(TxtWidth.getText().toString()));
                    windowTwo.repaint();
                }
            });


            btBuy.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pen.setBrend(BoxBreVar.getSelectedItem().toString());
                    pen.setTypeOfPen(BoxTypeVar.getSelectedItem().toString());
                    pen.setNumbOfPen(Integer.valueOf(numbPen.getText().toString()));
                    Information.setText(null);
                    Information.append(pen + "");
                }
            });


            windowTwo.setVisible(true);
        }
    }


     class Felt_tip_pen extends Pens {
        String Packing_type;
        String Form;
        String Type_caps;

        Felt_tip_pen() {
            Packing_type = "cardboard box";
            Form = "round";
            Type_caps = "with a ventilated";
        }

        public String toString() {
            return " Felt_Pen : " + "\n" +
                    "Number of Felt = " + numbOfPen + "\n" + " Type = " + TypeOfPen + "\n" + "Brend = " + Brend + "\n" + "Packing_type = " + Packing_type + "\n"
                    + "Form of Felt_Pen = " + Form + "\n" + "Type caps = " + Type_caps;
        }


        void setPacking_type(String Packing) {
            this.Packing_type = Packing;
        }

        void setForm(String F) {
            this.Form = F;
        }

        void setType_caps(String Caps) {
            this.Type_caps = Caps;
        }


        public void paint(Graphics g) {
            int w = Width;
            int h = Height;
            g.setColor(color);
            g.drawRect(0, 30, w, h);


        }




                                                    public void draw_Felt_window(Felt_tip_pen felt  ,JFrame window) {
                                                        String[] Brend = {
                                                                " KOH-I-NOOR",
                                                                "Faber Castell",
                                                                "Staedler",
                                                                "Lyra"
                                                        };


                                                        String[] Type = {
                                                                "watercolor",
                                                                "changeColor",
                                                                "withEffects"
                                                        };

                                                        String[] Pucking_Type = {
                                                                "blister",
                                                                "carton",
                                                                "plastic packaging"
                                                        };

                                                        String[] Form_Type = {
                                                                "round",
                                                                "hexagons",
                                                                "triquetrous"
                                                        };

                                                        String[] Type_caps = {
                                                                "with ventilated ",
                                                                "non-ventilated cap"
                                                        };

                                                        JFrame windowTwo = new JFrame("BuyFeltPen");
                                                        windowTwo.setSize(500, 800);

                                                        windowTwo.setLocationRelativeTo(null);
                                                        windowTwo.setLayout(null);
                                                        windowTwo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                                                        //btBuy
                                                        JButton btBuy = new JButton("Buy");
                                                        btBuy.setBounds(200, 100, 80, 25);
                                                        windowTwo.add(btBuy);

                                                        // btSize
                                                        JButton btSize = new JButton("Size");
                                                        btSize.setBounds(20, 175, 80, 25);
                                                        windowTwo.add(btSize);

                                                        //draw
                                                        felt.setBounds(0, 300, 800, 800);
                                                        windowTwo.add(felt);

                                                        //Height
                                                        JLabel HLabel = new JLabel("Height");
                                                        HLabel.setBounds(20, 75, 100, 25);
                                                        windowTwo.add(HLabel);

                                                        JTextField TxtHeight = new JTextField("0");
                                                        TxtHeight.setBounds(20, 100, 100, 25);
                                                        windowTwo.add(TxtHeight);
                                                        //Width
                                                        JLabel WLabel = new JLabel("Width");
                                                        WLabel.setBounds(20, 125, 100, 25);
                                                        windowTwo.add(WLabel);

                                                        JTextField TxtWidth = new JTextField("0");
                                                        TxtWidth.setBounds(20, 150, 100, 25);
                                                        windowTwo.add(TxtWidth);

                                                        //color

                                                        JButton btColor = new JButton("Color");
                                                        btColor.setBounds(120, 100, 80, 25);
                                                        windowTwo.add(btColor);


                                                        JLabel LPen = new JLabel("number of Felt_Pen");
                                                        LPen.setBounds(20, 5, 100, 30);
                                                        windowTwo.add(LPen);

                                                        JTextField numbPen = new JTextField("0");
                                                        numbPen.setBounds(20, 40, 100, 25);
                                                        windowTwo.add(numbPen);


                                                        //type
                                                        JLabel LType = new JLabel("Type of Felt_Pen");
                                                        LType.setBounds(122, 5, 80, 30);
                                                        windowTwo.add(LType);

                                                        JComboBox BoxTypeVar = new JComboBox(Type);
                                                        BoxTypeVar.setBounds(120, 40, 100, 25);
                                                        windowTwo.add(BoxTypeVar);

                                                        //brend
                                                        JLabel LBrend = new JLabel("Brend");
                                                        LBrend.setBounds(230, 5, 100, 30);
                                                        windowTwo.add(LBrend);

                                                        JComboBox BoxBreVar = new JComboBox(Brend);
                                                        BoxBreVar.setBounds(220, 40, 100, 25);
                                                        windowTwo.add(BoxBreVar);


                                                        //setPacking_type
                                                        JComboBox BoxPackingVar = new JComboBox(Pucking_Type);
                                                        BoxPackingVar.setBounds(320, 40, 70, 25);
                                                        windowTwo.add(BoxPackingVar);
                                                        //setForm
                                                        JComboBox BoxFormVar = new JComboBox(Form_Type);
                                                        BoxFormVar.setBounds(390, 40, 70, 25);
                                                        windowTwo.add(BoxFormVar);
                                                        //SetCaps
                                                        JComboBox BoxCapsVar = new JComboBox(Type_caps);
                                                        BoxCapsVar.setBounds(320, 65, 110, 25);
                                                        windowTwo.add(BoxCapsVar);


                                                        //inform
                                                        JTextArea Information = new JTextArea();
                                                        Information.setBounds(280, 100, 200, 120);
                                                        windowTwo.add(Information);

                                                        //btExit
                                                        JButton btExit = new JButton("exit");
                                                        btExit.setBounds(280, 220, 80, 25);
                                                        windowTwo.add(btExit);


                                                        btExit.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                windowTwo.dispose();
                                                                window.setVisible(true);

                                                            }
                                                        });


                                                        btColor.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                Color choosenColor = JColorChooser.showDialog(null, "Choose color", Color.white);
                                                                if (choosenColor != null) {
                                                                    felt.setColor(choosenColor);
                                                                    felt.setOpaque(true);

                                                                    windowTwo.repaint();

                                                                }
                                                            }
                                                        });

                                                        btSize.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {

                                                                felt.setPenHeight(Integer.valueOf(TxtHeight.getText().toString()));
                                                                felt.setPenWidth(Integer.valueOf(TxtWidth.getText().toString()));
                                                                windowTwo.repaint();
                                                            }
                                                        });


                                                        btBuy.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                felt.setBrend(BoxBreVar.getSelectedItem().toString());
                                                                felt.setTypeOfPen(BoxTypeVar.getSelectedItem().toString());
                                                                felt.setNumbOfPen(Integer.valueOf(numbPen.getText().toString()));

                                                                felt.setPacking_type(BoxPackingVar.getSelectedItem().toString());
                                                                felt.setType_caps(BoxCapsVar.getSelectedItem().toString());
                                                                felt.setForm(BoxFormVar.getSelectedItem().toString());

                                                                Information.setText(null);
                                                                Information.append(felt + "");
                                                            }
                                                        });


                                                        windowTwo.setVisible(true);
                                                    }


               public   void windowD() {

            JFrame window = new JFrame("Laba5");
            window.setSize(215, 88);
            window.setLocationRelativeTo(null);

            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            window.setLayout(null);
            JButton btCreatePen = new JButton("create Pen");

            btCreatePen.setBounds(0, 0, 100, 50);
            window.add(btCreatePen);

            JButton btCreateFelt = new JButton("create Felt");

            btCreateFelt.setBounds(100, 0, 100, 50);
            window.add(btCreateFelt);

            window.setVisible(true);


            btCreatePen.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    Pens Pen = new Pens();


                    Pen.draw_window(Pen, window);
//                    window.dispose();
                    window.setVisible(false);

                }
            });


            btCreateFelt.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    Felt_tip_pen Felt_Pen = new Felt_tip_pen();
                    Felt_Pen.draw_Felt_window(Felt_Pen,window);
                    window.dispose();


                }
            });

        }


    }







public class Main {

    public static void main(String[] args) {


        Felt_tip_pen felt_p = new Felt_tip_pen() ;
        felt_p.windowD();


    }
}
