
package informacionpersonal;

/**
 *
 * @author maryse
 * 
 * Programa para imprimir cadenas en Java 
 * 
 */

public class InformacionPersonal {

    String nombre = "Uzziel",
           apellido_paterno = "Valdéz",
           apellido_materno = "Ordoñez";
    int edad = 19;
    String fecha_nacimiento = "09/02/2004";
    String numCuenta = "1912158";
    String hobbies = "Leer";
    String mat = "Calculo, Programación, Circuitos";
    

    public void Informacion(){        
        System.out.println("El nombre completo de la persona es: " + nombre +" "+ apellido_paterno +" "+ apellido_materno );
        System.out.println("Su edad es: " + edad +" años ");
        System.out.println("Su fecha de nacimiento es: " + fecha_nacimiento);
        System.out.println("Su pasatiempo es: " + hobbies);
    }
    
    public static void main(String[] args) {
        InformacionPersonal informacion= new InformacionPersonal();
        informacion.Informacion();
                
    }
    
}
