/*
    *Name: AreaJuego    
    *Information: Clase que contiene toda la informacion del terreno de juego, asi
                  como la ubicacion de los barcos en una partida.    
    *Date:1/7/2014    
    *Copyright
 */
package Codigo;

/**
 *
 * @author Mario A
 */
public class Tablero {

    private boolean[][] tableroMatriz = null;
    private int cantidadBarcosAliados;
    private int cantidadBarcosEnemigos;

    /**
     * Metodo Constructor
     *
     * @param pFilas cantidad de filas del terreno de juego
     * @param pColumnas cantidad de columnas del terreno de juego
     */
    public Tablero(int pFilas, int pColumnas) {
        tableroMatriz = new boolean[pFilas][pColumnas];
    }

    public int getCantidadBarcosAliados() {
        return cantidadBarcosAliados;
    }

    public void setCantidadBarcosAliados(int cantidadBarcosAliados) {
        this.cantidadBarcosAliados = cantidadBarcosAliados;
    }

    public int getCantidadBarcosEnemigos() {
        return cantidadBarcosEnemigos;
    }

    public void setCantidadBarcosEnemigos(int cantidadBarcosEnemigos) {
        this.cantidadBarcosEnemigos = cantidadBarcosEnemigos;
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

        if (tableroMatriz[pFila][pColumna] == true) {
            return false;
        } else {
            tableroMatriz[pFila][pColumna] = true;
            return true;
        }
    }
    
    /**
     * Metodo para verificar si existe un barco en la posicion indicada
     * @param pFila fila indicada
     * @param pColumna columna indicada
     * @return true si existe un barco en la casilla, o false en caso contrario
     */
    public boolean hayBarco(int pFila, int pColumna){
        return tableroMatriz[pFila][pColumna];
    }
    
    /**
     * Metodo para obtener la matriz
     * @return matriz de juego
     */
    public boolean[][] getMatriz(){
        return tableroMatriz;
    }

    /**
     * Metodo para destruir un barco y eliminarlo de la matriz
     * @param pFila fila en la que se va a buscar si existe un barco
     * @param pColumna columna en la que se va a buscar si existe un barco
     * @return true si se destruye un barco o false en caso contrario
     */
    public boolean destruirBarco(int pFila, int pColumna){
         if (tableroMatriz[pFila][pColumna] == true) {
             tableroMatriz[pFila][pColumna] = false;
             return true;
        } else {            
            return false;
        }
    }

}
