import com.sun.j3d.utils.geometry.GeometryInfo;
import com.sun.j3d.utils.geometry.NormalGenerator;
import com.sun.j3d.utils.universe.SimpleUniverse;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.media.j3d.Alpha;
import javax.media.j3d.AmbientLight;
import javax.media.j3d.Appearance;
import javax.media.j3d.Background;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;

import javax.media.j3d.Geometry;
import javax.media.j3d.Material;
import javax.media.j3d.PointLight;
import javax.media.j3d.RotationInterpolator;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;

import javax.swing.SwingConstants;

import javax.vecmath.Color3f;
import javax.vecmath.Point3f;

import org.nfunk.jep.JEP;
import org.nfunk.jep.function.ArcSine;
import org.nfunk.jep.function.ArcSineH;
import org.nfunk.jep.function.Sine;
import org.nfunk.jep.function.SineH;

public class Graficadora3D extends JFrame {
    private JPanel jPanel1 = new JPanel();
    Parse parsex = new Parse();
    Parse parsey = new Parse();
    Parse parsez = new Parse();
    private GraphicsConfiguration graphicsConfiguration;
    private Canvas3D canvas;
    private SimpleUniverse simpleUniverse;
    private BranchGroup MyBranchGroup;
    private Alpha alpha;
    private JButton jButton1 = new JButton();
    private JLabel jLabel1 = new JLabel();
    private JTextField jTextField1 = new JTextField();
    private JLabel jLabel2 = new JLabel();
    private JButton jButton2 = new JButton();
    private JLabel jLabel3 = new JLabel();
    private JButton jButton3 = new JButton();
    private JButton jButton4 = new JButton();
    private JButton jButton5 = new JButton();
    private JButton jButton6 = new JButton();
    private JButton jButton7 = new JButton();
    private JButton jButton8 = new JButton();
    private JButton jButton12 = new JButton();
    private JButton jButton13 = new JButton();
    private JButton jButton14 = new JButton();
    private JButton jButton15 = new JButton();
    private JButton jButton16 = new JButton();
    private JButton jButton17 = new JButton();
    private JButton jButton18 = new JButton();
    private JButton jButton19 = new JButton();
    private JButton jButton21 = new JButton();
    private JButton jButton22 = new JButton();
    private JButton jButton23 = new JButton();
    private JButton jButton24 = new JButton();
    private JButton jButton9 = new JButton();
    private JButton jButton10 = new JButton();
    private JButton jButton11 = new JButton();
    private JButton jButton20 = new JButton();
    private JButton jButton25 = new JButton();
    private JButton jButton26 = new JButton();
    private JButton jButton27 = new JButton();
    private String[] numeros = new String[]{"0","1","2","3","4","5","6","7","8","9"};
    private JComboBox jComboBox1 = new JComboBox(numeros);
    private JButton jButton28 = new JButton();
    private JButton jButton29 = new JButton();
    private JButton jButton30 = new JButton();

