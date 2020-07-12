package com.zb

import javax.swing.JFrame
import javax.swing.JLabel

fun main() {
    JFrame().apply {
        title = "Hello World"
        setBounds(200, 200, 300, 300)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        JLabel("Hello world").also { contentPane.add(it) }
        isVisible = true
    }
}