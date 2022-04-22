package com.zb.exam.prepare;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridBagLayoutDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("测试窗口");

        GridBagLayout gridBagLayout = new GridBagLayout();    // 布局管理器
        frame.setLayout(gridBagLayout);

        final JTextField tf1 = new JTextField();
        final JTextField tf2 = new JTextField();
        final JTextField tf3 = new JTextField();

        final JButton bt1 = new JButton("Start");
        final JButton bt2 = new JButton("Clear");


        GridBagConstraints c = null;                    // 约束

        c = new GridBagConstraints(0, 0, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
        frame.add(tf1);
        gridBagLayout.setConstraints(tf1, c);

        c = new GridBagConstraints(1, 0, 1, 1, 1, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
        frame.add(tf2);
        gridBagLayout.setConstraints(tf2, c);

        c = new GridBagConstraints(0, 1, 2, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
        frame.add(tf3);
        gridBagLayout.setConstraints(tf3, c);


        c = new GridBagConstraints(0, 2, 1, 1, 1, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
        frame.add(bt1);
        gridBagLayout.setConstraints(bt1, c);
        bt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bt1) {
                    String text = tf1.getText() + tf2.getText();
                    tf3.setText(text);
                }
            }
        });


        c = new GridBagConstraints(1, 2, 1, 1, 1, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
        frame.add(bt2);
        gridBagLayout.setConstraints(bt2, c);
        bt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bt2) {
                    tf3.setText(null);
                }
            }
        });


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(200, 200, 400, 400);
        frame.setVisible(true);
    }
}
