/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;


import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import estadistica.recursos.Imagenfondo;
import estadistica.recursos.JPColor;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Jonathan
 */
public class MDIPrincipal extends javax.swing.JFrame {

   private static int vSeccion;
   
   private JIFCuantitativo cuantitativo;
   private JIFCualitativo cualitativo;
   
  
    public MDIPrincipal() {
        initComponents();
        
          escritorio.setBorder(new Imagenfondo());

        
          
          
        Color c1=new Color(66,111,166);
        Color c2=new Color(102,174,118);
        JPColor miColor=new JPColor(c1,c2);
        miColor.setSize(this.getSize());
        panel.add(miColor);
        
    }
//    @SuppressWarnings("unchecked")
//    @Override
//    public Image getIconImage() 
//      {
//        Image retValue = Toolkit.getDefaultToolkit().
//                getImage(ClassLoader.getSystemResource("com/sys/utd/Recursos/icono.png"));
//        return retValue;
//    }
    
     public static int getvSeccion() {
        return vSeccion;
    }

    public static void setvSeccion(int vSeccion) {
        MDIPrincipal.vSeccion = vSeccion;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDInicio = new javax.swing.JDialog();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        pf_contra = new javax.swing.JPasswordField();
        btn_ingresar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        label = new javax.swing.JLabel();
        lb_usuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btn_cualitativa = new javax.swing.JButton();
        btn_cuantitativa = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        JDInicio.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        JDInicio.setUndecorated(true);
        JDInicio.setResizable(false);

        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 153, 0));
        jLabel1.setText("ENTRADA AL SISTEMA");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(105, 105, 105))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Usuario *");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Contraseña *");

        pf_contra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pf_contraKeyPressed(evt);
            }
        });

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estadistica/recursos/llave.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_ingresar)
                        .addGap(49, 49, 49)
                        .addComponent(btn_salir))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_usuario)
                        .addComponent(pf_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(pf_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ingresar)
                    .addComponent(btn_salir))
                .addContainerGap())
        );

        javax.swing.GroupLayout JDInicioLayout = new javax.swing.GroupLayout(JDInicio.getContentPane());
        JDInicio.getContentPane().setLayout(JDInicioLayout);
        JDInicioLayout.setHorizontalGroup(
            JDInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JDInicioLayout.setVerticalGroup(
            JDInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDInicioLayout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Estadistica JA");
        setIconImage(getIconImage());

        jToolBar1.setRollover(true);

        label.setText("Usuario:");
        jToolBar1.add(label);

        lb_usuario.setText("no hay usuario");
        jToolBar1.add(lb_usuario);
        jToolBar1.add(jSeparator1);

        btn_cualitativa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estadistica/recursos/estadistica.png"))); // NOI18N
        btn_cualitativa.setToolTipText("Variables Cualitativas");
        btn_cualitativa.setFocusable(false);
        btn_cualitativa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cualitativa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cualitativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cualitativaActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_cualitativa);

        btn_cuantitativa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estadistica/recursos/cualitativa.png"))); // NOI18N
        btn_cuantitativa.setToolTipText("Variable Cuantitativa");
        btn_cuantitativa.setFocusable(false);
        btn_cuantitativa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cuantitativa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cuantitativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cuantitativaActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_cuantitativa);

        escritorio.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 236, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tipo Variables");

        jMenu4.setText("Cualitativas");

        jMenuItem2.setText("Tabla de frecuencias");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenu2.add(jMenu4);

        jMenu3.setText("Cuantitativos");

        jMenuItem1.setText("Tabla de Frecuencias");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pf_contraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf_contraKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            this.logueo();
        }
    }//GEN-LAST:event_pf_contraKeyPressed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        this.logueo();
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
              if(estacerrado(cuantitativo))
        {
             
                try {
                        cuantitativo=new JIFCuantitativo();
                    escritorio.add(cuantitativo);
                    Dimension tamanoEscritorio=escritorio.getSize();
                    Dimension framesize=cuantitativo.getSize();
                    cuantitativo.setLocation((tamanoEscritorio.width - framesize.width)/2, (tamanoEscritorio.height - framesize.height)/2) ;
                    cuantitativo.show();
                } catch (Exception ex) {
                    Logger.getLogger(MDIPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
       
        }else
        {
            JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
                if(estacerrado(cualitativo))
        {
             
                try {
                        cualitativo=new JIFCualitativo();
                    escritorio.add(cualitativo);
                    Dimension tamanoEscritorio=escritorio.getSize();
                    Dimension framesize=cualitativo.getSize();
                    cualitativo.setLocation((tamanoEscritorio.width - framesize.width)/2, (tamanoEscritorio.height - framesize.height)/2) ;
                    cualitativo.show();
                } catch (Exception ex) {
                    Logger.getLogger(MDIPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
       
        }else
        {
            JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btn_cualitativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cualitativaActionPerformed
               if(estacerrado(cualitativo))
        {
             
                try {
                        cualitativo=new JIFCualitativo();
                    escritorio.add(cualitativo);
                    Dimension tamanoEscritorio=escritorio.getSize();
                    Dimension framesize=cualitativo.getSize();
                    cualitativo.setLocation((tamanoEscritorio.width - framesize.width)/2, (tamanoEscritorio.height - framesize.height)/2) ;
                    cualitativo.show();
                } catch (Exception ex) {
                    Logger.getLogger(MDIPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
       
        }else
        {
            JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
        }
    }//GEN-LAST:event_btn_cualitativaActionPerformed

    private void btn_cuantitativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cuantitativaActionPerformed
              if(estacerrado(cuantitativo))
        {
             
                try {
                        cuantitativo=new JIFCuantitativo();
                    escritorio.add(cuantitativo);
                    Dimension tamanoEscritorio=escritorio.getSize();
                    Dimension framesize=cuantitativo.getSize();
                    cuantitativo.setLocation((tamanoEscritorio.width - framesize.width)/2, (tamanoEscritorio.height - framesize.height)/2) ;
                    cuantitativo.show();
                } catch (Exception ex) {
                    Logger.getLogger(MDIPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
       
        }else
        {
            JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
        }
    }//GEN-LAST:event_btn_cuantitativaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

            System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ParseException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;");
                    break;
                }
            }
           UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
        //</editor-fold>

        /* Create and display the form */
                 public void run() {
                new MDIPrincipal().setVisible(false);
                MDIPrincipal principal=new MDIPrincipal();
                principal.setLocationRelativeTo(null);
                principal.setVisible(false);
                principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
                principal.iniciarSistema();
               // new Thread(new Splash()).start();
//            }
            }
            });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog JDInicio;
    private javax.swing.JButton btn_cualitativa;
    private javax.swing.JButton btn_cuantitativa;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField pf_contra;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

     private boolean estacerrado(Object obj)
{
    JInternalFrame[] activos=escritorio.getAllFrames();
    boolean cerrado=true;
    int i=0;
    while (i<activos.length && cerrado)
    {
        if(activos[i]==obj)
        {
            cerrado=false;
        }
        i++;
    }
    return cerrado;
    
}
     
     
 public void iniciarSistema()
 {
     JDInicio.pack();
     JDInicio.setLocationRelativeTo(null);
     JDInicio.setVisible(true);
     JDInicio.setResizable(false);
 }
     
     public void logueo()
 {
     try
     {
         
         String usuario=txt_usuario.getText();
         String contra=String.valueOf(pf_contra.getPassword());
         
         String us="admin";
         String clave="admin";
         
         if(usuario.equals(us) && contra.equals(clave))
             
         {
             
         
         
             JDInicio.dispose();
             txt_usuario.setText("");
             pf_contra.setText("");
             
         
             
             
             
             
             
             
             lb_usuario.setText(usuario);
             
             
             this.setVisible(true);
                 
           
             
         }
         else
         {
             JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos. \n Intentelo de nuevo", "Mensaje Error", JOptionPane.ERROR_MESSAGE);
         }
         
     }catch(HeadlessException e)
     {
        JOptionPane.showMessageDialog(this, "Error de conexión" + e, "Mensaje Error", JOptionPane.ERROR_MESSAGE);

     }
 }
     
     
     









}
