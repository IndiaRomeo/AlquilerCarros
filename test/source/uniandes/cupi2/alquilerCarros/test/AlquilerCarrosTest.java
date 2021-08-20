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
package uniandes.cupi2.alquilerCarros.test;

import junit.framework.*;
import uniandes.cupi2.alquilerCarros.mundo.*;

/**
 * Prueba la clase AlquilerCarrosTest
 */
public class AlquilerCarrosTest extends TestCase
{

    // -------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------

    /**
     * El alquilerCarros de AlquilerCarrosTest
     */
    private AlquilerCarros alquilerCarros;


    // -------------------------------------------------------------
    // Métodos
    // -------------------------------------------------------------

    /**
     * Construye una nueva tienda de alquiler de carros vacía
     */
    private void setupEscenario1( )
    {
        alquilerCarros = new AlquilerCarros( );
        alquilerCarros.inicializar( );
    }

    /**
     * Construye una tienda de alquiler de carros con alquileres
     */
    private void setupEscenario2( )
    {
        alquilerCarros = new AlquilerCarros( );
        alquilerCarros.inicializar( );

        alquilerCarros.registrarAlquilerCarro1( 1 );
        alquilerCarros.registrarAlquilerCarro2( 2 );
        alquilerCarros.registrarAlquilerCarro3( 3 );
    }

    /**
     * Construye una tienda de alquiler de carros con alquileres con cupones
     */
    private void setupEscenario3( )
    {
        alquilerCarros = new AlquilerCarros( );
        alquilerCarros.inicializar( );

        alquilerCarros.registrarAlquilerCuponCarro1( 1 );
        alquilerCarros.registrarAlquilerCuponCarro2( 2 );
        alquilerCarros.registrarAlquilerCuponCarro3( 3 );
    }

    /**
     * Prueba 1 - Prueba el método inicializar Métodos a probar: <br>
     * inicializar, darCarro1, darCarro2, darCarro3
     */
    public void testInicializar( )
    {
        setupEscenario1( );

        assertNotNull( "No creó el carro 1", alquilerCarros.darCarro1( ) );
        assertNotNull( "No creó el carro 2", alquilerCarros.darCarro1( ) );
        assertNotNull( "No creó el carro 3", alquilerCarros.darCarro1( ) );
    }

    /**
     * Prueba 2 - Prueba el método RegistrarAlquilerCarro1<br>
     * Métodos a probar: <br>
     * registrarAlquilerCarro1, darDineroRecaudado
     */
    public void testRegistrarAlquilerCarro1( )
    {
        int numeroHoras = 2;
        setupEscenario1( );

        alquilerCarros.registrarAlquilerCarro1( numeroHoras );

        assertEquals( "No registró el numero de horas del alquiler correctamente", numeroHoras, alquilerCarros.darCarro1( ).darNumeroHoras( ) );
        assertEquals( "No registró el alquiler correctamente", 101000, alquilerCarros.darCarro1( ).darDineroRecaudado( ) );
    }

    /**
     * Prueba 3 - Prueba el método RegistrarAlquilerCarro2<br>
     * Métodos a probar: <br>
     * registrarAlquilerCarro2, darDineroRecaudado
     */
    public void testRegistrarAlquilerCarro2( )
    {
        int numeroHoras = 2;
        setupEscenario1( );

        alquilerCarros.registrarAlquilerCarro2( numeroHoras );

        assertEquals( "No registró el numero de horas del alquiler correctamente", numeroHoras, alquilerCarros.darCarro2( ).darNumeroHoras( ) );
        assertEquals( "No registró el alquiler correctamente", 200500, alquilerCarros.darCarro2( ).darDineroRecaudado( ) );
    }

    /**
     * Prueba 4 - Prueba el método RegistrarAlquilerCarro3<br>
     * Métodos a probar: <br>
     * registrarAlquilerCarro3, darDineroRecaudado
     */
    public void testRegistrarAlquilerCarro3( )
    {
        int numeroHoras = 2;
        setupEscenario1( );

        alquilerCarros.registrarAlquilerCarro3( numeroHoras );

        assertEquals( "No registró el numero de horas del alquiler correctamente", numeroHoras, alquilerCarros.darCarro3( ).darNumeroHoras( ) );
        assertEquals( "No registró el alquiler correctamente", 300640, alquilerCarros.darCarro3( ).darDineroRecaudado( ) );
    }

    /**
     * Prueba 5 - Prueba el método RegistrarAlquilerCarro1<br>
     * Métodos a probar: <br>
     * registrarAlquilerCarro1, darDineroRecaudado
     */
    public void testRegistrarAlquilerCuponCarro1( )
    {
        int numeroHoras = 2;
        setupEscenario1( );

        alquilerCarros.registrarAlquilerCuponCarro1( numeroHoras );

        assertEquals( "No registró el numero de horas del alquiler correctamente", numeroHoras, alquilerCarros.darCarro1( ).darNumeroHoras( ) );
        assertEquals( "No registró el alquiler correctamente", 50500, alquilerCarros.darCarro1( ).darDineroRecaudado( ) );
    }

