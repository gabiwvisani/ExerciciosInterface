public class Triangulo  implements Shape {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularÁrea() {
        return 0.5 * base * altura;
    }
}
