/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reservas;

public class Consumo {
    private int id;
    private int id_producto;
    private int id_reserva;

    public Consumo() {
    }

    public Consumo(int id, int id_producto, int id_reserva) {
        this.id = id;
        this.id_producto = id_producto;
        this.id_reserva = id_reserva;
    }

    public int getId() {
        return id;
    }

    public int getId_producto() {
        return id_producto;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }
    
   
    
}
