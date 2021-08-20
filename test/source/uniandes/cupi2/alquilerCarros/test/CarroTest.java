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
 * Prueba la clase CarroTest
 */
public class CarroTest extends TestCase
{

    // -------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------

    /**
     * El carro de CarroTest
     */
    private Carro carro;

    /**
     * Variable de valor del alquiler
     */
    private int valorAlquiler;

    // -------------------------------------------------------------
    // Métodos
    // -------------------------------------------------------------

    /**
     * Construye un nuevo Carro vacío
     */
    public void setupEscenario1( )
    {
        carro = new Carro( );
        valorAlquiler = 52548;
        carro.inicializar( valorAlquiler, "Carro1" );
    }

    /**
     * Prueba 1 - Prueba el método inicializar Métodos a probar: <br>
     * inicializar, darCuponesRedimidos, darDineroRecaudado, darNumeroHoras, darMarcaCarro, darPrecioHora
     */
    public void testInicializar( )
    {
        setupEscenario1( );

        assertTrue( "No se crea con el los cupones en cero", carro.darCuponesRedimidos( ) == 0 );
        assertTrue( "No inicializa el dinero recaudado en cero", carro.darDineroRecaudado( ) == 0 );
        assertTrue( "No inicializa el número de horas alquiladas en cero", carro.darNumeroHoras( ) == 0 );
        assertTrue( "No se crea con la marca de carro por parámetro", carro.darMarcaCarro( ).equals( "Carro1" ) );
        assertTrue( "No se crea con el percio por hora por parámetro", carro.darPrecioHora( ) == 52548 );
    }

    /**
     * Prueba 2 - Prueba el método registrarAlquiler Métodos a probar: <br>
     * registrarAlquiler, darDineroRecaudado, darNumeroHoras
     */
    public void testRegistrarAlquiler( )
    {
        int horasAlquilar = 2;
        setupEscenario1( );

        carro.registrarAlquiler( horasAlquilar );

        assertTrue( "No incrementa el dinero recaudado correctamente", carro.darDineroRecaudado( ) == valorAlquiler * horasAlquilar );
        assertTrue( "No aumenta el número de horas alquiladas correctamente", carro.darNumeroHoras( ) == horasAlquilar );
    }

    /**
     * Prueba 3 - Prueba el método registrarAlquiler Métodos a probar: <br>
     * registrarAlquiler, darDineroRecaudado, darNumeroHoras
     */
    public void testRegistrarAlquilerCupon( )
    {
        setupEscenario1( );

        int horasAlquilar = 2;
        carro.registrarAlquilerCupon( horasAlquilar );

        assertTrue( "No incrementa el dinero recaudado correctamente", carro.darDineroRecaudado( ) == ( valorAlquiler * horasAlquilar ) * ( 0.5 ) );
        assertTrue( "No aumenta el número de cupones redimidos correctamente", carro.darCuponesRedimidos( ) == 1 );
        assertTrue( "No aumenta el número de horas alquiladas correctamente", carro.darNumeroHoras( ) == horasAlquilar );
    }

    /**
     * Prueba 4 - Prueba el método reiniciar Métodos a probar: <br>
     * reiniciar, darDineroRecaudado, darNumeroGalonesVendidos
     */
    public void testReiniciar( )
    {
        setupEscenario1( );

        int horasAlquilar = 12;
        carro.registrarAlquiler( horasAlquilar );
        carro.registrarAlquilerCupon( horasAlquilar );
        carro.reiniciar( );

        assertTrue( "No reinicia el dinero recaudado en cero", carro.darDineroRecaudado( ) == 0 );
        assertTrue( "No reinicia el número de cupones redimidos en cero", carro.darCuponesRedimidos( ) == 0 );
        assertTrue( "No reinicia el número de horas alquiladas en cero", carro.darNumeroHoras( ) == 0 );
    }

}