package Principal;

import AreaVolumen.PantallaP;

import Hora.*;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PruebaTiempo1 extends JFrame {

    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JTextField jTextField1 = new JTextField();
    private JTextField jTextField2 = new JTextField();
    private JTextField jTextField3 = new JTextField();
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();

    public PruebaTiempo1() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void jbInit()throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(302, 232));
        jLabel1.setText("Hora:");
        jLabel1.setBounds(new Rectangle(81, 24, 75, 30));
        jLabel2.setText("Minuto:");
        jLabel2.setBounds(new Rectangle(81, 63, 78, 30));
        jLabel3.setText("Segundos:");
        jLabel3.setBounds(new Rectangle(81, 105, 75, 27));
        jTextField1.setBounds(new Rectangle(174, 33, 51, 21));
        jTextField2.setBounds(new Rectangle(174, 69, 51, 21));
        jTextField3.setBounds(new Rectangle(174, 105, 48, 21));
        jButton1.setText("Hora Estandar");
        jButton1.setBounds(new Rectangle(15, 147, 117, 27));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Calcular(e);
            }
        });
        jButton2.setText("Hora Universal");
        jButton2.setBounds(new Rectangle(162, 147, 120, 27));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Calcular2(e);
            }
        });
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jTextField3, null);
        this.getContentPane().add(jTextField2, null);
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);

    }
    
    public static void main(String args[]){
        PruebaTiempo1 pt1 = new PruebaTiempo1();
        pt1.setLocationRelativeTo(null);
        pt1.setVisible(true);
    }

    private void Calcular(ActionEvent e) {
        String h=jTextField1.getText();
        String m=jTextField2.getText();
        String s=jTextField3.getText();
        if(h.equals("")==true)
            h="0";
        if(m.equals("")==true)
            m="0";
        if(s.equals("")==true)
            s="0";
        Tiempo1 t = new Tiempo1(Integer.parseInt(h),Integer.parseInt(m),Integer.parseInt(s));
        JOptionPane.showMessageDialog(this,t.aStringEstandar(),"Hora Estandar",JOptionPane.INFORMATION_MESSAGE,null);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }

    private void Calcular2(ActionEvent e) {
        String h=jTextField1.getText();
        String m=jTextField2.getText();
        String s=jTextField3.getText();
        if(h.equals("")==true)
            h="0";
        if(m.equals("")==true)
            m="0";
        if(s.equals("")==true)
            s="0";
        Tiempo1 t = new Tiempo1(Integer.parseInt(h),Integer.parseInt(m),Integer.parseInt(s));
        JOptionPane.showMessageDialog(this,t.aStringUniversal(),"Hora Universal",JOptionPane.INFORMATION_MESSAGE,null);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }
}