    /**
     * Prueba 6 - Prueba el método RegistrarAlquilerCarro2<br>
     * Métodos a probar: <br>
     * registrarAlquilerCarro2, darDineroRecaudado
     */
    public void testRegistrarAlquilerCuponCarro2( )
    {
        int numeroHoras = 2;
        setupEscenario1( );

        alquilerCarros.registrarAlquilerCuponCarro2( numeroHoras );

        assertEquals( "No registró el numero de horas del alquiler correctamente", numeroHoras, alquilerCarros.darCarro2( ).darNumeroHoras( ) );
        assertEquals( "No registró el alquiler correctamente", 100250, alquilerCarros.darCarro2( ).darDineroRecaudado( ) );
    }

    /**
     * Prueba 7 - Prueba el método RegistrarAlquilerCarro3<br>
     * Métodos a probar: <br>
     * registrarAlquilerCarro3, darDineroRecaudado
     */
    public void testRegistrarAlquilerCuponCarro3( )
    {
        int numeroHoras = 2;
        setupEscenario1( );

        alquilerCarros.registrarAlquilerCuponCarro3( numeroHoras );

        assertEquals( "No registró el numero de horas del alquiler correctamente", numeroHoras, alquilerCarros.darCarro3( ).darNumeroHoras( ) );
        assertEquals( "No registró el alquiler correctamente", 150320, alquilerCarros.darCarro3( ).darDineroRecaudado( ) );
    }

    /**
     * Prueba 8 - Prueba el método DarCostoPromerdioHora<br>
     * Métodos a probar: <br>
     * darTotalDineroRecaudado, darCostoPromerdioHora
     */
    public void testDarCostoPromerdioHora( )
    {
        setupEscenario2( );
        assertEquals( "No calcula correctamente el costo promedio de horas del alquiler", 116993.0, alquilerCarros.darCostoPromerdioHora( ) ,1);
    }

    /**
     * Prueba 9 - Prueba el método DarTotalDineroRecaudado<br>
     * Métodos a probar: <br>
     * darCarro1, darCarro2, darCarro2, darPrecioHora, darTotalDineroRecaudado
     */
    public void testDarTotalDineroRecaudado( )
    {
        setupEscenario2( );
        assertEquals( "No calcula correctamente el total del dinero recaudado.", 701960, alquilerCarros.darTotalDineroRecaudado( ) );
    }

    /**
     * Prueba 10 - Prueba el método DarTotalHorasAlquiler<br>
     * Métodos a probar: <br>
     * darTotalHorasAlquiler
     */
    public void testDarTotalHorasAlquiler( )
    {
        setupEscenario2( );
        assertEquals( "No calcula correctamente el total del dinero recaudado.", 6, alquilerCarros.darTotalHorasAlquiler( ) );
    }

    /**
     * Prueba 11 - Prueba el método DarTotalDineroRecaudado con bonos de descuento<br>
     * Métodos a probar: <br>
     * darCarro1, darCarro2, darCarro2, darPrecioHora, darTotalDineroRecaudado
     */
    public void testDarTotalDineroRecaudadoCupones( )
    {
        setupEscenario3( );
        assertEquals( "No calcula correctamente el total del dinero recaudado.", 350980, alquilerCarros.darTotalDineroRecaudado( ) );
    }

    /**
     * Prueba 12 - Prueba el método DarTotalBonosRedimidos<br>
     * Métodos a probar: <br>
     * darTotalBonosRedimidos
     */
    public void testDarTotalBonosRedimidos()
    {
        setupEscenario3( );
        alquilerCarros.registrarAlquilerCarro1( 5 );
        
        assertEquals( "No se retorna correctamente el total de bonos redimidos", 3, alquilerCarros.darTotalBonosRedimidos( ));
    }
    
    /**
     * Prueba 13 - Prueba el método reiniciar <br>
     * Métodos a probar: <br>
     * reiniciar, darSurtidor1, darSurtidor2, darSurtidor3
     */
    public void testReiniciar( )
    {
        setupEscenario2( );

        alquilerCarros.reiniciar();
        Carro carro1 = alquilerCarros.darCarro1( );
        Carro carro2 = alquilerCarros.darCarro2( );
        Carro carro3 = alquilerCarros.darCarro3( );

        assertTrue( "No reinicia el dinero recaudado en cero", carro1.darDineroRecaudado( ) == 0 );
        assertTrue( "No reinicia el número de cupones redimidos en cero", carro1.darCuponesRedimidos( ) == 0 );
        assertTrue( "No reinicia el número de horas alquiladas en cero", carro1.darNumeroHoras( ) == 0 );
        
        assertTrue( "No reinicia el dinero recaudado en cero", carro2.darDineroRecaudado( ) == 0 );
        assertTrue( "No reinicia el número de cupones redimidos en cero", carro2.darCuponesRedimidos( ) == 0 );
        assertTrue( "No reinicia el número de horas alquiladas en cero", carro2.darNumeroHoras( ) == 0 );
        
        assertTrue( "No reinicia el dinero recaudado en cero", carro3.darDineroRecaudado( ) == 0 );
        assertTrue( "No reinicia el número de cupones redimidos en cero", carro3.darCuponesRedimidos( ) == 0 );
        assertTrue( "No reinicia el número de horas alquiladas en cero", carro3.darNumeroHoras( ) == 0 );
    }

}