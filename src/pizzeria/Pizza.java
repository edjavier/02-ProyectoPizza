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
class Pizza {
    
    //atributos de la clase Pizza.
    private String nombre;
    private float precio;
    private TipoPizza tipoPizza;
    private VariedadPizza variedad;
    private TamanioPizza tamanio;
    
    //metodo constructor por defecto de la clase Pizza.
    public Pizza(){
        
    }
    
    //metodo constructor con todos los atributos de la clase Pizza.
    public Pizza(String nombre, float precio, TipoPizza tipoPizza, VariedadPizza variedad, TamanioPizza tamanio){
        this.nombre = nombre;
        this.precio = precio;
        this.tipoPizza = tipoPizza;
        this.variedad = variedad;
        this.tamanio = tamanio;
    }
    
    //metodos de seteo de la clase Pizza.
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setPrecio(float precio){
        this.precio = precio;
    }
    
    public float getPrecio(){
        return this.precio;
    }
    
    public void setTipoPizza(TipoPizza tipoPizza){
        this.tipoPizza = tipoPizza;
    }
    
    public TipoPizza getTipoPizza(){
        return this.tipoPizza;
    }
    
    public void setVariedad(VariedadPizza variedad){
        this.variedad = variedad;
    }
    
    public VariedadPizza getVariedad(){
        return this.variedad;
    }
    
    public void setTamanio(TamanioPizza tamanio){
        this.tamanio = tamanio;
    }
}
