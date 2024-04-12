/*
 */

import java.util.ArrayList;

public class Directivo extends Empleado {

    private Categoria categoria;

private ArrayList<Empleado> subordinados = new ArrayList<>();

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public void mostrarDatos() {
        
        super.mostrarDatos();
        System.out.println("Categoría: " + this.categoria.getNombre());
    }

    public ArrayList<Empleado> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(ArrayList<Empleado> subordinados) {
        this.subordinados = subordinados;
    }

    public void addSubordinado(Empleado e){
        //relación bidireccional
        e.setJefe(this);
        this.subordinados.add(e);
    }

    public void removeSubordinado(Empleado e){
        e.setJefe(null);
        this.subordinados.remove(e);
    }
    

}