package poo.demointerface;

public class DemoInterface {

    public static void main(String[] args) {
        Cuadrado fig1 = new Cuadrado(10);
        Triangulo fig2 = new Triangulo(5);
        Circulo fig3 = new Circulo(5);

        fig1.mostrar();
        fig2.mostrar();
        fig3.mostrar();
    }
}
