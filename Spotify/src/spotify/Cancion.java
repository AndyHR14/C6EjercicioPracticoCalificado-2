/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotify;

/**
 *
 * @author Andy
 */
public class Cancion {
    /*
    Con la clase creada, procedemos a declarar sus atributos, en este caso solamente declaramos
    el ID de la cancion como privado, debido a que Spotify no muestra el ID que asigna a cada
    cancion a sus usuarios, el resto de la informacion si es accesible para los usuarios.
    */
    private int id;
    public String titulo;
    public String autor;
    public String duracion;
    public int añoCreacion;

    /*
    Ahora creamos el constructor, el cual requiere que se le ingresen los atributos deseados,
    sin embargo, tambien se puede trabajar de manera que en el propio constructor se establezca
    la informacion de sus atributos.
    */
    public Cancion(int id, String titulo, String autor, String duracion, int añoCreacion) {
        this.id = 14;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.añoCreacion = añoCreacion;
    }
  
    /*
    Ahora creamos todos los setters y getters de los atributos, esto con el fin de poder imprimir
    y trabajar con cualquier atributo, incluso aquel que se encuentre privado.
    */        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getAñoCreacion() {
        return añoCreacion;
    }

    public void setAñoCreacion(int añoCreacion) {
        this.añoCreacion = añoCreacion;
    }

    
    
}