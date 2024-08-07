//Martin Alvarez Salazar 19460870
package batimercadorunnable;


public class BatiCajero implements Runnable {
    private BatiCliente cliente;
    private long TiempoInicial;

    public BatiCajero(BatiCliente cliente, long TP) {
	this.cliente = cliente;
	this.TiempoInicial = TP;
    }

    @Override
    public void run() {
        System.out.println("La cajera Batichica" + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + this.cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - this.TiempoInicial) / 1000 + "seg");
            for (int i = 0; i < this.cliente.getcarroCompra().length; i++) { 			
                this.esperarXsegundos(cliente.getcarroCompra()[i]);
               	System.out.println("Procesado el producto " + (i + 1) + " de " + this.cliente.getNombre()+ "->Tiempo: " + (System.currentTimeMillis() - this.TiempoInicial) / 1000 + "seg");
		}
	System.out.println("La cajera Batichica" + " HA TERMINADO DE PROCESAR " + this.cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - this.TiempoInicial) / 1000 + "seg");
    }

    private void esperarXsegundos(int segundos) {
	try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            }
	}   
}
