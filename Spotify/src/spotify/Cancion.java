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
    private int id;
    public String titulo;
    public String autor;
    public String duracion;
    public int añoCreacion;

    public Cancion(int id, String titulo, String autor, String duracion, int añoCreacion) {
        this.id = 14;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.añoCreacion = añoCreacion;
    }
  
    
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