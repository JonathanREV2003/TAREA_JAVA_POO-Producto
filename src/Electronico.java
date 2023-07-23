public class Electronico extends Producto {

    public String marca;


    public Electronico(int id, String nombre, int precio, int
            cantidad, String marca,Float calcularDes)
    {
               super(id, nombre, precio, cantidad);
               this.marca=marca;

    }
    public  void calcularDes(){
    System.out.println("nn");
    }

    public void mostrarDatos(){
        System.out.printf("Id producto = "+getId()+
                "\nNombre: "+getNombre()+
                "\nPrecio: "+getPrecio()+
                "\nCantidad: "+getCantidad());
    }


}
