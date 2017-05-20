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
public class VariedadPizza {
    
    //atributos de la clase VariedadPizza.
    private String ingredientes;
    private String nombre;
    
    //metodo constructor por defecto de la clase VaridadPizza.
    public VariedadPizza(){
        
    }
    
    //metodo constructor con todos los atributos de la clase VariedadPizza.
    public VariedadPizza(String ingredientes, String nombre){
        this.ingredientes = ingredientes;
        this.nombre = nombre;
    }
    
    //metodos de seteo de la clase VaridadPizza.
    public void setIngredientes(String ingredientes){
        this.ingredientes = ingredientes;
    }
    
    public String getIngredientes(){
        return this.ingredientes;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
}
