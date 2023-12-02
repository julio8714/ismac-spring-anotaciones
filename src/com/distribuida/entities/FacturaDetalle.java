package com.distribuida.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FacturaDetalle {
	
	
	private int idFacturadetalle;
	private int cantidad; 
	private double subtotal;
	
	@Autowired
	private Factura factura;
	
	
	@Autowired
	private Producto producto;
	
	public FacturaDetalle() {}
	
	public int getIdFacturadetalle() {
		return idFacturadetalle;
	}
	public void setIdFacturadetalle(int idFacturadetalle) {
		this.idFacturadetalle = idFacturadetalle;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	@Override
	public String toString() {
		return "FacturaDetalle [idFacturadetalle=" + idFacturadetalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", factura=" + factura + ", producto=" + producto + "]";
	}
	

}
