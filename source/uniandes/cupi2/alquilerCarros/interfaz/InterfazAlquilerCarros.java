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

import java.awt.*;

import javax.swing.*;

import uniandes.cupi2.alquilerCarros.mundo.AlquilerCarros;

/**
 * Esta es la ventana principal de la aplicación.
 */
@SuppressWarnings("serial")
public class InterfazAlquilerCarros extends JFrame
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Clase principal del mundo
     */
    private AlquilerCarros alquilerCarros;

    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Panel del encabezado de la aplicación
     */
    private PanelImagen panelImagen;

    /**
     * Panel del carro 1 
     */
    private PanelCarro panelInformacion1;

    /**
     * Panel del carro 2 
     */
    private PanelCarro panelInformacion2;

    /**
     * Panel del carro 3 
     */
    private PanelCarro panelInformacion3;

    /**
     * Panel con los botones de extensión del documento
     */
    private PanelExtension panelExtension;

    /**
     * Panel con la información consolidada de la aplicación
     */
    private PanelConsolidado panelConsolidado;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Descripción <br>
     * <b>post: </b> Descripción
     */
    public InterfazAlquilerCarros( )
    {
        // Crea la clase principal
        alquilerCarros = new AlquilerCarros( );
        alquilerCarros.inicializar( );

        // Construye la forma
        setLayout( new BorderLayout( ) );
        setTitle( "CupiRent" );
        setSize( 800, 600 );
        setResizable( false );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLocationRelativeTo( null );

        // Creación de los paneles aquí
        panelImagen = new PanelImagen( );
        add( panelImagen, BorderLayout.NORTH );

        panelInformacion1 = new PanelCarro( this, alquilerCarros.darCarro1( ), "data/imagenes/renault.jpg", 1 );
        panelInformacion1.setPreferredSize( new Dimension( 265, 100 ) );

        panelInformacion2 = new PanelCarro( this, alquilerCarros.darCarro2( ), "data/imagenes/bmw.jpg", 2 );
        panelInformacion2.setPreferredSize( new Dimension( 265, 100 ) );

        panelInformacion3 = new PanelCarro( this, alquilerCarros.darCarro3( ), "data/imagenes/mercedez.jpg", 3 );
        panelInformacion3.setPreferredSize( new Dimension( 265, 100 ) );

        add( panelInformacion1, BorderLayout.WEST );

        add( panelInformacion2, BorderLayout.CENTER );

        add( panelInformacion3, BorderLayout.EAST );

        JPanel panelAux = new JPanel( );
        panelAux.setLayout( new BorderLayout( ) );

        panelConsolidado = new PanelConsolidado( );
        panelAux.add( panelConsolidado, BorderLayout.NORTH );

        panelExtension = new PanelExtension( this );
        panelAux.add( panelExtension, BorderLayout.SOUTH );

        add( panelAux, BorderLayout.SOUTH );
        panelConsolidado.actualizar( alquilerCarros );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Método encargado de llamar al método registrar alquiler carro del mundo
     * @param pNumeroHoras numero de horas de alquiler del carro 1
     */
    public void alquilarCarro1( int pNumeroHoras )
    {
        alquilerCarros.registrarAlquilerCarro1( pNumeroHoras );
        panelConsolidado.actualizar( alquilerCarros );
    }

    /**
     * Método encargado de llamar al método registrar alquiler carro del mundo
     * @param pNumeroHoras numero de horas de alquiler del carro 2
     */
    public void alquilarCarro2( int pNumeroHoras )
    {
        alquilerCarros.registrarAlquilerCarro2( pNumeroHoras );
        panelConsolidado.actualizar( alquilerCarros );
    }

    /**
     * Método encargado de llamar al método registrar alquiler carro del mundo
     * @param pNumeroHoras numero de horas de alquiler del carro 3
     */
    public void alquilarCarro3( int pNumeroHoras )
    {
        alquilerCarros.registrarAlquilerCarro3( pNumeroHoras );
        panelConsolidado.actualizar( alquilerCarros );
    }

    /**
     * Método encargado de llamar al método registrar alquiler carro con Cupon del mundo
     * @param pNumeroHoras numero de horas de alquiler del carro 1
     */
    public void alquilarCuponCarro1( int pNumeroHoras )
    {
        alquilerCarros.registrarAlquilerCuponCarro1( pNumeroHoras );
        panelConsolidado.actualizar( alquilerCarros );
    }


    /**
     * Método encargado de llamar al método registrar alquiler carro con Cupon del mundo
     * @param pNumeroHoras numero de horas de alquiler del carro 2
     */
    public void alquilarCuponCarro2( int pNumeroHoras )
    {
        alquilerCarros.registrarAlquilerCuponCarro2( pNumeroHoras );
        panelConsolidado.actualizar( alquilerCarros );
    }


    /**
     * Método encargado de llamar al método registrar alquiler carro con Cupon del mundo
     * @param pNumeroHoras numero de horas de alquiler del carro 3
     */
    public void alquilarCuponCarro3( int pNumeroHoras )
    {
        alquilerCarros.registrarAlquilerCuponCarro3( pNumeroHoras );
        panelConsolidado.actualizar( alquilerCarros );
    }

    /**
     * Método encargado de llamar el reiniciar de los datos del mundo y encargado en actualizar la interfaz para que se queden los datos en 0
     */
    public void reiniciar( )
    {
        alquilerCarros.reiniciar( );
        panelConsolidado.actualizar( alquilerCarros );

        panelInformacion1.actualizar( );
        panelInformacion2.actualizar( );
        panelInformacion3.actualizar( );
    }
    // -----------------------------------------------------------------
    // Puntos de Extensión
    // -----------------------------------------------------------------

    /**
     * Método para la extensión 1
     */
    public void reqFuncOpcion1( )
    {
        String resultado = alquilerCarros.metodo1( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * Método para la extensión 2
     */
    public void reqFuncOpcion2( )
    {
        String resultado = alquilerCarros.metodo2( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    // -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    /**
     * Este método ejecuta la aplicación, creando una nueva interfaz
     * 
     * @param args
     */
    public static void main( String[] args )
    {
        try
        {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );
        }
        catch( Exception e )
        {
            e.printStackTrace( );
        }
        InterfazAlquilerCarros interfaz = new InterfazAlquilerCarros( );
        interfaz.setVisible( true );
    }
}
