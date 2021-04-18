package Principal;

import AreaVolumen.PantallaP;

import Operaciones.*;
import Calculadora.*;

import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Principal extends JFrame{
    private JLabel jLabel1 = new JLabel();
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();

    public Principal() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void jbInit() throws Exception {
        this.setSize(new Dimension(513, 137));
        this.setLayout(null);
        jLabel1.setText("Seleccione una Opcion:");
        jLabel1.setBounds(new Rectangle(138, 12, 195, 39));
        jLabel1.setFont(new Font("Times New Roman", 3, 18));
        jButton1.setText("Calculadora");
        jButton1.setBounds(new Rectangle(24, 63, 219, 33));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Calculadora(e);
            }
        });
        jButton2.setText("Operaciones");
        jButton2.setBounds(new Rectangle(261, 66, 219, 30));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton2_actionPerformed(e);
            }
        });
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jLabel1, null);
    }
    
    public static void main (String args[]){
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
        Principal p = new Principal();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }

    private void Calculadora(ActionEvent e) {
        Calculadora C = new Calculadora();
        C.setLocationRelativeTo(null);
        C.setResizable(false);
        C.setModal(true);
        C.setVisible(true);
    }

    private void jButton2_actionPerformed(ActionEvent e) {
        PantallaP pantalla = new PantallaP();
        pantalla.setLocationRelativeTo(null);
        pantalla.setResizable(false);   
        pantalla.setVisible(true);
    }
    
}
