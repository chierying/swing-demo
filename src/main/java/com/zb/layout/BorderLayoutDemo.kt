package com.zb.layout

import java.awt.BorderLayout
import javax.swing.JButton
import javax.swing.JFrame

fun main() {
    val frame = JFrame("布局管理器")
    frame.setSize(400, 200)
    frame.layout = BorderLayout()

    val bt1 = JButton("上")
    val bt2 = JButton("左")
    val bt3 = JButton("中")
    val bt4 = JButton("右")
    val bt5 = JButton("下")

    frame.add(bt1, BorderLayout.NORTH)
    frame.add(bt2, BorderLayout.WEST)
    frame.add(bt3, BorderLayout.CENTER)
    frame.add(bt4, BorderLayout.EAST)
    frame.add(bt5, BorderLayout.SOUTH)

    frame.setBounds(300, 300, 600, 300)
    frame.isVisible = true
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
}