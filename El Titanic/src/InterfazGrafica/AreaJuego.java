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

    private boolean turnoAliado;
    private boolean partidaFinalizada = true;

    private Tablero tableroDeJuego = null;
    private JToggleButton[][] tableroGrafico = null;

    // Objetos del Programa
    private Jugador jugadorAliado = null;
    private Jugador jugadorEnemigo = null;
    // Ventanas externas
    private final PantallaUsuario ventanaUsuarios = new PantallaUsuario();
    private final Configuraciones ventanaConfiguracion = new Configuraciones();

    /**
     * Creates new form AreaJuego
     */
    public AreaJuego() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Pnl_Usuarios = new javax.swing.JPanel();
        Lbl_Player1Photo = new javax.swing.JLabel();
        Lbl_Player2Photo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Pnl_User1 = new javax.swing.JPanel();
        Lbl_ScorePlayer1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Lbl_Player1Name = new javax.swing.JLabel();
        Pnl_User2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Lbl_ScorePlayer2 = new javax.swing.JLabel();
        Lbl_Player2Name = new javax.swing.JLabel();
        Pnl_Tablero = new javax.swing.JPanel();
        Lbl_Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MnI_NuevoJuego = new javax.swing.JMenuItem();
        MnI_Configuracion = new javax.swing.JMenuItem();
        MnI_Salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MnI_EditJueg1 = new javax.swing.JMenuItem();
        MnI_EditJueg2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MnI_Instrucciones = new javax.swing.JMenuItem();
        MnI_AcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Titanic Area de Juego");
        setName("Titanic"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_Usuarios.setBackground(new java.awt.Color(153, 255, 153));
        Pnl_Usuarios.setOpaque(false);
        Pnl_Usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Player1Photo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Lbl_Player1Photo.setOpaque(true);
        Pnl_Usuarios.add(Lbl_Player1Photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 100, 100));

        Lbl_Player2Photo.setOpaque(true);
        Pnl_Usuarios.add(Lbl_Player2Photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 245, 100, 100));
        Pnl_Usuarios.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 224, 170, 10));

        Lbl_ScorePlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_ScorePlayer1.setText("0");
        Lbl_ScorePlayer1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Puntuacion");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        Lbl_Player1Name.setFont(new java.awt.Font("Gill Sans MT", 3, 14)); // NOI18N
        Lbl_Player1Name.setForeground(new java.awt.Color(102, 102, 102));
        Lbl_Player1Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Player1Name.setText("Jugador 1");
        Lbl_Player1Name.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout Pnl_User1Layout = new javax.swing.GroupLayout(Pnl_User1);
        Pnl_User1.setLayout(Pnl_User1Layout);
        Pnl_User1Layout.setHorizontalGroup(
            Pnl_User1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_User1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(Pnl_User1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lbl_Player1Name)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lbl_ScorePlayer1)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        Pnl_User1Layout.setVerticalGroup(
            Pnl_User1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_User1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_Player1Name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Pnl_User1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_ScorePlayer1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        Pnl_Usuarios.add(Pnl_User1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 140, 170, 60));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Puntuacion");

        Lbl_ScorePlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_ScorePlayer2.setText("0");

        Lbl_Player2Name.setFont(new java.awt.Font("Gill Sans MT", 3, 14)); // NOI18N
        Lbl_Player2Name.setForeground(new java.awt.Color(102, 102, 102));
        Lbl_Player2Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Player2Name.setText("Jugador 2");
        Lbl_Player2Name.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout Pnl_User2Layout = new javax.swing.GroupLayout(Pnl_User2);
        Pnl_User2.setLayout(Pnl_User2Layout);
        Pnl_User2Layout.setHorizontalGroup(
            Pnl_User2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_User2Layout.createSequentialGroup()
                .addGroup(Pnl_User2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_User2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(Lbl_Player2Name))
                    .addGroup(Pnl_User2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Lbl_ScorePlayer2)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        Pnl_User2Layout.setVerticalGroup(
            Pnl_User2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_User2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_Player2Name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(Pnl_User2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_ScorePlayer2)))
        );

        Pnl_Usuarios.add(Pnl_User2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 360, 170, 60));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Pnl_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
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

        Lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoJuego1.png"))); // NOI18N
        Lbl_Fondo.setOpaque(true);
        getContentPane().add(Lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 560));

        jMenu1.setText("Archivo");

        MnI_NuevoJuego.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        MnI_NuevoJuego.setText("Nuevo Juego");
        MnI_NuevoJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_NuevoJuegoActionPerformed(evt);
            }
        });
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

        jMenu2.setText("Crear Jugadores");

        MnI_EditJueg1.setText("Crear Aliado");
        MnI_EditJueg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_EditJueg1ActionPerformed(evt);
            }
        });
        jMenu2.add(MnI_EditJueg1);

        MnI_EditJueg2.setText("Crear Enemigo");
        MnI_EditJueg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_EditJueg2ActionPerformed(evt);
            }
        });
        jMenu2.add(MnI_EditJueg2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        MnI_Instrucciones.setText("Instrucciones de Uso");
        jMenu3.add(MnI_Instrucciones);

        MnI_AcercaDe.setText("Acerca de");
        jMenu3.add(MnI_AcercaDe);

        jMenuBar1.add(jMenu3);

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

        // Muestra un mensaje preguntando al usuario si quiere salir del programa
        int opcion = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea"
                + " salir del juego?", "Salir",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        // Sale del juego
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_MnI_SalirActionPerformed

    /**
     * Evento que captura cuando un boton ha sido seleccionado en la matriz de
     * botones y se procede a verificar y ejecutar el ataque al elemento seleccionado
     * @param evt boton presionado
     */
    private void verificarAtaque(java.awt.event.MouseEvent evt) {

        // Almacena el boton que llama el evento de verificar ataque
        JToggleButton botonPressionado = (JToggleButton) evt.getComponent();
        
        // VERIFICA SI EL BOTON FUE PRESIONADO EN UNA PARTIDA YA FINALIZADA O NO
        if (partidaFinalizada) {
            // Ya la partida finalizo. Restaura el boton y muestra el mensaje.
            botonPressionado.setSelected(!botonPressionado.isSelected());
            JOptionPane.showMessageDialog(this, "Este juego ya terminó. Presione F2"
                    + " para iniciar una nueva partida");
            return;
        }

        //  SE PROCEDE A VERIFICAR SI EL BOTON SELECCIONADO YA FUE PRESIONADO
        if (!botonPressionado.isSelected()) {
            // Ya el boton fue presionado. Se restaura el estado y se indica al usuario.
            botonPressionado.setSelected(true);
            JOptionPane.showMessageDialog(this, "Esta casilla ya fue atacada. Intente atacando otra casilla");
            return;
        }
        
        // SE PROCEDE A VERIFICAR SI LA CASILLA SELECCIONADA PRESENTA UN BARCO PARA UNDIRLA
        int numeroFilas = tableroGrafico.length;
        int numeroColumnas = tableroGrafico[0].length;
        // Recorre la matriz de botones en busca de la ubicacion del elemento seleccionado.
        for (int f = 0; f < numeroFilas; f++) 
        {
            for (int c = 0; c < numeroColumnas; c++) 
            {
                // Se compara con el boton en la fila "f" y columna "c", para obtener la ubicacion
                // exacta en filas y columnas del elemento donde se esta realizando el ataque.
                if (botonPressionado == tableroGrafico[f][c]) 
                {
                    // Verifica si es el turno del Aliado y se esta presionando en el campo del aliado
                    if (turnoAliado && (f < (numeroFilas - 1) / 2)) {
                        // Restaura el boton, muestra mensaje al usuario y sale del metodo.
                        botonPressionado.setSelected(false);
                        JOptionPane.showMessageDialog(this, "No se pueden realizar"
                                + " ataques al campo aliado en el turno del Aliado");
                        return;
                    } 
                    // Verifica si es el turno del Enemigo y se esta presionando en el campo del enemigo
                    else if (!turnoAliado && (f > (numeroFilas - 1) / 2)) {
                        // Restaura el boton, muestra mensaje al usuario y sale del metodo
                        botonPressionado.setSelected(false);
                        JOptionPane.showMessageDialog(this, "No se pueden realizar"
                                + " ataques al campo enemigo en el turno del Enemigo");
                        return;
                    }
                    // Seleccion correcta. Se procede a ejecutar el ataque en la fila y columna dada.
                    else {
                        // Ejecuta el ataque y cambia el turno del jugador
                        ejecutarAtaque(f, c);
                        turnoAliado = !turnoAliado;
                        return;
                    }
                }
            }
        }
    }

    /**
     * Metodo que lleva a cabo el ataque y modifica tanto la matriz grafica (coloca 
     * un barco hundido o un vacio como imagen) como la matriz de objeto Tablero 
     * (cambia el valor del true a false, en caso que hubiera un barco, indicando 
     * que este fue hundido)
     * @param pFilaAtaque fila que se va a atacar
     * @param pColumnaAtaque columna que se va a atacar
     */
    private void ejecutarAtaque(int pFilaAtaque, int pColumnaAtaque) {

        System.out.println("El elemento presionado esta en " + pFilaAtaque + ',' + pColumnaAtaque);
                    
        // SE VERIFICA SI HAY UN BARCO EN LA FILA Y COLUMNA DONDE SE REALIZA EL ATAQUE
        if (this.tableroDeJuego.hayBarco(pFilaAtaque, pColumnaAtaque)) {
            
            // Se procede a destruir el barco del Tablero
            tableroDeJuego.destruirBarco(pFilaAtaque, pColumnaAtaque);

            // ***************  COLOCAR NUEVA IMAGEN POR BARCO HUNDIDO  ***********************
            int imagenAlto = tableroGrafico[pFilaAtaque][pColumnaAtaque].getHeight();
            int imagenAncho = tableroGrafico[pFilaAtaque][pColumnaAtaque].getWidth();

            ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/barco.gif"));
            Image imgEscalada;
            // Se verifica la menor dimension (ancho vs alto) para que la imagen no se vea estirada
            if (imagenAncho <= imagenAlto) {
                imgEscalada = imagen.getImage().getScaledInstance(imagenAncho,
                        imagenAncho, Image.SCALE_SMOOTH);
            } else {
                imgEscalada = imagen.getImage().getScaledInstance(imagenAlto,
                        imagenAlto, Image.SCALE_SMOOTH);
            }
            Icon iconoEscalado = new ImageIcon(imgEscalada);
            // establece la nueva imagen al boton
            tableroGrafico[pFilaAtaque][pColumnaAtaque].setIcon(iconoEscalado);
            // *******************************************************************************

            // SE PROCEDE A VERIFICAR SI ES EL TURNO DEL ALIADO Y SI YA GANO LA PARTIDA
            if (turnoAliado) {
                // Disminuye la cantidad de barcos enemigo luego del ataque
                int barcos = tableroDeJuego.getCantidadBarcosEnemigos();
                barcos--;
                tableroDeJuego.setCantidadBarcosEnemigos(barcos);
                if (barcos == 0) {
                    // Modifica el puntaje del jugador Aliado
                    int puntaje = jugadorAliado.getPuntaje();
                    puntaje++;
                    jugadorAliado.setPuntaje(puntaje);
                    // Modifica el puntaje graficamente
                    Lbl_ScorePlayer1.setText(puntaje + "");                    
                    // Modifica los datos de las estadisticas de las partidas
                    jugadorAliado.setCantidadPartidasJugadas(jugadorAliado.getCantidadPartidasJugadas() + 1);
                    jugadorEnemigo.setCantidadPartidasJugadas(jugadorEnemigo.getCantidadPartidasJugadas() + 1);
                    jugadorAliado.setCantidadPartidasGanadas(jugadorAliado.getCantidadPartidasGanadas() + 1);
                    jugadorEnemigo.setCantidadPartidasPerdidas(jugadorEnemigo.getCantidadPartidasPerdidas() + 1);                    
                    // Establece la partida como finalizada
                    partidaFinalizada = true;
                    // Muestra mensaje de victoria
                    JOptionPane.showMessageDialog(this, "Jugador Aliado Gana. Presiona F2 para iniciar una nueva partida");
                }
            }
            
            // ES EL TURNO DEL ENEMIGO. SE PROCEDE A VERIFICAR SI YA GANO LA PARTIDA
            else {
                // Disminuye la cantidad de barcos aliados luego del ataque
                int barcos = tableroDeJuego.getCantidadBarcosAliados();
                barcos--;
                tableroDeJuego.setCantidadBarcosAliados(barcos);
                if (barcos == 0) {
                    // Modifica el puntaje del jugador Enemigo
                    int puntaje = jugadorEnemigo.getPuntaje();
                    puntaje++;
                    jugadorEnemigo.setPuntaje(puntaje);
                    // Modifica el puntaje graficamente
                    Lbl_ScorePlayer2.setText(puntaje + "");
                    // Modifica los datos de las estadisticas de las partidas
                    jugadorEnemigo.setCantidadPartidasJugadas(jugadorEnemigo.getCantidadPartidasJugadas() + 1);
                    jugadorAliado.setCantidadPartidasJugadas(jugadorAliado.getCantidadPartidasJugadas() + 1);
                    jugadorEnemigo.setCantidadPartidasGanadas(jugadorEnemigo.getCantidadPartidasGanadas() + 1);
                    jugadorAliado.setCantidadPartidasPerdidas(jugadorAliado.getCantidadPartidasPerdidas() + 1); 
                    // Establece la partida como finalizada
                    partidaFinalizada = true;
                    // Muestra mensaje de victoria
                    JOptionPane.showMessageDialog(this, "Jugador Enemigo Gana. Presiona F2 para iniciar una nueva partida");
                }
            }
        }
        // NO HAY UN BARCO EN ESA FILA Y COLUMNA. SE ELIMINA LA IMAGEN DEL TIMON Y SE DEJA COMO VACIO
        else{
            tableroGrafico[pFilaAtaque][pColumnaAtaque].setIcon(null);
        }

    }

    /**
     * Metodo utilizado para crear el terreno de juego y los barcos que se
     * colocaran en el de forma aleatoria. Seguido de ello, generara un boolean
     * aleatorio para asignar quien comienza el juego.
     * @param filasDe1Usuario Cantidad de filas presentes en el campo de un
     * jugador
     * @param columnasDelTablero cantidad de columnas del tablero
     * @param cantidadDeBarcos cantidad de barcos de un jugador
     */
    private void generarJuego(int filasDe1Usuario, int columnasDelTablero, int cantidadDeBarcos) {

        // SE PROCEDE A VERIFICAR SI HAY UNA PARTIDA EN CURSO O NO PARA CREAR UNA NUEVA
        if (partidaFinalizada) {
            // No hay un juego actualmente. Se procede a crear la partida.
            generarTerreno(filasDe1Usuario * 2, columnasDelTablero);
            generarBarcos(filasDe1Usuario * 2, columnasDelTablero, cantidadDeBarcos);
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
                generarBarcos(filasDe1Usuario * 2, columnasDelTablero, cantidadDeBarcos);
            } else {
                // El usuario desea continuar con su partida. Se sale de este metodo
                return;
            }
        }

        // SE GENERA UN RANDOM PARA ASIGNAR QUIEN HACE EL PRIMER ATAQUE DEL JUEGO.
        Random rand = new Random(System.currentTimeMillis());
        turnoAliado = rand.nextBoolean();
        // Se muestra un mensaje al usuario informando quien comienza la partida
        if (turnoAliado == true) {
            JOptionPane.showMessageDialog(this, "La partida inicia aleatoriamente en favor del jugador Aliado");
        } else {
            JOptionPane.showMessageDialog(this, "La partida inicia aleatoriamente en favor del jugador Enemigo");
        }

        // Se establece la variable partidaFinalizada en false. Esto indica que hay un juego en proceso
        partidaFinalizada = false;
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

    /**
     * Metodo utilizado para crear de manera aleatoria la posicion en la que se
     * ubicaran los barcos, tanto aliados como enemigos, en el tablero de juego
     * @param pFilas cantidad de filas del Tablero (cantidad sin contar la fila
     * vacia)
     * @param pColumnas cantidad de columnas del Tablero
     * @param pCantidadDeBarcos cantidad de barcos por bando en el juego.
     */
    private void generarBarcos(int pFilas, int pColumnas, int pCantidadDeBarcos) {

        // Establece la cantidad de barcos que habran para los Aliados y los Enemigos
        tableroDeJuego.setCantidadBarcosAliados(pCantidadDeBarcos);
        tableroDeJuego.setCantidadBarcosEnemigos(pCantidadDeBarcos);
        // Creamos el Metodo que genera los Random
        Random generadorRandom = new Random(System.currentTimeMillis());

        // En el for se crean la cantidad de barcos random para Aliados y Enemigos
        for (int i = 0; i < pCantidadDeBarcos; i++) {
            int filas;
            int columnas;
            // El do/while es para crear los barcos Aliados en la fila y columna random.
            do {
                filas = generadorRandom.nextInt(pFilas / 2);
                columnas = generadorRandom.nextInt(pColumnas);

            } while (!tableroDeJuego.setBarco(filas, columnas));
            System.out.println("Barco Aliado creado en " + filas + "," + columnas);

            // El do/while es para crear los barcos Enemigos en la fila y columna random.
            do {
                filas = generadorRandom.nextInt(pFilas / 2) + ((pFilas / 2) + 1);
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
        ventanaConfiguracion.setVisible(true);
    }//GEN-LAST:event_MnI_ConfiguracionActionPerformed

    /**
     * Metodo utilizado para crear un nuevo jugador Aliado al seleccionar el
     * elemento del menu
     * @param evt
     */
    private void MnI_EditJueg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_EditJueg1ActionPerformed

        // Se crea un nuevo objeto Jugador que va a ser de tipo Aliado
        jugadorAliado = new Jugador(true);
        // Se establece el puntaje inicial del nuevo jugador        
        Lbl_ScorePlayer1.setText("0");
        // Se pasan los elementos que se van a modificar desde la ventana Usuarios
        // y se procede a mostrarla.
        ventanaUsuarios.setAliado(Lbl_Player1Photo, Lbl_Player1Name, jugadorAliado);
        ventanaUsuarios.setVisible(true);
    }//GEN-LAST:event_MnI_EditJueg1ActionPerformed

    /**
     * Metodo utilizado para crear un nuevo jugador Enemigo al seleccionar el
     * elemento del menu
     * @param evt
     */
    private void MnI_EditJueg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_EditJueg2ActionPerformed

        // Se crea un nuevo objeto Jugador que va a ser de tipo Enemigo
        jugadorEnemigo = new Jugador(false);
        // Se establece el puntaje inicial del nuevo jugador                
        Lbl_ScorePlayer2.setText("0");
        // Se pasan los elementos que se van a modificar desde la ventana Usuarios
        // y se procede a mostrarla.
        ventanaUsuarios.setAliado(Lbl_Player2Photo, Lbl_Player2Name, jugadorEnemigo);
        ventanaUsuarios.setVisible(true);
    }//GEN-LAST:event_MnI_EditJueg2ActionPerformed

    /**
     * Metodo utilizado para verificar si el usuario desea cerrar la ventana una
     * vez presionado el boton X
     * @param evt
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        // Mensaje solicitandole al usuario la confirmacion para salir del juego
        int opcion = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea"
                + " salir del juego?", "Salir",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        // Se cierra la aplicacion si selecciono "YES"
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void MnI_NuevoJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_NuevoJuegoActionPerformed

        // Verifica si aun no se crearon los jugadores antes de crear una nueva partida
        if ((jugadorAliado == null) || (jugadorEnemigo == null)
                || (jugadorAliado.getNombreJugador().equals(""))
                || (jugadorEnemigo.getNombreJugador().equals(""))) {
            JOptionPane.showMessageDialog(this, "No se han creado los jugadores aún.");
        } else {

            // Obtiene los datos generados en la ventana configuracion
            int numeroColumnas = ventanaConfiguracion.getColumnasDelTablero();
            int numeroFilasPorUsuario = ventanaConfiguracion.getFilasDe1Usuario();
            int numeroBarcos = ventanaConfiguracion.getCantidadDeBarcos();

            // Se procede a generar el terreno de juego y los barcos, desde el metodo generarJuego
            generarJuego(numeroFilasPorUsuario, numeroColumnas, numeroBarcos);
        }
    }//GEN-LAST:event_MnI_NuevoJuegoActionPerformed

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
    private javax.swing.JLabel Lbl_Fondo;
    private javax.swing.JLabel Lbl_Player1Name;
    private javax.swing.JLabel Lbl_Player1Photo;
    private javax.swing.JLabel Lbl_Player2Name;
    private javax.swing.JLabel Lbl_Player2Photo;
    private javax.swing.JLabel Lbl_ScorePlayer1;
    private javax.swing.JLabel Lbl_ScorePlayer2;
    private javax.swing.JMenuItem MnI_AcercaDe;
    private javax.swing.JMenuItem MnI_Configuracion;
    private javax.swing.JMenuItem MnI_EditJueg1;
    private javax.swing.JMenuItem MnI_EditJueg2;
    private javax.swing.JMenuItem MnI_Instrucciones;
    private javax.swing.JMenuItem MnI_NuevoJuego;
    private javax.swing.JMenuItem MnI_Salir;
    private javax.swing.JPanel Pnl_Tablero;
    private javax.swing.JPanel Pnl_User1;
    private javax.swing.JPanel Pnl_User2;
    private javax.swing.JPanel Pnl_Usuarios;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
