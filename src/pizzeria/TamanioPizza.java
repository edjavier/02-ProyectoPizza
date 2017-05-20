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
public class TamanioPizza {
    
    //atributos de la clase TamanioPizza.
    private int cantPorciones;
    private String nombre;
    
    //metodo constructor por defecto de la clase TamanioPizza.
    public TamanioPizza(){
        
    }
    
    //metodo constructor con todos los atributos de la clase TamanioPizza.
    public TamanioPizza(int cantPorciones, String nombre){
        this.cantPorciones = cantPorciones;
        this.nombre = nombre;
    }
    
    //metodos de seteo de la clase TamanioPizza.
    public void getCantPorciones(int cantPorciones){
        this.cantPorciones = cantPorciones;
    }
    
    public int getCantPorciones(){
        return this.cantPorciones;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
}
