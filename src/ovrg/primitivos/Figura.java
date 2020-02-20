package ovrg.primitivos;

import java.util.List;

public class Figura {
    private String nombre;
    protected boolean val;
    protected List<Puntos> coorenadas;

    Figura(String nombre){
        this.nombre = nombre;
        this.val = false;
    }

    public boolean isval(){
        return this.val;
    }

    public void dibujar(MiCanvas mc){
        System.out.println("Dibujar Figuara");

    }

}
