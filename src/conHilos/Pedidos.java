package conHilos;

import java.security.SecureRandom;

public class Pedidos extends Thread {

    private static final int TAMANIO = 100_000;
    SecureRandom sr = new SecureRandom();
    long timeStamp;
    int[] B = new int[TAMANIO];

    public Pedidos(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public void run() {
        System.out.println("Inicio del llenado del vector pedidos en el tiempo: " + ((System.currentTimeMillis() - timeStamp) / 1000 + " seg."));

        for (int i = 0; i < TAMANIO; i++) {
            B[i] = sr.nextInt(10000) + 1;
            System.out.println("Procesado el pedido " + i + " = " + B[i] +  " Tiempo -> " + ((System.currentTimeMillis() - timeStamp) / 1000 + " seg."));
        }
        
        System.out.println("El pedido ha sido procesado en el tiempo -> " + ((System.currentTimeMillis() - timeStamp) / 1000 + " seg."));
        System.out.println(isAlive());
    }
}
