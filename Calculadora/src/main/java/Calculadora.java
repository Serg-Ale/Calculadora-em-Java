
public class Calculadora {
    private double x;
    private double y;

    public Calculadora() {
    }

    public Calculadora(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double somar(double x, double y) {
        return x + y;
    }

    public double subtrair(double x, double y) {
        return x - y;
    }

    public double multiplicar(double x, double y) {
        return x * y;
    }

    public double dividir(double x, double y) {
        return x / y;
    }
}
