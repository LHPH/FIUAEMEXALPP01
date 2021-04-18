package Calculadora;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HM extends JFrame{

    private JButton jButton1 = new JButton();

    public HM() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void jbInit() throws Exception {
        this.setSize(new Dimension(340, 113));
        this.setLayout(null);
        jButton1.setText("HM");
        jButton1.setBounds(new Rectangle(96, 24, 126, 36));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Hola(e);
            }
        });
        this.getContentPane().add(jButton1, null);
    }
    
    public static void main (String args[]){
        HM hm = new HM();
        hm.setLocationRelativeTo(null);
        hm.setVisible(true);
    }

    private void Hola(ActionEvent e) {
        HolaMundo holam = new HolaMundo();
        holam.setLocationRelativeTo(this);
        holam.setVisible(true);
    }
}
