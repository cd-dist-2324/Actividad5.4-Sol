import java.util.Date;

public class MiPersona implements Comparable<MiPersona>{
    private String nombre;
    private Date fechaNac;

    @Override
    public int compareTo(MiPersona otro) {

      return  this.nombre.compareTo(otro.getNombre());
       
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    
}
