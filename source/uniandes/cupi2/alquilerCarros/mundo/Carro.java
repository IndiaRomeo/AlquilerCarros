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
package uniandes.cupi2.alquilerCarros.mundo;

/**
 * Clase que representa un carro de la tienda de alquiler de carros
 */
public class Carro
{

    // -------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------

    /**
     * El numero horas que ha sido alquilado el carro
     */
    private int numeroHoras;

    /**
     * El precio por hora de alquiler del carro
     */
    private int precioHora;

    /**
     * El nombre de la marca del carro
     */
    //TODO declare el atributo marcaCarro de tipo String
    private String marcaCarro;

    /**
     * El total de dinero recaudado por el alquiler del Carro
     */
    //TODO declare el atributo dineroRecaudado de tipo int
    private int dineroRecaudado;

    /**
     * El total de cupones redimidos  
     */
    //TODO declare el atributo cupones de tipo int
    private int cupones;


    // -------------------------------------------------------------
    // Métodos
    // -------------------------------------------------------------

    /**
     * Inicializa el Carro con los valores que llegan por parámetro<br>
     * <b>post: </b> El Carro se inicializó con numero de horas en cero,<br>
     * dinero recaudado en cero y los cupones en cero<br>
     * @param pPrecioHora Valor del alquiler por hora
     * @param pMarcaCarro El nombre de la marca del carro
     */
    public void inicializar( int pPrecioHora, String pMarcaCarro )
    {
        precioHora = pPrecioHora;
        marcaCarro = pMarcaCarro;
        
        //TODO inicialice numeroHoras, dineroRecaudado y cupones en cero
        this.numeroHoras = 0;
        this.dineroRecaudado = 0;
        this.cupones = 0;
        
    }

    /**
     * Devuelve el numero de horas alquiladas del carro <br>
     * @return numero de horas alquiladas
     */
    public int darNumeroHoras( )
    {
        return numeroHoras;
    }

    /**
     * Devuelve el precio por hora de alquiler del carro <br>
     * @return precio por hora de alquiler
     */
    public int darPrecioHora( )
    {
        return precioHora;
    }

    /**
     * Devuelve la marca del carro <br>
     * @return La marca del carro
     */
    public String darMarcaCarro( )
    {
        //TODO Completar según la documentación del método
        return marcaCarro;
        
    }

    /**
     * Devuelve el dinero recaudado por el carro<br>
     * @return El dinero recaudado
     */
    public int darDineroRecaudado( )
    {
        //TODO Completar según la documentación del método
       return dineroRecaudado;
    }

    /**
     * Devuelve la cantidad de cupones redimidos <br>
     * @return Número de cupones redimidos
     */
    public int darCuponesRedimidos( )
    {
        //TODO Completar según la documentación del método
        return cupones;
    }

    /**
     * Registrar el alquiler del carro dado un número de horas <br>
     * <b>post: </b> Se incremento el numero de horas alquiladas del carro, <br>
     *               Se incremento el dineroRecaudado de acuerdo al numero de horas alquiladas y su precio. <br>
     * @param pNumeroHoras Numero de horas alquiladas
     */
    public void registrarAlquiler( int pNumeroHoras )
    {
        //TODO Completar según la documentación del método
        numeroHoras = pNumeroHoras * 1;
        dineroRecaudado = precioHora * pNumeroHoras;
        
    }

    /**
     * Registrar el alquiler del carro dado un número de horas, teniendo en cuenta el descuento dado por el cupón.<br>
     * <b>post: </b> Se incremento el numero de horas alquiladas del carro, <br>
     *               Se incremento el dineroRecaudado de acuerdo al numero de horas alquiladas y su precio con un descuento del 50% <br>
     *               Se incremento el número de cupones en uno. 
     * @param pNumeroHoras Numero de horas alquiladas
     */
    public void registrarAlquilerCupon( int pNumeroHoras )
    {
        //TODO Completar según la documentación del método
        double descuento = 0.5;
        
        dineroRecaudado = ( int ) ( (precioHora * pNumeroHoras) * (descuento) );
        cupones = 1;
        numeroHoras = pNumeroHoras; 
    }

    /**
     * Reinicia el Carro, deja el número de horas alquiladas, el dinero recaudado y el número de cupones en cero.
     */
    public void reiniciar( )
    {
        //TODO Completar según la documentación del método
        numeroHoras = 0;
        dineroRecaudado = 0;
        cupones = 0;
        
    }
}