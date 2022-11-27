package sinHilos;

import java.util.HashMap;

public class Mayor {

    private static final int TAMANIO = 100_000;
    private long timeStamp;
    sinHilos.Producto p = new sinHilos.Producto();
    sinHilos.Pedido pe = new sinHilos.Pedido();

    public void mayorPedido(long timeStamp) {
        
        HashMap<Integer, Integer> mapa = new HashMap<>();
        
        System.out.println("Inicio del calculo del mayor pedido en el tiempo: " + (((System.currentTimeMillis() - timeStamp) / 1000) + " seg."));

        int mayor = 0;
        
        for (int i = 0; i < TAMANIO; i++) {
            if (pe.B[i] > mayor) {
                mayor = pe.B[i];
            }
        }
        System.out.println("El pedido mayor es: " + mayor);
        System.out.println("El proceso de obtener mayor pedido terminó en el tiempo -> " + (((System.currentTimeMillis() - timeStamp) / 1000) + " seg."));
    }

}
