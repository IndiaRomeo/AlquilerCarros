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
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import uniandes.cupi2.alquilerCarros.mundo.Carro;

/**
 * Panel de información Adicional
 */
@SuppressWarnings("serial")
public class PanelCarro extends JPanel implements ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
    /**
     * Comando Opción alquilar
     */
    private static final String ALQUILAR = "ALQUILAR";
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Ventana principal de la aplicación
     */
    private InterfazAlquilerCarros principal;
    /**
     * Objeto que representa el carro
     */
    private Carro carro;

    /**
     * Ventana de los botones
     */
    private PanelTexto panelTexto;

    /**
     * Flag del numero del carro
     */
    private int numCarro;
    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    /**
     * Botón Alquilar
     */
    private JButton btnAlquilar;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Método constructor del panel Carro
     * @param pPrincipal Panel principal
     * @param pCarro Carro actual de el panel
     * @param pImg Imagen del carro
     * @param pNumCarro Numero del carro actual en el panel
     */
    public PanelCarro( InterfazAlquilerCarros pPrincipal, Carro pCarro, String pImg, int pNumCarro )
    {

        principal = pPrincipal;
        setCarro( pCarro );
        numCarro = pNumCarro;

        setBorder( new TitledBorder( "Carro " + pNumCarro) );
        setLayout( new BorderLayout( ) );

        JLabel imagen = new JLabel( );
        ImageIcon icono = new ImageIcon( pImg );
        
        imagen = new JLabel( "", icono, JLabel.CENTER );
        imagen.setPreferredSize( new Dimension( 216, 100 ) );
        add( imagen, BorderLayout.NORTH );

        panelTexto = new PanelTexto( pPrincipal , pCarro);
        add( panelTexto, BorderLayout.CENTER );

        // Botón alquilar
        btnAlquilar = new JButton( "Alquilar Carro" );
        btnAlquilar.setActionCommand( ALQUILAR );
        btnAlquilar.addActionListener( this );
        add( btnAlquilar, BorderLayout.SOUTH );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
    
    /**
     * Manejo de los eventos de los botones
     * @param e Acción que generó el evento.
     */
    public void actionPerformed( ActionEvent e )
    {
        Object[] possibilities = {"Tarifa plena", "Cupon de descuento"};
        String alquilerRta = (String)JOptionPane.showInputDialog(principal," Selccionar forma de alquiler: ","Alquiler", JOptionPane.PLAIN_MESSAGE,null, possibilities,"Tarifa plena");
        if(alquilerRta != null)
        if( ALQUILAR.equals( e.getActionCommand( ) ) )
        {
            if( numCarro == 1 )
            {
                int rta = panelTexto.darHorasAlquilar( );
                if( rta != -1 )
                {
                    if(alquilerRta.equals( "Tarifa plena" ))
                    principal.alquilarCarro1( panelTexto.darHorasAlquilar( ) );
                    else
                    principal.alquilarCuponCarro1( panelTexto.darHorasAlquilar( ) );  
                }
            }
            else if( numCarro == 2 )
            {
                int rta = panelTexto.darHorasAlquilar( );
                if( rta != -1 )
                {
                    if(alquilerRta.equals( "Tarifa plena" ))
                        principal.alquilarCarro2( panelTexto.darHorasAlquilar( ) );
                        else
                        principal.alquilarCuponCarro2( panelTexto.darHorasAlquilar( ) );
                }
            }
            else if( numCarro == 3 )
            {
                int rta = panelTexto.darHorasAlquilar( );
                if( rta != -1 )
                {
                    if(alquilerRta.equals( "Tarifa plena" ))
                        principal.alquilarCarro3( panelTexto.darHorasAlquilar( ) );
                        else
                        principal.alquilarCuponCarro3( panelTexto.darHorasAlquilar( ) );
                }
            }
            
            ///
           /* if( numCarro == 1 )
            {
                int rta = panelTexto.darHorasAlquilar( );
                if( rta != -1 )
                {
                    if(alquilerRta.equals( "Cupon de descuento" ))
                    principal.alquilarCarro1( panelTexto.darHorasAlquilar( ) );
                    else
                    principal.alquilarCuponCarro1( panelTexto.darHorasAlquilar( ) );  
                }
            }
            else if( numCarro == 2 )
            {
                int rta = panelTexto.darHorasAlquilar( );
                if( rta != -1 )
                {
                    if(alquilerRta.equals( "Cupon de descuento" ))
                        principal.alquilarCarro2( panelTexto.darHorasAlquilar( ) );
                        else
                        principal.alquilarCuponCarro2( panelTexto.darHorasAlquilar( ) );
                }
            }
            else if( numCarro == 3 )
            {
                int rta = panelTexto.darHorasAlquilar( );
                if( rta != -1 )
                {
                    if(alquilerRta.equals( "Cupon de descuento" ))
                        principal.alquilarCarro3( panelTexto.darHorasAlquilar( ) );
                        else
                        principal.alquilarCuponCarro3( panelTexto.darHorasAlquilar( ) );
                }
            }*/
            actualizar();
        }
    }
    
    /**
     * Método encargado en actualizar el panel texto
     */
    public void actualizar()
    {
        panelTexto.actualizar( );
    }

    public Carro getCarro( )
    {
        return carro;
    }

    public void setCarro( Carro carro )
    {
        this.carro = carro;
    }

}