    public Graficadora3D() {
        try {
            jbInit();
            establecer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(872, 534));
        this.getContentPane().setBackground(new Color(165, 165, 255));
        jPanel1.setBounds(new Rectangle(15, 12, 525, 477));
        jPanel1.setBackground(new Color(214, 231, 255));
        jButton1.setText("Detener Rotacion");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AD_Rotacion(e);
            }
        });
        jButton1.setBounds(new Rectangle(654, 459, 132, 24));
        jLabel1.setText("Ingrese la ecuacion:");
        jLabel1.setBounds(new Rectangle(552, 18, 249, 30));
        jLabel1.setFont(new Font("Tahoma", 0, 15));
        jLabel1.setForeground(new Color(0, 99, 0));
        jTextField1.setBounds(new Rectangle(594, 60, 252, 33));
        jLabel2.setText("y(x,z):");
        jLabel2.setBounds(new Rectangle(552, 60, 45, 30));
        jLabel2.setFont(new Font("Tahoma", 0, 13));
        jLabel2.setForeground(new Color(0, 33, 115));
        jButton2.setText("Graficar");
        jButton2.setBounds(new Rectangle(588, 417, 99, 21));
        jButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Graficar(e);
                }
            });
        jLabel3.setText("Opciones:");
        jLabel3.setBounds(new Rectangle(627, 102, 165, 24));
        jLabel3.setFont(new Font("Tahoma", 0, 15));
        jLabel3.setForeground(new Color(0, 99, 0));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jButton3.setText("sen");
        jButton3.setBounds(new Rectangle(546, 135, 69, 27));
        jButton3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    seno(e);
                }
            });
        jButton4.setText("cos");
        jButton4.setBounds(new Rectangle(624, 135, 69, 27));
        jButton4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    cos(e);
                }
            });
        jButton5.setText("tan");
        jButton5.setBounds(new Rectangle(702, 135, 69, 27));
        jButton5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tan(e);
                }
            });
        jButton6.setText("asen");
        jButton6.setBounds(new Rectangle(780, 135, 69, 27));
        jButton6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    asen(e);
                }
            });
        jButton7.setText("acos");
        jButton7.setBounds(new Rectangle(546, 174, 69, 27));
        jButton7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    acos(e);
                }
            });
        jButton8.setText("atan");
        jButton8.setBounds(new Rectangle(624, 174, 69, 27));
        jButton8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    atan(e);
                }
            });
        jButton12.setText("senh");
        jButton12.setBounds(new Rectangle(702, 174, 69, 27));
        jButton12.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    senh(e);
                }
            });
        jButton13.setText("cosh");
        jButton13.setBounds(new Rectangle(780, 174, 69, 27));
        jButton13.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    cosh(e);
                }
            });
        jButton14.setText("tanh");
        jButton14.setBounds(new Rectangle(546, 213, 69, 27));
        jButton14.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tanh(e);
                }
            });
        jButton15.setText("asenh");
        jButton15.setBounds(new Rectangle(624, 213, 69, 27));
        jButton15.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    asenh(e);
                }
            });
        jButton16.setText("acosh");
        jButton16.setBounds(new Rectangle(702, 213, 69, 27));
        jButton16.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    acosh(e);
                }
            });
        jButton17.setText("atanh");
        jButton17.setBounds(new Rectangle(780, 213, 69, 27));
        jButton17.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    atanh(e);
                }
            });
        jButton18.setText("ln");
        jButton18.setBounds(new Rectangle(546, 252, 69, 27));
        jButton18.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    ln(e);
                }
            });
        jButton19.setText("log");
        jButton19.setBounds(new Rectangle(624, 252, 69, 27));
        jButton19.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    log(e);
                }
            });
        jButton21.setText("exp");
        jButton21.setBounds(new Rectangle(702, 252, 69, 27));
        jButton21.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    exp(e);
                }
            });
        jButton22.setText("sqrt");
        jButton22.setBounds(new Rectangle(780, 252, 69, 27));
        jButton22.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    sqrt(e);
                }
            });
        jButton23.setText("pi");
        jButton23.setBounds(new Rectangle(546, 294, 69, 27));
        jButton23.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    pi(e);
                }
            });
        jButton24.setText("e");
        jButton24.setBounds(new Rectangle(624, 294, 69, 27));
        jButton24.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    e(e);
                }
            });
        jButton9.setText("+");
        jButton9.setBounds(new Rectangle(705, 294, 66, 27));
        jButton9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    suma(e);
                }
            });
        jButton10.setText("-");
        jButton10.setBounds(new Rectangle(783, 294, 66, 27));
        jButton10.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    menos(e);
                }
            });
        jButton11.setText("*");
        jButton11.setBounds(new Rectangle(546, 333, 69, 24));
        jButton11.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    multiplicacion(e);
                }
            });
        jButton20.setText("/");
        jButton20.setBounds(new Rectangle(627, 333, 66, 24));
        jButton20.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    division(e);
                }
            });
        jButton25.setText("^");
        jButton25.setBounds(new Rectangle(705, 333, 66, 24));
        jButton25.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    elevar(e);
                }
            });
        jButton26.setText("x");
        jButton26.setBounds(new Rectangle(783, 333, 66, 24));
        jButton26.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    x(e);
                }
            });
        jButton27.setText("z");
        jButton27.setBounds(new Rectangle(546, 369, 69, 24));
        jButton27.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    z(e);
                }
            });
        jComboBox1.setBounds(new Rectangle(789, 369, 48, 24));
        jComboBox1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Numero(e);
                }
            });
        jButton28.setText("Limpiar");
        jButton28.setBounds(new Rectangle(720, 417, 96, 21));
        jButton28.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Limpiar(e);
                }
            });
        jButton29.setText("(");
        jButton29.setBounds(new Rectangle(627, 369, 66, 24));
        jButton29.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    parentesisabre(e);
                }
            });
        jButton30.setText(")");
        jButton30.setBounds(new Rectangle(705, 369, 66, 24));
        jButton30.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    parentesiscerrar(e);
                }
            });
        this.getContentPane().add(jButton30, null);
        this.getContentPane().add(jButton29, null);
        this.getContentPane().add(jButton28, null);
        this.getContentPane().add(jComboBox1, null);
        this.getContentPane().add(jButton27, null);
        this.getContentPane().add(jButton26, null);
        this.getContentPane().add(jButton25, null);
        this.getContentPane().add(jButton20, null);
        this.getContentPane().add(jButton11, null);
        this.getContentPane().add(jButton10, null);
        this.getContentPane().add(jButton9, null);
        this.getContentPane().add(jButton24, null);
        this.getContentPane().add(jButton23, null);
        this.getContentPane().add(jButton22, null);
        this.getContentPane().add(jButton21, null);
        this.getContentPane().add(jButton19, null);
        this.getContentPane().add(jButton18, null);
        this.getContentPane().add(jButton17, null);
        this.getContentPane().add(jButton16, null);
        this.getContentPane().add(jButton15, null);
        this.getContentPane().add(jButton14, null);
        this.getContentPane().add(jButton13, null);
        this.getContentPane().add(jButton12, null);
        this.getContentPane().add(jButton8, null);
        this.getContentPane().add(jButton7, null);
        this.getContentPane().add(jButton6, null);
        this.getContentPane().add(jButton5, null);
        this.getContentPane().add(jButton4, null);
        this.getContentPane().add(jButton3, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jPanel1, null);
    }
    
    
    public void establecer(){
        jTextField1.setText("cos(x^2)*tan(z^2)/(e^(0.25*(x^2+z^2)))");
        jPanel1.setLayout(new BorderLayout());
        graphicsConfiguration = SimpleUniverse.getPreferredConfiguration();
        canvas = new Canvas3D(graphicsConfiguration);
        MyBranchGroup = createSceneGraph();

        simpleUniverse = new SimpleUniverse(canvas);

        simpleUniverse.getViewingPlatform().setNominalViewingTransform();
        simpleUniverse.addBranchGraph(MyBranchGroup);
        canvas.setSize(jPanel1.getSize());
        jPanel1.add(canvas, BorderLayout.CENTER);
    }
    
    private BranchGroup createSceneGraph() {
        BranchGroup root = new BranchGroup();
        TransformGroup spin = new TransformGroup();
        spin.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        root.addChild(spin);

        //object
        Appearance ap = new Appearance();
        ap.setMaterial(new Material());
        Shape3D shape = new Shape3D(createGeometry(), ap);

        Transform3D tr = new Transform3D();
        tr.setScale(0.2);
        TransformGroup tg = new TransformGroup(tr);
        spin.addChild(tg);
        tg.addChild(shape);

        alpha = new Alpha(-1, 12000);
        RotationInterpolator rotator = new RotationInterpolator(alpha, spin);
        BoundingSphere bounds = new BoundingSphere();
        rotator.setSchedulingBounds(bounds);
        spin.addChild(rotator);
        //background and light
        Background background = new Background(1.0f, 1.0f, 1.0f);
        background.setApplicationBounds(bounds);
        root.addChild(background);
        AmbientLight light = new AmbientLight(true, new Color3f(Color.red));
        light.setInfluencingBounds(bounds);
        root.addChild(light);
        PointLight ptlight = new PointLight(new Color3f(Color.green),new Point3f(3f,3f,3f), new Point3f(1f,0f,0f));
        ptlight.setInfluencingBounds(bounds);
        root.addChild(ptlight);
        return root;
    }

    private Geometry createGeometry() {
        int m = 70;
        int n = 70;
        Point3f[] pts = new Point3f[m*n];
        int idx = 0;
        Parse parse = new Parse();
        parse.evaluador.parseExpression(jTextField1.getText());
        parse.errorExpr = parse.evaluador.hasError();
        if(!parse.errorExpr){ 
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    float x = (i - m/2)*0.1f;
                    float z = (j - n/2)*0.2f;
                    parse.evaluador.addVariable("x", x);
                    parse.evaluador.addVariable("z", z);
                    float y = (float)parse.evaluador.getValue();
                    //float y = (float)(Math.cos(x*x) * Math.tan(z*z))/((float)Math.exp(0.25*(x*x+z*z)));
                    //float y = (float)(Math.pow(x, 2) + Math.pow(z, 2)) - 8;
                    pts[idx++] = new Point3f(x, y, z);
                }
            }

            int[] coords = new int[2*n*(m-1)];
            idx = 0;
            for (int i = 1; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    coords[idx++] = i*n + j;
                    coords[idx++] = (i-1)*n + j;
                }
            }

            int[] stripCounts = new int[m-1];
            for (int i = 0; i < m-1; i++) stripCounts[i] = 2*n;

            GeometryInfo gi = new GeometryInfo(GeometryInfo.TRIANGLE_STRIP_ARRAY);
            gi.setCoordinates(pts);
            gi.setCoordinateIndices(coords);
            gi.setStripCounts(stripCounts);

            NormalGenerator ng = new NormalGenerator();
            ng.generateNormals(gi);

            return gi.getGeometryArray();
        }else{
            JOptionPane.showMessageDialog(jPanel1, "Funcion Invalida", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    private void AD_Rotacion(ActionEvent e) {

        if (jButton1.getText().equals("Activar Rotacion")) {
            jButton1.setText("Detener Rotacion");
            alpha.resume();
        } else if (jButton1.getText().equals("Detener Rotacion")) {
            jButton1.setText("Activar Rotacion");
            alpha.pause();
        }
    }

    private void Graficar(ActionEvent e) {
        jPanel1.removeAll();
        graphicsConfiguration = SimpleUniverse.getPreferredConfiguration();
        canvas = new Canvas3D(graphicsConfiguration);
        MyBranchGroup = createSceneGraph();
        simpleUniverse = new SimpleUniverse(canvas);
        simpleUniverse.getViewingPlatform().setNominalViewingTransform();
        simpleUniverse.addBranchGraph(MyBranchGroup);
        canvas.setSize(jPanel1.getSize());
        jPanel1.add(canvas, BorderLayout.CENTER);
        jPanel1.updateUI();

    }

    private void seno(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"sen(");
    }

    private void Limpiar(ActionEvent e) {
        jTextField1.setText("");
    }

    private void cos(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"cos(");
    }

    private void tan(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"tan(");
    }

    private void asen(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"asen(");
    }

    private void acos(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"acos(");
    }

    private void atan(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"atan(");
    }

    private void senh(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"senh(");
    }

    private void cosh(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"cosh(");
    }

    private void tanh(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"tanh(");
    }

    private void asenh(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"asenh(");
    }

    private void acosh(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"acosh(");
    }

    private void atanh(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"atanh(");
    }

    private void ln(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"ln(");
    }

    private void log(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"log(");
    }

    private void exp(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"exp(");
    }

    private void sqrt(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"sqrt(");
    }

    private void pi(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"pi");
    }

    private void e(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"e");
    }

    private void suma(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"+");
    }

    private void menos(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"-");
    }

    private void multiplicacion(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"*");
    }

    private void division(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"/");
    }

    private void elevar(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"^");
    }

    private void x(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"x");
    }

    private void z(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"z");
    }

    private void Numero(ActionEvent e) {
        String cadena=jTextField1.getText();
        String num=jComboBox1.getSelectedItem().toString();
        jTextField1.setText(cadena+num);
    }

    private void parentesisabre(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+"(");
    }

    private void parentesiscerrar(ActionEvent e) {
        String cadena=jTextField1.getText();
        jTextField1.setText(cadena+")");
    }


    class Parse {
            
            JEP evaluador;
            double vx;
            boolean errorNumero;
            boolean errorExpr;
            
        public Parse() {
                    
            evaluador = new JEP();
            evaluador.addStandardFunctions();
            evaluador.addStandardConstants();
            evaluador.addComplex();
            evaluador.addFunction("sen", new Sine());
            evaluador.addFunction("asen", new ArcSine());
            evaluador.addFunction("senh", new SineH());
            evaluador.addFunction("asenh", new ArcSineH());
            evaluador.addVariable("x", 0);
            evaluador.addVariable("z", 0);
            evaluador.setImplicitMul(true);
        }
    
        public double evaluar(JEP parser, String m, double valor) {
            parser.parseExpression(m);
            parser.addVariable("x", valor);
            errorExpr = parser.hasError();
            return parser.getValue();
        }

    }
    
    public static void main (String args[]){
        Graficadora3D G3D = new Graficadora3D();
        G3D.setLocationRelativeTo(null);
        G3D.setVisible(true);
    }
}
