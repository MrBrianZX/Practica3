package ovrg.primitivos;

import java.util.ArrayList;

public class Circulo extends Figura {
    private double radio;

    Circulo(String nombre, double radio) {
        super(nombre);

        this.radio = radio;
        this.coorenadas = new ArrayList<Puntos>();
        this.val = this.valCirculo();
    }

    private boolean valCirculo() {
        return  (this.radio > 0);
    }

    @Override
    public void dibujar(MiCanvas mc) {
        super.dibujar(mc);
        System.out.println("Dibujar Ciruclo");

        mc.getGraphics().drawArc(100, 100, );
    }

    public double area(){
        return Math.PI*(radio* radio);
    }

    public double perimetro(){
        return 2*Math.PI*radio;
    }
}
