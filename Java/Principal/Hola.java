package Principal;

import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Hola extends JFrame {
    private JButton jButton1 = new JButton();
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();

    public Hola() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(312, 289));
        this.setLocationRelativeTo(null);
        jButton1.setText("Pulsame");
        jButton1.setBounds(new Rectangle(110, 170, 95, 35));
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
                }
            });
        jLabel1.setText("Hola Mundo");
        jLabel1.setBounds(new Rectangle(120, 20, 305, 45));
         jLabel1.setVisible(false);
        jLabel1.setFont(new Font("Tahoma",1,12));


        jLabel2.setText("Hello World");
        //jLabel2.setBounds(new Rectangle(25, 70, 320, 40));
        jLabel2.setBounds(new Rectangle(120, 65, 305, 45));
        jLabel2.setVisible(false);
        jLabel2.setFont(new Font("Tahoma",1,12));


        jLabel3.setText("\u3053\u3093\u306B\u3061\u306F \u305B\u304B\u3044");
        jLabel3.setBounds(new Rectangle(80, 110, 185, 45));
        jLabel3.setFont(new Font("Gulim",1,20));
        jLabel3.setVisible(false);

        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jButton1, null);
    }


    private void jButton1_actionPerformed(ActionEvent e) {
        //JOptionPane.showMessageDialog(this,"Hola Mundo","Hola Mundo",JOptionPane.INFORMATION_MESSAGE);
        
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        
    }
    
    public static void main(String...arg){
        Hola hola = new Hola();
        hola.setVisible(true);
    }
}
