package uniandes.cupi2.alquilerCarros.interfaz;

import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import uniandes.cupi2.alquilerCarros.mundo.AlquilerCarros;

/**
 * Panel que muestra la informaci�n consolidada de la estaci�n de servicio
 */
@SuppressWarnings("serial")
public class PanelConsolidado extends JPanel
{
    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    /**
     * Etiqueta consolidado n�mero de horas alquiladas
     */
    private JLabel etiquetaNumHoras;

    /**
     * Etiqueta consolidado dinero total recaudado
     */
    private JLabel etiquetaDineroRecaudado;

    /**
     * Etiqueta costo promedio de la hora de acuerdo a los alquileres realizados
     */
    private JLabel etiquetaPromedioHora;

    /**
     * Etiqueta cantidad de bonos redimidos
     */
    private JLabel etiquetaCantidadBonos;

    /**
     * Campo de texto consolidado n�mero de bonos redimidos
     */
    private JTextField txtCantidadBonos;

    /**
     * Campo de texto consolidado n�mero de horas alquiladas
     */
    private JTextField txtNumHoras;

    /**
     * Campo de texto consolidado dinero total recaudado
     */
    private JTextField txtDineroRecaudado;

    /**
     * Campo de texto costo promedio de horas de acuerdo a los alquileres
     * 
     */
    private JTextField txtPromedioHora;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del panel
     */
    public PanelConsolidado( )
    {
        etiquetaCantidadBonos = new JLabel( " Canitdad de Bonos Redimidos: " );
        etiquetaCantidadBonos.setHorizontalAlignment( JLabel.LEFT );

        etiquetaDineroRecaudado = new JLabel( " Dinero Total Recaudado: " );
        etiquetaDineroRecaudado.setHorizontalAlignment( JLabel.LEFT );

        txtDineroRecaudado = new JTextField( " $ " );
        txtDineroRecaudado.setEditable( false );

        etiquetaNumHoras = new JLabel( " Horas Alquiladas: " );
        etiquetaNumHoras.setHorizontalAlignment( JLabel.LEFT );

        txtCantidadBonos = new JTextField( "0" );
        txtCantidadBonos.setEditable( false );

        txtNumHoras = new JTextField( );
        txtNumHoras.setEditable( false );

        etiquetaPromedioHora = new JLabel( " Costo Promedio por Hora: " );
        etiquetaPromedioHora.setHorizontalAlignment( JLabel.LEFT );

        txtPromedioHora = new JTextField( " $ 0" );
        txtPromedioHora.setEditable( false );

        setBorder( BorderFactory.createTitledBorder( "Consolidado Total" ) );
        setLayout( new GridLayout( 2, 3 ) );

        add( etiquetaCantidadBonos );
        add( etiquetaNumHoras );
        add( etiquetaDineroRecaudado );
        add( etiquetaPromedioHora );
        add( txtCantidadBonos );
        add( txtNumHoras );
        add( txtDineroRecaudado );
        add( txtPromedioHora );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Actualiza los campos de interfaz con los consolidados de la estaci�n
     * @param alquiler Estaci�n de servicio
     */
    public void actualizar( AlquilerCarros alquiler )
    {
        txtDineroRecaudado.setText( " $ " + formatearValorReal( alquiler.darTotalDineroRecaudado( ), 2 ) );
        txtNumHoras.setText( " " + formatearValorReal( alquiler.darTotalHorasAlquiler( ), 0 ) );
        txtCantidadBonos.setText( " " + alquiler.darTotalBonosRedimidos( ) );
        if( alquiler.darTotalHorasAlquiler( ) > 0 )
        {
            txtPromedioHora.setText( " $ " + formatearValorReal( alquiler.darCostoPromerdioHora( ), 2 ) );
        }
        else
        {
            txtPromedioHora.setText( " $ 0" );
        }
    }

    /**
     * Formatea un valor num�rico real para presentar en la interfaz <br>
     * @param valor El valor num�rico a ser formateado
     * @param numDigitos El n�mero de decimales deseados
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
