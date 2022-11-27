package sinHilos;

import java.security.SecureRandom;

public class Producto {

    private static final int TAMANIO = 100_000;
    int[] A = new int[TAMANIO];
    SecureRandom sr = new SecureRandom();
    private long timeStamp;


    public void llenarA(long timeStamp) {
        System.out.println("Inicio del llenado del vector A, en tiempo -> " + ((System.currentTimeMillis() - timeStamp) / 1000 + " seg."));
        for (int i = 0; i < TAMANIO; i++) {
            A[i] = sr.nextInt(10000) + 1;
            System.out.println("Llenar A en posicion " + i + " = " + A[i]+ ", en tiempo ->  " + ((System.currentTimeMillis() - timeStamp) / 1000 + " seg."));
        }
        System.out.println("Fin del llenado del vector A, en tiempo -> " + ((System.currentTimeMillis() - timeStamp) / 1000 + " seg."));
    }

}
