package com.zb.layout

import java.awt.BorderLayout
import java.awt.CardLayout
import java.awt.Color
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.JTextField

fun main() {
    val p1 = JPanel().apply {
        add(JButton("登录"))
        add(JButton("注册"))
        add(JButton("找回密码"))
    }
    val p2 = JPanel().apply {
        add(JTextField("用户名", 20))
        add(JTextField("密码", 20))
        add(JTextField("验证码", 20))
    }
    val cards = JPanel(CardLayout()).apply {
        add(p1, "card1")
        add(p2, "card2")
    }
    val layout = cards.layout as CardLayout
    layout.show(cards, "card1")

    val menu = JPanel().apply {
        background = Color.GRAY
        val bt1 = JButton("card1")
        bt1.addActionListener { layout.show(cards, "card1") }
        val bt2 = JButton("card2")
        bt2.addActionListener { layout.show(cards, "card2") }
        add(bt1)
        add(bt2)
    }

    val frame = JFrame("Card布局").apply {
        add(cards, BorderLayout.CENTER)
        add(menu, BorderLayout.NORTH)
        setBounds(200, 200, 400, 400)
        isVisible = true
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    }
}