package ovrg.primitivos;

import javax.swing.*;

public class MiCanvas extends JComponent {
    public void init(){
        this.c = new Circulo("pizza", 50);
        this.t = new Triangulo("Rebanada");
    }
}
