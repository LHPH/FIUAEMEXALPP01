package AreaVolumen;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Pantalla extends JFrame {
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    private JTextField jTextField1 = new JTextField();
    private JTextField jTextField2 = new JTextField();
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JTextArea jTextArea1 = new JTextArea();
    private JButton jButton3 = new JButton();
    private JButton jButton4 = new JButton();

    public Pantalla() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(492, 334));
        jButton1.setText("Area de Triangulo");
        jButton1.setBounds(new Rectangle(35, 40, 190, 35));
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
                }
            });
        jButton2.setText("Volumen de Esfera");
        jButton2.setBounds(new Rectangle(245, 40, 195, 35));
        jButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton2_actionPerformed(e);
                }
            });
        jTextField1.setBounds(new Rectangle(95, 145, 70, 30));
        jTextField1.setVisible(false);
        jTextField2.setBounds(new Rectangle(350, 145, 70, 30));
        jTextField2.setVisible(false);
        jLabel1.setBounds(new Rectangle(30, 145, 50, 30));
        jLabel1.setVisible(false);
        jLabel2.setText("Altura");
        jLabel2.setBounds(new Rectangle(300, 145, 40, 35));
        jLabel2.setVisible(false);
        jTextArea1.setBounds(new Rectangle(245, 230, 115, 35));
        jTextArea1.setVisible(false);
        jButton3.setText("Realizar");
        jButton3.setBounds(new Rectangle(125, 235, 105, 30));
        jButton3.setVisible(false);
        jButton3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton3_actionPerformed(e);
                }
            });
        jButton4.setText("Realizar");
        jButton4.setBounds(new Rectangle(125, 235, 105, 30));
        jButton4.setVisible(false);
        jButton4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton4_actionPerformed(e);
                }
            });
        this.getContentPane().add(jButton4, null);
        this.getContentPane().add(jButton3, null);
        this.getContentPane().add(jTextArea1, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jTextField2, null);
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jButton1, null);
    }

    private void jButton1_actionPerformed(ActionEvent e) {
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jLabel1.setText("Base");
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jTextArea1.setVisible(true);
        jButton3.setVisible(true);
    }
    
    public static void  main (String args[]){
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
        JFrame pantalla = new Pantalla();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        pantalla.setResizable(false);
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }

    private void jButton3_actionPerformed(ActionEvent e) {
        if(!jTextField1.getText().equals("")&&!jTextField2.getText().equals("")){
            //////////////////////////////////////////Tomar base de jTextField1 y Altura de jTextField2
        }
        else
            JOptionPane.showMessageDialog(null, "Debe agregar base y altura");
    }

    private void jButton2_actionPerformed(ActionEvent e) {
        jTextField1.setVisible(true);
        jTextField2.setVisible(false);
        jLabel1.setText("Radio");
        jLabel1.setVisible(true);
        jLabel2.setVisible(false);
        jTextArea1.setVisible(true);
        jButton4.setVisible(true);    
    }

    private void jButton4_actionPerformed(ActionEvent e) {
        if(!jTextField1.getText().equals("")){
            //////////////////////////////////////////Tomar radio de JtextField1        
        }
        else
            JOptionPane.showMessageDialog(null, "Debe agregar radio");
    }
}
