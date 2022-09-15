package audio;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Audio {
//https://www.youtube.com/watch?v=g5jwBj7z9vo
    public static void main(String[] args) {
        double duracion,tiempo, tamaño;
    
        try {
      
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\Neoco_000\\Documents\\NetBeansProjects\\Audio\\src\\audio\\video.wav")));
             
            duracion = sonido.getMicrosecondLength();
            tiempo= (duracion/100000)/600;
            tamaño = sonido.getFrameLength();
            System.out.println("Tamaño en bits "+ tamaño);
            System.out.println("Tiempo "+ tiempo+"Minutos");
           System.out.println("Datos generales del audio "+ sonido.getFormat());
           
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
            System.out.println(ex.toString());

        }
    }

}
