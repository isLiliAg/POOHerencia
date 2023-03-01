public class Analista {

    private String nombre;
    private double salario;
    private int edad;

    public Analista(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public double getSalario() {
        return this.salario;
    }

    public double getBonoAnual() {
        return this.salario * .05;
    }

    public void getAumentoSalarial() {
        this.salario = this.salario * 1.2;
    }
}
