package conHilos;

import java.security.SecureRandom;

public class Productos extends Thread {

    private static final int TAMANIO = 100_000;
    SecureRandom sr = new SecureRandom();
    long timeStamp;
    int[] A = new int[TAMANIO];

    public Productos(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public void run() {
        System.out.println("Inicio del llenado del vector productos en el tiempo: " + ((System.currentTimeMillis() - timeStamp) / 1000 + " seg."));

        for (int i = 0; i < TAMANIO; i++) {
            A[i] = sr.nextInt(10000) + 1;
            System.out.println("Procesado el producto " + i + " = " + A[i] + " Tiempo -> " + ((System.currentTimeMillis() - timeStamp) / 1000 + " seg."));
        }

        System.out.println("El producto ha sido procesado en el tiempo -> " + ((System.currentTimeMillis() - timeStamp) / 1000 + " seg."));
        System.out.println(isAlive());
    }

}
