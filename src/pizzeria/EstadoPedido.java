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
class EstadoPedido {
    
    //atributos de la clase EstadoPedido.
    private String nombre;
    
    //metodo constructor por defecto.
        public EstadoPedido(){
    }
    
    //metodo constructor con todos los atributos de la clase EstadoPedido.
    public EstadoPedido(String nombre){
        this.nombre = nombre;
    }
    
    //metodos de seteo de la clase EstadoPedido.
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
}
