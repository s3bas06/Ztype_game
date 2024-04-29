package program;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Ztype{
	
	private int wavesNumber = -1;
	int indiceAnterior = -1;
	
	private JFrame frame;
	private List<String[]> waves = new ArrayList<>();
	private List<String> waveActual = new ArrayList<>();
	
	private List<player> arregloEnemigos = new ArrayList<>();
	
	private String[] arreglo1 = {"Manzana", "Perro", "Montaña", "Sol"};
	private String[] arreglo2 = {"Gato", "Bosque", "Lápiz", "Casa"};
	private String[] arreglo3 = {"Auto", "Playa", "Libro", "Montaña"};
	
	private String[] arreglo4 = {"Flor", "Árbol", "Estrella", "Pelota", "Mariposa", "Reloj"};
	private String[] arreglo5 = {"Oso", "Cielo", "Nube", "Río", "Reloj", "Lámpara"};
	private String[] arreglo6 = {"Guitarra", "Universo", "Dinosaurio", "Globo", "Camión", "Sombrero"};
	private String[] arreglo7 = {"Aguacate", "Elefante", "Reloj", "Canción", "Nadar", "Bicicleta"};
	private String[] arreglo8 = {"Computadora", "Pintura", "Rosa", "Guitarra", "Ventana", "Reloj"};
	
	private String[] arreglo9 = {"Cebra", "Peluche", "Pastel", "Luna", "Reloj", "Elefante", "Jirafa", "Nube"};
	private String[] arreglo10 = {"Chocolate", "Elefante", "Mariposa", "Guitarra", "Reloj", "Cama", "Rana", "Flor"};
	private String[] arreglo11 = {"Camisa", "León", "Elefante", "Cielo", "Reloj", "Tigre", "Águila", "Flor"};
	private String[] arreglo12 = {"Lápiz", "Perro", "Cielo", "Manzana", "Reloj", "Elefante", "Vaca", "Globo"};
	private String[] arreglo13 = {"Libro", "Rana", "Elefante", "Tigre", "Reloj", "Mariposa", "Plátano", "Luna"};
	
	private String[] arreglo14 = {"Globo", "Piano", "Cebra", "Vaca", "Elefante", "Tigre", "Cielo", "Árbol", "Reloj", "Perro", "Cama", "Lámpara"};
	private String[] arreglo15 = {"Reloj", "Jirafa", "León", "Pelota", "Pastel", "Luna", "Rosa", "Estrella", "Computadora", "Tren", "Nube", "Gato"};
	private String[] arreglo16 = {"Elefante", "Flor", "Mariposa", "Peluche", "Canción", "Águila", "Río", "Guitarra", "Nube", "Sol", "Camisa", "Lápiz"};
	private String[] arreglo17 = {"Luna", "Globo", "Reloj", "Nube", "Estrella", "Cama", "Elefante", "Pintura", "Rana", "Cielo", "Pelota", "Perro"};
	private String[] arreglo18 = {"Árbol", "Gato", "Cebra", "Pastel", "Mariposa", "Elefante", "Guitarra", "Reloj", "Piano", "Flor", "Estrella", "Pelota"};
	private String[] arreglo19 = {"Mariposa", "Elefante", "Computadora", "Reloj", "Rana", "Nube", "Peluche", "Luna", "Águila", "Cielo", "Pastel", "Perro"};
	private String[] arreglo20 = {"Pelota", "Cama", "Nube", "Luna", "Guitarra", "Reloj", "Estrella", "Elefante", "Mariposa", "Piano", "Perro", "Globo"};
	private String[] arreglo21 = {"Pastel", "Pelota", "Luna", "Cama", "Águila", "Estrella", "Computadora", "Elefante", "Rosa", "Cielo", "Reloj", "Nube"};
	private String[] arreglo22 = {"Reloj", "Cielo", "Águila", "Globo", "Pintura", "Luna", "Computadora", "Pastel", "Elefante", "Mariposa", "Pelota", "Nube"};
	private String[] arreglo23 = {"Nube", "Águila", "Reloj", "Luna", "Globo", "Piano", "Cama", "Elefante", "Computadora", "Pelota", "Mariposa", "Estrella"};
	private String[] arreglo24 = {"Estrella", "Piano", "Águila", "Computadora", "Reloj", "Mariposa", "Pelota", "Luna", "Globo", "Nube", "Cama", "Elefante"};
	private String[] arreglo25 = {"Cama", "Reloj", "Águila", "Nube", "Luna", "Globo", "Elefante", "Pelota", "Mariposa", "Estrella", "Piano", "Computadora"};
	private String[] arreglo26 = {"Computadora", "Cama", "Elefante", "Pelota", "Mariposa", "Luna", "Reloj", "Águila", "Nube", "Globo", "Estrella", "Piano"};
	private String[] arreglo27 = {"Luna", "Águila", "Pelota", "Reloj", "Computadora", "Estrella", "Globo", "Piano", "Nube", "Mariposa", "Cama", "Elefante"};
	private String[] arreglo28 = {"Nube", "Globo", "Reloj", "Piano", "Águila", "Mariposa", "Cama", "Estrella", "Computadora", "Pelota", "Luna", "Elefante"};
	private String[] arreglo29 = {"Piano", "Mariposa", "Computadora", "Globo", "Estrella", "Reloj", "Nube", "Pelota", "Águila", "Luna", "Cama", "Elefante"};
	private String[] arreglo30 = {"Reloj", "Globo", "Pelota", "Nube", "Luna", "Águila", "Cama", "Mariposa", "Piano", "Computadora", "Elefante", "Estrella"};

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ztype window = new Ztype();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ztype() {
		waves.add(arreglo1);
		waves.add(arreglo2);
		waves.add(arreglo3);
		waves.add(arreglo4);
		waves.add(arreglo5);
		waves.add(arreglo6);
		waves.add(arreglo7);
		waves.add(arreglo8);
		waves.add(arreglo9);
		waves.add(arreglo10);
		waves.add(arreglo11);
		waves.add(arreglo12);
		waves.add(arreglo13);
		waves.add(arreglo14);
		waves.add(arreglo15);
		waves.add(arreglo16);
		waves.add(arreglo17);
		waves.add(arreglo18);
		waves.add(arreglo19);
		waves.add(arreglo20);
		waves.add(arreglo21);
		waves.add(arreglo22);
		waves.add(arreglo23);
		waves.add(arreglo24);
		waves.add(arreglo25);
		waves.add(arreglo26);
		waves.add(arreglo27);
		waves.add(arreglo28);
		waves.add(arreglo29);
		waves.add(arreglo30);
		
		frame = new JFrame();
		frame.setBounds(700, 90, 495, 848);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//initialize();
		newGame(frame);
		//settings(frame);
		//myStats();
		//loadMyOwnWords(frame);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ZTYPE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 61, 459, 153);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Impact", Font.BOLD, 150));
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(118, 543, 250, 232);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		//New game label
		
		JLabel lblNewLabel_1 = new JLabel("new game");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(10, 11, 230, 55);
		
		panel_1.add(lblNewLabel_1);
		
		//settings label
		
		JLabel lblNewLabel_1_1 = new JLabel("settings");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(10, 77, 230, 55);
		panel_1.add(lblNewLabel_1_1);
		
		//my stats label
		
		JLabel lblNewLabel_1_1_1 = new JLabel("my stats");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1_1_1.setBounds(10, 141, 230, 55);
		panel_1.add(lblNewLabel_1_1_1);
		
		//load my own words label
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("load my own words");
		lblNewLabel_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(10, 207, 230, 25);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		//fondo label e imagen
		
		ImageIcon fondo = new ImageIcon("src/program/Galaxia.gif");
		
		JLabel menuFondo = new JLabel(fondo);
		menuFondo.setBounds(0,0,fondo.getIconWidth(),fondo.getIconHeight());
		
		panel.add(menuFondo);
		
		
		/*
		 * 
		 * IMPLEMENTAR TODOS LOS MOUSELISTENER DE LOS LABEL.
		 *
		 */
		
		
		lblNewLabel_1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				frame.getContentPane().removeAll();
				newGame(frame);
				frame.repaint();
				frame.revalidate();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		lblNewLabel_1_1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				frame.getContentPane().removeAll();
				settings(frame);
				frame.repaint();
				frame.revalidate();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		lblNewLabel_1_1_1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				frame.getContentPane().removeAll();
				myStats(frame);
				frame.repaint();
				frame.revalidate();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		lblNewLabel_1_1_1_1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				frame.getContentPane().removeAll();
				loadMyOwnWords(frame);
				frame.repaint();
				frame.revalidate();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	private void newGame(JFrame frame) {
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		ImageIcon fondo = new ImageIcon("src/program/Galaxia.gif");
		ImageIcon jugador = new ImageIcon("src/program/nave.png");
		Image imagenEscalada = jugador.getImage().getScaledInstance(100, -1, Image.SCALE_SMOOTH);
		ImageIcon jugadorEscalado = new ImageIcon(imagenEscalada);
		ImageIcon pausa = new ImageIcon("src/program/boton de pausa.png");
		
		JLabel player = new JLabel(jugadorEscalado);
		player.setBounds(200,700,jugadorEscalado.getIconWidth(), jugadorEscalado.getIconHeight());
		panel.add(player);
		
		JLabel menuFondo = new JLabel(fondo);
		menuFondo.setBounds(0,0,fondo.getIconWidth(),fondo.getIconHeight());
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 52, 52);
		panel_1.setBackground(new Color(240,240,240,100));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel botonPausa = new JLabel(pausa);
		botonPausa.setBounds(10,11,32,32);
		panel_1.add(botonPausa);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(51, 115, 376, 584);
		panel.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setVisible(false);
		panel_2.setBackground(new Color(240,240,240,140));
		
		JLabel lblNewLabel_3 = new JLabel("PAUSE");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 11, 356, 38);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("-       50%    + ");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblNewLabel_3_1.setBounds(10, 163, 356, 38);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("-       50%    + ");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblNewLabel_3_1_1.setBounds(10, 379, 356, 38);
		panel_2.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Back to title");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_3_1_1_1.setBounds(10, 523, 356, 38);
		panel_2.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Sound");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_3_1_2.setBounds(10, 83, 356, 38);
		panel_2.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("Music");
		lblNewLabel_3_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_3_1_2_1.setBounds(10, 293, 356, 38);
		panel_2.add(lblNewLabel_3_1_2_1);
		
		
		/*
		 * 
		 * ADD MOUSELISTENERS
		 * 
		 * 
		 */
		
		panel_1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				//Timer.stop();
				panel_2.setVisible(true);
				lblNewLabel_3_1_1_1.addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent e) {
						frame.getContentPane().removeAll();
						initialize();
						frame.repaint();
						frame.revalidate();
					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
				});
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		panel.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				panel_2.setVisible(false);
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		/*
		 * 
		 * 
		 *  CREACION DE TODAS LAS COSAS DEL JUEGO, EL TIMER, LA CREACION DE NAVES ENEMIGAS, GENERACION DE LAS PALABRAS, ETC.
		 * 
		 * 
		 * 
		 */
		
		Timer timerJuego = new Timer(100, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		
		timerJuego.start();
		generarArreglo(indiceAnterior);
		generarNaves(panel);
		
		wavesNumber = 1;
		
		panel.add(menuFondo);
	}
	
	private void generarNaves(JPanel panel) {
		int cant = waveActual.size();
		List<JLabel> arregloJLabel = new ArrayList<>();
		for(int i = 0; i<cant; i++) {
			Random randx = new Random();
			Random randy = new Random();
			Random booleano = new Random();
			Boolean lanzar = false;
			
			int x = randx.nextInt(300) + 50;
			int y = randy.nextInt(1);
		
			if(wavesNumber>4) {
				lanzar = booleano.nextBoolean();
				if(lanzar) {
					ImageIcon naveEnemiga = new ImageIcon("src/program/nave enemiga 2.png");
					Image imagenEscalada = naveEnemiga.getImage().getScaledInstance(64, -1, Image.SCALE_SMOOTH);
					ImageIcon enemigoEscalado = new ImageIcon(imagenEscalada);
					arregloEnemigos.add(new player(x,(-1) * y, 64,64, enemigoEscalado, true)); 
				}else {
					ImageIcon naveEnemiga = new ImageIcon("src/program/nave enemiga 1.png");
					Image imagenEscalada = naveEnemiga.getImage().getScaledInstance(64, -1, Image.SCALE_SMOOTH);
					ImageIcon enemigoEscalado= new ImageIcon(imagenEscalada);
					arregloEnemigos.add(new player(x,(-1) * y, 64,64, enemigoEscalado, true)); 
				}
			}else {
				ImageIcon naveEnemiga = new ImageIcon("src/program/nave enemiga 1.png");
				Image imagenEscalada = naveEnemiga.getImage().getScaledInstance(64, -1, Image.SCALE_SMOOTH);
				ImageIcon enemigoEscalado= new ImageIcon(imagenEscalada);
				arregloEnemigos.add(new player(x,(-1) * y, 64,64, enemigoEscalado, true)); 
			}
		}
		
		for(int i = 0; i<arregloEnemigos.size(); i++) {
			 JLabel enemigo = new JLabel(arregloEnemigos.get(i).getTextura());
			 enemigo.setBounds(arregloEnemigos.get(i).getX(), arregloEnemigos.get(i).getY(), arregloEnemigos.get(i).getWidth(), arregloEnemigos.get(i).getHeight());
			 arregloJLabel.add(enemigo);
		}
		
		for(int i = 0; i<arregloJLabel.size(); i++) {
			panel.add(arregloJLabel.get(i));
		}
	}

	private void generarArreglo(int indiceAnterior) {
		Random rand = new Random();
		int indice = 0;
		if(wavesNumber<=3) {
			indice = rand.nextInt(3);
			if(indice == indiceAnterior) {
				generarArreglo(indiceAnterior);
			}else {
				for(String palabras : waves.get(indice)) {
					waveActual.add(palabras);
				}
				indiceAnterior = indice;
			}
		}
		
		if(wavesNumber>3 && wavesNumber <= 8) {
			indice = rand.nextInt(5) + 3;
			if(indice == indiceAnterior) {
				generarArreglo(indiceAnterior);
			}else {
				for(String palabras : waves.get(indice)) {
					waveActual.add(palabras);
				}
				indiceAnterior = indice;
			}
		}
		
		if(wavesNumber>8 && wavesNumber <= 13) {
			indice = rand.nextInt(5) + 8;
			if(indice == indiceAnterior) {
				generarArreglo(indiceAnterior);
			}else {
				for(String palabras : waves.get(indice)) {
					waveActual.add(palabras);
				}
				indiceAnterior = indice;
			}
		}
		
		if(wavesNumber>13 && wavesNumber <= 30) {
			if(indice == indiceAnterior) {
				generarArreglo(indiceAnterior);
			}else {
				for(String palabras : waves.get(indice)) {
					waveActual.add(palabras);
				}
				indiceAnterior = indice;
			}
		}
	}
	
	
	private void settings(JFrame frame) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(97, 40, 288, 76);
		panel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setOpaque(false);		
		
		JLabel lblNewLabel_2 = new JLabel("Settings");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 0, 268, 76);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(0,0,0,150));
		panel_1_1.setLayout(null);
		
		panel_1_1.setBounds(97, 217, 288, 329);
		panel.add(panel_1_1);
		
		JLabel lblSoundVolume = new JLabel("-   50% +");
		lblSoundVolume.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoundVolume.setForeground(Color.WHITE);
		lblSoundVolume.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblSoundVolume.setBounds(10, 63, 268, 76);
		panel_1_1.add(lblSoundVolume);
		
		JLabel lblMusicVolume = new JLabel("-   50% +");
		lblMusicVolume.setHorizontalAlignment(SwingConstants.CENTER);
		lblMusicVolume.setForeground(Color.WHITE);
		lblMusicVolume.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblMusicVolume.setBounds(10, 221, 268, 76);
		panel_1_1.add(lblMusicVolume);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Sound");
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_1_2.setBounds(10, 11, 268, 50);
		panel_1_1.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Music");
		lblNewLabel_2_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_1_2_1.setBounds(10, 160, 268, 50);
		panel_1_1.add(lblNewLabel_2_1_2_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(97, 665, 288, 76);
		panel_1_1_1.setOpaque(false);
		panel.add(panel_1_1_1);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("Back to title");
		lblNewLabel_2_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_1_2_2.setBounds(10, 11, 268, 50);
		panel_1_1_1.add(lblNewLabel_2_1_2_2);
		
		ImageIcon fondo = new ImageIcon("src/program/Galaxia.gif");
		
		JLabel menuFondo = new JLabel(fondo);
		menuFondo.setBounds(0,0,fondo.getIconWidth(),fondo.getIconHeight());
		
		panel.add(menuFondo);
		
		
		/*
		 * 
		 * 
		 * MOUSE LISTENERS.
		 * 
		 * 
		 */
		
		lblNewLabel_2_1_2_2.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				frame.getContentPane().removeAll();
				initialize();
				frame.repaint();
				frame.revalidate();
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		lblSoundVolume.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		lblMusicVolume.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	private void myStats(JFrame frame) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(97, 40, 288, 76);
		panel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setOpaque(false);		
		
		JLabel lblNewLabel_2 = new JLabel("My stats");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 0, 268, 76);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(0,0,0,150));
		panel_1_1.setLayout(null);
		
		panel_1_1.setBounds(97, 217, 288, 329);
		panel.add(panel_1_1);
		
		JLabel lblStatsInformation = new JLabel("Informacion de los stats");
		lblStatsInformation.setVerticalAlignment(SwingConstants.TOP);
		lblStatsInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatsInformation.setForeground(Color.WHITE);
		lblStatsInformation.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblStatsInformation.setBounds(10, 63, 268, 255);
		panel_1_1.add(lblStatsInformation);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Best Scores");
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_1_2.setBounds(10, 11, 268, 50);
		panel_1_1.add(lblNewLabel_2_1_2);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(97, 665, 288, 76);
		panel_1_1_1.setOpaque(false);
		panel.add(panel_1_1_1);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("Back to title");
		lblNewLabel_2_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_1_2_2.setBounds(10, 11, 268, 50);
		panel_1_1_1.add(lblNewLabel_2_1_2_2);
		
		ImageIcon fondo = new ImageIcon("src/program/Galaxia.gif");
		
		
		JLabel menuFondo = new JLabel(fondo);
		menuFondo.setBounds(0,0,fondo.getIconWidth(),fondo.getIconHeight());
		
		/*
		 * 
		 * 
		 * 
		 * MOUSE LISTENERS
		 * 
		 * 
		 * 
		 */
		
		lblNewLabel_2_1_2_2.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				frame.getContentPane().removeAll();
				initialize();
				frame.repaint();
				frame.revalidate();
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		
		
		panel.add(menuFondo);
	}
	
	private void loadMyOwnWords(JFrame frame) {
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 40, 459, 76);
		panel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setOpaque(false);		
		
		JLabel lblNewLabel_2 = new JLabel("Load my own words");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 0, 439, 76);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(0,0,0,150));
		panel_1_1.setLayout(null);
		
		panel_1_1.setBounds(20, 127, 438, 527);
		panel.add(panel_1_1);
		
		JLabel lblStatsInformation = new JLabel("To load your own words you must to put it in\nthe area next to this write.");
		lblStatsInformation.setVerticalAlignment(SwingConstants.TOP);
		lblStatsInformation.setForeground(Color.WHITE);
		lblStatsInformation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStatsInformation.setBounds(10, 63, 418, 85);
		panel_1_1.add(lblStatsInformation);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("List of words");
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_1_2.setBounds(10, 11, 418, 50);
		panel_1_1.add(lblNewLabel_2_1_2);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(97, 665, 288, 76);
		panel_1_1_1.setOpaque(false);
		panel.add(panel_1_1_1);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("Back to title");
		lblNewLabel_2_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_1_2_2.setBounds(10, 11, 268, 50);
		panel_1_1_1.add(lblNewLabel_2_1_2_2);
		
		ImageIcon fondo = new ImageIcon("src/program/Galaxia.gif");
		
		JLabel menuFondo = new JLabel(fondo);
		menuFondo.setBounds(0,0,fondo.getIconWidth(),fondo.getIconHeight());
		
		/*
		 * 
		 * 
		 * Add mouseListeners.
		 * 
		 * 
		 */
		
		lblNewLabel_2_1_2_2.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				frame.getContentPane().removeAll();
				initialize();
				frame.repaint();
				frame.revalidate();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
}
