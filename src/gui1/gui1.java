package gui1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class gui1 {
    private JButton oke;
    private JPanel gui;

    public gui1(){
        oke.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hi beb");

            }
        });
        oke.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null,"oke");
            }
        });
    }

    public static void main(String[] args) {
        JFrame myframe = new JFrame("Program Ilmi Punya");
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setContentPane(new gui1().gui);
        myframe.setVisible(true);
    }
}
