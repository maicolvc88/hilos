package sinHilos;

import java.security.SecureRandom;

public class Pedido {
    
    private static final int TAMANIO = 100_000;
    private long timeStamp;
    SecureRandom sr = new SecureRandom();

    int[] B = new int[TAMANIO];

    public void llenarB(long timeStamp) {
        System.out.println("Inicio del llenado del vector B, en tiempo -> " + ((System.currentTimeMillis() - timeStamp) / 1000 + " seg."));
        for (int i = 0; i < TAMANIO; i++) {
            B[i] = sr.nextInt(10000) + 1;
            System.out.println("Llenar B en posicion " + i + " = " + B[i] +  " en tiempo ->  " + ((System.currentTimeMillis() - timeStamp) / 1000 + " seg."));
        }
        System.out.println("Fin del llenado del vector B, en tiempo ->  " + ((System.currentTimeMillis() - timeStamp) / 1000 + " seg."));
    }

}
