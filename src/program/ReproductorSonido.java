package program;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class ReproductorSonido {
	private Clip clip;
	private FloatControl gainControl;
	public void cargarSonido(String ruta) {
		try {
			File archivoSonido = new File(ruta);
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivoSonido);
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			
			gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void reproducir() {
		if(clip != null) {
			clip.setFramePosition(0);
			clip.start();
		}
	}
	
	public void detener() {
		if(clip != null && clip.isRunning()) {
			clip.stop();
		}
	}
	
    public void ajustarVolumen(float valor) {
        if (gainControl != null) {
            gainControl.setValue(valor);
        }
    }
    
    public void reproducirEnBucle() {
        if (clip != null) {
            clip.setFramePosition(0);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }
}
