package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JTextField text;
    JButton Submit, EXIT, CreateAccount ;

    Login(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setUndecorated(true);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource( "icons/Quiz.png"));
        Image i=i1.getImage().getScaledInstance(550,580,Image.SCALE_DEFAULT);
        ImageIcon i2= new ImageIcon(i);
        JLabel image=new JLabel(i2);
        image.setBounds(390, -50, 550, 680);
        add(image);

        JLabel heading = new JLabel("QUIZ TEST" );
        heading.setBounds(70,-160,350,500);
        heading.setFont(new Font( "Mongolian Baiti",Font.BOLD, 50));
        heading.setBackground(new Color(22,50,99));
        add(heading);

        JLabel name= new JLabel("Enter Your Name :");
        name.setBounds(100,200, 300,35);
        name.setFont(new Font("Times New Roman", Font.BOLD,25));
        name.setForeground(new Color(22,30,99));
        add(name);

        text = new JTextField();
        text.setBounds(50,260,300,35);
        text.setFont(new Font("Times New Roman",Font.BOLD,18));
        add(text);


        Submit=new JButton("Submit");
        Submit.setBounds(113,375,150,40);
        Submit.setBackground(new Color(22,45,99));
        Submit.setForeground(Color.WHITE);
        Submit.addActionListener(this);
        add(Submit);


        EXIT =new JButton("EXIT");
        EXIT.setBounds(130,425,120,40);
        EXIT.setBackground(new Color(22,45,99));
        EXIT.setForeground(Color.WHITE);
        EXIT.addActionListener(this);
        add(EXIT);

        setSize(920, 580);
        setLocation(190, 50);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Submit) {
            String name = text.getText();
            setVisible(false);
            new Rules(name);
        } else if (e.getSource() == EXIT) {
            System.exit(100);

        }
    }
        public static void main(String[] args) {
        new Login();
    }
}
