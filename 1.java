import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class main {

    public static void main(String[] args) {
        JFrame window = new JFrame("first laba");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,400);
        window.setVisible(true);
        JButton btn = new JButton("start");
        JTextField str1 = new JTextField();
        JTextField res = new JTextField();
        //��������� ����������
        window.getContentPane().add(str1);
        window.getContentPane().add(btn);
        window.getContentPane().add(res);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a;
                int k,i;

                k = 0;
                a = str1.getText();
                for (i = 0; i<a.length();i++)
                {
                    k++;
                }
                //System.out.println("large number of letters:"+ku+" number of small letters:"+kl);
                res.setText(" number :"+k);




            }
        });
    }
}
