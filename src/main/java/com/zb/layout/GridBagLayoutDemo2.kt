package com.zb.layout

import java.awt.Color
import java.awt.GridBagConstraints
import java.awt.GridBagLayout
import java.awt.Insets
import javax.swing.JFrame

fun main() {
    JFrame("GridBag布局").apply {
        layout = GridBagLayout()
        addButton("Button 1", gbc(0, 0, 1, 1) {
            fill = GridBagConstraints.HORIZONTAL
            weightx = 0.5
            background= Color.RED
        })
        addButton("Button 2", gbc(1, 0, 1, 1) {
            fill = GridBagConstraints.HORIZONTAL
            weightx = 0.5
            background= Color.RED
        })
        addButton("Button 3", gbc(2, 0, 1, 1) {
            fill = GridBagConstraints.HORIZONTAL
            weightx = 0.5
            background= Color.RED
        })
        addButton("Large Button 4", gbc(0, 1, 3, 1) {
            fill = GridBagConstraints.BOTH
            ipady = 40
            background= Color.RED
        })
        addButton("Button 5", gbc(1, 2, 2, 1) {
            weighty = 1.0
            fill = GridBagConstraints.HORIZONTAL
            anchor = GridBagConstraints.SOUTH
            insets = Insets(10, 10, 10, 10)
            background= Color.RED
        })
        setBounds(200, 200, 300, 300)
        contentPane.background = Color.GREEN
        isVisible = true
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    }
}