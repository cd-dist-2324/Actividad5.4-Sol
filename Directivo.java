/*
 */
public class Directivo extends Empleado {

    public Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public void mostrarDatos() {
        // TODO Auto-generated method stub
        super.mostrarDatos();
        System.out.println("Categoría: " + this.categoria.getNombre());
    }

    

}