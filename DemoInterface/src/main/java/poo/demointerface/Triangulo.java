package poo.demointerface;

public class Triangulo extends PoligonoRegular {

    public Triangulo(double lado) {
        this.lado = lado;
        this.cantLados = 3;
        calcularApotema();
    }

    @Override
    public double calcularArea() {
        return Math.sqrt(3) / 4 * Math.pow(lado, 2);
    }

    @Override
    public void mostrar() {
        System.out.println(String.format("Triangulo equilatero - Lados:%.2f, Perimetro:%.2f, Area:%.2f", lado, calcularPerimetro(), calcularArea()));
    }
}
