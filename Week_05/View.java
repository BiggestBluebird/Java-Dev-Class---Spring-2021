package com.batson_java_course_2021.Week_05;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame{
    private Controller controller;
    private String labelText;

    public View(Controller c) {
        this.controller = c;
        this.labelText = "Default label text";

        JTextField textField = new JTextField();
        textField.setColumns(50);
        add(textField);

        JLabel label = new JLabel(this.labelText);
        label.setSize(100, 100);
        add(label);

        JButton button = new JButton("Modify text");
        button.setSize(100, 100);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setLabelText(controller.modifyText(textField.getText()));
                label.setText(labelText);
            }
        });
        add(button);

        this.setSize(500, 500);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setLabelText(String t) {
        this.labelText = t;
    }
}