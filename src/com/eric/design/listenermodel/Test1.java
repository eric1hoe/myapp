package com.eric.design.listenermodel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test1 extends JFrame {
	Test1() {
        JPanel panel = new JPanel();
        JButton button1 = new JButton("��ťһ");
        JButton button2 = new JButton("��ť��");

        panel.add(button1);
        panel.add(button2);
        this.getContentPane().add(panel);
        this.setVisible(true);

        button1.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("�㰴�˰�ťһ");
                    }
                });
        button2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("�㰴�˰�ť��");
                    }
                });
    }

    public static void main(String args[]) {
        new Test1();
    }
}