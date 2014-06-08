/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

/**
 *
 * @author Mario A
 */
public class Tablero {

    private boolean[][] tableroJuego = null;

    /**
     * Metodo Constructor
     *
     * @param pFilas cantidad de filas del terreno de juego
     * @param pColumnas cantidad de columnas del terreno de juego
     */
    public Tablero(int pFilas, int pColumnas) {
        tableroJuego = new boolean[pFilas][pColumnas];
    }
    
    public Tablero(){
    
    }

    /**
     * Metodo utilizado para establecer un barco en el terreno de juego
     *
     * @param pFila fila en la que se almacenara el barco
     * @param pColumna columna en la que se almacenara el barco
     * @return true en caso de que se haya podido guardar o false en caso de que
     * ya exista un barco en dicha posicion.
     */
    public boolean setBarco(int pFila, int pColumna) {

        if (tableroJuego[pFila][pColumna] == true) {
            return false;
        } else {
            tableroJuego[pFila][pColumna] = true;
            return true;
        }
    }

    /**
     * Metodo para destruir un barco y eliminarlo de la matriz
     * @param pFila fila en la que se va a buscar si existe un barco
     * @param pColumna columna en la que se va a buscar si existe un barco
     * @return true si se destruye un barco o false en caso contrario
     */
    public boolean destruirBarco(int pFila, int pColumna){
         if (tableroJuego[pFila][pColumna] == true) {
             tableroJuego[pFila][pColumna] = false;
             return true;
        } else {            
            return false;
        }
    }
    
    /**
     * Metodo para crear un nuevo terreno de juego con nuevas medidas
     * @param pFilas cantidad de filas
     * @param pColumnas cantidad de columnas
     */
    public void reInicializarTerreno(int pFilas, int pColumnas){
        
        // Elimina la referencia al tablero de juego antiguo
        tableroJuego = null;
        // Crea un nuevo terreno de juego con las medidas especificadas
        tableroJuego = new boolean[pFilas][pColumnas];
        
    }
}
