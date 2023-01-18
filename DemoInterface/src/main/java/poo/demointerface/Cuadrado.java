package poo.demointerface;

public class Cuadrado extends PoligonoRegular {

    public Cuadrado(double lado) {
        this.lado = lado;
        this.cantLados = 4;
        calcularApotema();
    }

    @Override
    public void mostrar() {
        System.out.println(String.format("Cuadrado - Lados:%.2f, Perimetro:%.2f, Area:%.2f", lado, calcularPerimetro(), calcularArea()));
    }
}
