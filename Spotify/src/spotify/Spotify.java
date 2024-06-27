/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spotify;

/**
 *
 * @author Andy
 */
public class Spotify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Este programa se basa en la utilizacion de constructores, setters y getters
        para simular un reproducto de musica como lo es Spotify.
        Primero se crea la clase "Cancion", se definen sus atributos, y se utilizan constructores, setters y getters.
        
        Empezamos trabajando con constructores, por lo que creamos un objeto, e introducimos sus argumentos
        para luego, con un println imprimir cada atributo de la clase con el comando clase.[atributo],
        para el atributo ID no funciona este comando debido a que es una clase privada, por lo que la unica
        manera de obtenerlo es con el comando .get
        */
        Cancion cancion = new Cancion(14, "The Zephyr Song", "Red Hot Chili Peppers", "3:52" , 2002);
        System.out.println("Id: " + cancion.getId());
        System.out.println("Titulo de la cancion: " + cancion.titulo);
        System.out.println("Autor: " + cancion.autor);
        System.out.println("Duracion de la cancion: " + cancion.duracion);
        System.out.println("Anio de salida: " + cancion.añoCreacion);
        
        /*
        Despues, con el comando set cambiamos cada atributo para que nos devuelva una nueva salida
        por lo que ahora, cada atributo del objeto que creamos guardara informacion distinta.    
        */
        cancion.setId(15);
        cancion.setTitulo("How Much a Dollar Cost");
        cancion.setAutor("Kendrick Lamar");
        cancion.setDuracion("4:22");
        cancion.setAñoCreacion(2015);
        
        /*
        Y por ultimo, por medio de un println, utilizamos el comando clase.get[atributo] para imprimir 
        cada atributo y obtener la informacion que registramos con el comando set, ignorando los argumentos
        que habiamos utilizado anteriormente.
        */
        System.out.println("--------------------------------------");
        System.out.println("La siguiente cancion sera: ");
        System.out.println("Id: " + cancion.getId() + " | Titulo: " + cancion.getTitulo()
                + " | Autor: " + cancion.getAutor() + " | Duracion: " + cancion.getDuracion()
                + " | Anio de salida: " + cancion.getAñoCreacion());
        
        
            
        }
    }
    

