package Calculadora;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JDialog{

    private JLabel jLabel1 = new JLabel();
    private JTextField jTextField1 = new JTextField();
    private JButton jButton2 = new JButton();
    private JButton jButton1 = new JButton();
    private JButton jButton3 = new JButton();
    private JButton jButton4 = new JButton();
    private JButton jButton5 = new JButton();
    private JButton jButton6 = new JButton();
    private JButton jButton7 = new JButton();
    private JButton jButton8 = new JButton();
    private JButton jButton9 = new JButton();
    private JButton jButton10 = new JButton();
    private JButton jButton11 = new JButton();
    private JButton jButton12 = new JButton();
    private JButton jButton13 = new JButton();
    private JButton jButton14 = new JButton();
    private JButton jButton16 = new JButton();
    private JButton jButton17 = new JButton();
    private ArrayList<Integer> promedio = new ArrayList<Integer>();
    private int indnum=0;
    private int indope=0;
    private int op=0;
    private int op1=-1;
    private int op2=-1;
    private Funciones fu = new Funciones();
    
    public Calculadora() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void jbInit() throws Exception {
        this.setSize(new Dimension(393, 339));
        this.setLayout(null);
        jTextField1.setBounds(new Rectangle(6, 6, 378, 75));
        jTextField1.setEditable(false);
        jButton2.setText("=");
        jButton2.setBounds(new Rectangle(252, 252, 78, 51));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                res(e);
            }
        });
        jButton1.setText("9");
        jButton1.setBounds(new Rectangle(291, 189, 84, 54));
        jButton1.setActionCommand("9");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nueve(e);
            }
        });
        jButton3.setText("6");
        jButton3.setBounds(new Rectangle(291, 138, 87, 48));
        jButton3.setActionCommand("6");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seis(e);
            }
        });
        jButton4.setText("3");
        jButton4.setBounds(new Rectangle(291, 87, 87, 48));
        jButton4.setActionCommand("3");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tres(e);
            }
        });
        jButton5.setText("2");
        jButton5.setBounds(new Rectangle(198, 87, 87, 48));
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dos(e);
            }
        });
        jButton6.setText("5");
        jButton6.setBounds(new Rectangle(198, 138, 87, 48));
        jButton6.setActionCommand("5");
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cinco(e);
            }
        });
        jButton7.setText("8");
        jButton7.setBounds(new Rectangle(201, 189, 84, 54));
        jButton7.setActionCommand("8");
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ocho(e);
            }
        });
        jButton8.setText("1");
        jButton8.setBounds(new Rectangle(105, 87, 87, 48));
        jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                uno(e);
            }
        });
        jButton9.setText("4");
        jButton9.setBounds(new Rectangle(105, 138, 87, 48));
        jButton9.setActionCommand("4");
        jButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cuatro(e);
            }
        });
        jButton10.setText("7");
        jButton10.setBounds(new Rectangle(108, 192, 81, 48));
        jButton10.setActionCommand("7");
        jButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                siete(e);
            }
        });
        jButton11.setText("0");
        jButton11.setBounds(new Rectangle(156, 255, 81, 45));
        jButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cero(e);
            }
        });
        jButton12.setText("+");
        jButton12.setBounds(new Rectangle(12, 87, 87, 39));
        jButton12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                suma(e);
            }
        });
        jButton13.setText("-");
        jButton13.setBounds(new Rectangle(12, 132, 87, 39));
        jButton13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resta(e);
            }
        });
        jButton14.setText("*");
        jButton14.setBounds(new Rectangle(12, 177, 87, 39));
        jButton14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                multi(e);
            }
        });
        jButton16.setText("/");
        jButton16.setBounds(new Rectangle(12, 222, 87, 39));
        jButton16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                divi(e);
            }
        });
        jButton17.setText("promedio");
        jButton17.setBounds(new Rectangle(12, 270, 93, 39));
        jButton17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              promedio(e);
            }
        });
        this.getContentPane().add(jButton17, null);
        this.getContentPane().add(jButton16, null);
        this.getContentPane().add(jButton14, null);
        this.getContentPane().add(jButton13, null);
        this.getContentPane().add(jButton12, null);
        this.getContentPane().add(jButton11, null);
        this.getContentPane().add(jButton10, null);
        this.getContentPane().add(jButton9, null);
        this.getContentPane().add(jButton8, null);
        this.getContentPane().add(jButton7, null);
        this.getContentPane().add(jButton6, null);
        this.getContentPane().add(jButton5, null);
        this.getContentPane().add(jButton4, null);
        this.getContentPane().add(jButton3, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jLabel1, null);
    }
    
    public static void main(String[] args) {
        Calculadora frame = new Calculadora();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }


    private void uno(ActionEvent e) {
        if(indnum==0){
            String l= jTextField1.getText()+ "1";
            jTextField1.setText(l);
        }else if(indnum==1){
            jTextField1.setText("1");
            indnum=0;
        }
    }

    private void dos(ActionEvent e) {
        if(indnum==0){
            String l= jTextField1.getText()+ "2";
            jTextField1.setText(l);
        }else if(indnum==1){
            jTextField1.setText("2");
            indnum=0;
        }
    }

    private void tres(ActionEvent e) {
        if(indnum==0){
            String l= jTextField1.getText()+ "3";
            jTextField1.setText(l);
        }else if(indnum==1){
            jTextField1.setText("3");
            indnum=0;
        }
    }

    private void cuatro(ActionEvent e) {
        if(indnum==0){
            String l= jTextField1.getText()+ "4";
            jTextField1.setText(l);
        }else if(indnum==1){
            jTextField1.setText("4");
            indnum=0;
        }    
    }

    private void cinco(ActionEvent e) {
        if(indnum==0){
            String l= jTextField1.getText()+ "5";
            jTextField1.setText(l);
        }else if(indnum==1){
            jTextField1.setText("5");
            indnum=0;
        }
    }

    private void seis(ActionEvent e) {
        if(indnum==0){
            String l= jTextField1.getText()+ "6";
            jTextField1.setText(l);
        }else if(indnum==1){
            jTextField1.setText("6"); 
            indnum=0;
        }
    }

    private void siete(ActionEvent e) {
        if(indnum==0){
            String l= jTextField1.getText()+ "7";
            jTextField1.setText(l);
        }else if(indnum==1){
            jTextField1.setText("7");
            indnum=0;
        }
    }

    private void ocho(ActionEvent e) {
        if(indnum==0){
            String l= jTextField1.getText()+ "8";
            jTextField1.setText(l);
        }else if(indnum==1){
            jTextField1.setText("8");
            indnum=0;
        }
    }

    private void nueve(ActionEvent e) {    
        if(indnum==0){
            String l= jTextField1.getText()+ "9";
            jTextField1.setText(l);
        }else if(indnum==1){
            jTextField1.setText("9");
            indnum=0;
        }
    }

    private void cero(ActionEvent e) {
        if(indnum==0){
            String l= jTextField1.getText()+ "0";
            jTextField1.setText(l);
        }else if(indnum==1){
            jTextField1.setText("0");   
        }
    }

    private void suma(ActionEvent e) {
        op1 = Integer.parseInt(jTextField1.getText());
        jTextField1.setText("");
        op=1;
        indope=1;
    }

    private void resta(ActionEvent e) {
        op1 = Integer.parseInt(jTextField1.getText());
        jTextField1.setText("");
        op=2;
        indope=1;
    }

    private void multi(ActionEvent e) {
        op1 = Integer.parseInt(jTextField1.getText());
        jTextField1.setText("");
        op=3;
        indope=1;
    }

    private void divi(ActionEvent e) {
        op1 = Integer.parseInt(jTextField1.getText());
        jTextField1.setText("");
        op=4;
        indope=1;
    }

    private void res(ActionEvent e) {
        op2 = Integer.parseInt(jTextField1.getText());
        System.out.println(op1);
        System.out.println(op2);
        System.out.println(indnum);
        System.out.println(indope);
        float res=0;
        if(indope==1){
            if(op1!=-1 && op2 !=-1){
                if(op==1){
                    res=fu.suma(op1,op2);
                    jTextField1.setText(String.valueOf(res));
                }else if(op==2){
                    res=fu.resta(op1,op2);
                    jTextField1.setText(String.valueOf(res));
                }else if(op==3){
                    res=fu.mult(op1,op2);
                    jTextField1.setText(String.valueOf(res));
                }else if(op==4){
                    try {
                        res=fu.div(op1, op2);
                        jTextField1.setText(String.valueOf(res));  
                    } catch (Exception f) {
                        jTextField1.setText("Error !");
                    }          
                }
                op=0;
                op1=-1;
                op2=-1;
                indope=0;
                indnum=1;
            }
        }else if(indope==3){
            promedio.add(Integer.parseInt(jTextField1.getText()));
            jTextField1.setText("");
        }
    }

    private void promedio(ActionEvent e) {
        if(indope!=3){
            jTextField1.setText("");
            indope=3;
        }else{
            jTextField1.setText(String.valueOf(fu.PROMEDIO(promedio)));
            indope=0;
            indnum=1;
        }
    }

}
