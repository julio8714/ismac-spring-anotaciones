package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.DatosEmpresa;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Producto;



public class Principal {
	
	public static void main(String[] args) {
		
		
		System.out.println("*******************1*******************************");
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("*******************2*******************************");
		
		
		Cliente cliente1 = context.getBean("cliente", Cliente.class);
		
		
		Producto producto1 = context.getBean("producto", Producto.class);
	
		
		Factura factura1 = context.getBean("factura", Factura.class);
		
		
		FacturaDetalle facturadetalle = context.getBean("facturaDetalle", FacturaDetalle.class);
		
		DatosEmpresa datosEmpresa = context.getBean("datosEmpresa", DatosEmpresa.class);
		
		
		//CLIENTES 
		cliente1.setIdCliente(1);
		cliente1.setCedula("1733445566");
		cliente1.setNombre("Carlos");
		cliente1.setApellido("Guerrero");
		cliente1.setEdad(21);
		cliente1.setFechaNacimiento(new Date());
		cliente1.setDireccion("tababela");
		cliente1.setTelefono("0978926921");
		cliente1.setCorreo("carlos@hotmail.com");
		
		
		
		
		factura1.setIdFactura(1);
		factura1.setNumFactura("FAC-001");
		factura1.setFecha(new Date());
		factura1.setTotalNeto(30.22);
		factura1.setIva(0.12);
		factura1.setTotal(50.24);
		

		
		
		producto1.setIdProducto(1);
		producto1.setNombre("Peras");
		producto1.setDescripcion("Fruta temporada");
		producto1.setPrecio(0.45);
		producto1.setStock(250);
		
		
		
		facturadetalle.setIdFacturadetalle(1);
		facturadetalle.setCantidad(20);
		facturadetalle.setFactura(factura1);
		
		
		System.out.println(factura1.toString());
		System.out.println(facturadetalle.toString());
		System.out.println(datosEmpresa.toString());
		
		
		
		
		
		
		
		
	
		System.out.println("*******************3*******************************");
		
		context.close();
		System.out.println("*******************4*******************************");
		
	
	}
}
