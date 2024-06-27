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
        Cancion cancion = new Cancion(14, "The Zephyr Song", "Red Hot Chili Peppers", "3:52" , 2002);
        System.out.println("Id: " + cancion.getId());
        System.out.println("Titulo de la cancion: " + cancion.titulo);
        System.out.println("Autor: " + cancion.autor);
        System.out.println("Duracion de la cancion: " + cancion.duracion);
        System.out.println("Anio de salida: " + cancion.añoCreacion);
        
        cancion.setId(15);
        cancion.setTitulo("How Much a Dollar Cost");
        cancion.setAutor("Kendrick Lamar");
        cancion.setDuracion("4:22");
        cancion.setAñoCreacion(2015);
        
        System.out.println("--------------------------------------");
        System.out.println("La siguiente cancion sera: ");
        System.out.println("Id: " + cancion.getId() + " - Titulo: " + cancion.getAutor() 
                + " - Autor: " + cancion.getAutor() + " - Duracion: " + cancion.getDuracion()
                + " - Anio de salida: " + cancion.getAñoCreacion());
        
        
            
        }
    }
    

