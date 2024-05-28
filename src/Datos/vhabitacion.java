/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author Hola
 */
public class vhabitacion {
    private int idhabitacion;
    private String numero;
    private String zona;
    private String descripcion;
    private int precio_diario;
    private String estado;
    private String tipo_habitacion;
    private String servicio;

    public vhabitacion(int idhabitacion, String numero, String zona, String descripcion, int precio_diario, String estado, String tipo_habitacion) {
        this.idhabitacion = idhabitacion;
        this.numero = numero;
        this.zona = zona;
        this.descripcion = descripcion;
        this.precio_diario = precio_diario;
        this.estado = estado;
        this.tipo_habitacion = tipo_habitacion;
    }

    public vhabitacion() {
    }

    public int getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio_diario() {
        return precio_diario;
    }

    public void setPrecio_diario(int precio_diario) {
        this.precio_diario = precio_diario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo_habitacion() {
        return tipo_habitacion;
    }

    public void setTipo_habitacion(String tipo_habitacion) {
        this.tipo_habitacion = tipo_habitacion;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    
    
}
