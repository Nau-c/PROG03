/*
 * Construye una clase Complejo con dos atributos:

    real: parte real del número complejo
    imag: parte imaginaria del número complejo

Puedes consultar la estructura de una clase en el apartado correspondiente de la unidad, 
o bien partir de la definición de la clase Persona del apartado anterior. 
A continuación crea los siguientes métodos dentro de la clase:
 * 
 * 
 */
package numeros;
import java.util.Scanner;

/**
 *
 * @author Nauzet
 */
public class Complejo {
    
    //Declaro las variables de tipo double
    double real;
    double imag;
    
   //Constructor que inicia las vcariables a 0

    public Complejo() {
        real = 0.0;
        imag = 0.0;
    }


    //Constructor que inicializa los atributos a los valores indicados por referencia.
    public  Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    //Devuelve la parte real del objeto.
    public double consulta_real() {
        return real;
    }
    
//Devuelve la parte imaginaria del objeto.
    public double consulta_imag() {
        return imag;
    }
    
//Asigna a la parte real del objeto el valor indicado en el parámetro real
    public void cambio_real(double cambio_real) {
        this.real = cambio_real;
    }
//Asigna a la parte imagianria del objeto el valor indicado en el parámetro real
    public void cambio_imag(double cambio_imag) {
        this.imag = cambio_imag;
    }
   
/*Convierte a String el número complejo, mediante la concatenación de sus atributos y devuelve 
 como resultado la cadena de texto 3 + 4i, si 3 es la parte real y 4 la parte imaginaria.*/

    @Override
    public String toString() {
        return + real + "+" + imag + "i"; //Método que muestra el objeto en forma de String concatenado
    }

 

    
    public void sumar(Complejo b){
        double suma_real = b.real + this.real; //Creamos una variable en el método para gaurda la suma de la parte real
        // Le sumamos la parte real del número dque hemos llamado
        double suma_imag = b.imag = this.imag; //Se hace lo mismo con parte imagianria
        this.real = suma_real; //Asignamos a la parte real del número que es el valor total de la suma 
        this.imag = suma_imag; //Asignamos a la parte imaginaria del número que llamó al valor total de la suma
    }
   
   
      
    /*Suma la parte real con la parte real del número complejo b y la parte 
    imaginaria con la parte imaginaria del número complejo b, es decir se suman
    los sumaImag complejos con los que estamos trabajando*/  
   
    public static void main(String[] args) {
        double cambio_real,cambio_imag; // Variables locales para almacenar los datos que recogeremos por teclado
    
        
        //Creamos un objeto que es de la clase Complejo y usamos el constructyor que hemso creado con valor inicial 0
        Complejo a = new Complejo();  
        
        Scanner teclado = new Scanner(System.in); //Creamos una variable de tipo Scanner para recoger datos
        
        
        
        System.out.println("\nEl núumero que inicia es: "+a.toString()); //Ejecutamos la consulta de todos los datos al inicio no devuelve vbalor 0 
        
        
        Complejo b = new Complejo(2.4,3.5); //Creanos un objeto del tipo de clase Complej, 
                                           //usamso el constructor creado para iniciar los atributos a unos valores que mostramos
        
        System.out.println("\nAhora del siguiente número"+b.toString());//Usamos el metodo toString para mostra el número complejo en forma de String
        
       
        System.out.println("\nIntroduzca la parte real de un nuevo número");
        cambio_real = teclado.nextDouble(); //Guardamos en la variable local cambio_reral lo recogido por teclado
        a.cambio_real(cambio_real); //Llamada al método Set para obtener el dato leido a la variable cambio_real del Objeto creado
        
        
        
        System.out.print("\nIntroduzca la parte imagianrio del número");
        cambio_imag = teclado.nextDouble(); //Guardamos en la variable local cambio_imag lo recogido por teclado
        a.cambio_imag(cambio_imag); //Llamada al método Set para obtener el dato leido a la variable cambio_imag del Objeto creado
        
        
        
      
        System.out.println("\nLa parte real del número es: "+a.consulta_real()); //Usamos el método de consulta para mostrar la parte real
        //parte cambio_real del objeto "a"
        System.out.println("\nLa parte imaginaria del número es: "+b.consulta_imag());//Usamos el método de consulta para mostrar la parte 
        //imagianria  de objeto "a"
        System.out.println("\nEl número complejo introducido es: "+a.toString()+"\n"); //mostramso el resultado como String
        
        a.sumar(b); //Usamos el método suma llamandolo con el obeto "a", por los que estamos usando los atributos del 
        // "a" y le pasamos "b" por referencia
        
        System.out.println("\nLa suma de los número complejos es: "+ a.toString());// Como ahora tenemos el Objeto a 
        //el valor de la suma lo muestro como String
    
    }
}
