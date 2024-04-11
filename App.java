import java.time.Instant;
import java.util.Date;

public class  App {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.setCif("abc1234.");
        //empresa.setNombre("MiEmpresa");


        MiPersona maria = new MiPersona();
        maria.setNombre("Maria");
        maria.setFechaNac(Date.from(Instant.now()));

        maria.compareTo(maria);
    }
    
}
