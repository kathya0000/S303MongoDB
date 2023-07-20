package S303N3;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
    int precio;
    private static int contadorTickets = 0;
    private int numeroTicket;
    private Date fechaCompra;
    private List<LineaTicket> lineas;
    private double totalCompra;

    //Constructor
    public Ticket(Date fechaCompra) {
        this.numeroTicket = contadorTickets++;
        this.fechaCompra = fechaCompra;
        this.lineas = new ArrayList<>();
        this.totalCompra = 0.0;
    }
    //Getter
    public int getNumeroTicket() {

        return numeroTicket;
    }
    public Date getFechaCompra() {

        return fechaCompra;
    }
    public List<LineaTicket> getLineas() {

        return lineas;
    }
    public double getTotalCompra() {

        return totalCompra;
    }
    public void agregarlinea(LineaTicket linea) {
        lineas.add(linea);
        totalCompra += linea.getImporte();

        // Actualizar el stock y restar el valor del producto del importe total
        Producto producto = linea.getProducto();
        producto.restarCantidad(linea.getCantidad());
        totalCompra -= linea.getImporte();
    }

}
