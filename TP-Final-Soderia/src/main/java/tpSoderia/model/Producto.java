package tpSoderia.model;

import java.util.Objects;

public abstract class Producto {
    private String idProducto;
    private String nombre;
    private double precioBase;
    private int stockDisponible;

    public Producto(String idProducto, String nombre, int stockDisponible, double precioBase) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.stockDisponible = stockDisponible;
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecioFinal(int cantidad);

    public void actualizarStock(int cantidad){}

    public int getStockDisponible() {
        return stockDisponible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return Double.compare(precioBase, producto.precioBase) == 0 && stockDisponible == producto.stockDisponible && Objects.equals(idProducto, producto.idProducto) && Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto, nombre, precioBase, stockDisponible);
    }
}
