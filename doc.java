
/**
 * Write a description of class doc here.
 * 
 * @author Marcos
 * @version 1
 */
public interface doc
{

   
   /**
    * 
    * 
    * 
    * 
    * Resumen:
    * 
    * Nos devuvelve el contenido de la fila x del fichero de texto con ruta absoluta file.
    * 
    * 
    *Precondicion:
    * 
    *Un entero de tipo int y un String que sea la ruta absoluta del fichero.
    * 
    *Poscondicion:
    * 
    *Devuelve un String
    * 
    * @param int x,String file
    * 
    * @return
    * String obtenerLinea.
    * 

    */
   // Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file.
   public abstract String obtenerLinea(int x, String file);
   
   
   /**
    * 
    * 
    * 
    * 
    *  Resumen
    * Nos devuvelve el la posicion geografica d ela calle introducida.
    * 
    * 
    *Precondicion:
    * 
    * Introducir una cadena de tipo String que represente una calle.
    * 
    *Poscondicion:
    *Devuelve dos floats que representan la latitud y altitud de la calle.
    * 
    * @param String calle.
    * 
    * @return
    *float altitud,float latitud.
    * 
    */
   public abstract float posicionGeografica (String calle);
   
   
   
     /**
     * @Resumen
     * Nos devuvelve el la posicion geografica d ela calle introducida.
     */
    /**
     * @param String calle.
     */
    
       /**
    * @return
    * gfloat altitud,float latitud.
   */
   /**
    * @precondicion
    * Introducir una cadena de tipo String que represente una calle.
    */
   /**
    * @poscondicion
    * Devuelve dos floats que representan la latitud y altitud de la calle .
    */
   

}
