package S303N3;

public interface ProductoRepository {
    //OPERACIONES CRUD (Create, Read, Update, Delete)
    //insertarProducto, buscarProducto, actualizarProducto, y eliminarProducto
    public void insertarProducto(Producto){};
    public Producto buscarProducto(Producto){};
    public void actualizarProducto(Producto){};
    public void eliminarProducto(Producto){};
}
