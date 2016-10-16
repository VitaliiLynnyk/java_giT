import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("first laba");
        window.setSize(350,120);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.setVisible(true);
        JButton btn = new JButton("start");
        JTextField str1 = new JTextField();
        JTextField res = new JTextField();
        //створення компонентів
        window.getContentPane().add(str1,BorderLayout.CENTER);
        window.getContentPane().add(btn,BorderLayout.EAST);
        window.getContentPane().add(res,BorderLayout.SOUTH);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)  {
                String str;
                str = str1.getText();

                int i ;
                int  k = 0 ;
                char[] chArray = str.toCharArray();
                System.out.println("char = " + Arrays.toString(chArray));

                for( i = 0; i < chArray.length; i++)
                {
                    k=0;

                    for (int j=0; j<chArray.length;j++)


                        if ( chArray[i]  == chArray[j]  )
                        {
                            k++;
                        }

                    System.out.println(chArray[i] + " " + k);

                  //  break;
                }
            }









        });
    }
}
