import java.util.ArrayList;

public class Empresa {

  private String cif;

  private String nombre;

  /**
   * 
   * @element-type Empleado
   */
  private ArrayList<Empleado> empleados = new ArrayList<>();
  /**
   * 
   * @element-type Cliente
   */
  private ArrayList<Cliente> clientes = new ArrayList<>();

  public String getCif() {
    return cif;
  }

  public void setCif(String cif) {
    this.cif = cif;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public ArrayList<Empleado> getEmpleados() {
    return empleados;
  }

  public void setEmpleados(ArrayList<Empleado> empleados) {
    this.empleados = empleados;
  }

  public ArrayList<Cliente> getClientes() {
    return clientes;
  }

  public void setClientes(ArrayList<Cliente> clientes) {
    this.clientes = clientes;
  }

  public void addEmpleado(Empleado e){
    //relación bidireccional
    e.setEmpresa(this);
    this.empleados.add(e);
  }

  public void removeEmpleado(Empleado e){
    e.setEmpresa(null);
    this.empleados.remove(e);
  }


  public void addCliente(Cliente cliente){
    //relación bidireccional
    cliente.setEmpresa(this);
    this.clientes.add(cliente);
  }

  public void removeCliente(Cliente cliente){
    cliente.setEmpresa(null);
    this.clientes.remove(cliente);
  }
}