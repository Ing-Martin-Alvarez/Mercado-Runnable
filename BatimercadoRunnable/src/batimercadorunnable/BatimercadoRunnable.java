//Martin Alvarez Salazar 19460870
package batimercadorunnable;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BatimercadoRunnable {

    private static final int numCajeras = 1;
    
    public static void main(String[] args) {        
        ArrayList<BatiCliente>baticlientes = new ArrayList<BatiCliente>();
        baticlientes.add(new BatiCliente("Superman", new int[] { 2, 2, 1, 5, 2, 4, 3 })); 
        baticlientes.add(new BatiCliente("Flash", new int[] { 1, 1, 5, 1, 1, 3  })); 
        baticlientes.add(new BatiCliente("Green Lantern", new int[] { 5, 3, 5, 2 })); 

        long timeinitial = System.currentTimeMillis();  
        
        ExecutorService executor = Executors.newFixedThreadPool(numCajeras);
        for (BatiCliente cliente: baticlientes) {
            Runnable cajera = new BatiCajero(cliente, timeinitial);
            executor.execute(cajera);
        }
        executor.shutdown();	
        while (!executor.isTerminated()) {
        }
        
        long fin = System.currentTimeMillis();	
        System.out.println("Tiempo total de procesamiento: "+(fin-timeinitial)/1000+" Segundos");       
    }  
}
