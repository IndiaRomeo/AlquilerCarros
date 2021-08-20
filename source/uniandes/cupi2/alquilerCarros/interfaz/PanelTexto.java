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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import uniandes.cupi2.alquilerCarros.mundo.Carro;

/**
 * Panel de manejo de extensiones
 */
@SuppressWarnings("serial")
public class PanelTexto extends JPanel
{
    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    /**
     * Label marca
     */
    private JTextField txtMarca;

    /**
     * Label hora
     */
    private JTextField valorHora;

    /**
     * Label horas alquilar
     */
    private JTextField horasAlquilar;

    /**
     * Label horas alquiladas
     */
    private JTextField horasAlquiladas;

    /**
     * Label Cantidad Bonos
     */
    private JTextField cantidadBonos;

    /**
     * Carro actual del panel
     */
    private Carro carro;
    
    /**
     * Interfaz Principal
     */
    InterfazAlquilerCarros principal;
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Método encargado en construir el panel
     * @param pCarro Carro que llega por parametro para inicializar toda su infromacion
     */
    public PanelTexto( InterfazAlquilerCarros pVentama, Carro pCarro )
    {
        principal = pVentama;
        carro = pCarro;

        setLayout( new GridBagLayout( ) );
        GridBagConstraints gbc = new GridBagConstraints( );
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets( 3, 3, 3, 3 );

        // Texto Marca Carro
        JLabel labMarca = new JLabel( "Marca:" );
        labMarca.setForeground( Color.BLUE );
        gbc.gridx = 0;
        gbc.gridy = 0;
        add( labMarca, gbc );

        txtMarca = new JTextField( pCarro.darMarcaCarro( ) );
        txtMarca.setEditable( false );
        gbc.gridx = 1;
        add( txtMarca, gbc );

        // Label valor por hora
        JLabel labValorHora = new JLabel( "Valor por Hora:" );
        labValorHora.setForeground( Color.BLUE );
        gbc.gridx = 0;
        gbc.gridy = 1;
        add( labValorHora, gbc );

        valorHora = new JTextField( "$ " + formatearValorReal( pCarro.darPrecioHora( ), 2 ) );
        valorHora.setEditable( false );
        gbc.gridx = 1;
        add( valorHora, gbc );

        // Label Horas alquiladas
        JLabel lblHorasAlquiladas = new JLabel( "Hora alquiladas:" );
        lblHorasAlquiladas.setForeground( Color.BLUE );
        gbc.gridx = 0;
        gbc.gridy = 2;
        add( lblHorasAlquiladas, gbc );

        horasAlquiladas = new JTextField( carro.darNumeroHoras( ) + "" );
        horasAlquiladas.setEditable( false );
        gbc.gridx = 1;
        add( horasAlquiladas, gbc );

        // Label cantidad Bonos
        JLabel lblBonos = new JLabel( "Cantidad de Bonos:" );
        lblBonos.setForeground( Color.BLUE );
        gbc.gridx = 0;
        gbc.gridy = 3;
        add( lblBonos, gbc );

        cantidadBonos = new JTextField( carro.darCuponesRedimidos( ) + "" );
        cantidadBonos.setEditable( false );
        gbc.gridx = 1;
        add( cantidadBonos, gbc );

        // Text Field Horas a alquilar
        JLabel lblHorasAlquilar = new JLabel( "Horas a alquilar:" );
        lblHorasAlquilar.setForeground( Color.BLUE );
        gbc.gridx = 0;
        gbc.gridy = 4;
        add( lblHorasAlquilar, gbc );

        horasAlquilar = new JTextField( );
        horasAlquilar.setPreferredSize( new Dimension( 100, 20 ) );
        gbc.gridx = 1;
        add( horasAlquilar, gbc );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Método encargado en retornar las horas a alquilar que registro el usuario
     * @return
     */
    public int darHorasAlquilar( )
    {
        try
        {
            return Integer.parseInt( horasAlquilar.getText( ) );
        }
        catch( Exception e )
        {
            JOptionPane.showMessageDialog( principal, "Debe ingresar valores numéricos enteros en las horas a alquilar", "Error", JOptionPane.ERROR_MESSAGE );
            return -1;
        }
    }

    /**
     * Método encargado en actualizar los texto de cantidad bonos y horas alquiladas
     */
    public void actualizar( )
    {
        cantidadBonos.setText( carro.darCuponesRedimidos( ) + "" );
        horasAlquiladas.setText( carro.darNumeroHoras( ) + "" );
    }

    /**
     * Formatea un valor numérico real para presentar en la interfaz <br>
     * 
     * @param valor El valor numérico a ser formateado
     * @param numDigitos El número de decimales deseados
     * @return Cadena con el valor formateado con puntos y signos.
     */
    private String formatearValorReal( double valor, int numDigitos )
    {
        DecimalFormat df = ( DecimalFormat )NumberFormat.getInstance( );
        df.applyPattern( " ###,###.##" );
        df.setMinimumFractionDigits( 0 );
        return df.format( valor );
    }
}
