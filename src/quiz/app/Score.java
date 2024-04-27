package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame {

    Score(String name, int score){

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/Trophy.jpg"));
        Image i2 = i1.getImage().getScaledInstance(250, 240, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20, 300, 250, 240);
        add(image);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/star.png"));
        Image i5 = i4.getImage().getScaledInstance(750,230, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel imagee = new JLabel(i6);
        imagee.setBounds(0,0,750,230);
        add(imagee);


        JLabel heading = new JLabel("ThankYou for Playing QUIZ Test");
        heading.setBounds(50, 214,700, 100);
        heading.setFont(new Font("Georgia", Font.BOLD, 40));
        heading.setForeground(new Color(227, 233, 245));
        add(heading);

        JLabel Score = new JLabel("Marks Scored : " + score);
        Score.setBounds(345, 380,300, 30);
        Score.setFont(new Font("Times New Roman", Font.BOLD, 26));
        Score.setForeground(Color.WHITE);
        add(Score);

        JLabel username = new JLabel("Name : " + name);
        username.setBounds(345, 330,300, 30);
        username.setFont(new Font("Times New Roman", Font.BOLD, 26));
        username.setForeground(Color.WHITE);
        add(username);

        JButton again = new JButton("PLAY AGAIN");
        again.setBounds(355, 504, 180, 30);
        again.setFont(new Font("Tahoma", Font.BOLD, 17));
        again.setBackground(Color.pink);
        again.setForeground(Color.BLACK);
        add(again);
        again.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();

            }
        });

        JButton exit = new JButton("EXIT");
        exit.setBounds(560, 504, 170, 30);
        exit.setFont(new Font("Tahoma", Font.BOLD, 18));
        exit.setBackground(Color.pink);
        exit.setForeground(Color.BLACK);
        add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setSize(750, 550);
        setLocation(300, 80);
        setLayout(null);
        setUndecorated(true);
        getContentPane().setBackground(new Color(26, 14, 50));
        setVisible(true);
    }
    public static void main(String[] args) {
         new Score("User",0);
    }
}
