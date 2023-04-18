public class Secretario extends Empleado{

    private int hhee;

    ///region Constructor

    public Secretario(String nombre, String dni, int edad, float salario, int hhee) {
        super(nombre, dni, edad, salario);
        this.hhee = hhee;
    }
    ///endregion

    ///region G y S

    public int getHhee() {
        return hhee;
    }

    public void setHhee(int hhee) {
        this.hhee = hhee;
    }
    ///endregion


    @Override
    float calcularBonificacion() {
        return (1000 + this.hhee*50);
    }
}
