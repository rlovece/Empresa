public abstract class Empleado extends Persona {

    protected float salario;

    ///region Constructor
    public Empleado(String nombre, String dni, int edad, float salario) {
        super(nombre, dni, edad);
        this.salario = salario;
    }
    ///endregion

    ///region G y S
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    ///endregion

    abstract float calcularBonificacion ();

    @Override
    public String toString() {
        return nombre + " sueldo: " + salario + "💸\n";
    }
}
