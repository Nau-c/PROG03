/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nauzet
 */
package TAREA_PRO03_;
import java.util.Scanner;
public class Persona { //clase principal persona la cual contiene las variables primitivas

  //Atributos creadas dentro de la clase persona 
    String nombre;
    int edad;
    float altura;
   
    public String consulta_nombre() { //Método para la consulta del nombre (obtenemos)y mostrar el nombre
        return nombre;
    }
    
    public void cambio_nombre(String cambio_nombre) { // Constructor con los parámetros, para cambiar un nombre 
        //Le quitamos el this, porque solo tenemos un nombre que se llama así siempre sera el mismo 
        nombre = cambio_nombre;
    }

    public int consulta_edad() { //Método para la consulta del edad (obtenemos)
        return edad;
    }

    public float consulta_altura() { //Método para la consulta del altura (obtenemos)
        return altura;
    }

    public void cambio_edad(int cambio_edad) { //Método con los parámetros, realiza el cambio de valor
        //Le quitamos el this, porque solo tenemos un nombre que se llama así siempre sera el mismo 
        edad = cambio_edad;
    }

    public void cambio_altura(float cambio_altura) { //Método para cambiar una variable
        altura = cambio_altura;
    }

    public Persona() { //Constructor con valores fijos
        nombre = "Luisa Perez";
        edad = 22;
        altura = 1.70f;
    }

    public Persona(String nombre, int edad, float altura) { //Constructor creado que podemos  cambair su salida en voud cuando mostramso pro pantalla le damos los valores
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

   
    

  
    /*es el punto de entrada para cualquier programa java y NO es un método ordinario. 
    *Se utiliza principalmente para indicar la jvm 
    *del punto de entrada al programa y el programa se ejecuta desde este punto.
    */
   
    public static void main(String[] args) {
        String cambio_name; //Creamos la nueva variable donde se alamacenara el nombre nuevo recogido por teclado para ser usado en el método 
        int cambio_edad; 
        float cambio_altura;
  
        Persona valor_estatico = new Persona("Nauzet López Mendoza", 30, 1.90f);
        
        System.out.println("\nAhora el nombre es: " + valor_estatico.consulta_nombre());//Mostramos el nombre cambiado de la clase "persona
        
        System.out.println("\nAhora la edad es: " + valor_estatico.consulta_edad());//Mostramos el nombre cambiado de la clase "persona"
        
        System.out.println("\nAhora la asltura es: " + valor_estatico.consulta_altura());//Mostramos el nombre cambiado de la clase "persona"
        
        
        
        
        Persona New_persona = new Persona();//Creamos un objeto de persona que tendrá sus variables y métodos
        Scanner teclado = new Scanner (System.in); //Creamos la recogida de datos por teclado 
        System.out.println("\nIntroduce un nombre"); //Solicitamos al usuario que introduza un nombre
        String cambio_nombre = teclado.nextLine(); //Leemos la palabras hasta el siguiente espacio
        New_persona.cambio_nombre(cambio_nombre);// Objeto previamente creado le añadimos Las variables introducidas por teclado serán los parámetros
       
        
        
        
       
        
        System.out.println("\nIntroduce una edad"); //Solicitamos al usuario que introduza un nombre
        cambio_edad = teclado.nextInt(); //Leemos la palabras hasta el siguiente espacio Indicamos que el valor introducido por teclaod es texto
        New_persona.cambio_edad(cambio_edad);// Objeto previamente creado le añadimos Las variables introducidas por teclado serán los parámetros
      

        
        

        System.out.println("\nIntroduce tu altura"); //Solicitamos al usuario que introduza un nombre
        cambio_altura = teclado.nextFloat();
        New_persona.cambio_altura(cambio_altura); // Objeto previamente creado le añadimos Las variables introducidas por teclado serán los parámetros
       

        
        
        
        System.out.println("\nAhora el nombre es: " + New_persona.consulta_nombre());//Mostramos el nombre cambiado de la clase "persona
        
        System.out.println("\nAhora la edad es: " + New_persona.consulta_edad());//Mostramos el nombre cambiado de la clase "persona"
        
        System.out.println("\nAhora la asltura es: " + New_persona.consulta_altura());//Mostramos el nombre cambiado de la clase "persona"
        
        
    }
    
}
