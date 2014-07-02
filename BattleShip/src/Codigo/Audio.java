/*
    *Name: Audio    
    *Information: Clase donde se controlaran todos los aspectos necesarios para
                  la reproduccion de archivos de audio.    
    *Date:1/7/2014    
    *Copyright
 */

package Codigo;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 *
 * @author Mario A
 */
public class Audio {
    
    public BasicPlayer reproductor;
    
    /**
     * Metodo constructor que inicializa el reproductor
     */
    public Audio(){
       reproductor = new BasicPlayer();
    }
    
    /**
     * Metodo constructor que inicializa el reproductor y se le asigna el archivo
     * de audio que va a reproducir
     * @param pRutaDelArchivo ruta del Archivo de audio a reproducir 
     */
    public Audio(String pRutaDelArchivo){
        try {
            reproductor = new BasicPlayer();
            reproductor.open(new File(pRutaDelArchivo));
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Audio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Metodo para establecer un archivo al reproductor
     * @param ruta ruta del archivo de audio 
     */
    public void setFile(String ruta) {
        try {
            reproductor.open(new File(ruta));
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Audio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Metodo para reproducir el audio 
     */
    public void play(){
        try {
            reproductor.play();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Audio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Metodo para pausar el audio 
     */
    public void pause() {
        try {
            reproductor.pause();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Audio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Metodo para continuar reproduciendo el audio pausado 
     */
    public void resume() {
        try {
            reproductor.resume();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Audio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Metodo para detener la reproduccion 
     */
    public void stop() {
        try {
            reproductor.stop();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Audio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
