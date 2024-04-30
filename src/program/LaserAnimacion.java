package program;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class LaserAnimacion extends JPanel implements ActionListener {
	private int x1, y1;
	private int x2, y2;
	private int step = 10;
	private Timer timer;
	
	public LaserAnimacion(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
		timer = new Timer(100, this);
		timer.start();
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		g.drawLine(x1, y1, x2, y2);
	}
	
	public void actionPerformed(ActionEvent e) {
		 // Calcular el siguiente paso del rayo láser
        if (x1 < x2) {
            x1 += step;
        } else if (x1 > x2) {
            x1 -= step;
        }

        if (y1 < y2) {
            y1 += step;
        } else if (y1 > y2) {
            y1 -= step;
        }

        // Redibujar el panel
        repaint();

        // Detener la animación cuando el rayo láser alcanza la posición final
        if (x1 == x2 && y1 == y2) {
            timer.stop();
        }
		
	}
	
}
