public class Empleado extends Persona {

    private Empresa empresa;
    private Directivo jefe;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Directivo getJefe() {
        return jefe;
    }

    public void setJefe(Directivo jefe) {
        this.jefe = jefe;
    }

    @Override
    public void mostrarDatos() {
        
        super.mostrarDatos();
        System.out.println("Empresa: " + this.empresa!=null? this.empresa.getNombre(): "");
    }

}