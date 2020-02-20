package ovrg.primitivos;

import java.util.ArrayList;

public class Triangulo extends Figura{
    private double ladoA;
    private double ladoB;
    private double ladoC;

    private double anguloA;
    private double anguloB;
    private double anguloC;

    Triangulo(String nombre, double a, double b, double c) {
        super(nombre);

        ladoA = a;
        ladoB = b;
        ladoC = c;

        anguloA = 0;
        anguloB = 0;
        anguloC = 0;

        coorenadas = new ArrayList<Puntos>();
    }

    private boolean valTriangulo(){
        return (ladoA + ladoB > ladoC) && (ladoB + ladoC > ladoA ) && (ladoA + ladoC > ladoB);
    }

    @Override
    public void dibujar(MiCanvas mc) {
        super.dibujar(mc);
        System.out.println("Dibujar Triangulo");
    }

    public void calcAngulos(){
        anguloA=  (ladoA*ladoA - ladoB*ladoB - ladoC*ladoC)/(-2*ladoB*ladoC);
        anguloA = Math.acos(anguloA);
    }


}
