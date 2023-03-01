public class Vendedor {
    private String nombre;
    private double salario;
    private int edad;
    private double porcentajeComision;

    public Vendedor(String nombre, double salario, int edad,
                    double porcentajeComision) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
        this.porcentajeComision = porcentajeComision;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getSalario() {
        return this.salario;
    }

    public int getEdad() {
        return this.edad;
    }

    public double getPorcentajeComision() {
        return this.porcentajeComision;
    }

    public void aumentoSalarial() {
        this.salario = this.salario * 1.2;
    }

    public void aumentarComision() {
        if (this.porcentajeComision < .30) {
            this.porcentajeComision =
                    this.porcentajeComision * 1.2;
        }
    }
}
