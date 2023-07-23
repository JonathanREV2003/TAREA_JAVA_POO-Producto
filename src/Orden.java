import java.util.ArrayList;
import java.util.List;

public class Orden {

    List<Producto> lista = new ArrayList<Producto>();
    public List<Producto> getLista() {

        lista.add(new Producto(1,"Frijol",5,2));
        lista.add(new Producto(2,"Arroz",5,5));
        lista.add(new Producto(3,"Leche",15,3));
        lista.add(new Producto(4,"Huevo",35,10));

        //for(int i = 0; i<lista.size(); i++) {
           // System.out.println("Prueba: " + lista.get(i).getNombre());
       // }

        return lista;
    }
}
