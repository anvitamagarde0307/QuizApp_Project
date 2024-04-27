package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener{

    JButton Start,back;

    String name;


    Rules(String name){

        this.name = name;


        JLabel heading =new JLabel("RULES: FOR QUIZ TEST");
        heading.setBounds(240,170, 700, 30);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 34));
        heading.setForeground(new Color(201, 204, 215));
        add(heading);

        JLabel rules =new JLabel();
        rules.setBounds(180,192, 700, 350);
        rules.setFont(new Font("New Times Roman", Font.PLAIN, 16));
        rules.setForeground(new Color(232, 221, 221));
        rules.setText(
                "<html>"+
                        "1. Participation in the quiz is free and open to all." + "<br><br>" +
                        "2. There are a total 10 questions. " + "<br><br>" +
                        "3. Each question carries 10 mark each." + "<br><br>" +
                        "4. You only have 15 seconds to answer each question.      " + "<br><br>" +
                        "5. No negative marking." + "<br><br>" +
                        "6. One Hint allowed for each Round(10 Questions)." + "<br><br>" +                 "<html>"
        );
        add(rules);

        back=new JButton("Back");
        back.setBounds(300, 500,100,30);
        back.setBackground(new Color(22,45,99));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        Start=new JButton("Start");
        Start.setBounds(450, 500,100,30);
        Start.setBackground(new Color(22, 45, 99));
        Start.setForeground(Color.WHITE);
        Start.addActionListener(this);
        add(Start);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/backg.jpg"));
        Image i=i1.getImage().getScaledInstance(800,650,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(0,0,800,650);
        add(image);



        setSize(800,650);
        setLocation(300,40);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){

       if(e.getSource()==Start){
           setVisible(false);
           new Quiz(name);

       }else {
           setVisible(false);
           new Login();
           
       }

    }

    public static  void main(String[] args)
    {
        new Rules( "User");

    }
}