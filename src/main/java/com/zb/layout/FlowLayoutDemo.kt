package com.zb.layout

import java.awt.Color
import java.awt.FlowLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

fun main() {
    val frame = JFrame("Flow布局")
    val panel = JPanel()
    for (i in 1..9) {
        JButton("$i").also { panel.add(it) }
    }

    panel.layout = FlowLayout(FlowLayout.LEADING, 20, 20)
    frame.add(panel)
    frame.setBounds(200, 200, 400, 400)
    frame.isVisible = true
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
}