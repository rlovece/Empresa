public class Gerente extends Empleado {

    private String departamento;

    ///region Constructor

    public Gerente(String nombre, String dni, int edad, float salario, String departamento) {
        super(nombre, dni, edad, salario);
        this.departamento = departamento;
    }
    ///endregion

    ///region G y S

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    ///endregion

    @Override
    float calcularBonificacion() {
        return 10000;
    }
}
