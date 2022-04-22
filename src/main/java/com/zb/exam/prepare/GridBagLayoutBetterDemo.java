package com.zb.exam.prepare;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.GridBagConstraints.*;

public class GridBagLayoutBetterDemo {

    public static void main(String[] args) {
        final JFrame frame = new JFrame("测试窗口");

        GridBagLayout gridBagLayout = new GridBagLayout();    // 布局管理器
        frame.setLayout(gridBagLayout);

        final JTextField tf1 = new JTextField();
        final JTextField tf2 = new JTextField();
        final JTextField tf3 = new JTextField();
        final JButton bt1 = new JButton("Start");
        final JButton bt2 = new JButton("Clear");


        GridBagConstraints c = null;                    // 约束

        // tf1
        c = new GridBagConstraints();
        frame.add(tf1);
        gridBagLayout.setConstraints(tf1, c);

        // tf2
        c = new GridBagConstraints();
        c.gridwidth = REMAINDER;     // 占据该行剩余空间，并自动换行
        frame.add(tf2);
        gridBagLayout.setConstraints(tf2, c);

        // tf3
        c = new GridBagConstraints();
        c.gridwidth = 2;
        c.fill = HORIZONTAL;
        frame.add(tf3);
        gridBagLayout.setConstraints(tf3, c);


        // bt1
        c = new GridBagConstraints();
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


        // bt2
        c = new GridBagConstraints();
        c.gridwidth = REMAINDER;
        frame.add(bt2);
        gridBagLayout.setConstraints(bt2, c);
        bt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bt2) {
                    tf3.setText(null);
                    frame.setVisible(false);
                    frame.dispose();
                }
            }
        });


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // frame.setBounds(200, 200, 400, 400);
        frame.pack();
        frame.setVisible(true);
    }
}
