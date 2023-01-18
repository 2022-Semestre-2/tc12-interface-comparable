package poo.demointerface;

public abstract class PoligonoRegular implements Area, Perimetro {

    protected double lado, apotema;
    protected int cantLados;

    public abstract void mostrar();

    protected void calcularApotema() {
        double anguloCentral = 360 / cantLados;
        apotema = lado / 2 * Math.tan(anguloCentral / 2);
    }

    public int getCantLados() {
        return cantLados;
    }

    @Override
    public double calcularArea() {
        return calcularPerimetro() * apotema / 2;
    }

    @Override
    public double calcularPerimetro() {
        return cantLados * lado;
    }
}
