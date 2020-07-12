package com.zb.layout

import java.awt.GridBagConstraints
import java.awt.GridBagLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JTextField

fun main() {
    val frame = JFrame("拨号盘")
    val layout = GridBagLayout()
    frame.layout = layout
    val tfConstraints = GridBagConstraints().apply {
        fill = GridBagConstraints.BOTH
        gridwidth = GridBagConstraints.REMAINDER
    }

    val tf = JTextField("123213123123").apply {
        layout.setConstraints(this, tfConstraints)
        frame.add(this)
    }

    val btConstraints = GridBagConstraints().apply {
        fill = GridBagConstraints.BOTH
        weightx = 5.0
        weighty = 2.0
    }
    val btEndConstraints = GridBagConstraints().apply {
        fill = GridBagConstraints.BOTH
        gridwidth = GridBagConstraints.REMAINDER
        weightx = 5.0
        weighty = 2.0
    }

    frame.addButton("7", btConstraints)
    frame.addButton("8", btConstraints)
    frame.addButton("9", btEndConstraints)
    frame.addButton("4", btConstraints)
    frame.addButton("5", btConstraints)
    frame.addButton("6", btEndConstraints)
    frame.addButton("1", btConstraints)
    frame.addButton("2", btConstraints)
    frame.addButton("3", btEndConstraints)
    frame.addButton("返回", btConstraints)
    frame.addButton("拨号", btEndConstraints)

    frame.setBounds(200, 200, 400, 400)
    frame.isVisible = true
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
}

fun JFrame.addButton(title: String, constraints: GridBagConstraints): JButton {
    val bt = JButton(title)
    (this.contentPane.layout as GridBagLayout).setConstraints(bt, constraints)
    add(bt)
    return bt
}
