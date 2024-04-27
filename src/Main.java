import ClasesBases.Producto;
import ClasesBases.Usuario;

public class Main {

    public static void main(String[] args) {
        //Definiendo 3 objetos
        Producto prComputadora, prTV, prCelular;
        //Instanciamos un objeto
        prComputadora = new Producto(1, "Computadora ","HP",
                "negro", 1000, 20, 12);
        prTV = new Producto(2, "TV ","LG",
                "plomo", 500, 10, 12);
        prCelular = new Producto(3, "Celular ","Samsung",
                "rojo", 700, 5, 12);

        //Definiendo 3 objetos de Usuarios
        Usuario usrAdmin, usrCliente, usrProveedor;

    }


}