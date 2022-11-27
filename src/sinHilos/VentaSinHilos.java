package sinHilos;

import java.security.SecureRandom;

public class VentaSinHilos {

    private long timeStamp;

    private static final int TAMANIO = 100_000;
    sinHilos.Producto p = new sinHilos.Producto();
    sinHilos.Pedido pe = new sinHilos.Pedido();

    int[] C = new int[TAMANIO];
    

    public void llenarC(long timeStamp) {
        System.out.println("Inicio del llenado del vector C,  en tiempo -> " + ((System.currentTimeMillis() - timeStamp) / 1000 + " seg."));
        for (int i = 0; i < TAMANIO; i++) {
            int valor = 0;
            if (p.A[i] == pe.B[i]) {
                valor = p.A[i];
            } //else 
            if (pe.B[i] > p.A[i]) {
                valor = 2 * (pe.B[i] - p.A[i]);
            } //else
            if (p.A[i] < pe.B[i]){
                valor = pe.B[i];
            }
            C[i] = valor;
            System.out.println("Llenar C en posicion " + i + " = " + " en tiempo -> " + ((System.currentTimeMillis() - timeStamp) / 1000 + " seg."));
        }
        System.out.println("Fin del llenado del vector C, en tiempo -> " + ((System.currentTimeMillis() - timeStamp) / 1000 + " seg."));
    }

}
