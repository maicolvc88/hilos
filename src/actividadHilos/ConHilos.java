package actividadHilos;

import conHilos.Mayor;
import conHilos.Pedidos;
import conHilos.Productos;
import conHilos.VentaConHilos;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConHilos {

    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        Productos hilo1 = new Productos(inicio);
        Pedidos hilo2 = new Pedidos(inicio);
        VentaConHilos hilo3 = new VentaConHilos(inicio);
        hilo1.start();
        hilo2.start();
        hilo3.start();
        long fin = System.currentTimeMillis();
        long total = fin - inicio;

        Mayor mayor = new Mayor();
        mayor.mayorPedido(inicio);
    }

}
