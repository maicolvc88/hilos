package conHilos;

import java.security.SecureRandom;

public class VentaConHilos extends Thread{

    private static final int TAMANIO = 50_000;
    long timeStamp;

    int[] C = new int[TAMANIO];

    Productos p = new Productos(timeStamp);
    Pedidos pe = new Pedidos(timeStamp);

    public VentaConHilos(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public void run() {
        System.out.println("Inicio del procesamiento de las compras en el tiempo: " + ((System.currentTimeMillis() - timeStamp) / 1000 + " seg."));

        for (int i = 0; i < TAMANIO; i++) {
            int valor = 0;
            if (p.A[i] == pe.B[i]) {
                valor = p.A[i];
            } else if (pe.B[i] > p.A[i]) {
                valor = 2 * (pe.B[i] - p.A[i]);
            } else {
                valor = pe.B[i];
            }
            C[i] = valor;
            System.out.println("Procesando la compra " + i + "  Tiempo -> " + ((System.currentTimeMillis() - timeStamp) / 1000 + " seg."));
        }
    }
}
