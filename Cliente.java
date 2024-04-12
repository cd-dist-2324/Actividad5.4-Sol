public class Cliente extends Persona {

  private String telf;

    private Empresa empresa;

    public String getTelf() {
      return telf;
    }

    public void setTelf(String telf) {
      this.telf = telf;
    }

    public Empresa getEmpresa() {
      return empresa;
    }

    public void setEmpresa(Empresa empresa) {
      this.empresa = empresa;
    }

    @Override
    public void mostrarDatos() {
      
      super.mostrarDatos();
      System.out.println("Teléfono: " + this.telf);
      System.out.println("Empresa: " + this.empresa!=null? this.empresa.getNombre(): "");
    }

    
}