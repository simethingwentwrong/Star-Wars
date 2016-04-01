
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
      
    }

    /**
     * An example of a method - replace this comment with your own
     */
     
    public void generateStarWarsName(String nombre, String apellido, String apellidoMadre, String ciudad )
    {
       System.out.println("tu nombre en la peli seria: " + apellido.substring(0, 3) + nombre.substring(0, 3));
       System.out.println("tu apellido en la peli seria: " + apellidoMadre.substring( 0, 2) + ciudad.substring(0, 3));
    }
}
