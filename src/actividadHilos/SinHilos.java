package actividadHilos;

import conHilos.Mayor;
import sinHilos.Pedido;
import sinHilos.Producto;
import sinHilos.VentaSinHilos;


public class SinHilos {
    
    public static void main(String[] args) {
        
        long inicio = System.currentTimeMillis();
        VentaSinHilos hilo3 = new VentaSinHilos();
        Pedido hilo1 = new Pedido();
        Producto hilo2 = new Producto();
        Mayor mayor = new Mayor();
        hilo2.llenarA(inicio);
        hilo1.llenarB(inicio);
        hilo3.llenarC(inicio);
        mayor.mayorPedido(inicio);
        long fin = System.currentTimeMillis();
        long total = fin - inicio;
        System.out.println("Tarda: " + total + " ms");
    }
    
}
