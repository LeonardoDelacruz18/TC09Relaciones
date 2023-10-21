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
public class Usuario {
    
    private String nombre;
    private String contra;
    private ArrayList<Registro> listaRegistro; 
    public Usuario(){}
            
    public Usuario(String nombre, String contra) {
        this.nombre = nombre;
        this.contra = contra;
        this.listaRegistro = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }   

    public void agregarRegistro(Registro registro) {
        listaRegistro.add(registro);
    }

    public ArrayList<Registro> getRegistros() {
        return listaRegistro;
    }
    
    public void reportarUsuario(Usuario usuario) {
        // Implementa la lógica para reportar a otro usuario aquí
    }
}
