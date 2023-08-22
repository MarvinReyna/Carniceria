package com.lfac.Carniceria;

public interface CalculoFactura {
	public abstract void CalcularTotal();
	public abstract void CalcularIVA();
	public abstract void AgregarProducto(Producto producto);
}
