/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwcalculadora;

import java.awt.Toolkit;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.ImageIcon;

/**
 *
 * @author Alejandro Campos Maestre
 */
public class jfCalculadora extends javax.swing.JFrame
{

    private logicaCal logica = new logicaCal();
    private float operador1 = 0;
    private float operador2 = 0;
    
    /**
     * Creates new form jfCalculadora
     */
    public jfCalculadora()
    {
        initComponents();
        ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("calc.png")));
        this.setIconImage(icon.getImage());
        activarAyuda();
    }

    private void activarAyuda()
    {
        try
        {
            //Cargar el fichero ayuda
            File fichero = new File("help"+File.separator+"help_set.hs");
            URL hsURL = fichero.toURI().toURL();
            
            //Crear el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();
            
            //Añadir ayuda al boton y F1
            hb.enableHelpOnButton(jMenuAyuda, "menu", helpset);
            hb.enableHelpKey(getRootPane(), "menu", helpset);
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jpTexto = new javax.swing.JPanel();
        jlOperador1 = new javax.swing.JLabel();
        jtNumero1 = new javax.swing.JTextField();
        jlOperador2 = new javax.swing.JLabel();
        jtNumero2 = new javax.swing.JTextField();
        jpBotones = new javax.swing.JPanel();
        jbSumar = new javax.swing.JButton();
        jbRestar = new javax.swing.JButton();
        jbMultiplicar = new javax.swing.JButton();
        jbDividir = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jpResultado = new javax.swing.JPanel();
        jlResultado = new javax.swing.JLabel();
        jtResultado = new javax.swing.JTextField();
        jpErrores = new javax.swing.JPanel();
        jlError = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jAyuda = new javax.swing.JMenu();
        jMenuAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTexto.setLayout(new javax.swing.BoxLayout(jpTexto, javax.swing.BoxLayout.LINE_AXIS));

        jlOperador1.setText("Operador 1: ");
        jpTexto.add(jlOperador1);
        jpTexto.add(jtNumero1);

        jlOperador2.setText("Operador2: ");
        jpTexto.add(jlOperador2);
        jpTexto.add(jtNumero2);

        jPanel1.add(jpTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 459, 50));

        jpBotones.setLayout(new javax.swing.BoxLayout(jpBotones, javax.swing.BoxLayout.LINE_AXIS));

        jbSumar.setText("+");
        jbSumar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jbSumarActionPerformed(evt);
            }
        });
        jpBotones.add(jbSumar);

        jbRestar.setText("-");
        jbRestar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jbRestarActionPerformed(evt);
            }
        });
        jpBotones.add(jbRestar);

        jbMultiplicar.setText("x");
        jbMultiplicar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jbMultiplicarActionPerformed(evt);
            }
        });
        jpBotones.add(jbMultiplicar);

        jbDividir.setText("/");
        jbDividir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jbDividirActionPerformed(evt);
            }
        });
        jpBotones.add(jbDividir);

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jbLimpiarActionPerformed(evt);
            }
        });
        jpBotones.add(jbLimpiar);

        jPanel1.add(jpBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 89, -1, -1));

        jpResultado.setLayout(new javax.swing.BoxLayout(jpResultado, javax.swing.BoxLayout.LINE_AXIS));

        jlResultado.setText("Resultado: ");
        jpResultado.add(jlResultado);

        jtResultado.setEditable(false);
        jpResultado.add(jtResultado);

        jPanel1.add(jpResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 121, 459, 89));

        jpErrores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jpErrores, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 210, -1, -1));

        jlError.setVisible(false);
        jlError.setForeground(new java.awt.Color(255, 0, 51));
        jlError.setText("jkhhchkchc");
        jPanel1.add(jlError, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 459, 43));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jAyuda.setText("Ayuda");

        jMenuAyuda.setText("Mostrar ayuda");
        jAyuda.add(jMenuAyuda);

        jMenuBar1.add(jAyuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSumarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbSumarActionPerformed
    {//GEN-HEADEREND:event_jbSumarActionPerformed
        boolean isNumero = comprobadorCampoNumero(this.jtNumero1.getText(), this.jtNumero2.getText());

        if (isNumero)
        {
            sumar();
        }
    }//GEN-LAST:event_jbSumarActionPerformed

    private void jbRestarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbRestarActionPerformed
    {//GEN-HEADEREND:event_jbRestarActionPerformed
        boolean isNumero = comprobadorCampoNumero(this.jtNumero1.getText(), this.jtNumero2.getText());

        if (isNumero)
        {
            restar();
        }
    }//GEN-LAST:event_jbRestarActionPerformed

    private void jbMultiplicarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbMultiplicarActionPerformed
    {//GEN-HEADEREND:event_jbMultiplicarActionPerformed
        boolean isNumero = comprobadorCampoNumero(this.jtNumero1.getText(), this.jtNumero2.getText());

        if (isNumero)
        {
            multiplicar();
        }
    }//GEN-LAST:event_jbMultiplicarActionPerformed

    private void jbDividirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbDividirActionPerformed
    {//GEN-HEADEREND:event_jbDividirActionPerformed
        boolean isNumero = comprobadorCampoNumero(this.jtNumero1.getText(), this.jtNumero2.getText());

        if (isNumero)
        {
            dividir();
        }
    }//GEN-LAST:event_jbDividirActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbLimpiarActionPerformed
    {//GEN-HEADEREND:event_jbLimpiarActionPerformed
        this.jlError.setVisible(false);
        this.jtNumero1.setText("");
        this.jtNumero2.setText("");
        this.jtResultado.setText("");
    }//GEN-LAST:event_jbLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(jfCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(jfCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(jfCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(jfCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new jfCalculadora().setVisible(true);
            }
        });
    }

    public boolean comprobadorCampoNumero(String numero1, String numero2)
    {
        try
        {
            operador1 = Integer.parseInt(numero1);
            operador2 = Integer.parseInt(numero2);
        } catch (NumberFormatException e)
        {
            this.jlError.setText("Los datos insertados son incorrectos.");
            this.jtResultado.setText("");
            this.jlError.setVisible(true);

            return false;
        }
        this.jlError.setVisible(false);
        return true;
    }

    public void sumar()
    {
        float resultado = operador1 + operador2;

        this.jtResultado.setText(String.valueOf(resultado));
        this.jlError.setVisible(false);
    }

    public void restar()
    {
        float resultado = operador1 - operador2;

        this.jtResultado.setText(String.valueOf(resultado));
        this.jlError.setVisible(false);
    }

    public void multiplicar()
    {
        float resultado = operador1 * operador2;

        this.jtResultado.setText(String.valueOf(resultado));
        this.jlError.setVisible(false);
    }

    public void dividir()
    {
        try
        {
            float resultado = operador1 / operador2;
            this.jtResultado.setText(String.valueOf(resultado));
            this.jlError.setVisible(false);
        } catch (ArithmeticException e)
        {
            this.jlError.setText("Se ha intentado dividir entre 0.");
            this.jtResultado.setText("");
            this.jlError.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jAyuda;
    private javax.swing.JMenuItem jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbDividir;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbMultiplicar;
    private javax.swing.JButton jbRestar;
    private javax.swing.JButton jbSumar;
    private javax.swing.JLabel jlError;
    private javax.swing.JLabel jlOperador1;
    private javax.swing.JLabel jlOperador2;
    private javax.swing.JLabel jlResultado;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JPanel jpErrores;
    private javax.swing.JPanel jpResultado;
    private javax.swing.JPanel jpTexto;
    private javax.swing.JTextField jtNumero1;
    private javax.swing.JTextField jtNumero2;
    private javax.swing.JTextField jtResultado;
    // End of variables declaration//GEN-END:variables
}
