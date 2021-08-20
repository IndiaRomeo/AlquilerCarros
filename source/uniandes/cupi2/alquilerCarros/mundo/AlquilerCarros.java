/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: alquilerCarros
 * Autor: Kelvin Guerrero - 06-feb-2013
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.alquilerCarros.mundo;

/**
 * Clase que representa una tienda de la el alquiler de carros
 */
public class AlquilerCarros
{
    // -------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------

    /**
     * El carro 1 de la tienda
     */
    private Carro carro1;

    /**
     * El carro 2 de la tienda 
     */
    //TODO declare el atributo carro2 de tipo Carro
    private Carro carro2;

    /**
     * El carro 3 de la tienda 
     */
    //TODO declare el atributo carro2 de tipo Carro
    private Carro carro3;

    // -------------------------------------------------------------
    // M�todos
    // -------------------------------------------------------------

    /**
     * M�todo encargado de inicializar los carros de la tienda. Los carros se deben inicializar con la siguiente informaci�n:<br>
     * Carro 1 - costo alquiler: 50500, Marca: "Renault"
     * Carro 2 - costo alquiler: 100250, Marca:  "BMW" 
     * Carro 3 - costo alquiler: 150320, Marca:  "Mercedes-Benz"
     */
    public void inicializar( )
    {
        carro1 = new Carro( );
        carro1.inicializar( 50500, "Renault" );

        carro2 = new Carro( );
        carro2.inicializar( 100250, "BMW" );
        //TODO Inicialice el carro2 seg�n la documentaci�n del m�todo

        
        carro3 = new Carro( );
        carro3.inicializar( 150320, "Mercedes-Benz" );
        //TODO Inicialice el carro3 seg�n la documentaci�n del m�todo
    }

    /**
     * Devuelve el carro 1<br>
     * @return El carro 1
     */
    public Carro darCarro1( )
    {
        return carro1;
        
    }

    /**
     * Devuelve el carro 2<br>
     * @return El carro 2
     */
    public Carro darCarro2()//get
    {
        return carro2;
        //TODO Completar seg�n la documentaci�n del m�todo
        
    }

    /**
     * Devuelve el carro 3<br>
     * @return El carro 3
     */
    public Carro darCarro3( )
    {
        return carro3;
        //TODO Completar seg�n la documentaci�n del m�todo
    }


    /**
     * Devuelve el dinero total recaudado en la tienda por sus tres carros<br>
     * @return La sumatoria del dinero total recaudado por los tres carros
     */
    public int darTotalDineroRecaudado( )
    {
        
        return darCarro1( ).darDineroRecaudado( ) + darCarro2( ).darDineroRecaudado( ) + darCarro3( ).darDineroRecaudado( );
        //TODO Completar seg�n la documentaci�n del m�todo

    }
    
    /**
     * Devuelve el total de horas alquiladas, es decir la suma de las horas alquiladas de cada carro<br>
     * @return La cantidad de horas alquiladas de todos los carros
     */
    public int darTotalHorasAlquiler( )
    {
         int sumaHrsTotal = darCarro1().darNumeroHoras() + darCarro2().darNumeroHoras() + darCarro3().darNumeroHoras();
         
         return sumaHrsTotal;
        
        //TODO Completar seg�n la documentaci�n del m�todo

    }

    /**
     * Devuelve el costo promedio por hora, teniendo en cuenta el dinero recaudado por los tres carros <br> 
     * y el total de horas de alquiler.
     * @return El costo promedio por hora
     */
    public double darCostoPromerdioHora( )
    {
        
        double promedio = darTotalDineroRecaudado() / darTotalHorasAlquiler( );
        return promedio;
        //TODO Completar seg�n la documentaci�n del m�todo

    }
    
    /**
     * Devuelve el total de cupones redimidos en la tienda<br>
     * @return La cantidad de cupones redimidos
     */
    public int darTotalBonosRedimidos( )
    {
        int cuponesTotal = darCarro1().darCuponesRedimidos( ) + darCarro2().darCuponesRedimidos( ) + darCarro3( ).darCuponesRedimidos( );
        
        return cuponesTotal;
        //TODO Completar seg�n la documentaci�n del m�todo

    }

   

    /**
     * Registra un alquiler para el carro 1 <br>
     * @param pNumeroHoras Numero de horas a alquilar. pNumeroHoras > 0
     */
    public void registrarAlquilerCarro1( int pNumeroHoras )
    {
        carro1.registrarAlquiler( pNumeroHoras );
    }

    /**
     * Registra un alquiler para el carro 2 <br>
     * @param pNumeroHoras Numero de horas a alquilar. pNumeroHoras > 0
     */
    public void registrarAlquilerCarro2( int pNumeroHoras )
    {
        carro2.registrarAlquiler( pNumeroHoras );
        //TODO Completar seg�n la documentaci�n del m�todo
    }

    /**
     * Registra un alquiler para el carro 3 <br>
     * @param pNumeroHoras Numero de horas a alquilar. pNumeroHoras > 0
     */
    public void registrarAlquilerCarro3( int pNumeroHoras )
    {
        carro3.registrarAlquiler( pNumeroHoras );
        //TODO Completar seg�n la documentaci�n del m�todo
    }

    /**
     * Registra un alquiler con el cup�n de descuento para el carro 1 <br>
     * @param pNumeroHoras Numero de horas a alquilar. pNumeroHoras > 0
     */
    public void registrarAlquilerCuponCarro1( int pNumeroHoras )
    {
        carro1.registrarAlquilerCupon( pNumeroHoras );
        
    }

    /**
     * Registra un alquiler con el cup�n de descuento para el carro 2 <br>
     * @param pNumeroHoras Numero de horas a alquilar. pNumeroHoras > 0
     */
    public void registrarAlquilerCuponCarro2( int pNumeroHoras )
    {
        carro2.registrarAlquilerCupon( pNumeroHoras );
        //TODO Completar seg�n la documentaci�n del m�todo
    }

    /**
     * Registra un alquiler con el cup�n de descuento para el carro 3 <br>
     * @param pNumeroHoras Numero de horas a alquilar. pNumeroHoras > 0
     */
    public void registrarAlquilerCuponCarro3( int pNumeroHoras )
    {
        carro3.registrarAlquilerCupon( pNumeroHoras );
        //TODO Completar seg�n la documentaci�n del m�todo
    }

    /**
     * Reinicia todos los Carros
     */
    public void reiniciar( )
    {
        //TODO Completar seg�n la documentaci�n del m�todo
        carro1.inicializar( 50500, "Renault" );
        carro2.inicializar( 100250, "BMW" );
        carro3.inicializar( 50500, "Renault" );

    }

    // -------------------------------------------------------------
    // M�todos de extensi�n 
    // -------------------------------------------------------------
    
    /**
     * M�todo para la extensi�n 1
     * @return respuesta1
     */
    public String metodo1( )
    {
        return " M�todo 1";
    }

    /**
     * M�todo para la extensi�n 2
     * @return respuesta2
     */
    public String metodo2( )
    {
        return " M�todo 2";
    }
}