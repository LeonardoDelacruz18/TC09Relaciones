/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tc9ejemplo;

/**
 *
 * @author USER
 */
public class Tc9Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear usuarios
        Usuario usuario1 = new Usuario("UsuarioA", "contrasena1");
        Usuario usuario2 = new Usuario("UsuarioB", "contrasena2");

        // Crear registros
        Registro registro1 = new Registro("Descripcion 1", 
                "Categoria 1", "Fecha 1", "Ubicacion 1", 
                1, usuario1);
        
        Registro registro2 = new Registro("Descripcion 2", 
                "Categoria 2", "Fecha 2", "Ubicacion 2", 
                2, usuario1);
        
        Registro registro3 = new Registro("Descripcion 3", 
                "Categoria 3", "Fecha 3", "Ubicacion 3", 
                3, usuario2);

        // Relacionar registros con usuarios
        usuario1.agregarRegistro(registro1);
        usuario1.agregarRegistro(registro2);
        usuario2.agregarRegistro(registro3);

        // Obtener registros de un usuario
        System.out.println("Registros del Usuario " + usuario1.getNombre() + ":");
        
        for (Registro registro : usuario1.getRegistros()) {
            System.out.println("Descripción: " + registro.getDescripcion() + 
                    ", Categoría: " + registro.getCategoria());
        }      
    }    
}
