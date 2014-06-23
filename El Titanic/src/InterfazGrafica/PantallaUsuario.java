/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import Codigo.Jugador;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario A
 */
public class PantallaUsuario extends javax.swing.JFrame {

    // Variables de la clase
    private JLabel iconoSeleccionado = null;

    // Variables auxiliares para cargar la informacion faltante del usuario
    private JLabel etiquetaFotoUsuario;
    private JLabel etiquetaNombreUsuario;
    private JLabel etiquetaPuntaje;
    private Jugador jugador;
    private boolean tipoAliado;

    /**
     * Creates new form CrearUsuario
     */
    public PantallaUsuario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        Lbl_InfoAvatar = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(565, 550));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                cerrarVentana(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(434, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarBroke.png"))); // NOI18N
        jLabel1.setName("Brock"); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 124, 124));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarChaplin.png"))); // NOI18N
        jLabel2.setName("Charles Chaplin"); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 124, 124));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarEinstein.png"))); // NOI18N
        jLabel3.setName("Albert Einstein"); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 124, 124));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarClaudia.jpg"))); // NOI18N
        jLabel4.setName("Claudia"); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 124, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarFred.jpg"))); // NOI18N
        jLabel5.setName("Fred"); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 124, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarGhandi.jpg"))); // NOI18N
        jLabel6.setText("jLabel3");
        jLabel6.setName("Ghandi"); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 124, 124));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarHarry.jpg"))); // NOI18N
        jLabel7.setText("jLabel1");
        jLabel7.setName("Harry"); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 124, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarHitler.png"))); // NOI18N
        jLabel8.setText("jLabel2");
        jLabel8.setName("Hitler"); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 124, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarJack.png"))); // NOI18N
        jLabel9.setText("jLabel3");
        jLabel9.setName("Jack Sparrow"); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 124, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarJackson.png"))); // NOI18N
        jLabel10.setText("jLabel1");
        jLabel10.setName("Michael Jackson"); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 124, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarJobs.png"))); // NOI18N
        jLabel11.setText("jLabel2");
        jLabel11.setName("Steve Jobs"); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 124, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarJohn.jpg"))); // NOI18N
        jLabel12.setText("jLabel3");
        jLabel12.setName("Jhon"); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 124, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarKaty.png"))); // NOI18N
        jLabel13.setText("jLabel1");
        jLabel13.setName("Katty Perry"); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 124, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarLuisa.jpg"))); // NOI18N
        jLabel14.setText("jLabel2");
        jLabel14.setName("Luisa"); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 124, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarManosTijeras.png"))); // NOI18N
        jLabel15.setText("jLabel3");
        jLabel15.setName("Manos de Tijera"); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 124, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarMrBean.png"))); // NOI18N
        jLabel16.setText("jLabel1");
        jLabel16.setName("Mr. Bean"); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, 124, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarObama.png"))); // NOI18N
        jLabel17.setText("jLabel2");
        jLabel17.setName("Barack Obama"); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 720, 124, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarPenny.png"))); // NOI18N
        jLabel18.setText("jLabel3");
        jLabel18.setName("Penny"); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 720, 124, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarSheldon.png"))); // NOI18N
        jLabel19.setText("jLabel1");
        jLabel19.setName("Sheldon Cooper"); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 860, 124, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarElias.png"))); // NOI18N
        jLabel25.setName("Elias"); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 860, 124, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AvatarTyson.png"))); // NOI18N
        jLabel26.setText("jLabel2");
        jLabel26.setName("Mike Tyson"); // NOI18N
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenClicked(evt);
            }
        });
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 860, 124, -1));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 490, 280));

        jLabel21.setFont(new java.awt.Font("MingLiU_HKSCS", 1, 14)); // NOI18N
        jLabel21.setText("Avatar");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, 30));

        Txt_Nombre.setFont(new java.awt.Font("MingLiU_HKSCS", 0, 14)); // NOI18N
        getContentPane().add(Txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 160, -1));

        jLabel22.setFont(new java.awt.Font("Raavi", 2, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Creación De Usuarios");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 220, 30));

        jButton1.setText("Aplicar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 140, 30));

        jLabel23.setFont(new java.awt.Font("MingLiU_HKSCS", 3, 14)); // NOI18N
        jLabel23.setText("Nombre de Usuario:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 250, 30));

        Lbl_InfoAvatar.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        Lbl_InfoAvatar.setText("No ha seleccionado un Avatar aún");
        getContentPane().add(Lbl_InfoAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 260, 20));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BrushedMetal.jpg"))); // NOI18N
        jLabel24.setText("jLabel24");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento que es llamado al seleccionar una imagen Avatar del monton. Esto
     * es para utilizar esta imagen mas adelante estableciendola en la ventana
     * principal del juego
     *
     * @param evt
     */
    private void imagenClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenClicked
        iconoSeleccionado = (JLabel) evt.getComponent();
        Lbl_InfoAvatar.setText("El avatar seleccionado es: " + evt.getComponent().getName());
    }//GEN-LAST:event_imagenClicked

    /**
     * Metodo para cargar la informacion del usuario en la pantalla principal y
     * en el objeto Jugador
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Se verifica si completo la informacion solicitada para crear el usuario
        if (!Txt_Nombre.getText().equals("") && iconoSeleccionado != null) {

            // Se crea un nuevo objeto Jugador 
            jugador = new Jugador(tipoAliado, this.Txt_Nombre.getText(), iconoSeleccionado);
            
            // Se carga la informacion del Jugador en la Ventana de juego   
            this.etiquetaNombreUsuario.setText(Txt_Nombre.getText());
            this.etiquetaPuntaje.setText("0");

            // Cambia de tamano y establece la imagen del jugador en la ventana principal
            ImageIcon imagenAvatar = (ImageIcon) iconoSeleccionado.getIcon();
            Image imagenAvatarEscalada = imagenAvatar.getImage().getScaledInstance(etiquetaFotoUsuario.getWidth(),
                    etiquetaFotoUsuario.getHeight(), Image.SCALE_SMOOTH);
            Icon iconoAvatarEscaladoFinal = new ImageIcon(imagenAvatarEscalada);
            etiquetaFotoUsuario.setIcon(iconoAvatarEscaladoFinal);

            // Restablece los datos de esta clase
            Txt_Nombre.setText(null);
            this.iconoSeleccionado = null;
            Lbl_InfoAvatar.setText("No ha seleccionado un Avatar aún");

            // Desvanece la ventana Creacion de Usuarios
            this.dispose();
        } 
        // Muestra al usuario un mensaje, ya que no ha establecido toda la informacion necesaria
        else {
            JOptionPane.showMessageDialog(this, "Informacion incompleta. Verifique "
                    + "que haya establecido el nombre y seleccionado una imagen");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Metodo que limpia los componentes de esta ventana al cerrarla
     * @param evt 
     */
    private void cerrarVentana(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_cerrarVentana
        // Borra la informacion del campo Txt_Nombre
        Txt_Nombre.setText(null);
        this.iconoSeleccionado = null;
        Lbl_InfoAvatar.setText("No ha seleccionado un Avatar aún");
    }//GEN-LAST:event_cerrarVentana

    /**
     * Metodo que recibe los datos que se van a modificar tras la creacion de un
     * nuevo usuario.
     * @param pFoto Foto de la ventana de juego principal
     * @param pNombre Nombre que se muestra en la ventana principal del juego
     * @param pJugador Objeto jugador al que se le va a establecer informacion
     * @param pScore Marcador de la ventana principal
     * @param pAliado Variable que indica si es aliado o enemigo
     */
    public void setAliado(JLabel pFoto, JLabel pNombre, Jugador pJugador, JLabel pScore, boolean pAliado) {
        this.etiquetaFotoUsuario = pFoto;
        this.etiquetaNombreUsuario = pNombre;
        this.etiquetaPuntaje = pScore;
        this.jugador = pJugador;
        this.tipoAliado = pAliado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_InfoAvatar;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
