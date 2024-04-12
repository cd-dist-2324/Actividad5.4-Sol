
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.setCif("abc1234.");
        empresa.setNombre("MiEmpresa");

        Cliente cliente1 = new Cliente();
        cliente1.setEmpresa(empresa);
        cliente1.setId(1);
        cliente1.setFechaNacimiento(new Date());
        cliente1.setNombre("Cliente 1");
        cliente1.setTelf("+34 666 111 222");

        Cliente cliente2 = new Cliente();
        cliente2.setEmpresa(empresa);
        cliente2.setId(2);
        cliente2.setFechaNacimiento(DateUtilities.parseDate("1975-04-01"));
        cliente2.setNombre("Cliente 2");
        cliente2.setTelf("+34 666 333 222");

        Empleado subordinado = new Empleado();
        subordinado.setEmpresa(empresa);
        subordinado.setFechaNacimiento(DateUtilities.parseDate("1990-03-02"));
        subordinado.setId(1);
        subordinado.setNombre("subordinado 1");

        Directivo directivo = new Directivo();
        directivo.setEmpresa(empresa);
        directivo.setFechaNacimiento(DateUtilities.parseDate("1979-03-02"));
        directivo.setId(1);
        directivo.setNombre("directivo 1");
        directivo.addSubordinado(subordinado);

        Categoria categoria = new Categoria();
        categoria.setId(1);
        categoria.setNombre("RR.HH.");
        
        directivo.setCategoria(categoria);


        empresa.addCliente(cliente1);
        empresa.addCliente(cliente2);
        empresa.addEmpleado(subordinado);
        empresa.addEmpleado(directivo);

        for (Cliente cliente : empresa.getClientes()) {
            cliente.mostrarDatos();

        }

        for (Empleado emp : empresa.getEmpleados()) {
            emp.mostrarDatos();

        }

    }

   
}
