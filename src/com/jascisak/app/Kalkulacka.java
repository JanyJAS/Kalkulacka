package com.jascisak.app;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulacka {
    static int zr = 25;
    static Color color1 = new Color(35, 38, 38);
    static Color color2 = new Color(70, 75, 75);
    static Color color3 = new Color(197, 217, 222);

    public static void btnSet(JButton jb) {
        jb.setFont(new Font("Monaco", Font.BOLD, 2 * zr));
        jb.setBackground(color2);
        jb.setForeground(color3);
        jb.setOpaque(true);

    }

    public static void main(String[] args) {


        JFrame frame = new JFrame("Kalkulačka");
        frame.setMinimumSize(new Dimension(34 * zr, 27 * zr));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(color1);
        frame.setContentPane(panel);


        // JText
        JTextField textField = new JTextField();
        textField.setBounds(3 * zr, 3 * zr, 27 * zr, 3 * zr); // x, y, sirka, vyska
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        textField.setFont(new Font("Monaco", Font.BOLD, 2 * zr));
        textField.setBackground(color3);
        textField.setForeground(color2);
        panel.add(textField);

        JButton btnNum7 = new JButton("7");
        btnNum7.setBounds(3 * zr, 7 * zr, 6 * zr, 3 * zr);
        btnSet(btnNum7);
        panel.add(btnNum7);
        btnNum7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "7");
            }
        });
        JButton btnNum8 = new JButton("8");
        btnNum8.setBounds(10 * zr, 7 * zr, 6 * zr, 3 * zr);
        btnSet(btnNum8);
        panel.add(btnNum8);
        btnNum8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "8");
            }
        });
        JButton btnNum9 = new JButton("9");
        btnNum9.setBounds(17 * zr, 7 * zr, 6 * zr, 3 * zr);
        btnSet(btnNum9);
        panel.add(btnNum9);
        btnNum9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "9");
            }
        });
        JButton btnAc = new JButton("AC");
        btnAc.setBounds(24 * zr, 7 * zr, 6 * zr, 3 * zr);
        btnSet(btnAc);
        panel.add(btnAc);
        btnAc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        JButton btnNum4 = new JButton("4");
        btnNum4.setBounds(3 * zr, 11 * zr, 6 * zr, 3 * zr);
        btnSet(btnNum4);
        panel.add(btnNum4);
        btnNum4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "4");
            }
        });
        JButton btnNum5 = new JButton("5");
        btnNum5.setBounds(10 * zr, 11 * zr, 6 * zr, 3 * zr);
        btnSet(btnNum5);
        panel.add(btnNum5);
        btnNum5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "5");
            }
        });
        JButton btnNum6 = new JButton("6");
        btnNum6.setBounds(17 * zr, 11 * zr, 6 * zr, 3 * zr);
        btnSet(btnNum6);
        panel.add(btnNum6);
        btnNum6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "6");
            }
        });
        JButton btnMultiply = new JButton("*");
        btnMultiply.setBounds(24 * zr, 11 * zr, 6 * zr, 3 * zr);
        btnSet(btnMultiply);
        panel.add(btnMultiply);
        btnMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "*");
            }
        });

        JButton btnNum1 = new JButton("1");
        btnNum1.setBounds(3 * zr, 15 * zr, 6 * zr, 3 * zr);
        btnSet(btnNum1);
        panel.add(btnNum1);
        btnNum1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "1");
            }
        });
        JButton btnNum2 = new JButton("2");
        btnNum2.setBounds(10 * zr, 15 * zr, 6 * zr, 3 * zr);
        btnSet(btnNum2);
        panel.add(btnNum2);
        btnNum2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "2");
            }
        });
        JButton btnNum3 = new JButton("3");
        btnNum3.setBounds(17 * zr, 15 * zr, 6 * zr, 3 * zr);
        btnSet(btnNum3);
        panel.add(btnNum3);
        btnNum3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "3");
            }
        });
        JButton btnMinus = new JButton("-");
        btnMinus.setBounds(24 * zr, 15 * zr, 6 * zr, 3 * zr);
        btnSet(btnMinus);
        panel.add(btnMinus);
        btnMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "-");
            }
        });

        JButton btnNum0 = new JButton("0");
        btnNum0.setBounds(3 * zr, 19 * zr, 6 * zr, 3 * zr);
        btnSet(btnNum0);
        panel.add(btnNum0);
        btnNum0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "0");
            }
        });
        JButton btnDot = new JButton(".");
        btnDot.setBounds(10 * zr, 19 * zr, 6 * zr, 3 * zr);
        btnSet(btnDot);
        panel.add(btnDot);
        btnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ".");
            }
        });
        JButton btnEquals = new JButton("=");
        btnEquals.setBounds(17 * zr, 19 * zr, 6 * zr, 3 * zr);
        btnSet(btnEquals);
        panel.add(btnEquals);
        btnEquals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ScriptEngineManager factory = new ScriptEngineManager();
                ScriptEngine engine = factory.getEngineByName("nashorn");
                String vzorec = textField.getText();
                try {
                    textField.setText(engine.eval(vzorec).toString());
                } catch (ScriptException e1) {
                    textField.setText("ERROR");
                    throw new RuntimeException(e1);
                }
            }
        });
        JButton btnPlus = new JButton("+");
        btnPlus.setBounds(24 * zr, 19 * zr, 6 * zr, 3 * zr);
        btnSet(btnPlus);
        panel.add(btnPlus);
        btnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "+");
            }
        });

        JButton btnInfo = new JButton("info");
        btnInfo.setBounds(3 * zr, 1 * zr, 3 * zr, 1 * zr);
        btnInfo.setFont(new Font("Monaco", Font.ITALIC, zr / 3));
        btnInfo.setBackground(color2);
        btnInfo.setForeground(color3);
        btnInfo.setOpaque(true);
        panel.add(btnInfo);
        btnInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDialog d = new JDialog(frame, "info");
                JTextArea t = new JTextArea("Tento program bol vytvorený v rámci kurzu Java Development Junior. Jedná sa o test.");
                t.setLineWrap(true);
                t.setMargin(new Insets(10, 10, 10, 10));
                d.add(t);
                d.setLocationRelativeTo(null);
                d.setSize(300, 100);
                d.setVisible(true);
            }
        });
        frame.pack();
        frame.setVisible(true);

    }

}