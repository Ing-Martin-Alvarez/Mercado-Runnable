//Martin Alvarez Salazar 19460870
package batimercadorunnable;


public class BatiCliente {
    private String nombre;
    private int[] carroCompra;

    public BatiCliente(String nom, int[] carroC){
        nombre=nom;
        carroCompra=carroC;
    }
    //Métodos get
    public String getNombre(){
        return nombre;
    }
    public int[] getcarroCompra(){
        return carroCompra;
    }
}

