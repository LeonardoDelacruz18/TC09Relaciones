/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tc9ejemplo;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Registro {

    private String descripcion;
    private String categoria; 
    private String fecha;
    private String ubicacion;    
    private int prioridad;    
    private Usuario autor;      
    private ArrayList<Usuario> implicados;
    
    public Registro(){}
    
    public Registro(String descripcion, String categoria, String fecha,
            String ubicacion, int prioridad, Usuario autor) {
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.fecha = fecha;        
        this.ubicacion = ubicacion;
        this.prioridad = prioridad;
        this.autor = autor;
        this.implicados = new ArrayList<>();
    }
    
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }  

    public void agregarImplicado(Usuario usuario) {
        implicados.add(usuario);
    }

    public ArrayList<Usuario> getImplicados() {
        return implicados;
    }

}
