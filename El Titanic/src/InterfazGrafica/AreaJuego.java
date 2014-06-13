/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import Codigo.Jugador;
import Codigo.Tablero;
import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

/**
 *
 * @author Mario A
 */
public class AreaJuego extends javax.swing.JFrame {
    
    private boolean turno;

    private Tablero tableroDeJuego = null;
    private JToggleButton[][] tableroGrafico = null;

    // Objetos del Programa
    public static Jugador oJugador1 = new Jugador();
    public static Jugador oJugador2 = new Jugador();
    // Ventanas externas
    private PantallaUsuario ventanaUsuarios = new PantallaUsuario();
    private Configuraciones ventanaConfiguracion = new Configuraciones();

    /**
     * Creates new form AreaJuego
     */
    public AreaJuego() {
        initComponents();
        setLocationRelativeTo(null);
        Btn_Play.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Pnl_Usuarios = new javax.swing.JPanel();
        Lbl_Player1Photo = new javax.swing.JLabel();
        Lbl_Player2Photo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        Lbl_ScorePlayer1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Lbl_Player1Name = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Lbl_ScorePlayer2 = new javax.swing.JLabel();
        Lbl_Player2Name = new javax.swing.JLabel();
        Pnl_Tablero = new javax.swing.JPanel();
        Btn_Play = new javax.swing.JButton();
        Lbl_Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MnI_NuevoJuego = new javax.swing.JMenuItem();
        MnI_Configuracion = new javax.swing.JMenuItem();
        MnI_Salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MnI_EditJueg1 = new javax.swing.JMenuItem();
        MnI_EditJueg2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Titanic Area de Juego");
        setName("Titanic"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_Usuarios.setBackground(new java.awt.Color(153, 255, 153));
        Pnl_Usuarios.setOpaque(false);
        Pnl_Usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Player1Photo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Lbl_Player1Photo.setOpaque(true);
        Pnl_Usuarios.add(Lbl_Player1Photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 30, 100, 100));

        Lbl_Player2Photo.setOpaque(true);
        Pnl_Usuarios.add(Lbl_Player2Photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 245, 100, 100));
        Pnl_Usuarios.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 224, 220, 10));

        Lbl_ScorePlayer1.setText("100");

        jLabel3.setText("Puntuacion");

        Lbl_Player1Name.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(Lbl_ScorePlayer1)
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(Lbl_Player1Name)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(Lbl_Player1Name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_ScorePlayer1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        Pnl_Usuarios.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 190, 70));

        jLabel4.setText("Puntuacion");

        Lbl_ScorePlayer2.setText("200");

        Lbl_Player2Name.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 33, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(Lbl_Player2Name))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(Lbl_ScorePlayer2)))
                    .addGap(0, 34, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 9, Short.MAX_VALUE)
                    .addComponent(Lbl_Player2Name)
                    .addGap(4, 4, 4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(Lbl_ScorePlayer2)))
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        Pnl_Usuarios.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 170, 60));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(Pnl_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(Pnl_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane1.setLayer(Pnl_Usuarios, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 260, 460));

        Pnl_Tablero.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(153, 153, 153)));
        Pnl_Tablero.setOpaque(false);

        javax.swing.GroupLayout Pnl_TableroLayout = new javax.swing.GroupLayout(Pnl_Tablero);
        Pnl_Tablero.setLayout(Pnl_TableroLayout);
        Pnl_TableroLayout.setHorizontalGroup(
            Pnl_TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );
        Pnl_TableroLayout.setVerticalGroup(
            Pnl_TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        getContentPane().add(Pnl_Tablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 480, -1));

        Btn_Play.setText("Jugar");
        Btn_Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PlayActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        Lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoJuego1.png"))); // NOI18N
        Lbl_Fondo.setOpaque(true);
        getContentPane().add(Lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 560));

        jMenu1.setText("Archivo");

        MnI_NuevoJuego.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        MnI_NuevoJuego.setText("Nuevo Juego");
        jMenu1.add(MnI_NuevoJuego);

        MnI_Configuracion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        MnI_Configuracion.setText("Configuraciones");
        MnI_Configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_ConfiguracionActionPerformed(evt);
            }
        });
        jMenu1.add(MnI_Configuracion);

        MnI_Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MnI_Salir.setText("Salir");
        MnI_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_SalirActionPerformed(evt);
            }
        });
        jMenu1.add(MnI_Salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        MnI_EditJueg1.setText("Editar Aliado");
        MnI_EditJueg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_EditJueg1ActionPerformed(evt);
            }
        });
        jMenu2.add(MnI_EditJueg1);

        MnI_EditJueg2.setText("Editar Enemigo");
        MnI_EditJueg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_EditJueg2ActionPerformed(evt);
            }
        });
        jMenu2.add(MnI_EditJueg2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo para salir de la aplicacion al presionar Alt+F4 o al seleccionar
     * la opcion salir en el menu.
     *
     * @param evt
     */
    private void MnI_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_SalirActionPerformed

        int opcion = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea"
                + " salir del juego?", "Salir",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_MnI_SalirActionPerformed

    private void verificarAtaque(java.awt.event.MouseEvent evt) {
        JToggleButton botonAction = (JToggleButton) evt.getComponent();
        if (botonAction.isSelected()) {
            JOptionPane.showMessageDialog(this, "Boton Presionado");
        } else {
            botonAction.setSelected(true);
            JOptionPane.showMessageDialog(this, "Este boton ya ha sido presionado");
        }
    }

    private void generarJuego(int filasDe1Usuario, int columnasDelTablero, int cantidadDeBarcos) {

        if (tableroDeJuego == null) {
            // No hay un juego actualmente. Se procede a crear la partida.
            generarTerreno(filasDe1Usuario * 2, columnasDelTablero);
            generarBarcos(filasDe1Usuario, columnasDelTablero, cantidadDeBarcos);
        } else {
            // Hay una partida en curso. Se le pregunta al usuario si dessea
            // crear una nueva partida o continuar con la actual.
            int opcion = JOptionPane.showConfirmDialog(this, "Actualmente "
                    + "existe una partidad en curso. ¿Desea sobreescribir la"
                    + " partida?", "Partida en curso",
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (opcion == JOptionPane.YES_OPTION) {
                // El usuario desea sobreescribir la partida, por lo que se
                // procede a generar una nueva matriz.
                generarTerreno(filasDe1Usuario * 2, columnasDelTablero);
                generarBarcos(filasDe1Usuario, columnasDelTablero, cantidadDeBarcos);
            }
        }
    }

    private void generarTerreno(int pFilas, int pColumnas) {

        Pnl_Tablero.removeAll();
        // Se crea un nuevo Tablero, con las dimensiones dadas.
        tableroDeJuego = new Tablero(pFilas + 1, pColumnas);
        // Se crea la matriz de botones con las dimensiones dadas
        tableroGrafico = new JToggleButton[pFilas + 1][pColumnas];
        // Se obtiene las medidas del panel donde van los botones
        int anchoDelMarco = Pnl_Tablero.getWidth();
        int altoDelMarco = Pnl_Tablero.getHeight();
        // Se calcula la medida que tendra cada boton en la ventana
        int anchoBoton = anchoDelMarco / pColumnas;
        int altoBoton = altoDelMarco / (pFilas + 1);

        //  SE PROCEDE A CREAR LA INTERFAZ GRAFICA DEL TABLERO
        for (int i = 0; i <= pFilas; i++) {

            for (int j = 0; j < pColumnas; j++) {
                if (pFilas / 2 == i) {
                    break;
                }
                JToggleButton casilla = new JToggleButton();
                // Se asigna un evento al nuevo boton
                casilla.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        verificarAtaque(evt);
                    }
                });
                // Se establece la ubicacion y el tamano (X, Y, Ancho, Alto)
                casilla.setBounds((anchoBoton * j), (altoBoton * i), anchoBoton, altoBoton);
                // Se asigna la imagen para el nuevo boton
                ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/timon.png"));
                Image imgEscalada;
                // Se verifica la menor dimensio (ancho vs alto) para que la imagen no se vea estirada
                if (anchoBoton <= altoBoton) {
                    imgEscalada = imagen.getImage().getScaledInstance(anchoBoton,
                            anchoBoton, Image.SCALE_SMOOTH);
                } else {
                    imgEscalada = imagen.getImage().getScaledInstance(altoBoton,
                            altoBoton, Image.SCALE_SMOOTH);
                }
                Icon iconoEscalado = new ImageIcon(imgEscalada);
                casilla.setIcon(iconoEscalado);
                // Se agrega la nueva casilla a la ventana
                Pnl_Tablero.add(casilla);
                tableroGrafico[i][j] = casilla;
            }
        }
        Pnl_Tablero.repaint();

    }

    private void generarBarcos(int pFilas, int pColumnas, int pCantidadDeBarcos) {

        // Creamos el Metodo que genera los Random
        Random generadorRandom = new Random(System.currentTimeMillis());
        //El ciclo For para que cuente la cantidad de barcos para los Aliados al igual para los Enemigos
        for (int i = 0; i < pCantidadDeBarcos; i++) {
            int filas;
            int columnas;

            // El do/while es para crear los barcos Aliados.
            do {
                filas = generadorRandom.nextInt(pFilas / 2);
                columnas = generadorRandom.nextInt(pColumnas);

            } while (!tableroDeJuego.setBarco(filas, columnas));
            System.out.println("Barco Aliado creado en " + filas + "," + columnas);

            // El do/while es para crear los barcos Enemigos.
            do {
                filas = generadorRandom.nextInt(pFilas / 2) + (pFilas / 2 + 1);
                columnas = generadorRandom.nextInt(pColumnas);

            } while (!tableroDeJuego.setBarco(filas, columnas));
            System.out.println("Barco Enemigo creado en " + filas + "," + columnas);

        }
    }

    /**
     * Metodo utilizado para mostrar la ventana de configuracion.
     *
     * @param evt
     */
    private void MnI_ConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_ConfiguracionActionPerformed
        // TODO add your handling code here:
        ventanaConfiguracion.setDatosDeAreaJuego(this.Btn_Play);
        ventanaConfiguracion.setVisible(true);
    }//GEN-LAST:event_MnI_ConfiguracionActionPerformed

    private void MnI_EditJueg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_EditJueg1ActionPerformed
        ventanaUsuarios.setAliado(true, Lbl_Player1Photo, Lbl_Player1Name, Lbl_ScorePlayer1);
        ventanaUsuarios.setVisible(true);
    }//GEN-LAST:event_MnI_EditJueg1ActionPerformed

    private void MnI_EditJueg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_EditJueg2ActionPerformed
        ventanaUsuarios.setAliado(false, Lbl_Player2Photo, Lbl_Player2Name, Lbl_ScorePlayer2);
        ventanaUsuarios.setVisible(true);
    }//GEN-LAST:event_MnI_EditJueg2ActionPerformed

    private void Btn_PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PlayActionPerformed
        // TODO add your handling code here:
        
        this.Btn_Play.setVisible(false);
        
        // Obtiene los datos generados en la ventana configuracion
        int numeroColumnas = ventanaConfiguracion.getColumnasDelTablero();
        int numeroFilasPorUsuario = ventanaConfiguracion.getFilasDe1Usuario();
        int numeroBarcos = ventanaConfiguracion.getCantidadDeBarcos();
        // Se procede a generar el terreno de juego y los barcos, desde el metodo generarJuego
        generarJuego(numeroFilasPorUsuario, numeroColumnas, numeroBarcos);
        
        // Se genera un random para asignar quien inicia el Juego
        Random rand = new Random(System.currentTimeMillis());
        turno = rand.nextBoolean();        
        if(turno == true){
            JOptionPane.showMessageDialog(this, "La partida inicia aleatoriamente en favor del jugador Aliado");
        }else{
            JOptionPane.showMessageDialog(this, "La partida inicia aleatoriamente en favor del jugador Enemigo");
        }
        
        //******************************************************
    }//GEN-LAST:event_Btn_PlayActionPerformed

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
            java.util.logging.Logger.getLogger(AreaJuego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaJuego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaJuego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaJuego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AreaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Play;
    private javax.swing.JLabel Lbl_Fondo;
    private javax.swing.JLabel Lbl_Player1Name;
    private javax.swing.JLabel Lbl_Player1Photo;
    private javax.swing.JLabel Lbl_Player2Name;
    private javax.swing.JLabel Lbl_Player2Photo;
    private javax.swing.JLabel Lbl_ScorePlayer1;
    private javax.swing.JLabel Lbl_ScorePlayer2;
    private javax.swing.JMenuItem MnI_Configuracion;
    private javax.swing.JMenuItem MnI_EditJueg1;
    private javax.swing.JMenuItem MnI_EditJueg2;
    private javax.swing.JMenuItem MnI_NuevoJuego;
    private javax.swing.JMenuItem MnI_Salir;
    private javax.swing.JPanel Pnl_Tablero;
    private javax.swing.JPanel Pnl_Usuarios;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
