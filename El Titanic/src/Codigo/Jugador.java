/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Codigo;

import InterfazGrafica.AreaJuego;
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
    private int cantidadDeBarcos;    
    private int cantidadPartidasJugadas;
    private int cantidadPartidasGanadas;
    private int cantidadPartidasPerdidas;    
    // El Tipo define si es Aliado(1) o si es Enemigo(0)
    private boolean Aliado;
    
    // ***************  Metodo constructor  ************************************
    
    /**
     * Metodo constructor
     * @param pTipo tipo de jugador: 1->Aliado y 0->Enemigo
     * @param pCantidadBarcos cantidad de barcos
     * @param pAvatar Label con la imagen seleccionada del jugador
     */
    public Jugador(boolean pTipo, int pCantidadBarcos, JLabel pAvatar){
        this.cantidadDeBarcos = pCantidadBarcos;
        this.cantidadPartidasGanadas = 0;
        this.cantidadPartidasJugadas = 0;
        this.cantidadPartidasPerdidas = 0;        
        this.Aliado = pTipo;
        this.puntaje = 0;
        this.avatarJugador = pAvatar;
    }
    
    public Jugador(){
        
    }
    
    // ******************** Metodos Setters y Getters   ************************
    
    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    public int getCantidadDeBarcos() {
        return cantidadDeBarcos;
    }

    public void setCantidadDeBarcos(int cantidadDeBarcos) {
        this.cantidadDeBarcos = cantidadDeBarcos;
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
