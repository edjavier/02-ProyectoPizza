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
class DetallePedido {
    
    //atributos de la clase DetallePedido.
    private int cantidad;
    private float precio;
    private EstadoPedido estado;
    private Pizza pizza;
    
    //metodo constructor por defecto de la clase DetallePedido.
    public DetallePedido(){
    }
    
    //metodo constructor con todos los atributos de la clase DetallePedido.
    public DetallePedido(int cantidad, float precio, EstadoPedido estado, Pizza pizza){
        this.cantidad = cantidad;
        this.precio = precio;
        this.estado = estado;
        this.pizza = pizza;
    }
    
    //metodos de seteo de la clase DetallePedido.
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public int getCantidad(){
        return this.cantidad;
    }
    
    public void setPrecio(float precio){
        this.precio = precio;
    }
    
    public float getPrecio(){
        return this.precio;
    }
    
    public void setEstado(EstadoPedido estado){
        this.estado = estado;
    }
    
    public EstadoPedido getEstado(){
        return this.estado;
    }
    
    public void setPizza(Pizza pizza){
        this.pizza = pizza;
    }
    
    public Pizza getPizza(){
        return this.pizza;
    }
}
