import java.util.ArrayList;

public class Empresa {

  private String cif;

  private int nombre;

  /**
   * 
   * @element-type Empleado
   */
  private ArrayList<Empleado> empleados;
  /**
   * 
   * @element-type Cliente
   */
  private ArrayList<Cliente> clientes;

  public String getCif() {
    return cif;
  }

  public void setCif(String cif) {
    this.cif = cif;
  }

  public int getNombre() {
    return nombre;
  }

  public void setNombre(int nombre) {
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

}