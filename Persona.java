import java.time.Instant;
import java.util.Date;

public abstract class Persona {

  private int id;

  private String nombre;

  private Date fechaNacimiento;

 

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Date getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(Date fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public void mostrarDatos() {
    System.out.println("******");
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Id: " + this.id);
    System.out.println("Fecha nacimiento: " + this.fechaNacimiento!=null ? this.fechaNacimiento.toString(): "");
    System.out.println("Edad: " + calcularEdad());
    
  }

  private int calcularEdad() {
    Date currentDate = Date.from(Instant.now());
   return  DateUtilities.getDiffYears(this.fechaNacimiento, currentDate); 
    
 
  }


  

}