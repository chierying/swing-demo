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
    val tf = JTextField("123213123123").apply {
        layout.setConstraints(this, gbc(0, 0, 3, 1) { fill = GridBagConstraints.HORIZONTAL })
        frame.add(this)
    }
    val labels = listOf<String>("7", "8", "9", "4", "5", "6", "1", "2", "3", "返回", "拨号")
    for ((i, l) in labels.withIndex()) {
        frame.addButton(l, gbc(i % 3, i / 3 + 1, 1, 1) {
            fill = GridBagConstraints.BOTH
            weightx = 1.0
            weighty = 1.0
            if (i == labels.size - 1) gridwidth = 2
        }).addActionListener { tf.text += (it.source as JButton).text }
    }
    frame.apply {
        setBounds(200, 200, 400, 400)
        isVisible = true
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    }
}

fun gbc(x: Int, y: Int, w: Int, h: Int, action: GridBagConstraints.() -> Unit = {}) = GridBagConstraints().apply {
    gridx = x
    gridy = y
    gridwidth = w
    gridheight = h
    action()
}
