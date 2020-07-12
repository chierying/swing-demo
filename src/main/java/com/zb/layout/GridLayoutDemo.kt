package com.zb.layout

import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

fun main() {
    val panel = JPanel(GridLayout(3, 3, 5, 5)).apply {
        for (i in 1..9) {
            add(JButton(i.toString()))
        }
    }

    JFrame("Grid布局").apply {
        setBounds(300, 300, 300, 300)
        add(panel)
        isVisible = true
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    }
}