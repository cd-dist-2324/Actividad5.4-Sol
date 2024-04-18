public class Empleado extends Persona {

    private Empresa empresa;
    private Directivo jefe;

    private Float salarioBruto;

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

    public Float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    

}