package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {

    String questions[][] = new String[10][5];

    String answers[][] = new String[10][2];

    String useranswers[][] = new String[10][1];

    JLabel qno, Question;

    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup group;

    JButton next, submit, help;

    public static int timer = 15;

    public static int ans_given = 0;

    public static int count = 0;

    public static int score = 0;

    public static int correctAnswers = 0;

    public static int incorrectAnswers = 0;

    String name;


    Quiz(String name) {

        this.name = name;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Head.jpg"));
        JLabel imgg = new JLabel(i1);
        imgg.setBounds(0, 0, 1000, 240);
        add(imgg);


        qno = new JLabel();
        qno.setBounds(100, 280, 50, 30);
        qno.setBackground(new Color(22, 3, 30));
        qno.setForeground(new Color(245, 243, 246));
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);

        Question = new JLabel();
        Question.setBounds(150, 280, 900, 30);
        Question.setBackground(new Color(22, 3, 30));
        Question.setForeground(new Color(245, 243, 246));
        Question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(Question);

        questions[0][0] = "Which one of the following is not a Java feature?";
        questions[0][1] = "Object-oriented";
        questions[0][2] = "Use of pointers";
        questions[0][3] = "Portable";
        questions[0][4] = "Dynamic and Extensible";

        questions[1][0] = "Number of primitive data types in Java are.?";
        questions[1][1] = "6";
        questions[1][2] = "7";
        questions[1][3] = "8";
        questions[1][4] = "9";

        questions[2][0] = " Who invented Java Programming? ";
        questions[2][1] = "Guido van Rossum";
        questions[2][2] = "James Gosling";
        questions[2][3] = "Dennis Ritchie";
        questions[2][4] = "Bjarne Stroustrup";

        questions[3][0] = "When an array is passed to a method, what does the method receive?";
        questions[3][1] = "A Copy of the array";
        questions[3][2] = "The reference of the array";
        questions[3][3] = "Length of the array";
        questions[3][4] = "Copy of first element";

        questions[4][0] = "Arrays in java are.?";
        questions[4][1] = "Object References";
        questions[4][2] = "Objects";
        questions[4][3] = "Primitive data type";
        questions[4][4] = "None";

        questions[5][0] = "When is the object created with new keyword?";
        questions[5][1] = "At compile time";
        questions[5][2] = "At Run time";
        questions[5][3] = "Depends on the code";
        questions[5][4] = "None";

        questions[6][0] = "Identify the corrected definition of a package.?";
        questions[6][1] = "collection of editing tools";
        questions[6][2] = "collection of classes";
        questions[6][3] = "collection of classes & interfaces";
        questions[6][4] = "collection of interfaces";

        questions[7][0] = "compareTo() returns";
        questions[7][1] = "True";
        questions[7][2] = "False";
        questions[7][3] = "An int value";
        questions[7][4] = "None";

        questions[8][0] = "To which of the following does the class string belong to.";
        questions[8][1] = "java.awt";
        questions[8][2] = "java.lang";
        questions[8][3] = "java.applet";
        questions[8][4] = "java.String";

        questions[9][0] = "Total constructor string class have.?";
        questions[9][1] = "3";
        questions[9][2] = "7";
        questions[9][3] = "13";
        questions[9][4] = "20";

        answers[0][1] = "use of pointers";
        answers[1][1] = "8";
        answers[2][1] = "James Gosling";
        answers[3][1] = "The reference of the array";
        answers[4][1] = "Objects";
        answers[5][1] = "At run time";
        answers[6][1] = "collection of classes & interfaces";
        answers[7][1] = "An int value";
        answers[8][1] = "java.lang";
        answers[9][1] = "13";

        opt1 = new JRadioButton();
        opt1.setBounds(130, 415, 287, 32);
        opt1.setBackground(new Color(51, 2, 73,215));
        opt1.setForeground(new Color(239, 235, 241));
        opt1.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(530, 415, 287, 32);
        opt2.setBackground(new Color(51, 2, 73,215));
        opt2.setForeground(new Color(242, 240, 243));
        opt2.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(130, 495, 287, 32);
        opt3.setBackground(new Color(51, 2, 73,215));
        opt3.setForeground(new Color(243, 240, 244));
        opt3.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(530, 495, 287, 32);
        opt4.setBackground(new Color(51, 2, 73, 215));
        opt4.setForeground(new Color(245, 243, 246));
        opt4.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(opt4);

        group = new ButtonGroup();
        group.add(opt1);
        group.add(opt2);
        group.add(opt3);
        group.add(opt4);

        next = new JButton("Next");
        next.setBounds(700, 615, 80, 20);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        add(next);

        submit = new JButton("Submit");
        submit.setBounds(800, 615, 80, 20);
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.BLACK);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        help = new JButton("Help");
        help.setBounds(120, 615, 110, 20);
        help.setBackground(Color.PINK);
        help.setForeground(new Color(26, 2, 37));
        help.addActionListener(this);
        add(help);

        start(count);


        setSize(1000, 700);
        setLocation(50, 0);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            ans_given = 1;
            if (group.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = group.getSelection().getActionCommand();

            }

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        } else if (e.getSource() == help) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            help.setEnabled(false);
        } else if (e.getSource() == submit) {
            ans_given = 1;
            if (group.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = group.getSelection().getActionCommand();
            }
            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time Left: " + timer + "s"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 21));
        if (timer > 0) {
            g.drawString(time, 750, 370);
        } else {
            g.drawString("Times up !!", 750, 370);
        }
        timer--; //14

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception E) {
            E.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (group.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = group.getSelection().getActionCommand();
                }

                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1]))
                    {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { //next Button
                if (group.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = group.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }

        }
    }

    public void start(int count){
        qno.setText("" +(count+1)+". ");
        Question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        group.clearSelection();

    }

    public static void main(String[] args) {
        new Quiz("User");
    }
}
