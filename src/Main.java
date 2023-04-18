import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Gerente g1 = new Gerente("Carlos Perez", "000123", 53, 4000, "Operaciones");
        Gerente g2 = new Gerente("Mariana Castro", "000213", 45, 3500, "Administracion");

        Secretario s1 = new Secretario("Miriam Nuñez", "213000", 32, 1000, 5);
        Secretario s2 = new Secretario("Marcos Valdez", "031502", 42, 1000, 3);

        ArrayList<Empleado> listaEmpleados= new ArrayList<Empleado>();

        listaEmpleados.add(g1);
        listaEmpleados.add(g2);
        listaEmpleados.add(s1);
        listaEmpleados.add(s2);

        Consola.escribir("La lista de empleados\n" + listaEmpleados.toString());

        Consola.escribir(" \n *** Lista de bonificaciones ***");
        for (Empleado empleado: listaEmpleados
             ) {
            Consola.escribir(empleado.getNombre() + "  " + empleado.calcularBonificacion() +"💸");
        }

    }
}