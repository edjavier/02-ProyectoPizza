/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author edjavier
 */
public class TipoPizza {
    
    //atributos de la clase TipoPizza.
    private String descripcion;
    private String nombre;
    
    //metodo constructor por defecto.
    public TipoPizza(){
    }
    
    //metodo constructor con todos los atributos de la clase TipoPizza.
    public TipoPizza(String descripcion, String nombre){
        this.descripcion = descripcion;
        this.nombre = nombre;
    }
    
    //metodos de seteo de la clase TipoPizza.
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
}
