/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: alquilerCarros
 * Autor: Kelvin Guerrero - 06-feb-2013
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.alquilerCarros.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * Clase donde se coloca la imagen encabezado
 */
@SuppressWarnings("serial")
public class PanelImagen extends JPanel {

	/**
	 * Método constructor por defecto. Coloca la imagen del encabezado de la
	 * aplicación.
	 */
	public PanelImagen() {
		setLayout( new BorderLayout( ) );
		JLabel imagen = new JLabel();
		ImageIcon icono = new ImageIcon("data/imagenes/superior.jpg");
		// La agrega a la etiqueta
		imagen = new JLabel("");
		imagen.setIcon(icono);
		imagen.setHorizontalAlignment( JLabel.CENTER );
		add(imagen, BorderLayout.CENTER );

		setBackground(Color.WHITE);
		setBorder(new LineBorder(Color.BLACK));
	}
}
