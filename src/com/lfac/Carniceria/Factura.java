package com.lfac.Carniceria;

import java.util.Date;

public class Factura implements com.lfac.Carniceria.CalculoFactura {
	private String serie;
	private int numero;
	private Date fecha;
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	@Override
	public void CalcularTotal() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void CalcularIVA() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void AgregarProducto(Producto producto) {
		// TODO Auto-generated method stub
		
	}
	
}
