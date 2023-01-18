package poo.demointerface;

public class Circulo implements Area, Perimetro {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void mostrar() {
        System.out.println(String.format("Ciculo - Radio:%.2f, Perimetro:%.2f, Area:%.2f", radio, calcularPerimetro(), calcularArea()));
    }
}
