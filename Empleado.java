public class Empleado extends Persona {

    private Empresa empresa;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public void mostrarDatos() {
        // TODO Auto-generated method stub
        super.mostrarDatos();
        System.out.println("Empresa: " + this.empresa.getNombre());
    }

    

}