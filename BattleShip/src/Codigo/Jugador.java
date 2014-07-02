/*
    *Name: AreaJuego    
    *Information: Clase que contiene toda la informacion del el jugador. 
    *Date:1/7/2014    
    *Copyright
 */

package Codigo;

import javax.swing.JLabel;

/**
 * 
 * @author Mario A
 */

public class Jugador {
    
    // **************    Declaracion de Variables    ***************************
    
    private String nombreJugador;
    private JLabel avatarJugador;
    private int puntaje;  
    private int cantidadPartidasJugadas;
    private int cantidadPartidasGanadas;
    private int cantidadPartidasPerdidas;    
    // El Tipo define si es Aliado(1) o si es Enemigo(0)
    private boolean Aliado;
    
    // ***************  Metodo constructor  ************************************
    
    /**
     * Metodo constructor
     * @param pTipoJugador true si es Aliado o false si es Enemigo
     * @param pNombre Nombre del jugador
     * @param pAvatar Avatar del jugador
     */    
    public Jugador(boolean pTipoJugador, String pNombre, JLabel pAvatar){
        
        nombreJugador = pNombre;
        avatarJugador = pAvatar;
        puntaje = 0;
        cantidadPartidasGanadas = 0;
        cantidadPartidasJugadas = 0;
        cantidadPartidasPerdidas = 0; 
        Aliado = pTipoJugador;
        
    }
    
    // ******************** Metodos Setters y Getters   ************************
    
    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getCantidadPartidasJugadas() {
        return cantidadPartidasJugadas;
    }

    public void setCantidadPartidasJugadas(int cantidadPartidasJugadas) {
        this.cantidadPartidasJugadas = cantidadPartidasJugadas;
    }

    public int getCantidadPartidasGanadas() {
        return cantidadPartidasGanadas;
    }

    public void setCantidadPartidasGanadas(int cantidadPartidasGanadas) {
        this.cantidadPartidasGanadas = cantidadPartidasGanadas;
    }

    public int getCantidadPartidasPerdidas() {
        return cantidadPartidasPerdidas;
    }

    public void setCantidadPartidasPerdidas(int cantidadPartidasPerdidas) {
        this.cantidadPartidasPerdidas = cantidadPartidasPerdidas;
    }

    public boolean isAliado() {
        return Aliado;
    }

    public void setTipoJugador(boolean tipoJugador) {
        this.Aliado = tipoJugador;
    }

    public JLabel getAvatarJugador() {
        return avatarJugador;
    }

    public void setAvatarJugador(JLabel avatarJugador) {
        this.avatarJugador = avatarJugador;
    }
    
    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
    
   
    

}
