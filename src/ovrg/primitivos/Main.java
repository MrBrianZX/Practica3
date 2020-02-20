package ovrg.primitivos;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String [] args){
        Circulo circulo= new Circulo("Patricio", 50.0);
        Triangulo triangulo = new Triangulo("Eugenio", 30,30,50);


        MiCanvas canvas= new MiCanvas();
        JFrame frame = new JFrame("Esto");
        frame.getContentPane().add(canvas);
        frame.setVisible(true);



        if(circulo.isval())
            circulo.dibujar(new MiCanvas());

        if(triangulo.isval())
            triangulo.dibujar(new MiCanvas());
    }
}





