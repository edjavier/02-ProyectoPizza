/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author javie
 */
public class Pedido {
    
    //atributos de la clase Pedido.
    private Date fechaHoraCreacion;
    private Date fechaHoraEntrega;
    private String nombreCliente;
    private int numero;
    private EstadoPedido estado;
    private List<DetallePedido> detallesPedido;
    
    //metodo constructor por defecto.
    public Pedido(){
        detallesPedido = new ArrayList();
        }
    
    //metodo constructor con todos los atributos de la clase Pedido.
    public Pedido(Date fechaHoraCreacion, Date fechaHoraEntrega, String nombreCliente, int numero, EstadoPedido estado, List<DetallePedido> detallesPedido){
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.fechaHoraEntrega = fechaHoraEntrega;
        this.nombreCliente = nombreCliente;
        this.numero = numero;
        this.estado = estado;
        this.detallesPedido = detallesPedido;
    }
    
    //metodos de seteo de la clase
    public void setFechaHoraCreacion(Date fechaHoraCreacion){
        this.fechaHoraCreacion = fechaHoraCreacion;
    }
    
    public Date getfechaHoraCreacion(){
        return this.fechaHoraCreacion;
    }
    
    public void setFechaHoraEntrega(Date fechaHoraEntrega){
        this.fechaHoraEntrega = fechaHoraEntrega;
    }
    
    public Date getFechaHoraEntrega(){
        return this.fechaHoraEntrega;
    }
    
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }
    
    public String getNombreCliente(){
        return this.nombreCliente;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setEstado(EstadoPedido estado){
        this.estado = estado;
    }
    
    public EstadoPedido getEstado(){
        return this.estado;
    }
    
    public void setDetallesPedido(List<DetallePedido> detallesPedido){
        this.detallesPedido = detallesPedido;
    }
}